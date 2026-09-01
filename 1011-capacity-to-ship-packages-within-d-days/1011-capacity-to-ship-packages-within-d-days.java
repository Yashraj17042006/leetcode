class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        
        int result = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canShip(weights, days, mid)) {
                result = mid;
                high = mid - 1; // Try to find a smaller feasible capacity
            } else {
                low = mid + 1;  // Increase capacity
            }
        }
        
        return result;
    }
    
    private boolean canShip(int[] weights, int maxDays, int capacity) {
        int daysNeeded = 1;
        int currentLoad = 0;
        
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                daysNeeded++;
                currentLoad = 0;
            }
            currentLoad += w;
        }
        
        return daysNeeded <= maxDays;
    }
}
