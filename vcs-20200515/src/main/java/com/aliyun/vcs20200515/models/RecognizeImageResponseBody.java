// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RecognizeImageResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeImageResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static RecognizeImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageResponseBody self = new RecognizeImageResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeImageResponseBody setData(RecognizeImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeImageResponseBodyData getData() {
        return this.data;
    }

    public RecognizeImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class RecognizeImageResponseBodyDataBodyList extends TeaModel {
        @NameInMap("RespiratorColor")
        public String respiratorColor;

        @NameInMap("RightBottomY")
        public String rightBottomY;

        @NameInMap("Feature")
        public String feature;

        @NameInMap("LeftTopY")
        public String leftTopY;

        @NameInMap("ImageBaseSixFour")
        public String imageBaseSixFour;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("RightBottomX")
        public String rightBottomX;

        @NameInMap("LocalFeature")
        public String localFeature;

        @NameInMap("LeftTopX")
        public String leftTopX;

        public static RecognizeImageResponseBodyDataBodyList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseBodyDataBodyList self = new RecognizeImageResponseBodyDataBodyList();
            return TeaModel.build(map, self);
        }

        public RecognizeImageResponseBodyDataBodyList setRespiratorColor(String respiratorColor) {
            this.respiratorColor = respiratorColor;
            return this;
        }
        public String getRespiratorColor() {
            return this.respiratorColor;
        }

        public RecognizeImageResponseBodyDataBodyList setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public RecognizeImageResponseBodyDataBodyList setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public RecognizeImageResponseBodyDataBodyList setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public RecognizeImageResponseBodyDataBodyList setImageBaseSixFour(String imageBaseSixFour) {
            this.imageBaseSixFour = imageBaseSixFour;
            return this;
        }
        public String getImageBaseSixFour() {
            return this.imageBaseSixFour;
        }

        public RecognizeImageResponseBodyDataBodyList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public RecognizeImageResponseBodyDataBodyList setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public RecognizeImageResponseBodyDataBodyList setLocalFeature(String localFeature) {
            this.localFeature = localFeature;
            return this;
        }
        public String getLocalFeature() {
            return this.localFeature;
        }

        public RecognizeImageResponseBodyDataBodyList setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

    }

    public static class RecognizeImageResponseBodyDataFaceList extends TeaModel {
        @NameInMap("Quality")
        public Float quality;

        @NameInMap("RespiratorColor")
        public String respiratorColor;

        @NameInMap("KeyPointQuality")
        public Float keyPointQuality;

        @NameInMap("RightBottomY")
        public String rightBottomY;

        @NameInMap("Feature")
        public String feature;

        @NameInMap("LeftTopY")
        public String leftTopY;

        @NameInMap("ImageBaseSixFour")
        public String imageBaseSixFour;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("RightBottomX")
        public String rightBottomX;

        @NameInMap("LocalFeature")
        public String localFeature;

        @NameInMap("LeftTopX")
        public String leftTopX;

        public static RecognizeImageResponseBodyDataFaceList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseBodyDataFaceList self = new RecognizeImageResponseBodyDataFaceList();
            return TeaModel.build(map, self);
        }

        public RecognizeImageResponseBodyDataFaceList setQuality(Float quality) {
            this.quality = quality;
            return this;
        }
        public Float getQuality() {
            return this.quality;
        }

        public RecognizeImageResponseBodyDataFaceList setRespiratorColor(String respiratorColor) {
            this.respiratorColor = respiratorColor;
            return this;
        }
        public String getRespiratorColor() {
            return this.respiratorColor;
        }

        public RecognizeImageResponseBodyDataFaceList setKeyPointQuality(Float keyPointQuality) {
            this.keyPointQuality = keyPointQuality;
            return this;
        }
        public Float getKeyPointQuality() {
            return this.keyPointQuality;
        }

        public RecognizeImageResponseBodyDataFaceList setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public RecognizeImageResponseBodyDataFaceList setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public RecognizeImageResponseBodyDataFaceList setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public RecognizeImageResponseBodyDataFaceList setImageBaseSixFour(String imageBaseSixFour) {
            this.imageBaseSixFour = imageBaseSixFour;
            return this;
        }
        public String getImageBaseSixFour() {
            return this.imageBaseSixFour;
        }

        public RecognizeImageResponseBodyDataFaceList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public RecognizeImageResponseBodyDataFaceList setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public RecognizeImageResponseBodyDataFaceList setLocalFeature(String localFeature) {
            this.localFeature = localFeature;
            return this;
        }
        public String getLocalFeature() {
            return this.localFeature;
        }

        public RecognizeImageResponseBodyDataFaceList setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

    }

    public static class RecognizeImageResponseBodyData extends TeaModel {
        @NameInMap("BodyList")
        public java.util.List<RecognizeImageResponseBodyDataBodyList> bodyList;

        @NameInMap("FaceList")
        public java.util.List<RecognizeImageResponseBodyDataFaceList> faceList;

        public static RecognizeImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseBodyData self = new RecognizeImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeImageResponseBodyData setBodyList(java.util.List<RecognizeImageResponseBodyDataBodyList> bodyList) {
            this.bodyList = bodyList;
            return this;
        }
        public java.util.List<RecognizeImageResponseBodyDataBodyList> getBodyList() {
            return this.bodyList;
        }

        public RecognizeImageResponseBodyData setFaceList(java.util.List<RecognizeImageResponseBodyDataFaceList> faceList) {
            this.faceList = faceList;
            return this;
        }
        public java.util.List<RecognizeImageResponseBodyDataFaceList> getFaceList() {
            return this.faceList;
        }

    }

}
