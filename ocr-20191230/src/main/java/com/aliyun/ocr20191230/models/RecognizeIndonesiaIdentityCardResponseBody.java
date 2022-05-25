// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeIndonesiaIdentityCardResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeIndonesiaIdentityCardResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeIndonesiaIdentityCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIndonesiaIdentityCardResponseBody self = new RecognizeIndonesiaIdentityCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeIndonesiaIdentityCardResponseBody setData(RecognizeIndonesiaIdentityCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeIndonesiaIdentityCardResponseBodyData getData() {
        return this.data;
    }

    public RecognizeIndonesiaIdentityCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLine self = new RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLine();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLine setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLine self = new RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLine();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLine setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLine self = new RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLine();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLine setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLine self = new RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLine();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLine setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLine self = new RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLine();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLine setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataBirthDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataBirthDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataBirthDateKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataBirthDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataBirthDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataBirthDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataBirthDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataBirthDate self = new RecognizeIndonesiaIdentityCardResponseBodyDataBirthDate();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthDate setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataBirthDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataBirthDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthDate setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlaceKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlaceKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlaceKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlaceKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlaceKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlaceKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlace extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlaceKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlace build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlace self = new RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlace();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlace setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlaceKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlaceKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlace setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlace setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataCardBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataCardBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataCardBoxKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataCardBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataCardBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataCardBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataCardBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataCardBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataCardBox self = new RecognizeIndonesiaIdentityCardResponseBodyDataCardBox();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataCardBox setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataCardBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataCardBox setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataCardBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDateKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDate self = new RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDate();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDate setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDate setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataGenderKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataGenderKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataGenderKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataGenderKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataGenderKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataGenderKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataGender extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataGenderKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataGender build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataGender self = new RecognizeIndonesiaIdentityCardResponseBodyDataGender();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataGender setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataGenderKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataGenderKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataGender setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataGender setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataHeightKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataHeightKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataHeightKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataHeightKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataHeightKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataHeightKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataHeight extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataHeightKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataHeight build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataHeight self = new RecognizeIndonesiaIdentityCardResponseBodyDataHeight();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataHeight setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataHeightKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataHeightKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataHeight setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataHeight setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataIdNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataIdNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataIdNumberKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataIdNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataIdNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataIdNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataIdNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataIdNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataIdNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataIdNumber self = new RecognizeIndonesiaIdentityCardResponseBodyDataIdNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataIdNumber setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataIdNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataIdNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataIdNumber setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataIdNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumberKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumber self = new RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumber setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumber setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatusKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatusKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatusKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatusKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatusKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatusKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatus extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatusKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatus build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatus self = new RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatus();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatus setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatusKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatusKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatus setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatus setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLineKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLine self = new RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLine();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLine setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLine setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLineKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLine self = new RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLine();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLine setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLine setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataNationalityKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataNationalityKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataNationalityKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataNationalityKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNationalityKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNationalityKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataNationality extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataNationalityKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataNationality build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataNationality self = new RecognizeIndonesiaIdentityCardResponseBodyDataNationality();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNationality setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataNationalityKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataNationalityKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNationality setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataNationality setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataOccupationKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataOccupationKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataOccupationKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataOccupationKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataOccupationKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataOccupationKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataOccupation extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataOccupationKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataOccupation build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataOccupation self = new RecognizeIndonesiaIdentityCardResponseBodyDataOccupation();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataOccupation setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataOccupationKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataOccupationKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataOccupation setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataOccupation setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBoxKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBox self = new RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBox();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBox setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBox setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataProvinceKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataProvinceKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataProvinceKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataProvinceKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataProvinceKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataProvinceKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataProvince extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataProvinceKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataProvince build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataProvince self = new RecognizeIndonesiaIdentityCardResponseBodyDataProvince();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataProvince setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataProvinceKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataProvinceKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataProvince setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataProvince setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataReligionKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataReligionKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataReligionKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataReligionKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataReligionKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataReligionKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataReligion extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataReligionKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataReligion build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataReligion self = new RecognizeIndonesiaIdentityCardResponseBodyDataReligion();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataReligion setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataReligionKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataReligionKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataReligion setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataReligion setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataSexKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataSexKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataSexKeyPoints self = new RecognizeIndonesiaIdentityCardResponseBodyDataSexKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataSexKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataSexKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyDataSex extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataSexKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeIndonesiaIdentityCardResponseBodyDataSex build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyDataSex self = new RecognizeIndonesiaIdentityCardResponseBodyDataSex();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataSex setKeyPoints(java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataSexKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeIndonesiaIdentityCardResponseBodyDataSexKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataSex setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyDataSex setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeIndonesiaIdentityCardResponseBodyData extends TeaModel {
        @NameInMap("AddressFifthLine")
        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLine addressFifthLine;

        @NameInMap("AddressFirstLine")
        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLine addressFirstLine;

        @NameInMap("AddressFourthLine")
        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLine addressFourthLine;

        @NameInMap("AddressSecondLine")
        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLine addressSecondLine;

        @NameInMap("AddressThirdLine")
        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLine addressThirdLine;

        @NameInMap("BirthDate")
        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthDate birthDate;

        @NameInMap("BirthPlace")
        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlace birthPlace;

        @NameInMap("CardBox")
        public RecognizeIndonesiaIdentityCardResponseBodyDataCardBox cardBox;

        @NameInMap("ExpiryDate")
        public RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDate expiryDate;

        @NameInMap("Gender")
        public RecognizeIndonesiaIdentityCardResponseBodyDataGender gender;

        @NameInMap("Height")
        public RecognizeIndonesiaIdentityCardResponseBodyDataHeight height;

        @NameInMap("IdNumber")
        public RecognizeIndonesiaIdentityCardResponseBodyDataIdNumber idNumber;

        @NameInMap("LicenseNumber")
        public RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumber licenseNumber;

        @NameInMap("MaritalStatus")
        public RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatus maritalStatus;

        @NameInMap("NameFirstLine")
        public RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLine nameFirstLine;

        @NameInMap("NameSecondLine")
        public RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLine nameSecondLine;

        @NameInMap("Nationality")
        public RecognizeIndonesiaIdentityCardResponseBodyDataNationality nationality;

        @NameInMap("Occupation")
        public RecognizeIndonesiaIdentityCardResponseBodyDataOccupation occupation;

        @NameInMap("PortraitBox")
        public RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBox portraitBox;

        @NameInMap("Province")
        public RecognizeIndonesiaIdentityCardResponseBodyDataProvince province;

        @NameInMap("Religion")
        public RecognizeIndonesiaIdentityCardResponseBodyDataReligion religion;

        @NameInMap("Sex")
        public RecognizeIndonesiaIdentityCardResponseBodyDataSex sex;

        public static RecognizeIndonesiaIdentityCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIndonesiaIdentityCardResponseBodyData self = new RecognizeIndonesiaIdentityCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setAddressFifthLine(RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLine addressFifthLine) {
            this.addressFifthLine = addressFifthLine;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFifthLine getAddressFifthLine() {
            return this.addressFifthLine;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setAddressFirstLine(RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLine addressFirstLine) {
            this.addressFirstLine = addressFirstLine;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFirstLine getAddressFirstLine() {
            return this.addressFirstLine;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setAddressFourthLine(RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLine addressFourthLine) {
            this.addressFourthLine = addressFourthLine;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressFourthLine getAddressFourthLine() {
            return this.addressFourthLine;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setAddressSecondLine(RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLine addressSecondLine) {
            this.addressSecondLine = addressSecondLine;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressSecondLine getAddressSecondLine() {
            return this.addressSecondLine;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setAddressThirdLine(RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLine addressThirdLine) {
            this.addressThirdLine = addressThirdLine;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataAddressThirdLine getAddressThirdLine() {
            return this.addressThirdLine;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setBirthDate(RecognizeIndonesiaIdentityCardResponseBodyDataBirthDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthDate getBirthDate() {
            return this.birthDate;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setBirthPlace(RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlace birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataBirthPlace getBirthPlace() {
            return this.birthPlace;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setCardBox(RecognizeIndonesiaIdentityCardResponseBodyDataCardBox cardBox) {
            this.cardBox = cardBox;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataCardBox getCardBox() {
            return this.cardBox;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setExpiryDate(RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataExpiryDate getExpiryDate() {
            return this.expiryDate;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setGender(RecognizeIndonesiaIdentityCardResponseBodyDataGender gender) {
            this.gender = gender;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataGender getGender() {
            return this.gender;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setHeight(RecognizeIndonesiaIdentityCardResponseBodyDataHeight height) {
            this.height = height;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataHeight getHeight() {
            return this.height;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setIdNumber(RecognizeIndonesiaIdentityCardResponseBodyDataIdNumber idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataIdNumber getIdNumber() {
            return this.idNumber;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setLicenseNumber(RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumber licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataLicenseNumber getLicenseNumber() {
            return this.licenseNumber;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setMaritalStatus(RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatus maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataMaritalStatus getMaritalStatus() {
            return this.maritalStatus;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setNameFirstLine(RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLine nameFirstLine) {
            this.nameFirstLine = nameFirstLine;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataNameFirstLine getNameFirstLine() {
            return this.nameFirstLine;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setNameSecondLine(RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLine nameSecondLine) {
            this.nameSecondLine = nameSecondLine;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataNameSecondLine getNameSecondLine() {
            return this.nameSecondLine;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setNationality(RecognizeIndonesiaIdentityCardResponseBodyDataNationality nationality) {
            this.nationality = nationality;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataNationality getNationality() {
            return this.nationality;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setOccupation(RecognizeIndonesiaIdentityCardResponseBodyDataOccupation occupation) {
            this.occupation = occupation;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataOccupation getOccupation() {
            return this.occupation;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setPortraitBox(RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBox portraitBox) {
            this.portraitBox = portraitBox;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataPortraitBox getPortraitBox() {
            return this.portraitBox;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setProvince(RecognizeIndonesiaIdentityCardResponseBodyDataProvince province) {
            this.province = province;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataProvince getProvince() {
            return this.province;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setReligion(RecognizeIndonesiaIdentityCardResponseBodyDataReligion religion) {
            this.religion = religion;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataReligion getReligion() {
            return this.religion;
        }

        public RecognizeIndonesiaIdentityCardResponseBodyData setSex(RecognizeIndonesiaIdentityCardResponseBodyDataSex sex) {
            this.sex = sex;
            return this;
        }
        public RecognizeIndonesiaIdentityCardResponseBodyDataSex getSex() {
            return this.sex;
        }

    }

}
