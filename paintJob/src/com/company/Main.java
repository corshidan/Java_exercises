package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.9, 2.4 , 1.2 ,1));
    }
    public static int getBucketCount (double width , double height , double areaPerBucket , int extraBuckets) {
        if ((width <= 0 || height <= 0 || areaPerBucket <= 0 ) || (extraBuckets < 0)) {
            return -1;
        }
        double area = width * height;
        int buckets = (int) Math.ceil((area / areaPerBucket) - extraBuckets);
        return buckets;
    }

    public static int getBucketCount (double width , double height , double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        int buckets = (int) Math.ceil(area / areaPerBucket );
        return buckets;
    }

    public static int getBucketCount (double area , double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int buckets = (int) Math.ceil(area / areaPerBucket );
        return buckets;
    }
}
