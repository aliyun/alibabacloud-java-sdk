// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public String videoUrl;

    @NameInMap("Boxes")
    public java.util.List<EraseVideoLogoRequestBoxes> boxes;

    public static EraseVideoLogoRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoRequest self = new EraseVideoLogoRequest();
        return TeaModel.build(map, self);
    }

    public EraseVideoLogoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public EraseVideoLogoRequest setBoxes(java.util.List<EraseVideoLogoRequestBoxes> boxes) {
        this.boxes = boxes;
        return this;
    }
    public java.util.List<EraseVideoLogoRequestBoxes> getBoxes() {
        return this.boxes;
    }

    public static class EraseVideoLogoRequestBoxes extends TeaModel {
        @NameInMap("W")
        public Float w;

        @NameInMap("H")
        public Float h;

        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Float x;

        public static EraseVideoLogoRequestBoxes build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoLogoRequestBoxes self = new EraseVideoLogoRequestBoxes();
            return TeaModel.build(map, self);
        }

        public EraseVideoLogoRequestBoxes setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public EraseVideoLogoRequestBoxes setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public EraseVideoLogoRequestBoxes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public EraseVideoLogoRequestBoxes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

}
