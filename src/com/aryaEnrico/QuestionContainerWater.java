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

    public int optimizeSolution() {
        int pointerA = 0;
        int maxArea = 0;
        int height, width;
        int area;
        int pointerB = this.data.length-1;
        while (pointerA < pointerB) {
            height = Math.min(this.data[pointerA], this.data[pointerB]);
            width = pointerB-pointerA;
            area = width * height;
            maxArea =Math.max(area,maxArea);
            if (this.data[pointerB] < this.data[pointerA]) {
                pointerB--;
            } else {
                pointerA++;
            }
        }
        return maxArea;
    }


}

