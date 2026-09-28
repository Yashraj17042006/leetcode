class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 1;
        long minRank = ranks[0];
        for (int r : ranks) {
            minRank = Math.min(minRank, r);
        }
        long high = minRank * (long) cars * cars;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canRepairInTime(ranks, cars, mid)) {
                ans = mid;      
                high = mid - 1;
            } else {
                low = mid + 1;  
            }
        }
        return ans;
    }

    private boolean canRepairInTime(int[] ranks, int cars, long time) {
        long totalCarsRepaired = 0;
        for (int r : ranks) {
            totalCarsRepaired += (long) Math.sqrt((double) time / r);
            if (totalCarsRepaired >= cars) {
                return true; 
            }
        }
        return totalCarsRepaired >= cars;
    }
}
