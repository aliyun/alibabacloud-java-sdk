// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeIdentityCardResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeIdentityCardResponseData data;

    public static RecognizeIdentityCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIdentityCardResponse self = new RecognizeIdentityCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeIdentityCardResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeIdentityCardResponse setData(RecognizeIdentityCardResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeIdentityCardResponseData getData() {
        return this.data;
    }

    public static class RecognizeIdentityCardResponseDataFrontResultCardAreas extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        public static RecognizeIdentityCardResponseDataFrontResultCardAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataFrontResultCardAreas self = new RecognizeIdentityCardResponseDataFrontResultCardAreas();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseDataFrontResultCardAreas setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIdentityCardResponseDataFrontResultCardAreas setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIdentityCardResponseDataFrontResultFaceRectVertices extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        public static RecognizeIdentityCardResponseDataFrontResultFaceRectVertices build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataFrontResultFaceRectVertices self = new RecognizeIdentityCardResponseDataFrontResultFaceRectVertices();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseDataFrontResultFaceRectVertices setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIdentityCardResponseDataFrontResultFaceRectVertices setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        public static RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter self = new RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize extends TeaModel {
        @NameInMap("Height")
        @Validation(required = true)
        public Float height;

        @NameInMap("Width")
        @Validation(required = true)
        public Float width;

        public static RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize self = new RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

    }

    public static class RecognizeIdentityCardResponseDataFrontResultFaceRectangle extends TeaModel {
        @NameInMap("Angle")
        @Validation(required = true)
        public Float angle;

        @NameInMap("Center")
        @Validation(required = true)
        public RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter center;

        @NameInMap("Size")
        @Validation(required = true)
        public RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize size;

        public static RecognizeIdentityCardResponseDataFrontResultFaceRectangle build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataFrontResultFaceRectangle self = new RecognizeIdentityCardResponseDataFrontResultFaceRectangle();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseDataFrontResultFaceRectangle setAngle(Float angle) {
            this.angle = angle;
            return this;
        }
        public Float getAngle() {
            return this.angle;
        }

        public RecognizeIdentityCardResponseDataFrontResultFaceRectangle setCenter(RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter center) {
            this.center = center;
            return this;
        }
        public RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter getCenter() {
            return this.center;
        }

        public RecognizeIdentityCardResponseDataFrontResultFaceRectangle setSize(RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize size) {
            this.size = size;
            return this;
        }
        public RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize getSize() {
            return this.size;
        }

    }

    public static class RecognizeIdentityCardResponseDataFrontResult extends TeaModel {
        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Nationality")
        @Validation(required = true)
        public String nationality;

        @NameInMap("IDNumber")
        @Validation(required = true)
        public String IDNumber;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("BirthDate")
        @Validation(required = true)
        public String birthDate;

        @NameInMap("CardAreas")
        @Validation(required = true)
        public java.util.List<RecognizeIdentityCardResponseDataFrontResultCardAreas> cardAreas;

        @NameInMap("FaceRectVertices")
        @Validation(required = true)
        public java.util.List<RecognizeIdentityCardResponseDataFrontResultFaceRectVertices> faceRectVertices;

        @NameInMap("FaceRectangle")
        @Validation(required = true)
        public RecognizeIdentityCardResponseDataFrontResultFaceRectangle faceRectangle;

        public static RecognizeIdentityCardResponseDataFrontResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataFrontResult self = new RecognizeIdentityCardResponseDataFrontResult();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseDataFrontResult setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public RecognizeIdentityCardResponseDataFrontResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeIdentityCardResponseDataFrontResult setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public RecognizeIdentityCardResponseDataFrontResult setIDNumber(String IDNumber) {
            this.IDNumber = IDNumber;
            return this;
        }
        public String getIDNumber() {
            return this.IDNumber;
        }

        public RecognizeIdentityCardResponseDataFrontResult setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public RecognizeIdentityCardResponseDataFrontResult setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public RecognizeIdentityCardResponseDataFrontResult setCardAreas(java.util.List<RecognizeIdentityCardResponseDataFrontResultCardAreas> cardAreas) {
            this.cardAreas = cardAreas;
            return this;
        }
        public java.util.List<RecognizeIdentityCardResponseDataFrontResultCardAreas> getCardAreas() {
            return this.cardAreas;
        }

        public RecognizeIdentityCardResponseDataFrontResult setFaceRectVertices(java.util.List<RecognizeIdentityCardResponseDataFrontResultFaceRectVertices> faceRectVertices) {
            this.faceRectVertices = faceRectVertices;
            return this;
        }
        public java.util.List<RecognizeIdentityCardResponseDataFrontResultFaceRectVertices> getFaceRectVertices() {
            return this.faceRectVertices;
        }

        public RecognizeIdentityCardResponseDataFrontResult setFaceRectangle(RecognizeIdentityCardResponseDataFrontResultFaceRectangle faceRectangle) {
            this.faceRectangle = faceRectangle;
            return this;
        }
        public RecognizeIdentityCardResponseDataFrontResultFaceRectangle getFaceRectangle() {
            return this.faceRectangle;
        }

    }

    public static class RecognizeIdentityCardResponseDataBackResult extends TeaModel {
        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("Issue")
        @Validation(required = true)
        public String issue;

        public static RecognizeIdentityCardResponseDataBackResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataBackResult self = new RecognizeIdentityCardResponseDataBackResult();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseDataBackResult setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public RecognizeIdentityCardResponseDataBackResult setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public RecognizeIdentityCardResponseDataBackResult setIssue(String issue) {
            this.issue = issue;
            return this;
        }
        public String getIssue() {
            return this.issue;
        }

    }

    public static class RecognizeIdentityCardResponseData extends TeaModel {
        @NameInMap("FrontResult")
        @Validation(required = true)
        public RecognizeIdentityCardResponseDataFrontResult frontResult;

        @NameInMap("BackResult")
        @Validation(required = true)
        public RecognizeIdentityCardResponseDataBackResult backResult;

        public static RecognizeIdentityCardResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseData self = new RecognizeIdentityCardResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseData setFrontResult(RecognizeIdentityCardResponseDataFrontResult frontResult) {
            this.frontResult = frontResult;
            return this;
        }
        public RecognizeIdentityCardResponseDataFrontResult getFrontResult() {
            return this.frontResult;
        }

        public RecognizeIdentityCardResponseData setBackResult(RecognizeIdentityCardResponseDataBackResult backResult) {
            this.backResult = backResult;
            return this;
        }
        public RecognizeIdentityCardResponseDataBackResult getBackResult() {
            return this.backResult;
        }

    }

}
