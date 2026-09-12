import java.util.*;

class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        Integer[] order = new Integer[n];
        long[] l = new long[n], r = new long[n], w = new long[n];
        for (int i = 0; i < n; i++) {
            l[i] = intervals.get(i).get(0);
            r[i] = intervals.get(i).get(1);
            w[i] = intervals.get(i).get(2);
            order[i] = i;
        }
        Arrays.sort(order, (a, b) -> Long.compare(r[a], r[b]));
        long[] rSorted = new long[n];
        for (int i = 0; i < n; i++) rSorted[i] = r[order[i]];

        long[][] score = new long[n + 1][5];
        int[][][] idxList = new int[n + 1][5][];
        for (int k = 0; k < 5; k++) {
            score[0][k] = 0;
            idxList[0][k] = new int[0];
        }

        for (int i = 1; i <= n; i++) {
            int cur = order[i - 1];
            long li = l[cur], wi = w[cur];
            int p = lowerBound(rSorted, li);

            for (int k = 0; k < 5; k++) {
                long bestScore = score[i - 1][k];
                int[] bestIdx = idxList[i - 1][k];

                if (k > 0) {
                    long candScore = score[p][k - 1] + wi;
                    int[] candIdx = insertSorted(idxList[p][k - 1], cur);
                    if (better(candScore, candIdx, bestScore, bestIdx)) {
                        bestScore = candScore;
                        bestIdx = candIdx;
                    }
                }

                score[i][k] = bestScore;
                idxList[i][k] = bestIdx;
            }
        }

        return idxList[n][4];
    }

    private int lowerBound(long[] arr, long target) {
        int lo = 0, hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (arr[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    private int[] insertSorted(int[] arr, int val) {
        int[] res = new int[arr.length + 1];
        int i = 0;
        while (i < arr.length && arr[i] < val) {
            res[i] = arr[i];
            i++;
        }
        res[i] = val;
        for (int j = i; j < arr.length; j++) res[j + 1] = arr[j];
        return res;
    }

    private boolean better(long s1, int[] a1, long s2, int[] a2) {
        if (s1 != s2) return s1 > s2;
        int m = Math.min(a1.length, a2.length);
        for (int i = 0; i < m; i++) {
            if (a1[i] != a2[i]) return a1[i] < a2[i];
        }
        return a1.length < a2.length;
    }
}