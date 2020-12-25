// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("Async")
    public Boolean async;

    @NameInMap("Boxes")
    public java.util.List<EraseVideoLogoAdvanceRequestBoxes> boxes;

    public static EraseVideoLogoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoAdvanceRequest self = new EraseVideoLogoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EraseVideoLogoAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public EraseVideoLogoAdvanceRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public EraseVideoLogoAdvanceRequest setBoxes(java.util.List<EraseVideoLogoAdvanceRequestBoxes> boxes) {
        this.boxes = boxes;
        return this;
    }
    public java.util.List<EraseVideoLogoAdvanceRequestBoxes> getBoxes() {
        return this.boxes;
    }

    public static class EraseVideoLogoAdvanceRequestBoxes extends TeaModel {
        @NameInMap("W")
        public Float w;

        @NameInMap("H")
        public Float h;

        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Float x;

        public static EraseVideoLogoAdvanceRequestBoxes build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoLogoAdvanceRequestBoxes self = new EraseVideoLogoAdvanceRequestBoxes();
            return TeaModel.build(map, self);
        }

        public EraseVideoLogoAdvanceRequestBoxes setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public EraseVideoLogoAdvanceRequestBoxes setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public EraseVideoLogoAdvanceRequestBoxes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public EraseVideoLogoAdvanceRequestBoxes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

}
