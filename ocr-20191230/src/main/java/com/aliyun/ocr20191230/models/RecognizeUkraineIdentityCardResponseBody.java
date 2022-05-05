// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeUkraineIdentityCardResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeUkraineIdentityCardResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeUkraineIdentityCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeUkraineIdentityCardResponseBody self = new RecognizeUkraineIdentityCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeUkraineIdentityCardResponseBody setData(RecognizeUkraineIdentityCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeUkraineIdentityCardResponseBodyData getData() {
        return this.data;
    }

    public RecognizeUkraineIdentityCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataBirthDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataBirthDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataBirthDateKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataBirthDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataBirthDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataBirthDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataBirthDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataBirthDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataBirthDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataBirthDate self = new RecognizeUkraineIdentityCardResponseBodyDataBirthDate();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataBirthDate setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataBirthDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataBirthDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataBirthDate setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataBirthDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataCardBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataCardBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataCardBoxKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataCardBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataCardBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataCardBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataCardBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataCardBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataCardBox self = new RecognizeUkraineIdentityCardResponseBodyDataCardBox();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataCardBox setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataCardBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataCardBox setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataCardBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataDocumentNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataDocumentNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataDocumentNumberKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataDocumentNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataDocumentNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataDocumentNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataDocumentNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataDocumentNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataDocumentNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataDocumentNumber self = new RecognizeUkraineIdentityCardResponseBodyDataDocumentNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataDocumentNumber setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataDocumentNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataDocumentNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataDocumentNumber setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataDocumentNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataExpiryDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataExpiryDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataExpiryDateKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataExpiryDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataExpiryDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataExpiryDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataExpiryDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataExpiryDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataExpiryDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataExpiryDate self = new RecognizeUkraineIdentityCardResponseBodyDataExpiryDate();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataExpiryDate setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataExpiryDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataExpiryDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataExpiryDate setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataExpiryDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataNameEnglishKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataNameEnglishKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataNameEnglishKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataNameEnglishKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNameEnglishKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNameEnglishKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataNameEnglish extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataNameEnglishKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataNameEnglish build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataNameEnglish self = new RecognizeUkraineIdentityCardResponseBodyDataNameEnglish();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNameEnglish setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataNameEnglishKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataNameEnglishKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNameEnglish setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNameEnglish setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataNameUkraineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataNameUkraineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataNameUkraineKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataNameUkraineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNameUkraineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNameUkraineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataNameUkraine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataNameUkraineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataNameUkraine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataNameUkraine self = new RecognizeUkraineIdentityCardResponseBodyDataNameUkraine();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNameUkraine setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataNameUkraineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataNameUkraineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNameUkraine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNameUkraine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataNationalityKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataNationalityKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataNationalityKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataNationalityKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNationalityKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNationalityKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataNationality extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataNationalityKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataNationality build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataNationality self = new RecognizeUkraineIdentityCardResponseBodyDataNationality();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNationality setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataNationalityKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataNationalityKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNationality setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataNationality setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataPatronymicKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataPatronymicKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataPatronymicKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataPatronymicKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataPatronymicKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataPatronymicKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataPatronymic extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataPatronymicKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataPatronymic build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataPatronymic self = new RecognizeUkraineIdentityCardResponseBodyDataPatronymic();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataPatronymic setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataPatronymicKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataPatronymicKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataPatronymic setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataPatronymic setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataPortraitBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataPortraitBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataPortraitBoxKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataPortraitBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataPortraitBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataPortraitBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataPortraitBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataPortraitBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataPortraitBox self = new RecognizeUkraineIdentityCardResponseBodyDataPortraitBox();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataPortraitBox setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataPortraitBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataPortraitBox setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataPortraitBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataRecordNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataRecordNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataRecordNumberKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataRecordNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataRecordNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataRecordNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataRecordNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataRecordNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataRecordNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataRecordNumber self = new RecognizeUkraineIdentityCardResponseBodyDataRecordNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataRecordNumber setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataRecordNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataRecordNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataRecordNumber setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataRecordNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataSexKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataSexKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataSexKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataSexKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSexKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSexKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataSex extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataSexKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataSex build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataSex self = new RecognizeUkraineIdentityCardResponseBodyDataSex();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSex setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataSexKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataSexKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSex setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSex setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglishKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglishKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglishKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglishKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglishKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglishKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglish extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglishKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglish build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglish self = new RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglish();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglish setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglishKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglishKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglish setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglish setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraineKeyPoints self = new RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraine self = new RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraine();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraine setKeyPoints(java.util.List<RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeUkraineIdentityCardResponseBodyData extends TeaModel {
        @NameInMap("BirthDate")
        public RecognizeUkraineIdentityCardResponseBodyDataBirthDate birthDate;

        @NameInMap("CardBox")
        public RecognizeUkraineIdentityCardResponseBodyDataCardBox cardBox;

        @NameInMap("DocumentNumber")
        public RecognizeUkraineIdentityCardResponseBodyDataDocumentNumber documentNumber;

        @NameInMap("ExpiryDate")
        public RecognizeUkraineIdentityCardResponseBodyDataExpiryDate expiryDate;

        @NameInMap("NameEnglish")
        public RecognizeUkraineIdentityCardResponseBodyDataNameEnglish nameEnglish;

        @NameInMap("NameUkraine")
        public RecognizeUkraineIdentityCardResponseBodyDataNameUkraine nameUkraine;

        @NameInMap("Nationality")
        public RecognizeUkraineIdentityCardResponseBodyDataNationality nationality;

        @NameInMap("Patronymic")
        public RecognizeUkraineIdentityCardResponseBodyDataPatronymic patronymic;

        @NameInMap("PortraitBox")
        public RecognizeUkraineIdentityCardResponseBodyDataPortraitBox portraitBox;

        @NameInMap("RecordNumber")
        public RecognizeUkraineIdentityCardResponseBodyDataRecordNumber recordNumber;

        @NameInMap("Sex")
        public RecognizeUkraineIdentityCardResponseBodyDataSex sex;

        @NameInMap("SurnameEnglish")
        public RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglish surnameEnglish;

        @NameInMap("SurnameUkraine")
        public RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraine surnameUkraine;

        public static RecognizeUkraineIdentityCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeUkraineIdentityCardResponseBodyData self = new RecognizeUkraineIdentityCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeUkraineIdentityCardResponseBodyData setBirthDate(RecognizeUkraineIdentityCardResponseBodyDataBirthDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataBirthDate getBirthDate() {
            return this.birthDate;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setCardBox(RecognizeUkraineIdentityCardResponseBodyDataCardBox cardBox) {
            this.cardBox = cardBox;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataCardBox getCardBox() {
            return this.cardBox;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setDocumentNumber(RecognizeUkraineIdentityCardResponseBodyDataDocumentNumber documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataDocumentNumber getDocumentNumber() {
            return this.documentNumber;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setExpiryDate(RecognizeUkraineIdentityCardResponseBodyDataExpiryDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataExpiryDate getExpiryDate() {
            return this.expiryDate;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setNameEnglish(RecognizeUkraineIdentityCardResponseBodyDataNameEnglish nameEnglish) {
            this.nameEnglish = nameEnglish;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataNameEnglish getNameEnglish() {
            return this.nameEnglish;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setNameUkraine(RecognizeUkraineIdentityCardResponseBodyDataNameUkraine nameUkraine) {
            this.nameUkraine = nameUkraine;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataNameUkraine getNameUkraine() {
            return this.nameUkraine;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setNationality(RecognizeUkraineIdentityCardResponseBodyDataNationality nationality) {
            this.nationality = nationality;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataNationality getNationality() {
            return this.nationality;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setPatronymic(RecognizeUkraineIdentityCardResponseBodyDataPatronymic patronymic) {
            this.patronymic = patronymic;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataPatronymic getPatronymic() {
            return this.patronymic;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setPortraitBox(RecognizeUkraineIdentityCardResponseBodyDataPortraitBox portraitBox) {
            this.portraitBox = portraitBox;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataPortraitBox getPortraitBox() {
            return this.portraitBox;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setRecordNumber(RecognizeUkraineIdentityCardResponseBodyDataRecordNumber recordNumber) {
            this.recordNumber = recordNumber;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataRecordNumber getRecordNumber() {
            return this.recordNumber;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setSex(RecognizeUkraineIdentityCardResponseBodyDataSex sex) {
            this.sex = sex;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataSex getSex() {
            return this.sex;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setSurnameEnglish(RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglish surnameEnglish) {
            this.surnameEnglish = surnameEnglish;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataSurnameEnglish getSurnameEnglish() {
            return this.surnameEnglish;
        }

        public RecognizeUkraineIdentityCardResponseBodyData setSurnameUkraine(RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraine surnameUkraine) {
            this.surnameUkraine = surnameUkraine;
            return this;
        }
        public RecognizeUkraineIdentityCardResponseBodyDataSurnameUkraine getSurnameUkraine() {
            return this.surnameUkraine;
        }

    }

}
