// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RecognizeFaceQualityResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RecognizeFaceQualityResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeFaceQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceQualityResponseBody self = new RecognizeFaceQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceQualityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeFaceQualityResponseBody setData(RecognizeFaceQualityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeFaceQualityResponseBodyData getData() {
        return this.data;
    }

    public RecognizeFaceQualityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeFaceQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeFaceQualityResponseBodyDataAttributes extends TeaModel {
        @NameInMap("FaceQuality")
        public String faceQuality;

        @NameInMap("FaceScore")
        public String faceScore;

        @NameInMap("FaceStyle")
        public String faceStyle;

        @NameInMap("LeftTopX")
        public Integer leftTopX;

        @NameInMap("LeftTopY")
        public Integer leftTopY;

        @NameInMap("RightBottomX")
        public Integer rightBottomX;

        @NameInMap("RightBottomY")
        public Integer rightBottomY;

        @NameInMap("TargetImageStoragePath")
        public String targetImageStoragePath;

        public static RecognizeFaceQualityResponseBodyDataAttributes build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFaceQualityResponseBodyDataAttributes self = new RecognizeFaceQualityResponseBodyDataAttributes();
            return TeaModel.build(map, self);
        }

        public RecognizeFaceQualityResponseBodyDataAttributes setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public RecognizeFaceQualityResponseBodyDataAttributes setFaceScore(String faceScore) {
            this.faceScore = faceScore;
            return this;
        }
        public String getFaceScore() {
            return this.faceScore;
        }

        public RecognizeFaceQualityResponseBodyDataAttributes setFaceStyle(String faceStyle) {
            this.faceStyle = faceStyle;
            return this;
        }
        public String getFaceStyle() {
            return this.faceStyle;
        }

        public RecognizeFaceQualityResponseBodyDataAttributes setLeftTopX(Integer leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        public RecognizeFaceQualityResponseBodyDataAttributes setLeftTopY(Integer leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        public RecognizeFaceQualityResponseBodyDataAttributes setRightBottomX(Integer rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Integer getRightBottomX() {
            return this.rightBottomX;
        }

        public RecognizeFaceQualityResponseBodyDataAttributes setRightBottomY(Integer rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Integer getRightBottomY() {
            return this.rightBottomY;
        }

        public RecognizeFaceQualityResponseBodyDataAttributes setTargetImageStoragePath(String targetImageStoragePath) {
            this.targetImageStoragePath = targetImageStoragePath;
            return this;
        }
        public String getTargetImageStoragePath() {
            return this.targetImageStoragePath;
        }

    }

    public static class RecognizeFaceQualityResponseBodyData extends TeaModel {
        @NameInMap("Attributes")
        public RecognizeFaceQualityResponseBodyDataAttributes attributes;

        @NameInMap("Description")
        public String description;

        @NameInMap("QualityScore")
        public String qualityScore;

        public static RecognizeFaceQualityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFaceQualityResponseBodyData self = new RecognizeFaceQualityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeFaceQualityResponseBodyData setAttributes(RecognizeFaceQualityResponseBodyDataAttributes attributes) {
            this.attributes = attributes;
            return this;
        }
        public RecognizeFaceQualityResponseBodyDataAttributes getAttributes() {
            return this.attributes;
        }

        public RecognizeFaceQualityResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RecognizeFaceQualityResponseBodyData setQualityScore(String qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public String getQualityScore() {
            return this.qualityScore;
        }

    }

}
