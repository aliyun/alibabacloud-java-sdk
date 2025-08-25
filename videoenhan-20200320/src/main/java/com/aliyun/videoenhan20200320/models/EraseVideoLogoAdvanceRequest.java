// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoAdvanceRequest extends TeaModel {
    @NameInMap("Boxes")
    public java.util.List<EraseVideoLogoAdvanceRequestBoxes> boxes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/EraseVideoLogo/EraseVideoLogo1.mp4">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/EraseVideoLogo/EraseVideoLogo1.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static EraseVideoLogoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoAdvanceRequest self = new EraseVideoLogoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EraseVideoLogoAdvanceRequest setBoxes(java.util.List<EraseVideoLogoAdvanceRequestBoxes> boxes) {
        this.boxes = boxes;
        return this;
    }
    public java.util.List<EraseVideoLogoAdvanceRequestBoxes> getBoxes() {
        return this.boxes;
    }

    public EraseVideoLogoAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public static class EraseVideoLogoAdvanceRequestBoxes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("H")
        public Float h;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("W")
        public Float w;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("Y")
        public Float y;

        public static EraseVideoLogoAdvanceRequestBoxes build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoLogoAdvanceRequestBoxes self = new EraseVideoLogoAdvanceRequestBoxes();
            return TeaModel.build(map, self);
        }

        public EraseVideoLogoAdvanceRequestBoxes setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public EraseVideoLogoAdvanceRequestBoxes setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public EraseVideoLogoAdvanceRequestBoxes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public EraseVideoLogoAdvanceRequestBoxes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

}
