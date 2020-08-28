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

    public static class RecognizeIdentityCardResponseDataFrontResultCardAreas extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Double x;

        @NameInMap("Y")
        @Validation(required = true)
        public Double y;

        public static RecognizeIdentityCardResponseDataFrontResultCardAreas build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataFrontResultCardAreas self = new RecognizeIdentityCardResponseDataFrontResultCardAreas();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeIdentityCardResponseDataFrontResultFaceRectVertices extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Double x;

        @NameInMap("Y")
        @Validation(required = true)
        public Double y;

        public static RecognizeIdentityCardResponseDataFrontResultFaceRectVertices build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataFrontResultFaceRectVertices self = new RecognizeIdentityCardResponseDataFrontResultFaceRectVertices();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Double x;

        @NameInMap("Y")
        @Validation(required = true)
        public Double y;

        public static RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter self = new RecognizeIdentityCardResponseDataFrontResultFaceRectangleCenter();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize extends TeaModel {
        @NameInMap("Height")
        @Validation(required = true)
        public Double height;

        @NameInMap("Width")
        @Validation(required = true)
        public Double width;

        public static RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize self = new RecognizeIdentityCardResponseDataFrontResultFaceRectangleSize();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeIdentityCardResponseDataFrontResultFaceRectangle extends TeaModel {
        @NameInMap("Angle")
        @Validation(required = true)
        public Double angle;

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

    }

}
