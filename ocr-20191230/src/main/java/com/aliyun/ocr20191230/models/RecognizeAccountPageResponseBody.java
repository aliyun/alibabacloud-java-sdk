// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeAccountPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeAccountPageResponseBodyData data;

    public static RecognizeAccountPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAccountPageResponseBody self = new RecognizeAccountPageResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeAccountPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeAccountPageResponseBody setData(RecognizeAccountPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeAccountPageResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeAccountPageResponseBodyDataTitleArea extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static RecognizeAccountPageResponseBodyDataTitleArea build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseBodyDataTitleArea self = new RecognizeAccountPageResponseBodyDataTitleArea();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseBodyDataTitleArea setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeAccountPageResponseBodyDataTitleArea setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeAccountPageResponseBodyDataTitleArea setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAccountPageResponseBodyDataTitleArea setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class RecognizeAccountPageResponseBodyDataRegisterStampAreas extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static RecognizeAccountPageResponseBodyDataRegisterStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseBodyDataRegisterStampAreas self = new RecognizeAccountPageResponseBodyDataRegisterStampAreas();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseBodyDataRegisterStampAreas setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeAccountPageResponseBodyDataRegisterStampAreas setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeAccountPageResponseBodyDataRegisterStampAreas setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAccountPageResponseBodyDataRegisterStampAreas setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class RecognizeAccountPageResponseBodyDataOtherStampAreas extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static RecognizeAccountPageResponseBodyDataOtherStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseBodyDataOtherStampAreas self = new RecognizeAccountPageResponseBodyDataOtherStampAreas();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseBodyDataOtherStampAreas setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeAccountPageResponseBodyDataOtherStampAreas setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeAccountPageResponseBodyDataOtherStampAreas setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAccountPageResponseBodyDataOtherStampAreas setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class RecognizeAccountPageResponseBodyDataUndertakeStampAreas extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static RecognizeAccountPageResponseBodyDataUndertakeStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseBodyDataUndertakeStampAreas self = new RecognizeAccountPageResponseBodyDataUndertakeStampAreas();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseBodyDataUndertakeStampAreas setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeAccountPageResponseBodyDataUndertakeStampAreas setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeAccountPageResponseBodyDataUndertakeStampAreas setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAccountPageResponseBodyDataUndertakeStampAreas setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class RecognizeAccountPageResponseBodyDataInvalidStampAreas extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static RecognizeAccountPageResponseBodyDataInvalidStampAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseBodyDataInvalidStampAreas self = new RecognizeAccountPageResponseBodyDataInvalidStampAreas();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseBodyDataInvalidStampAreas setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeAccountPageResponseBodyDataInvalidStampAreas setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeAccountPageResponseBodyDataInvalidStampAreas setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAccountPageResponseBodyDataInvalidStampAreas setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class RecognizeAccountPageResponseBodyData extends TeaModel {
        @NameInMap("Gender")
        public String gender;

        @NameInMap("TitleArea")
        public RecognizeAccountPageResponseBodyDataTitleArea titleArea;

        @NameInMap("Angle")
        public Float angle;

        @NameInMap("RegisterStampAreas")
        public java.util.List<RecognizeAccountPageResponseBodyDataRegisterStampAreas> registerStampAreas;

        @NameInMap("Nationality")
        public String nationality;

        @NameInMap("BirthPlace")
        public String birthPlace;

        @NameInMap("OtherStampAreas")
        public java.util.List<RecognizeAccountPageResponseBodyDataOtherStampAreas> otherStampAreas;

        @NameInMap("UndertakeStampAreas")
        public java.util.List<RecognizeAccountPageResponseBodyDataUndertakeStampAreas> undertakeStampAreas;

        @NameInMap("BirthDate")
        public String birthDate;

        @NameInMap("Relation")
        public String relation;

        @NameInMap("NativePlace")
        public String nativePlace;

        @NameInMap("Name")
        public String name;

        @NameInMap("IDNumber")
        public String IDNumber;

        @NameInMap("InvalidStampAreas")
        public java.util.List<RecognizeAccountPageResponseBodyDataInvalidStampAreas> invalidStampAreas;

        public static RecognizeAccountPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAccountPageResponseBodyData self = new RecognizeAccountPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeAccountPageResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public RecognizeAccountPageResponseBodyData setTitleArea(RecognizeAccountPageResponseBodyDataTitleArea titleArea) {
            this.titleArea = titleArea;
            return this;
        }
        public RecognizeAccountPageResponseBodyDataTitleArea getTitleArea() {
            return this.titleArea;
        }

        public RecognizeAccountPageResponseBodyData setAngle(Float angle) {
            this.angle = angle;
            return this;
        }
        public Float getAngle() {
            return this.angle;
        }

        public RecognizeAccountPageResponseBodyData setRegisterStampAreas(java.util.List<RecognizeAccountPageResponseBodyDataRegisterStampAreas> registerStampAreas) {
            this.registerStampAreas = registerStampAreas;
            return this;
        }
        public java.util.List<RecognizeAccountPageResponseBodyDataRegisterStampAreas> getRegisterStampAreas() {
            return this.registerStampAreas;
        }

        public RecognizeAccountPageResponseBodyData setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public RecognizeAccountPageResponseBodyData setBirthPlace(String birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }
        public String getBirthPlace() {
            return this.birthPlace;
        }

        public RecognizeAccountPageResponseBodyData setOtherStampAreas(java.util.List<RecognizeAccountPageResponseBodyDataOtherStampAreas> otherStampAreas) {
            this.otherStampAreas = otherStampAreas;
            return this;
        }
        public java.util.List<RecognizeAccountPageResponseBodyDataOtherStampAreas> getOtherStampAreas() {
            return this.otherStampAreas;
        }

        public RecognizeAccountPageResponseBodyData setUndertakeStampAreas(java.util.List<RecognizeAccountPageResponseBodyDataUndertakeStampAreas> undertakeStampAreas) {
            this.undertakeStampAreas = undertakeStampAreas;
            return this;
        }
        public java.util.List<RecognizeAccountPageResponseBodyDataUndertakeStampAreas> getUndertakeStampAreas() {
            return this.undertakeStampAreas;
        }

        public RecognizeAccountPageResponseBodyData setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public RecognizeAccountPageResponseBodyData setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public RecognizeAccountPageResponseBodyData setNativePlace(String nativePlace) {
            this.nativePlace = nativePlace;
            return this;
        }
        public String getNativePlace() {
            return this.nativePlace;
        }

        public RecognizeAccountPageResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeAccountPageResponseBodyData setIDNumber(String IDNumber) {
            this.IDNumber = IDNumber;
            return this;
        }
        public String getIDNumber() {
            return this.IDNumber;
        }

        public RecognizeAccountPageResponseBodyData setInvalidStampAreas(java.util.List<RecognizeAccountPageResponseBodyDataInvalidStampAreas> invalidStampAreas) {
            this.invalidStampAreas = invalidStampAreas;
            return this;
        }
        public java.util.List<RecognizeAccountPageResponseBodyDataInvalidStampAreas> getInvalidStampAreas() {
            return this.invalidStampAreas;
        }

    }

}
