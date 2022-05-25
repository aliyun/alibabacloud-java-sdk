// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeRussiaIdentityCardResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeRussiaIdentityCardResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeRussiaIdentityCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRussiaIdentityCardResponseBody self = new RecognizeRussiaIdentityCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeRussiaIdentityCardResponseBody setData(RecognizeRussiaIdentityCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeRussiaIdentityCardResponseBodyData getData() {
        return this.data;
    }

    public RecognizeRussiaIdentityCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataBirthDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataBirthDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataBirthDateKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataBirthDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataBirthDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataBirthDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataBirthDate self = new RecognizeRussiaIdentityCardResponseBodyDataBirthDate();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthDate setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthDate setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLineKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLine self = new RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLine();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLine setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLineKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLine self = new RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLine();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLine setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLineKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLine self = new RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLine();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLine setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataCardBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataCardBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataCardBoxKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataCardBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataCardBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataCardBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataCardBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataCardBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataCardBox self = new RecognizeRussiaIdentityCardResponseBodyDataCardBox();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataCardBox setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataCardBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataCardBox setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataCardBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataGivenNameKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataGivenNameKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataGivenNameKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataGivenNameKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataGivenNameKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataGivenNameKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataGivenName extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataGivenNameKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataGivenName build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataGivenName self = new RecognizeRussiaIdentityCardResponseBodyDataGivenName();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataGivenName setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataGivenNameKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataGivenNameKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataGivenName setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataGivenName setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataIdNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataIdNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataIdNumberKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataIdNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataIdNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataIdNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataIdNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataIdNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataIdNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataIdNumber self = new RecognizeRussiaIdentityCardResponseBodyDataIdNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataIdNumber setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataIdNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataIdNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataIdNumber setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataIdNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataPaternalNameKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataPaternalNameKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataPaternalNameKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataPaternalNameKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataPaternalNameKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataPaternalNameKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataPaternalName extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataPaternalNameKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataPaternalName build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataPaternalName self = new RecognizeRussiaIdentityCardResponseBodyDataPaternalName();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataPaternalName setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataPaternalNameKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataPaternalNameKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataPaternalName setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataPaternalName setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataPortraitBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataPortraitBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataPortraitBoxKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataPortraitBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataPortraitBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataPortraitBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataPortraitBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataPortraitBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataPortraitBox self = new RecognizeRussiaIdentityCardResponseBodyDataPortraitBox();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataPortraitBox setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataPortraitBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataPortraitBox setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataPortraitBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataSexKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataSexKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataSexKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataSexKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSexKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSexKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataSex extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataSexKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataSex build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataSex self = new RecognizeRussiaIdentityCardResponseBodyDataSex();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSex setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataSexKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataSexKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSex setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSex setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLineKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLine self = new RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLine();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLine setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLine setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLineKeyPoints self = new RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLine self = new RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLine();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLine setKeyPoints(java.util.List<RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLine setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeRussiaIdentityCardResponseBodyData extends TeaModel {
        @NameInMap("BirthDate")
        public RecognizeRussiaIdentityCardResponseBodyDataBirthDate birthDate;

        @NameInMap("BirthPlaceFirstLine")
        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLine birthPlaceFirstLine;

        @NameInMap("BirthPlaceSecondLine")
        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLine birthPlaceSecondLine;

        @NameInMap("BirthPlaceThirdLine")
        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLine birthPlaceThirdLine;

        @NameInMap("CardBox")
        public RecognizeRussiaIdentityCardResponseBodyDataCardBox cardBox;

        @NameInMap("GivenName")
        public RecognizeRussiaIdentityCardResponseBodyDataGivenName givenName;

        @NameInMap("IdNumber")
        public RecognizeRussiaIdentityCardResponseBodyDataIdNumber idNumber;

        @NameInMap("PaternalName")
        public RecognizeRussiaIdentityCardResponseBodyDataPaternalName paternalName;

        @NameInMap("PortraitBox")
        public RecognizeRussiaIdentityCardResponseBodyDataPortraitBox portraitBox;

        @NameInMap("Sex")
        public RecognizeRussiaIdentityCardResponseBodyDataSex sex;

        @NameInMap("SurnameFirstLine")
        public RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLine surnameFirstLine;

        @NameInMap("SurnameSecondLine")
        public RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLine surnameSecondLine;

        public static RecognizeRussiaIdentityCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeRussiaIdentityCardResponseBodyData self = new RecognizeRussiaIdentityCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeRussiaIdentityCardResponseBodyData setBirthDate(RecognizeRussiaIdentityCardResponseBodyDataBirthDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataBirthDate getBirthDate() {
            return this.birthDate;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setBirthPlaceFirstLine(RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLine birthPlaceFirstLine) {
            this.birthPlaceFirstLine = birthPlaceFirstLine;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceFirstLine getBirthPlaceFirstLine() {
            return this.birthPlaceFirstLine;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setBirthPlaceSecondLine(RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLine birthPlaceSecondLine) {
            this.birthPlaceSecondLine = birthPlaceSecondLine;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceSecondLine getBirthPlaceSecondLine() {
            return this.birthPlaceSecondLine;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setBirthPlaceThirdLine(RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLine birthPlaceThirdLine) {
            this.birthPlaceThirdLine = birthPlaceThirdLine;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataBirthPlaceThirdLine getBirthPlaceThirdLine() {
            return this.birthPlaceThirdLine;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setCardBox(RecognizeRussiaIdentityCardResponseBodyDataCardBox cardBox) {
            this.cardBox = cardBox;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataCardBox getCardBox() {
            return this.cardBox;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setGivenName(RecognizeRussiaIdentityCardResponseBodyDataGivenName givenName) {
            this.givenName = givenName;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataGivenName getGivenName() {
            return this.givenName;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setIdNumber(RecognizeRussiaIdentityCardResponseBodyDataIdNumber idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataIdNumber getIdNumber() {
            return this.idNumber;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setPaternalName(RecognizeRussiaIdentityCardResponseBodyDataPaternalName paternalName) {
            this.paternalName = paternalName;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataPaternalName getPaternalName() {
            return this.paternalName;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setPortraitBox(RecognizeRussiaIdentityCardResponseBodyDataPortraitBox portraitBox) {
            this.portraitBox = portraitBox;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataPortraitBox getPortraitBox() {
            return this.portraitBox;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setSex(RecognizeRussiaIdentityCardResponseBodyDataSex sex) {
            this.sex = sex;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataSex getSex() {
            return this.sex;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setSurnameFirstLine(RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLine surnameFirstLine) {
            this.surnameFirstLine = surnameFirstLine;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataSurnameFirstLine getSurnameFirstLine() {
            return this.surnameFirstLine;
        }

        public RecognizeRussiaIdentityCardResponseBodyData setSurnameSecondLine(RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLine surnameSecondLine) {
            this.surnameSecondLine = surnameSecondLine;
            return this;
        }
        public RecognizeRussiaIdentityCardResponseBodyDataSurnameSecondLine getSurnameSecondLine() {
            return this.surnameSecondLine;
        }

    }

}
