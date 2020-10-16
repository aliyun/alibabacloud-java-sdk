// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RecognizeImageResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeImageResponseData data;

    public static RecognizeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageResponse self = new RecognizeImageResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeImageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeImageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeImageResponse setData(RecognizeImageResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeImageResponseData getData() {
        return this.data;
    }

    public static class RecognizeImageResponseDataBodyList extends TeaModel {
        @NameInMap("Feature")
        @Validation(required = true)
        public String feature;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("ImageBaseSixFour")
        @Validation(required = true)
        public String imageBaseSixFour;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public String leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public String leftTopY;

        @NameInMap("LocalFeature")
        @Validation(required = true)
        public String localFeature;

        @NameInMap("RespiratorColor")
        @Validation(required = true)
        public String respiratorColor;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public String rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public String rightBottomY;

        public static RecognizeImageResponseDataBodyList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseDataBodyList self = new RecognizeImageResponseDataBodyList();
            return TeaModel.build(map, self);
        }

        public RecognizeImageResponseDataBodyList setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public RecognizeImageResponseDataBodyList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public RecognizeImageResponseDataBodyList setImageBaseSixFour(String imageBaseSixFour) {
            this.imageBaseSixFour = imageBaseSixFour;
            return this;
        }
        public String getImageBaseSixFour() {
            return this.imageBaseSixFour;
        }

        public RecognizeImageResponseDataBodyList setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

        public RecognizeImageResponseDataBodyList setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public RecognizeImageResponseDataBodyList setLocalFeature(String localFeature) {
            this.localFeature = localFeature;
            return this;
        }
        public String getLocalFeature() {
            return this.localFeature;
        }

        public RecognizeImageResponseDataBodyList setRespiratorColor(String respiratorColor) {
            this.respiratorColor = respiratorColor;
            return this;
        }
        public String getRespiratorColor() {
            return this.respiratorColor;
        }

        public RecognizeImageResponseDataBodyList setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public RecognizeImageResponseDataBodyList setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

    }

    public static class RecognizeImageResponseDataFaceList extends TeaModel {
        @NameInMap("Feature")
        @Validation(required = true)
        public String feature;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("ImageBaseSixFour")
        @Validation(required = true)
        public String imageBaseSixFour;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public String leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public String leftTopY;

        @NameInMap("LocalFeature")
        @Validation(required = true)
        public String localFeature;

        @NameInMap("RespiratorColor")
        @Validation(required = true)
        public String respiratorColor;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public String rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public String rightBottomY;

        public static RecognizeImageResponseDataFaceList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseDataFaceList self = new RecognizeImageResponseDataFaceList();
            return TeaModel.build(map, self);
        }

        public RecognizeImageResponseDataFaceList setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public RecognizeImageResponseDataFaceList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public RecognizeImageResponseDataFaceList setImageBaseSixFour(String imageBaseSixFour) {
            this.imageBaseSixFour = imageBaseSixFour;
            return this;
        }
        public String getImageBaseSixFour() {
            return this.imageBaseSixFour;
        }

        public RecognizeImageResponseDataFaceList setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

        public RecognizeImageResponseDataFaceList setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public RecognizeImageResponseDataFaceList setLocalFeature(String localFeature) {
            this.localFeature = localFeature;
            return this;
        }
        public String getLocalFeature() {
            return this.localFeature;
        }

        public RecognizeImageResponseDataFaceList setRespiratorColor(String respiratorColor) {
            this.respiratorColor = respiratorColor;
            return this;
        }
        public String getRespiratorColor() {
            return this.respiratorColor;
        }

        public RecognizeImageResponseDataFaceList setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public RecognizeImageResponseDataFaceList setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

    }

    public static class RecognizeImageResponseData extends TeaModel {
        @NameInMap("BodyList")
        @Validation(required = true)
        public java.util.List<RecognizeImageResponseDataBodyList> bodyList;

        @NameInMap("FaceList")
        @Validation(required = true)
        public java.util.List<RecognizeImageResponseDataFaceList> faceList;

        public static RecognizeImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageResponseData self = new RecognizeImageResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeImageResponseData setBodyList(java.util.List<RecognizeImageResponseDataBodyList> bodyList) {
            this.bodyList = bodyList;
            return this;
        }
        public java.util.List<RecognizeImageResponseDataBodyList> getBodyList() {
            return this.bodyList;
        }

        public RecognizeImageResponseData setFaceList(java.util.List<RecognizeImageResponseDataFaceList> faceList) {
            this.faceList = faceList;
            return this;
        }
        public java.util.List<RecognizeImageResponseDataFaceList> getFaceList() {
            return this.faceList;
        }

    }

}
