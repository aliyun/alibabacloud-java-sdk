// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWorkwearRequest extends TeaModel {
    @NameInMap("Clothes")
    public DetectWorkwearRequestClothes clothes;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Labels")
    public java.util.List<String> labels;

    public static DetectWorkwearRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectWorkwearRequest self = new DetectWorkwearRequest();
        return TeaModel.build(map, self);
    }

    public DetectWorkwearRequest setClothes(DetectWorkwearRequestClothes clothes) {
        this.clothes = clothes;
        return this;
    }
    public DetectWorkwearRequestClothes getClothes() {
        return this.clothes;
    }

    public DetectWorkwearRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DetectWorkwearRequest setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public static class DetectWorkwearRequestClothes extends TeaModel {
        @NameInMap("MaxNum")
        public Long maxNum;

        @NameInMap("Threshold")
        public Double threshold;

        public static DetectWorkwearRequestClothes build(java.util.Map<String, ?> map) throws Exception {
            DetectWorkwearRequestClothes self = new DetectWorkwearRequestClothes();
            return TeaModel.build(map, self);
        }

        public DetectWorkwearRequestClothes setMaxNum(Long maxNum) {
            this.maxNum = maxNum;
            return this;
        }
        public Long getMaxNum() {
            return this.maxNum;
        }

        public DetectWorkwearRequestClothes setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

    }

}
