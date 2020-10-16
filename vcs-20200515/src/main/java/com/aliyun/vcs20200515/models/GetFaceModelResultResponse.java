// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetFaceModelResultResponse extends TeaModel {
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
    public GetFaceModelResultResponseData data;

    public static GetFaceModelResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFaceModelResultResponse self = new GetFaceModelResultResponse();
        return TeaModel.build(map, self);
    }

    public GetFaceModelResultResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFaceModelResultResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFaceModelResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFaceModelResultResponse setData(GetFaceModelResultResponseData data) {
        this.data = data;
        return this;
    }
    public GetFaceModelResultResponseData getData() {
        return this.data;
    }

    public static class GetFaceModelResultResponseDataRecords extends TeaModel {
        @NameInMap("MustacheStyle")
        @Validation(required = true)
        public String mustacheStyle;

        @NameInMap("FaceStyle")
        @Validation(required = true)
        public String faceStyle;

        @NameInMap("CapStyle")
        @Validation(required = true)
        public Integer capStyle;

        @NameInMap("SkinColor")
        @Validation(required = true)
        public Integer skinColor;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Float rightBottomY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Float rightBottomX;

        @NameInMap("HairStyle")
        @Validation(required = true)
        public Integer hairStyle;

        @NameInMap("GenderCode")
        @Validation(required = true)
        public Integer genderCode;

        @NameInMap("RespiratorColor")
        @Validation(required = true)
        public Integer respiratorColor;

        @NameInMap("EthicCode")
        @Validation(required = true)
        public Integer ethicCode;

        @NameInMap("AgeLowerLimit")
        @Validation(required = true)
        public Integer ageLowerLimit;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Float leftTopY;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Float leftTopX;

        @NameInMap("HairColor")
        @Validation(required = true)
        public Integer hairColor;

        @NameInMap("AgeUpLimit")
        @Validation(required = true)
        public Integer ageUpLimit;

        @NameInMap("GlassStyle")
        @Validation(required = true)
        public Integer glassStyle;

        @NameInMap("GlassColor")
        @Validation(required = true)
        public Integer glassColor;

        @NameInMap("CapColor")
        @Validation(required = true)
        public Integer capColor;

        @NameInMap("CapColorReliability")
        @Validation(required = true)
        public String capColorReliability;

        @NameInMap("RespiratorColorReliability")
        @Validation(required = true)
        public String respiratorColorReliability;

        @NameInMap("EthicCodeReliability")
        @Validation(required = true)
        public String ethicCodeReliability;

        @NameInMap("GenderCodeReliability")
        @Validation(required = true)
        public String genderCodeReliability;

        @NameInMap("GlassColorReliability")
        @Validation(required = true)
        public String glassColorReliability;

        @NameInMap("SkinColorReliability")
        @Validation(required = true)
        public String skinColorReliability;

        @NameInMap("MustacheStyleReliability")
        @Validation(required = true)
        public String mustacheStyleReliability;

        @NameInMap("CapStyleReliability")
        @Validation(required = true)
        public String capStyleReliability;

        @NameInMap("FaceStyleReliability")
        @Validation(required = true)
        public String faceStyleReliability;

        @NameInMap("GlassStyleReliability")
        @Validation(required = true)
        public String glassStyleReliability;

        @NameInMap("AgeUpLimitReliability")
        @Validation(required = true)
        public String ageUpLimitReliability;

        @NameInMap("HairStyleReliability")
        @Validation(required = true)
        public String hairStyleReliability;

        @NameInMap("AgeLowerLimitReliability")
        @Validation(required = true)
        public String ageLowerLimitReliability;

        @NameInMap("HairColorReliability")
        @Validation(required = true)
        public String hairColorReliability;

        @NameInMap("FeatureData")
        @Validation(required = true)
        public java.util.List<Float> featureData;

        public static GetFaceModelResultResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetFaceModelResultResponseDataRecords self = new GetFaceModelResultResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public GetFaceModelResultResponseDataRecords setMustacheStyle(String mustacheStyle) {
            this.mustacheStyle = mustacheStyle;
            return this;
        }
        public String getMustacheStyle() {
            return this.mustacheStyle;
        }

        public GetFaceModelResultResponseDataRecords setFaceStyle(String faceStyle) {
            this.faceStyle = faceStyle;
            return this;
        }
        public String getFaceStyle() {
            return this.faceStyle;
        }

        public GetFaceModelResultResponseDataRecords setCapStyle(Integer capStyle) {
            this.capStyle = capStyle;
            return this;
        }
        public Integer getCapStyle() {
            return this.capStyle;
        }

        public GetFaceModelResultResponseDataRecords setSkinColor(Integer skinColor) {
            this.skinColor = skinColor;
            return this;
        }
        public Integer getSkinColor() {
            return this.skinColor;
        }

        public GetFaceModelResultResponseDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public GetFaceModelResultResponseDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        public GetFaceModelResultResponseDataRecords setHairStyle(Integer hairStyle) {
            this.hairStyle = hairStyle;
            return this;
        }
        public Integer getHairStyle() {
            return this.hairStyle;
        }

        public GetFaceModelResultResponseDataRecords setGenderCode(Integer genderCode) {
            this.genderCode = genderCode;
            return this;
        }
        public Integer getGenderCode() {
            return this.genderCode;
        }

        public GetFaceModelResultResponseDataRecords setRespiratorColor(Integer respiratorColor) {
            this.respiratorColor = respiratorColor;
            return this;
        }
        public Integer getRespiratorColor() {
            return this.respiratorColor;
        }

        public GetFaceModelResultResponseDataRecords setEthicCode(Integer ethicCode) {
            this.ethicCode = ethicCode;
            return this;
        }
        public Integer getEthicCode() {
            return this.ethicCode;
        }

        public GetFaceModelResultResponseDataRecords setAgeLowerLimit(Integer ageLowerLimit) {
            this.ageLowerLimit = ageLowerLimit;
            return this;
        }
        public Integer getAgeLowerLimit() {
            return this.ageLowerLimit;
        }

        public GetFaceModelResultResponseDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public GetFaceModelResultResponseDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        public GetFaceModelResultResponseDataRecords setHairColor(Integer hairColor) {
            this.hairColor = hairColor;
            return this;
        }
        public Integer getHairColor() {
            return this.hairColor;
        }

        public GetFaceModelResultResponseDataRecords setAgeUpLimit(Integer ageUpLimit) {
            this.ageUpLimit = ageUpLimit;
            return this;
        }
        public Integer getAgeUpLimit() {
            return this.ageUpLimit;
        }

        public GetFaceModelResultResponseDataRecords setGlassStyle(Integer glassStyle) {
            this.glassStyle = glassStyle;
            return this;
        }
        public Integer getGlassStyle() {
            return this.glassStyle;
        }

        public GetFaceModelResultResponseDataRecords setGlassColor(Integer glassColor) {
            this.glassColor = glassColor;
            return this;
        }
        public Integer getGlassColor() {
            return this.glassColor;
        }

        public GetFaceModelResultResponseDataRecords setCapColor(Integer capColor) {
            this.capColor = capColor;
            return this;
        }
        public Integer getCapColor() {
            return this.capColor;
        }

        public GetFaceModelResultResponseDataRecords setCapColorReliability(String capColorReliability) {
            this.capColorReliability = capColorReliability;
            return this;
        }
        public String getCapColorReliability() {
            return this.capColorReliability;
        }

        public GetFaceModelResultResponseDataRecords setRespiratorColorReliability(String respiratorColorReliability) {
            this.respiratorColorReliability = respiratorColorReliability;
            return this;
        }
        public String getRespiratorColorReliability() {
            return this.respiratorColorReliability;
        }

        public GetFaceModelResultResponseDataRecords setEthicCodeReliability(String ethicCodeReliability) {
            this.ethicCodeReliability = ethicCodeReliability;
            return this;
        }
        public String getEthicCodeReliability() {
            return this.ethicCodeReliability;
        }

        public GetFaceModelResultResponseDataRecords setGenderCodeReliability(String genderCodeReliability) {
            this.genderCodeReliability = genderCodeReliability;
            return this;
        }
        public String getGenderCodeReliability() {
            return this.genderCodeReliability;
        }

        public GetFaceModelResultResponseDataRecords setGlassColorReliability(String glassColorReliability) {
            this.glassColorReliability = glassColorReliability;
            return this;
        }
        public String getGlassColorReliability() {
            return this.glassColorReliability;
        }

        public GetFaceModelResultResponseDataRecords setSkinColorReliability(String skinColorReliability) {
            this.skinColorReliability = skinColorReliability;
            return this;
        }
        public String getSkinColorReliability() {
            return this.skinColorReliability;
        }

        public GetFaceModelResultResponseDataRecords setMustacheStyleReliability(String mustacheStyleReliability) {
            this.mustacheStyleReliability = mustacheStyleReliability;
            return this;
        }
        public String getMustacheStyleReliability() {
            return this.mustacheStyleReliability;
        }

        public GetFaceModelResultResponseDataRecords setCapStyleReliability(String capStyleReliability) {
            this.capStyleReliability = capStyleReliability;
            return this;
        }
        public String getCapStyleReliability() {
            return this.capStyleReliability;
        }

        public GetFaceModelResultResponseDataRecords setFaceStyleReliability(String faceStyleReliability) {
            this.faceStyleReliability = faceStyleReliability;
            return this;
        }
        public String getFaceStyleReliability() {
            return this.faceStyleReliability;
        }

        public GetFaceModelResultResponseDataRecords setGlassStyleReliability(String glassStyleReliability) {
            this.glassStyleReliability = glassStyleReliability;
            return this;
        }
        public String getGlassStyleReliability() {
            return this.glassStyleReliability;
        }

        public GetFaceModelResultResponseDataRecords setAgeUpLimitReliability(String ageUpLimitReliability) {
            this.ageUpLimitReliability = ageUpLimitReliability;
            return this;
        }
        public String getAgeUpLimitReliability() {
            return this.ageUpLimitReliability;
        }

        public GetFaceModelResultResponseDataRecords setHairStyleReliability(String hairStyleReliability) {
            this.hairStyleReliability = hairStyleReliability;
            return this;
        }
        public String getHairStyleReliability() {
            return this.hairStyleReliability;
        }

        public GetFaceModelResultResponseDataRecords setAgeLowerLimitReliability(String ageLowerLimitReliability) {
            this.ageLowerLimitReliability = ageLowerLimitReliability;
            return this;
        }
        public String getAgeLowerLimitReliability() {
            return this.ageLowerLimitReliability;
        }

        public GetFaceModelResultResponseDataRecords setHairColorReliability(String hairColorReliability) {
            this.hairColorReliability = hairColorReliability;
            return this;
        }
        public String getHairColorReliability() {
            return this.hairColorReliability;
        }

        public GetFaceModelResultResponseDataRecords setFeatureData(java.util.List<Float> featureData) {
            this.featureData = featureData;
            return this;
        }
        public java.util.List<Float> getFeatureData() {
            return this.featureData;
        }

    }

    public static class GetFaceModelResultResponseData extends TeaModel {
        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<GetFaceModelResultResponseDataRecords> records;

        public static GetFaceModelResultResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetFaceModelResultResponseData self = new GetFaceModelResultResponseData();
            return TeaModel.build(map, self);
        }

        public GetFaceModelResultResponseData setRecords(java.util.List<GetFaceModelResultResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetFaceModelResultResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
