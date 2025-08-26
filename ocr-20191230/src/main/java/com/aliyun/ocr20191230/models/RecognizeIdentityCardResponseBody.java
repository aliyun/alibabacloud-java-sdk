// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeIdentityCardResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeIdentityCardResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D3F5BA69-79C4-46A4-B02B-58C4EEBC4C33</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeIdentityCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIdentityCardResponseBody self = new RecognizeIdentityCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeIdentityCardResponseBody setData(RecognizeIdentityCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeIdentityCardResponseBodyData getData() {
        return this.data;
    }

    public RecognizeIdentityCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeIdentityCardResponseBodyDataBackResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>19800101</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Issue")
        public String issue;

        /**
         * <strong>example:</strong>
         * <p>19970101</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        public static RecognizeIdentityCardResponseBodyDataBackResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseBodyDataBackResult self = new RecognizeIdentityCardResponseBodyDataBackResult();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseBodyDataBackResult setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public RecognizeIdentityCardResponseBodyDataBackResult setIssue(String issue) {
            this.issue = issue;
            return this;
        }
        public String getIssue() {
            return this.issue;
        }

        public RecognizeIdentityCardResponseBodyDataBackResult setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

    public static class RecognizeIdentityCardResponseBodyDataFrontResultCardAreas extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("Y")
        public Float y;

        public static RecognizeIdentityCardResponseBodyDataFrontResultCardAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseBodyDataFrontResultCardAreas self = new RecognizeIdentityCardResponseBodyDataFrontResultCardAreas();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultCardAreas setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultCardAreas setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIdentityCardResponseBodyDataFrontResultFaceRectVertices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>429.46124267578125</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>164.23321533203125</p>
         */
        @NameInMap("Y")
        public Float y;

        public static RecognizeIdentityCardResponseBodyDataFrontResultFaceRectVertices build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseBodyDataFrontResultFaceRectVertices self = new RecognizeIdentityCardResponseBodyDataFrontResultFaceRectVertices();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectVertices setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectVertices setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleCenter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>475.59390258789062</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>225.20643615722656</p>
         */
        @NameInMap("Y")
        public Float y;

        public static RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleCenter build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleCenter self = new RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleCenter();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleCenter setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleCenter setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleSize extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>97.063156127929688</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <strong>example:</strong>
         * <p>118.16333770751953</p>
         */
        @NameInMap("Width")
        public Float width;

        public static RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleSize build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleSize self = new RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleSize();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleSize setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleSize setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

    }

    public static class RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>-87.710586547851562</p>
         */
        @NameInMap("Angle")
        public Float angle;

        @NameInMap("Center")
        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleCenter center;

        @NameInMap("Size")
        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleSize size;

        public static RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangle build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangle self = new RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangle();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangle setAngle(Float angle) {
            this.angle = angle;
            return this;
        }
        public Float getAngle() {
            return this.angle;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangle setCenter(RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleCenter center) {
            this.center = center;
            return this;
        }
        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleCenter getCenter() {
            return this.center;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangle setSize(RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleSize size) {
            this.size = size;
            return this;
        }
        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangleSize getSize() {
            return this.size;
        }

    }

    public static class RecognizeIdentityCardResponseBodyDataFrontResult extends TeaModel {
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>19960111</p>
         */
        @NameInMap("BirthDate")
        public String birthDate;

        @NameInMap("CardAreas")
        public java.util.List<RecognizeIdentityCardResponseBodyDataFrontResultCardAreas> cardAreas;

        @NameInMap("FaceRectVertices")
        public java.util.List<RecognizeIdentityCardResponseBodyDataFrontResultFaceRectVertices> faceRectVertices;

        @NameInMap("FaceRectangle")
        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangle faceRectangle;

        @NameInMap("Gender")
        public String gender;

        /**
         * <strong>example:</strong>
         * <p>310228199601115411</p>
         */
        @NameInMap("IDNumber")
        public String IDNumber;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nationality")
        public String nationality;

        public static RecognizeIdentityCardResponseBodyDataFrontResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseBodyDataFrontResult self = new RecognizeIdentityCardResponseBodyDataFrontResult();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseBodyDataFrontResult setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResult setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResult setCardAreas(java.util.List<RecognizeIdentityCardResponseBodyDataFrontResultCardAreas> cardAreas) {
            this.cardAreas = cardAreas;
            return this;
        }
        public java.util.List<RecognizeIdentityCardResponseBodyDataFrontResultCardAreas> getCardAreas() {
            return this.cardAreas;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResult setFaceRectVertices(java.util.List<RecognizeIdentityCardResponseBodyDataFrontResultFaceRectVertices> faceRectVertices) {
            this.faceRectVertices = faceRectVertices;
            return this;
        }
        public java.util.List<RecognizeIdentityCardResponseBodyDataFrontResultFaceRectVertices> getFaceRectVertices() {
            return this.faceRectVertices;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResult setFaceRectangle(RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangle faceRectangle) {
            this.faceRectangle = faceRectangle;
            return this;
        }
        public RecognizeIdentityCardResponseBodyDataFrontResultFaceRectangle getFaceRectangle() {
            return this.faceRectangle;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResult setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResult setIDNumber(String IDNumber) {
            this.IDNumber = IDNumber;
            return this;
        }
        public String getIDNumber() {
            return this.IDNumber;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeIdentityCardResponseBodyDataFrontResult setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

    }

    public static class RecognizeIdentityCardResponseBodyData extends TeaModel {
        @NameInMap("BackResult")
        public RecognizeIdentityCardResponseBodyDataBackResult backResult;

        @NameInMap("FrontResult")
        public RecognizeIdentityCardResponseBodyDataFrontResult frontResult;

        public static RecognizeIdentityCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseBodyData self = new RecognizeIdentityCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeIdentityCardResponseBodyData setBackResult(RecognizeIdentityCardResponseBodyDataBackResult backResult) {
            this.backResult = backResult;
            return this;
        }
        public RecognizeIdentityCardResponseBodyDataBackResult getBackResult() {
            return this.backResult;
        }

        public RecognizeIdentityCardResponseBodyData setFrontResult(RecognizeIdentityCardResponseBodyDataFrontResult frontResult) {
            this.frontResult = frontResult;
            return this;
        }
        public RecognizeIdentityCardResponseBodyDataFrontResult getFrontResult() {
            return this.frontResult;
        }

    }

}
