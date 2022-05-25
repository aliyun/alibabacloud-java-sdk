// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVietnamIdentityCardResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeVietnamIdentityCardResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeVietnamIdentityCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVietnamIdentityCardResponseBody self = new RecognizeVietnamIdentityCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeVietnamIdentityCardResponseBody setData(RecognizeVietnamIdentityCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeVietnamIdentityCardResponseBodyData getData() {
        return this.data;
    }

    public RecognizeVietnamIdentityCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLineKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLine self = new RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLine();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLine setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLineKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLine self = new RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLine();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLine setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataBirthDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataBirthDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataBirthDateKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataBirthDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataBirthDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataBirthDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataBirthDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataBirthDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataBirthDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataBirthDate self = new RecognizeVietnamIdentityCardResponseBodyDataBirthDate();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataBirthDate setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataBirthDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataBirthDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataBirthDate setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataBirthDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataCardBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataCardBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataCardBoxKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataCardBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataCardBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataCardBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataCardBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataCardBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataCardBox self = new RecognizeVietnamIdentityCardResponseBodyDataCardBox();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataCardBox setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataCardBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataCardBox setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataCardBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataDriveClassKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataDriveClassKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataDriveClassKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataDriveClassKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataDriveClassKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataDriveClassKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataDriveClass extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataDriveClassKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataDriveClass build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataDriveClass self = new RecognizeVietnamIdentityCardResponseBodyDataDriveClass();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataDriveClass setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataDriveClassKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataDriveClassKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataDriveClass setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataDriveClass setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataExpiryDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataExpiryDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataExpiryDateKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataExpiryDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataExpiryDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataExpiryDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataExpiryDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataExpiryDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataExpiryDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataExpiryDate self = new RecognizeVietnamIdentityCardResponseBodyDataExpiryDate();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataExpiryDate setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataExpiryDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataExpiryDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataExpiryDate setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataExpiryDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataFullNameKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataFullNameKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataFullNameKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataFullNameKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataFullNameKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataFullNameKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataFullName extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataFullNameKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataFullName build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataFullName self = new RecognizeVietnamIdentityCardResponseBodyDataFullName();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataFullName setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataFullNameKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataFullNameKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataFullName setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataFullName setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataIdNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataIdNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataIdNumberKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataIdNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataIdNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataIdNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataIdNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataIdNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataIdNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataIdNumber self = new RecognizeVietnamIdentityCardResponseBodyDataIdNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataIdNumber setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataIdNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataIdNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataIdNumber setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataIdNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataNationalityKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataNationalityKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataNationalityKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataNationalityKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataNationalityKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataNationalityKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataNationality extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataNationalityKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataNationality build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataNationality self = new RecognizeVietnamIdentityCardResponseBodyDataNationality();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataNationality setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataNationalityKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataNationalityKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataNationality setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataNationality setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLineKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLine self = new RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLine();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLine setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLine setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLineKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLine self = new RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLine();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLine setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLine setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataPortraitBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataPortraitBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataPortraitBoxKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataPortraitBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataPortraitBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataPortraitBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataPortraitBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataPortraitBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataPortraitBox self = new RecognizeVietnamIdentityCardResponseBodyDataPortraitBox();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataPortraitBox setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataPortraitBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataPortraitBox setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataPortraitBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLineKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLine self = new RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLine();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLine setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLine setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLineKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLine self = new RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLine();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLine setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLine setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataSexKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeVietnamIdentityCardResponseBodyDataSexKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataSexKeyPoints self = new RecognizeVietnamIdentityCardResponseBodyDataSexKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataSexKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataSexKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyDataSex extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataSexKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeVietnamIdentityCardResponseBodyDataSex build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyDataSex self = new RecognizeVietnamIdentityCardResponseBodyDataSex();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyDataSex setKeyPoints(java.util.List<RecognizeVietnamIdentityCardResponseBodyDataSexKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeVietnamIdentityCardResponseBodyDataSexKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataSex setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeVietnamIdentityCardResponseBodyDataSex setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeVietnamIdentityCardResponseBodyData extends TeaModel {
        @NameInMap("AddressFirstLine")
        public RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLine addressFirstLine;

        @NameInMap("AddressSecondLine")
        public RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLine addressSecondLine;

        @NameInMap("BirthDate")
        public RecognizeVietnamIdentityCardResponseBodyDataBirthDate birthDate;

        @NameInMap("CardBox")
        public RecognizeVietnamIdentityCardResponseBodyDataCardBox cardBox;

        @NameInMap("DriveClass")
        public RecognizeVietnamIdentityCardResponseBodyDataDriveClass driveClass;

        @NameInMap("ExpiryDate")
        public RecognizeVietnamIdentityCardResponseBodyDataExpiryDate expiryDate;

        @NameInMap("FullName")
        public RecognizeVietnamIdentityCardResponseBodyDataFullName fullName;

        @NameInMap("IdNumber")
        public RecognizeVietnamIdentityCardResponseBodyDataIdNumber idNumber;

        @NameInMap("Nationality")
        public RecognizeVietnamIdentityCardResponseBodyDataNationality nationality;

        @NameInMap("OriginPlaceFirstLine")
        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLine originPlaceFirstLine;

        @NameInMap("OriginPlaceSecondLine")
        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLine originPlaceSecondLine;

        @NameInMap("PortraitBox")
        public RecognizeVietnamIdentityCardResponseBodyDataPortraitBox portraitBox;

        @NameInMap("ResidencePlaceFirstLine")
        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLine residencePlaceFirstLine;

        @NameInMap("ResidencePlaceSecondLine")
        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLine residencePlaceSecondLine;

        @NameInMap("Sex")
        public RecognizeVietnamIdentityCardResponseBodyDataSex sex;

        public static RecognizeVietnamIdentityCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVietnamIdentityCardResponseBodyData self = new RecognizeVietnamIdentityCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeVietnamIdentityCardResponseBodyData setAddressFirstLine(RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLine addressFirstLine) {
            this.addressFirstLine = addressFirstLine;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataAddressFirstLine getAddressFirstLine() {
            return this.addressFirstLine;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setAddressSecondLine(RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLine addressSecondLine) {
            this.addressSecondLine = addressSecondLine;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataAddressSecondLine getAddressSecondLine() {
            return this.addressSecondLine;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setBirthDate(RecognizeVietnamIdentityCardResponseBodyDataBirthDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataBirthDate getBirthDate() {
            return this.birthDate;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setCardBox(RecognizeVietnamIdentityCardResponseBodyDataCardBox cardBox) {
            this.cardBox = cardBox;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataCardBox getCardBox() {
            return this.cardBox;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setDriveClass(RecognizeVietnamIdentityCardResponseBodyDataDriveClass driveClass) {
            this.driveClass = driveClass;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataDriveClass getDriveClass() {
            return this.driveClass;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setExpiryDate(RecognizeVietnamIdentityCardResponseBodyDataExpiryDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataExpiryDate getExpiryDate() {
            return this.expiryDate;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setFullName(RecognizeVietnamIdentityCardResponseBodyDataFullName fullName) {
            this.fullName = fullName;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataFullName getFullName() {
            return this.fullName;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setIdNumber(RecognizeVietnamIdentityCardResponseBodyDataIdNumber idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataIdNumber getIdNumber() {
            return this.idNumber;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setNationality(RecognizeVietnamIdentityCardResponseBodyDataNationality nationality) {
            this.nationality = nationality;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataNationality getNationality() {
            return this.nationality;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setOriginPlaceFirstLine(RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLine originPlaceFirstLine) {
            this.originPlaceFirstLine = originPlaceFirstLine;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceFirstLine getOriginPlaceFirstLine() {
            return this.originPlaceFirstLine;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setOriginPlaceSecondLine(RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLine originPlaceSecondLine) {
            this.originPlaceSecondLine = originPlaceSecondLine;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataOriginPlaceSecondLine getOriginPlaceSecondLine() {
            return this.originPlaceSecondLine;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setPortraitBox(RecognizeVietnamIdentityCardResponseBodyDataPortraitBox portraitBox) {
            this.portraitBox = portraitBox;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataPortraitBox getPortraitBox() {
            return this.portraitBox;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setResidencePlaceFirstLine(RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLine residencePlaceFirstLine) {
            this.residencePlaceFirstLine = residencePlaceFirstLine;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceFirstLine getResidencePlaceFirstLine() {
            return this.residencePlaceFirstLine;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setResidencePlaceSecondLine(RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLine residencePlaceSecondLine) {
            this.residencePlaceSecondLine = residencePlaceSecondLine;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataResidencePlaceSecondLine getResidencePlaceSecondLine() {
            return this.residencePlaceSecondLine;
        }

        public RecognizeVietnamIdentityCardResponseBodyData setSex(RecognizeVietnamIdentityCardResponseBodyDataSex sex) {
            this.sex = sex;
            return this;
        }
        public RecognizeVietnamIdentityCardResponseBodyDataSex getSex() {
            return this.sex;
        }

    }

}
