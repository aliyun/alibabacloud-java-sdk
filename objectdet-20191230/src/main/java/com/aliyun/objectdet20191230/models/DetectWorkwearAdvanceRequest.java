// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWorkwearAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    @NameInMap("Clothes")
    public DetectWorkwearAdvanceRequestClothes clothes;

    @NameInMap("Labels")
    public java.util.List<String> labels;

    public static DetectWorkwearAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectWorkwearAdvanceRequest self = new DetectWorkwearAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectWorkwearAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public DetectWorkwearAdvanceRequest setClothes(DetectWorkwearAdvanceRequestClothes clothes) {
        this.clothes = clothes;
        return this;
    }
    public DetectWorkwearAdvanceRequestClothes getClothes() {
        return this.clothes;
    }

    public DetectWorkwearAdvanceRequest setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public static class DetectWorkwearAdvanceRequestClothes extends TeaModel {
        @NameInMap("MaxNum")
        public Long maxNum;

        @NameInMap("Threshold")
        public Double threshold;

        public static DetectWorkwearAdvanceRequestClothes build(java.util.Map<String, ?> map) throws Exception {
            DetectWorkwearAdvanceRequestClothes self = new DetectWorkwearAdvanceRequestClothes();
            return TeaModel.build(map, self);
        }

        public DetectWorkwearAdvanceRequestClothes setMaxNum(Long maxNum) {
            this.maxNum = maxNum;
            return this;
        }
        public Long getMaxNum() {
            return this.maxNum;
        }

        public DetectWorkwearAdvanceRequestClothes setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

    }

}
