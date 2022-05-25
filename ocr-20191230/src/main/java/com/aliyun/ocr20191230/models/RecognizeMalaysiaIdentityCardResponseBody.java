// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeMalaysiaIdentityCardResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeMalaysiaIdentityCardResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeMalaysiaIdentityCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMalaysiaIdentityCardResponseBody self = new RecognizeMalaysiaIdentityCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeMalaysiaIdentityCardResponseBody setData(RecognizeMalaysiaIdentityCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeMalaysiaIdentityCardResponseBodyData getData() {
        return this.data;
    }

    public RecognizeMalaysiaIdentityCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLine self = new RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLine();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLine setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLine self = new RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLine();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLine setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLine self = new RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLine();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLine setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLine self = new RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLine();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLine setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLine self = new RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLine();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLine setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLine setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataCardBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataCardBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataCardBoxKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataCardBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataCardBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataCardBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataCardBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataCardBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataCardBox self = new RecognizeMalaysiaIdentityCardResponseBodyDataCardBox();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataCardBox setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataCardBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataCardBox setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataCardBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataDriveClassKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataDriveClassKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataDriveClassKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataDriveClassKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataDriveClassKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataDriveClassKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataDriveClass extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataDriveClassKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataDriveClass build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataDriveClass self = new RecognizeMalaysiaIdentityCardResponseBodyDataDriveClass();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataDriveClass setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataDriveClassKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataDriveClassKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataDriveClass setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataDriveClass setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDateKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDate self = new RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDate();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDate setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDate setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataIdNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataIdNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataIdNumberKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataIdNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataIdNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataIdNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataIdNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataIdNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataIdNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataIdNumber self = new RecognizeMalaysiaIdentityCardResponseBodyDataIdNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataIdNumber setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataIdNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataIdNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataIdNumber setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataIdNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataIssueDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataIssueDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataIssueDateKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataIssueDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataIssueDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataIssueDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataIssueDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataIssueDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataIssueDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataIssueDate self = new RecognizeMalaysiaIdentityCardResponseBodyDataIssueDate();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataIssueDate setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataIssueDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataIssueDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataIssueDate setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataIssueDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLineKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLine self = new RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLine();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLine setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLine setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLineKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLineKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLineKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLineKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLineKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLineKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLine extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLineKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLine build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLine self = new RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLine();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLine setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLineKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLineKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLine setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLine setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataNationalityKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataNationalityKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataNationalityKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataNationalityKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNationalityKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNationalityKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataNationality extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataNationalityKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataNationality build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataNationality self = new RecognizeMalaysiaIdentityCardResponseBodyDataNationality();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNationality setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataNationalityKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataNationalityKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNationality setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataNationality setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBoxKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBox self = new RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBox();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBox setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBox setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataSexKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataSexKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataSexKeyPoints self = new RecognizeMalaysiaIdentityCardResponseBodyDataSexKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataSexKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataSexKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyDataSex extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataSexKeyPoints> keyPoints;

        @NameInMap("Score")
        public String score;

        @NameInMap("Text")
        public String text;

        public static RecognizeMalaysiaIdentityCardResponseBodyDataSex build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyDataSex self = new RecognizeMalaysiaIdentityCardResponseBodyDataSex();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataSex setKeyPoints(java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataSexKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeMalaysiaIdentityCardResponseBodyDataSexKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataSex setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyDataSex setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeMalaysiaIdentityCardResponseBodyData extends TeaModel {
        @NameInMap("AddressFifthLine")
        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLine addressFifthLine;

        @NameInMap("AddressFirstLine")
        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLine addressFirstLine;

        @NameInMap("AddressFourthLine")
        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLine addressFourthLine;

        @NameInMap("AddressSecondLine")
        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLine addressSecondLine;

        @NameInMap("AddressThirdLine")
        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLine addressThirdLine;

        @NameInMap("CardBox")
        public RecognizeMalaysiaIdentityCardResponseBodyDataCardBox cardBox;

        @NameInMap("DriveClass")
        public RecognizeMalaysiaIdentityCardResponseBodyDataDriveClass driveClass;

        @NameInMap("ExpiryDate")
        public RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDate expiryDate;

        @NameInMap("IdNumber")
        public RecognizeMalaysiaIdentityCardResponseBodyDataIdNumber idNumber;

        @NameInMap("IssueDate")
        public RecognizeMalaysiaIdentityCardResponseBodyDataIssueDate issueDate;

        @NameInMap("NameFirstLine")
        public RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLine nameFirstLine;

        @NameInMap("NameSecondLine")
        public RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLine nameSecondLine;

        @NameInMap("Nationality")
        public RecognizeMalaysiaIdentityCardResponseBodyDataNationality nationality;

        @NameInMap("PortraitBox")
        public RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBox portraitBox;

        @NameInMap("Sex")
        public RecognizeMalaysiaIdentityCardResponseBodyDataSex sex;

        public static RecognizeMalaysiaIdentityCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeMalaysiaIdentityCardResponseBodyData self = new RecognizeMalaysiaIdentityCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setAddressFifthLine(RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLine addressFifthLine) {
            this.addressFifthLine = addressFifthLine;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFifthLine getAddressFifthLine() {
            return this.addressFifthLine;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setAddressFirstLine(RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLine addressFirstLine) {
            this.addressFirstLine = addressFirstLine;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFirstLine getAddressFirstLine() {
            return this.addressFirstLine;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setAddressFourthLine(RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLine addressFourthLine) {
            this.addressFourthLine = addressFourthLine;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressFourthLine getAddressFourthLine() {
            return this.addressFourthLine;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setAddressSecondLine(RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLine addressSecondLine) {
            this.addressSecondLine = addressSecondLine;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressSecondLine getAddressSecondLine() {
            return this.addressSecondLine;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setAddressThirdLine(RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLine addressThirdLine) {
            this.addressThirdLine = addressThirdLine;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataAddressThirdLine getAddressThirdLine() {
            return this.addressThirdLine;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setCardBox(RecognizeMalaysiaIdentityCardResponseBodyDataCardBox cardBox) {
            this.cardBox = cardBox;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataCardBox getCardBox() {
            return this.cardBox;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setDriveClass(RecognizeMalaysiaIdentityCardResponseBodyDataDriveClass driveClass) {
            this.driveClass = driveClass;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataDriveClass getDriveClass() {
            return this.driveClass;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setExpiryDate(RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataExpiryDate getExpiryDate() {
            return this.expiryDate;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setIdNumber(RecognizeMalaysiaIdentityCardResponseBodyDataIdNumber idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataIdNumber getIdNumber() {
            return this.idNumber;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setIssueDate(RecognizeMalaysiaIdentityCardResponseBodyDataIssueDate issueDate) {
            this.issueDate = issueDate;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataIssueDate getIssueDate() {
            return this.issueDate;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setNameFirstLine(RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLine nameFirstLine) {
            this.nameFirstLine = nameFirstLine;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataNameFirstLine getNameFirstLine() {
            return this.nameFirstLine;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setNameSecondLine(RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLine nameSecondLine) {
            this.nameSecondLine = nameSecondLine;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataNameSecondLine getNameSecondLine() {
            return this.nameSecondLine;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setNationality(RecognizeMalaysiaIdentityCardResponseBodyDataNationality nationality) {
            this.nationality = nationality;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataNationality getNationality() {
            return this.nationality;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setPortraitBox(RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBox portraitBox) {
            this.portraitBox = portraitBox;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataPortraitBox getPortraitBox() {
            return this.portraitBox;
        }

        public RecognizeMalaysiaIdentityCardResponseBodyData setSex(RecognizeMalaysiaIdentityCardResponseBodyDataSex sex) {
            this.sex = sex;
            return this;
        }
        public RecognizeMalaysiaIdentityCardResponseBodyDataSex getSex() {
            return this.sex;
        }

    }

}
