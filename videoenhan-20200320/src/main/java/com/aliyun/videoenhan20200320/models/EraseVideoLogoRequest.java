// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoRequest extends TeaModel {
    @NameInMap("Boxes")
    public java.util.List<EraseVideoLogoRequestBoxes> boxes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static EraseVideoLogoRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoRequest self = new EraseVideoLogoRequest();
        return TeaModel.build(map, self);
    }

    public EraseVideoLogoRequest setBoxes(java.util.List<EraseVideoLogoRequestBoxes> boxes) {
        this.boxes = boxes;
        return this;
    }
    public java.util.List<EraseVideoLogoRequestBoxes> getBoxes() {
        return this.boxes;
    }

    public EraseVideoLogoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static class EraseVideoLogoRequestBoxes extends TeaModel {
        @NameInMap("H")
        public Float h;

        @NameInMap("W")
        public Float w;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static EraseVideoLogoRequestBoxes build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoLogoRequestBoxes self = new EraseVideoLogoRequestBoxes();
            return TeaModel.build(map, self);
        }

        public EraseVideoLogoRequestBoxes setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public EraseVideoLogoRequestBoxes setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public EraseVideoLogoRequestBoxes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public EraseVideoLogoRequestBoxes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

}
