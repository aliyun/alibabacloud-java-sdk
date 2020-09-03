// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeAccountPageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeAccountPageResponseData data;

    public static RecognizeAccountPageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAccountPageResponse self = new RecognizeAccountPageResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeAccountPageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeAccountPageResponse setData(RecognizeAccountPageResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeAccountPageResponseData getData() {
        return this.data;
    }

    public static class RecognizeAccountPageResponseDataInvalidStampAreas extends TeaModel {
        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeAccountPageResponseDataInvalidStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseDataInvalidStampAreas self = new RecognizeAccountPageResponseDataInvalidStampAreas();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseDataInvalidStampAreas setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeAccountPageResponseDataInvalidStampAreas setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeAccountPageResponseDataInvalidStampAreas setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAccountPageResponseDataInvalidStampAreas setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAccountPageResponseDataUndertakeStampAreas extends TeaModel {
        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeAccountPageResponseDataUndertakeStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseDataUndertakeStampAreas self = new RecognizeAccountPageResponseDataUndertakeStampAreas();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseDataUndertakeStampAreas setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeAccountPageResponseDataUndertakeStampAreas setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeAccountPageResponseDataUndertakeStampAreas setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAccountPageResponseDataUndertakeStampAreas setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAccountPageResponseDataRegisterStampAreas extends TeaModel {
        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeAccountPageResponseDataRegisterStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseDataRegisterStampAreas self = new RecognizeAccountPageResponseDataRegisterStampAreas();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseDataRegisterStampAreas setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeAccountPageResponseDataRegisterStampAreas setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeAccountPageResponseDataRegisterStampAreas setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAccountPageResponseDataRegisterStampAreas setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAccountPageResponseDataOtherStampAreas extends TeaModel {
        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeAccountPageResponseDataOtherStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseDataOtherStampAreas self = new RecognizeAccountPageResponseDataOtherStampAreas();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseDataOtherStampAreas setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeAccountPageResponseDataOtherStampAreas setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeAccountPageResponseDataOtherStampAreas setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAccountPageResponseDataOtherStampAreas setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAccountPageResponseDataTitleArea extends TeaModel {
        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeAccountPageResponseDataTitleArea build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseDataTitleArea self = new RecognizeAccountPageResponseDataTitleArea();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseDataTitleArea setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeAccountPageResponseDataTitleArea setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeAccountPageResponseDataTitleArea setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAccountPageResponseDataTitleArea setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAccountPageResponseData extends TeaModel {
        @NameInMap("Angle")
        @Validation(required = true)
        public Float angle;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("Relation")
        @Validation(required = true)
        public String relation;

        @NameInMap("BirthPlace")
        @Validation(required = true)
        public String birthPlace;

        @NameInMap("Nationality")
        @Validation(required = true)
        public String nationality;

        @NameInMap("NativePlace")
        @Validation(required = true)
        public String nativePlace;

        @NameInMap("BirthDate")
        @Validation(required = true)
        public String birthDate;

        @NameInMap("IDNumber")
        @Validation(required = true)
        public String IDNumber;

        @NameInMap("InvalidStampAreas")
        @Validation(required = true)
        public java.util.List<RecognizeAccountPageResponseDataInvalidStampAreas> invalidStampAreas;

        @NameInMap("UndertakeStampAreas")
        @Validation(required = true)
        public java.util.List<RecognizeAccountPageResponseDataUndertakeStampAreas> undertakeStampAreas;

        @NameInMap("RegisterStampAreas")
        @Validation(required = true)
        public java.util.List<RecognizeAccountPageResponseDataRegisterStampAreas> registerStampAreas;

        @NameInMap("OtherStampAreas")
        @Validation(required = true)
        public java.util.List<RecognizeAccountPageResponseDataOtherStampAreas> otherStampAreas;

        @NameInMap("TitleArea")
        @Validation(required = true)
        public RecognizeAccountPageResponseDataTitleArea titleArea;

        public static RecognizeAccountPageResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseData self = new RecognizeAccountPageResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseData setAngle(Float angle) {
            this.angle = angle;
            return this;
        }
        public Float getAngle() {
            return this.angle;
        }

        public RecognizeAccountPageResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeAccountPageResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public RecognizeAccountPageResponseData setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public RecognizeAccountPageResponseData setBirthPlace(String birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }
        public String getBirthPlace() {
            return this.birthPlace;
        }

        public RecognizeAccountPageResponseData setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public RecognizeAccountPageResponseData setNativePlace(String nativePlace) {
            this.nativePlace = nativePlace;
            return this;
        }
        public String getNativePlace() {
            return this.nativePlace;
        }

        public RecognizeAccountPageResponseData setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public RecognizeAccountPageResponseData setIDNumber(String IDNumber) {
            this.IDNumber = IDNumber;
            return this;
        }
        public String getIDNumber() {
            return this.IDNumber;
        }

        public RecognizeAccountPageResponseData setInvalidStampAreas(java.util.List<RecognizeAccountPageResponseDataInvalidStampAreas> invalidStampAreas) {
            this.invalidStampAreas = invalidStampAreas;
            return this;
        }
        public java.util.List<RecognizeAccountPageResponseDataInvalidStampAreas> getInvalidStampAreas() {
            return this.invalidStampAreas;
        }

        public RecognizeAccountPageResponseData setUndertakeStampAreas(java.util.List<RecognizeAccountPageResponseDataUndertakeStampAreas> undertakeStampAreas) {
            this.undertakeStampAreas = undertakeStampAreas;
            return this;
        }
        public java.util.List<RecognizeAccountPageResponseDataUndertakeStampAreas> getUndertakeStampAreas() {
            return this.undertakeStampAreas;
        }

        public RecognizeAccountPageResponseData setRegisterStampAreas(java.util.List<RecognizeAccountPageResponseDataRegisterStampAreas> registerStampAreas) {
            this.registerStampAreas = registerStampAreas;
            return this;
        }
        public java.util.List<RecognizeAccountPageResponseDataRegisterStampAreas> getRegisterStampAreas() {
            return this.registerStampAreas;
        }

        public RecognizeAccountPageResponseData setOtherStampAreas(java.util.List<RecognizeAccountPageResponseDataOtherStampAreas> otherStampAreas) {
            this.otherStampAreas = otherStampAreas;
            return this;
        }
        public java.util.List<RecognizeAccountPageResponseDataOtherStampAreas> getOtherStampAreas() {
            return this.otherStampAreas;
        }

        public RecognizeAccountPageResponseData setTitleArea(RecognizeAccountPageResponseDataTitleArea titleArea) {
            this.titleArea = titleArea;
            return this;
        }
        public RecognizeAccountPageResponseDataTitleArea getTitleArea() {
            return this.titleArea;
        }

    }

}
