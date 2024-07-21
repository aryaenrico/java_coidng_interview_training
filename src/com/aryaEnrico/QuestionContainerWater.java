package com.aryaEnrico;

public class QuestionContainerWater {

    public int[] data;

    public QuestionContainerWater(int[] data) {
        this.data = data;
    }

    public int bruteForceSolution() {
        int maxArea = 0;
        int width, height;
        if (this.data.length <= 2) {
            return 0;
        }

        for (int i = 0; i < this.data.length; i++) {
            for (int j = i + 1; j < this.data.length; j++) {
                height = Math.min(this.data[i], this.data[j]);
                width = j - i;
                maxArea = Math.max(maxArea, height * width);
            }
        }
        return maxArea;
    }
}
