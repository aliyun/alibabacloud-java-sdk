// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetFaceModelResultResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetFaceModelResultResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetFaceModelResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFaceModelResultResponseBody self = new GetFaceModelResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFaceModelResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFaceModelResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFaceModelResultResponseBody setData(GetFaceModelResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFaceModelResultResponseBodyData getData() {
        return this.data;
    }

    public GetFaceModelResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetFaceModelResultResponseBodyDataRecords extends TeaModel {
        @NameInMap("RightBottomY")
        public Float rightBottomY;

        @NameInMap("HairColorReliability")
        public String hairColorReliability;

        @NameInMap("HairColor")
        public Integer hairColor;

        @NameInMap("FaceStyle")
        public String faceStyle;

        @NameInMap("GlassStyleReliability")
        public String glassStyleReliability;

        @NameInMap("MustacheStyleReliability")
        public String mustacheStyleReliability;

        @NameInMap("RespiratorColorReliability")
        public String respiratorColorReliability;

        @NameInMap("RightBottomX")
        public Float rightBottomX;

        @NameInMap("AgeUpLimit")
        public Integer ageUpLimit;

        @NameInMap("AgeUpLimitReliability")
        public String ageUpLimitReliability;

        @NameInMap("HairStyle")
        public Integer hairStyle;

        @NameInMap("AgeLowerLimit")
        public Integer ageLowerLimit;

        @NameInMap("LeftTopY")
        public Float leftTopY;

        @NameInMap("FeatureData")
        public java.util.List<Float> featureData;

        @NameInMap("SkinColorReliability")
        public String skinColorReliability;

        @NameInMap("CapColor")
        public Integer capColor;

        @NameInMap("FaceStyleReliability")
        public String faceStyleReliability;

        @NameInMap("CapStyleReliability")
        public String capStyleReliability;

        @NameInMap("GenderCodeReliability")
        public String genderCodeReliability;

        @NameInMap("HairStyleReliability")
        public String hairStyleReliability;

        @NameInMap("GlassColorReliability")
        public String glassColorReliability;

        @NameInMap("EthicCode")
        public Integer ethicCode;

        @NameInMap("RespiratorColor")
        public Integer respiratorColor;

        @NameInMap("MustacheStyle")
        public String mustacheStyle;

        @NameInMap("GlassColor")
        public Integer glassColor;

        @NameInMap("GlassStyle")
        public Integer glassStyle;

        @NameInMap("SkinColor")
        public Integer skinColor;

        @NameInMap("CapColorReliability")
        public String capColorReliability;

        @NameInMap("CapStyle")
        public Integer capStyle;

        @NameInMap("GenderCode")
        public Integer genderCode;

        @NameInMap("LeftTopX")
        public Float leftTopX;

        @NameInMap("AgeLowerLimitReliability")
        public String ageLowerLimitReliability;

        @NameInMap("EthicCodeReliability")
        public String ethicCodeReliability;

        public static GetFaceModelResultResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetFaceModelResultResponseBodyDataRecords self = new GetFaceModelResultResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetFaceModelResultResponseBodyDataRecords setRightBottomY(Float rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        public GetFaceModelResultResponseBodyDataRecords setHairColorReliability(String hairColorReliability) {
            this.hairColorReliability = hairColorReliability;
            return this;
        }
        public String getHairColorReliability() {
            return this.hairColorReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setHairColor(Integer hairColor) {
            this.hairColor = hairColor;
            return this;
        }
        public Integer getHairColor() {
            return this.hairColor;
        }

        public GetFaceModelResultResponseBodyDataRecords setFaceStyle(String faceStyle) {
            this.faceStyle = faceStyle;
            return this;
        }
        public String getFaceStyle() {
            return this.faceStyle;
        }

        public GetFaceModelResultResponseBodyDataRecords setGlassStyleReliability(String glassStyleReliability) {
            this.glassStyleReliability = glassStyleReliability;
            return this;
        }
        public String getGlassStyleReliability() {
            return this.glassStyleReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setMustacheStyleReliability(String mustacheStyleReliability) {
            this.mustacheStyleReliability = mustacheStyleReliability;
            return this;
        }
        public String getMustacheStyleReliability() {
            return this.mustacheStyleReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setRespiratorColorReliability(String respiratorColorReliability) {
            this.respiratorColorReliability = respiratorColorReliability;
            return this;
        }
        public String getRespiratorColorReliability() {
            return this.respiratorColorReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setRightBottomX(Float rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        public GetFaceModelResultResponseBodyDataRecords setAgeUpLimit(Integer ageUpLimit) {
            this.ageUpLimit = ageUpLimit;
            return this;
        }
        public Integer getAgeUpLimit() {
            return this.ageUpLimit;
        }

        public GetFaceModelResultResponseBodyDataRecords setAgeUpLimitReliability(String ageUpLimitReliability) {
            this.ageUpLimitReliability = ageUpLimitReliability;
            return this;
        }
        public String getAgeUpLimitReliability() {
            return this.ageUpLimitReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setHairStyle(Integer hairStyle) {
            this.hairStyle = hairStyle;
            return this;
        }
        public Integer getHairStyle() {
            return this.hairStyle;
        }

        public GetFaceModelResultResponseBodyDataRecords setAgeLowerLimit(Integer ageLowerLimit) {
            this.ageLowerLimit = ageLowerLimit;
            return this;
        }
        public Integer getAgeLowerLimit() {
            return this.ageLowerLimit;
        }

        public GetFaceModelResultResponseBodyDataRecords setLeftTopY(Float leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        public GetFaceModelResultResponseBodyDataRecords setFeatureData(java.util.List<Float> featureData) {
            this.featureData = featureData;
            return this;
        }
        public java.util.List<Float> getFeatureData() {
            return this.featureData;
        }

        public GetFaceModelResultResponseBodyDataRecords setSkinColorReliability(String skinColorReliability) {
            this.skinColorReliability = skinColorReliability;
            return this;
        }
        public String getSkinColorReliability() {
            return this.skinColorReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setCapColor(Integer capColor) {
            this.capColor = capColor;
            return this;
        }
        public Integer getCapColor() {
            return this.capColor;
        }

        public GetFaceModelResultResponseBodyDataRecords setFaceStyleReliability(String faceStyleReliability) {
            this.faceStyleReliability = faceStyleReliability;
            return this;
        }
        public String getFaceStyleReliability() {
            return this.faceStyleReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setCapStyleReliability(String capStyleReliability) {
            this.capStyleReliability = capStyleReliability;
            return this;
        }
        public String getCapStyleReliability() {
            return this.capStyleReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setGenderCodeReliability(String genderCodeReliability) {
            this.genderCodeReliability = genderCodeReliability;
            return this;
        }
        public String getGenderCodeReliability() {
            return this.genderCodeReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setHairStyleReliability(String hairStyleReliability) {
            this.hairStyleReliability = hairStyleReliability;
            return this;
        }
        public String getHairStyleReliability() {
            return this.hairStyleReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setGlassColorReliability(String glassColorReliability) {
            this.glassColorReliability = glassColorReliability;
            return this;
        }
        public String getGlassColorReliability() {
            return this.glassColorReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setEthicCode(Integer ethicCode) {
            this.ethicCode = ethicCode;
            return this;
        }
        public Integer getEthicCode() {
            return this.ethicCode;
        }

        public GetFaceModelResultResponseBodyDataRecords setRespiratorColor(Integer respiratorColor) {
            this.respiratorColor = respiratorColor;
            return this;
        }
        public Integer getRespiratorColor() {
            return this.respiratorColor;
        }

        public GetFaceModelResultResponseBodyDataRecords setMustacheStyle(String mustacheStyle) {
            this.mustacheStyle = mustacheStyle;
            return this;
        }
        public String getMustacheStyle() {
            return this.mustacheStyle;
        }

        public GetFaceModelResultResponseBodyDataRecords setGlassColor(Integer glassColor) {
            this.glassColor = glassColor;
            return this;
        }
        public Integer getGlassColor() {
            return this.glassColor;
        }

        public GetFaceModelResultResponseBodyDataRecords setGlassStyle(Integer glassStyle) {
            this.glassStyle = glassStyle;
            return this;
        }
        public Integer getGlassStyle() {
            return this.glassStyle;
        }

        public GetFaceModelResultResponseBodyDataRecords setSkinColor(Integer skinColor) {
            this.skinColor = skinColor;
            return this;
        }
        public Integer getSkinColor() {
            return this.skinColor;
        }

        public GetFaceModelResultResponseBodyDataRecords setCapColorReliability(String capColorReliability) {
            this.capColorReliability = capColorReliability;
            return this;
        }
        public String getCapColorReliability() {
            return this.capColorReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setCapStyle(Integer capStyle) {
            this.capStyle = capStyle;
            return this;
        }
        public Integer getCapStyle() {
            return this.capStyle;
        }

        public GetFaceModelResultResponseBodyDataRecords setGenderCode(Integer genderCode) {
            this.genderCode = genderCode;
            return this;
        }
        public Integer getGenderCode() {
            return this.genderCode;
        }

        public GetFaceModelResultResponseBodyDataRecords setLeftTopX(Float leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        public GetFaceModelResultResponseBodyDataRecords setAgeLowerLimitReliability(String ageLowerLimitReliability) {
            this.ageLowerLimitReliability = ageLowerLimitReliability;
            return this;
        }
        public String getAgeLowerLimitReliability() {
            return this.ageLowerLimitReliability;
        }

        public GetFaceModelResultResponseBodyDataRecords setEthicCodeReliability(String ethicCodeReliability) {
            this.ethicCodeReliability = ethicCodeReliability;
            return this;
        }
        public String getEthicCodeReliability() {
            return this.ethicCodeReliability;
        }

    }

    public static class GetFaceModelResultResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<GetFaceModelResultResponseBodyDataRecords> records;

        public static GetFaceModelResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFaceModelResultResponseBodyData self = new GetFaceModelResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFaceModelResultResponseBodyData setRecords(java.util.List<GetFaceModelResultResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetFaceModelResultResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
