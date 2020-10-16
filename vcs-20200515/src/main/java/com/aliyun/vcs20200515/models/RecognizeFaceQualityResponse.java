// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RecognizeFaceQualityResponse extends TeaModel {
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
    public RecognizeFaceQualityResponseData data;

    public static RecognizeFaceQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceQualityResponse self = new RecognizeFaceQualityResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceQualityResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeFaceQualityResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeFaceQualityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeFaceQualityResponse setData(RecognizeFaceQualityResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeFaceQualityResponseData getData() {
        return this.data;
    }

    public static class RecognizeFaceQualityResponseDataAttributes extends TeaModel {
        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Integer leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Integer leftTopY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Integer rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Integer rightBottomY;

        @NameInMap("TargetImageStoragePath")
        @Validation(required = true)
        public String targetImageStoragePath;

        @NameInMap("FaceStyle")
        @Validation(required = true)
        public String faceStyle;

        @NameInMap("FaceQuality")
        @Validation(required = true)
        public String faceQuality;

        @NameInMap("FaceScore")
        @Validation(required = true)
        public String faceScore;

        public static RecognizeFaceQualityResponseDataAttributes build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFaceQualityResponseDataAttributes self = new RecognizeFaceQualityResponseDataAttributes();
            return TeaModel.build(map, self);
        }

        public RecognizeFaceQualityResponseDataAttributes setLeftTopX(Integer leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        public RecognizeFaceQualityResponseDataAttributes setLeftTopY(Integer leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        public RecognizeFaceQualityResponseDataAttributes setRightBottomX(Integer rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Integer getRightBottomX() {
            return this.rightBottomX;
        }

        public RecognizeFaceQualityResponseDataAttributes setRightBottomY(Integer rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Integer getRightBottomY() {
            return this.rightBottomY;
        }

        public RecognizeFaceQualityResponseDataAttributes setTargetImageStoragePath(String targetImageStoragePath) {
            this.targetImageStoragePath = targetImageStoragePath;
            return this;
        }
        public String getTargetImageStoragePath() {
            return this.targetImageStoragePath;
        }

        public RecognizeFaceQualityResponseDataAttributes setFaceStyle(String faceStyle) {
            this.faceStyle = faceStyle;
            return this;
        }
        public String getFaceStyle() {
            return this.faceStyle;
        }

        public RecognizeFaceQualityResponseDataAttributes setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public RecognizeFaceQualityResponseDataAttributes setFaceScore(String faceScore) {
            this.faceScore = faceScore;
            return this;
        }
        public String getFaceScore() {
            return this.faceScore;
        }

    }

    public static class RecognizeFaceQualityResponseData extends TeaModel {
        @NameInMap("QualityScore")
        @Validation(required = true)
        public String qualityScore;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Attributes")
        @Validation(required = true)
        public RecognizeFaceQualityResponseDataAttributes attributes;

        public static RecognizeFaceQualityResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFaceQualityResponseData self = new RecognizeFaceQualityResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeFaceQualityResponseData setQualityScore(String qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public String getQualityScore() {
            return this.qualityScore;
        }

        public RecognizeFaceQualityResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RecognizeFaceQualityResponseData setAttributes(RecognizeFaceQualityResponseDataAttributes attributes) {
            this.attributes = attributes;
            return this;
        }
        public RecognizeFaceQualityResponseDataAttributes getAttributes() {
            return this.attributes;
        }

    }

}
