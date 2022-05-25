// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTurkeyIdentityCardResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RecognizeTurkeyIdentityCardResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeTurkeyIdentityCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTurkeyIdentityCardResponseBody self = new RecognizeTurkeyIdentityCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeTurkeyIdentityCardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeTurkeyIdentityCardResponseBody setData(RecognizeTurkeyIdentityCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeTurkeyIdentityCardResponseBodyData getData() {
        return this.data;
    }

    public RecognizeTurkeyIdentityCardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeTurkeyIdentityCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryToolsKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryToolsKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryToolsKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryToolsKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryToolsKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryToolsKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryTools extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryToolsKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryTools build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryTools self = new RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryTools();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryTools setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryToolsKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryToolsKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryTools setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryTools setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataBirthDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataBirthDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataBirthDateKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataBirthDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBirthDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBirthDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataBirthDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataBirthDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataBirthDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataBirthDate self = new RecognizeTurkeyIdentityCardResponseBodyDataBirthDate();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBirthDate setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataBirthDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataBirthDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBirthDate setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBirthDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataBirthPlaceKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataBirthPlaceKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataBirthPlaceKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataBirthPlaceKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBirthPlaceKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBirthPlaceKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataBirthPlace extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataBirthPlaceKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataBirthPlace build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataBirthPlace self = new RecognizeTurkeyIdentityCardResponseBodyDataBirthPlace();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBirthPlace setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataBirthPlaceKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataBirthPlaceKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBirthPlace setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBirthPlace setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataBloodTypeKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataBloodTypeKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataBloodTypeKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataBloodTypeKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBloodTypeKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBloodTypeKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataBloodType extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataBloodTypeKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataBloodType build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataBloodType self = new RecognizeTurkeyIdentityCardResponseBodyDataBloodType();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBloodType setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataBloodTypeKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataBloodTypeKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBloodType setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataBloodType setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataCardBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataCardBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataCardBoxKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataCardBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataCardBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataCardBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataCardBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataCardBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataCardBox self = new RecognizeTurkeyIdentityCardResponseBodyDataCardBox();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataCardBox setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataCardBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataCardBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataCardBox setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataCardBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataCiltKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataCiltKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataCiltKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataCiltKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataCiltKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataCiltKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataCilt extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataCiltKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataCilt build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataCilt self = new RecognizeTurkeyIdentityCardResponseBodyDataCilt();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataCilt setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataCiltKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataCiltKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataCilt setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataCilt setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumberKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumber self = new RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumber setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumber setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataDriveClassKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataDriveClassKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataDriveClassKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataDriveClassKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDriveClassKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDriveClassKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataDriveClass extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDriveClassKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataDriveClass build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataDriveClass self = new RecognizeTurkeyIdentityCardResponseBodyDataDriveClass();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDriveClass setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDriveClassKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDriveClassKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDriveClass setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDriveClass setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataDueDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataDueDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataDueDateKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataDueDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDueDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDueDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataDueDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDueDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataDueDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataDueDate self = new RecognizeTurkeyIdentityCardResponseBodyDataDueDate();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDueDate setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDueDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDueDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDueDate setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDueDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyenKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyenKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyenKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyenKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyenKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyenKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyen extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyenKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyen build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyen self = new RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyen();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyen setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyenKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyenKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyen setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyen setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataEntryNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataEntryNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataEntryNumberKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataEntryNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataEntryNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataEntryNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataEntryNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataEntryNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataEntryNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataEntryNumber self = new RecognizeTurkeyIdentityCardResponseBodyDataEntryNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataEntryNumber setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataEntryNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataEntryNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataEntryNumber setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataEntryNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataExpiryDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataExpiryDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataExpiryDateKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataExpiryDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataExpiryDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataExpiryDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataExpiryDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataExpiryDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataExpiryDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataExpiryDate self = new RecognizeTurkeyIdentityCardResponseBodyDataExpiryDate();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataExpiryDate setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataExpiryDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataExpiryDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataExpiryDate setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataExpiryDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataFatherNameKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataFatherNameKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataFatherNameKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataFatherNameKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataFatherNameKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataFatherNameKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataFatherName extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataFatherNameKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataFatherName build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataFatherName self = new RecognizeTurkeyIdentityCardResponseBodyDataFatherName();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataFatherName setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataFatherNameKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataFatherNameKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataFatherName setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataFatherName setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataForeignersIdKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataForeignersIdKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataForeignersIdKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataForeignersIdKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataForeignersIdKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataForeignersIdKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataForeignersId extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataForeignersIdKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataForeignersId build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataForeignersId self = new RecognizeTurkeyIdentityCardResponseBodyDataForeignersId();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataForeignersId setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataForeignersIdKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataForeignersIdKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataForeignersId setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataForeignersId setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataGenderKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataGenderKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataGenderKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataGenderKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataGenderKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataGenderKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataGender extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataGenderKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataGender build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataGender self = new RecognizeTurkeyIdentityCardResponseBodyDataGender();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataGender setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataGenderKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataGenderKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataGender setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataGender setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataGivenNameKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataGivenNameKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataGivenNameKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataGivenNameKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataGivenNameKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataGivenNameKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataGivenName extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataGivenNameKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataGivenName build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataGivenName self = new RecognizeTurkeyIdentityCardResponseBodyDataGivenName();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataGivenName setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataGivenNameKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataGivenNameKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataGivenName setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataGivenName setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataIdNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataIdNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataIdNumberKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataIdNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIdNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIdNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataIdNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIdNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataIdNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataIdNumber self = new RecognizeTurkeyIdentityCardResponseBodyDataIdNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIdNumber setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIdNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIdNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIdNumber setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIdNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataIssueByKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataIssueByKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataIssueByKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataIssueByKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueByKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueByKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataIssueBy extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssueByKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataIssueBy build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataIssueBy self = new RecognizeTurkeyIdentityCardResponseBodyDataIssueBy();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueBy setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssueByKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssueByKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueBy setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueBy setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataIssueCountyKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataIssueCountyKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataIssueCountyKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataIssueCountyKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueCountyKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueCountyKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataIssueCounty extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssueCountyKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataIssueCounty build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataIssueCounty self = new RecognizeTurkeyIdentityCardResponseBodyDataIssueCounty();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueCounty setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssueCountyKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssueCountyKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueCounty setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueCounty setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataIssueDateKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataIssueDateKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataIssueDateKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataIssueDateKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueDateKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueDateKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataIssueDate extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssueDateKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataIssueDate build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataIssueDate self = new RecognizeTurkeyIdentityCardResponseBodyDataIssueDate();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueDate setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssueDateKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssueDateKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueDate setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssueDate setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataIssuePlaceKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataIssuePlaceKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataIssuePlaceKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataIssuePlaceKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssuePlaceKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssuePlaceKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataIssuePlace extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssuePlaceKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataIssuePlace build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataIssuePlace self = new RecognizeTurkeyIdentityCardResponseBodyDataIssuePlace();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssuePlace setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssuePlaceKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataIssuePlaceKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssuePlace setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataIssuePlace setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataKutukKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataKutukKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataKutukKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataKutukKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataKutukKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataKutukKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataKutuk extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataKutukKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataKutuk build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataKutuk self = new RecognizeTurkeyIdentityCardResponseBodyDataKutuk();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataKutuk setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataKutukKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataKutukKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataKutuk setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataKutuk setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumberKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumber self = new RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumber setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumber setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatusKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatusKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatusKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatusKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatusKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatusKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatus extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatusKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatus build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatus self = new RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatus();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatus setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatusKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatusKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatus setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatus setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataMotherNameKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataMotherNameKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataMotherNameKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataMotherNameKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataMotherNameKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataMotherNameKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataMotherName extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataMotherNameKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataMotherName build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataMotherName self = new RecognizeTurkeyIdentityCardResponseBodyDataMotherName();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataMotherName setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataMotherNameKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataMotherNameKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataMotherName setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataMotherName setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataNameKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataNameKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataNameKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataNameKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNameKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNameKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataName extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataNameKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataName build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataName self = new RecognizeTurkeyIdentityCardResponseBodyDataName();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataName setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataNameKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataNameKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataName setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataName setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataNationalityKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataNationalityKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataNationalityKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataNationalityKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNationalityKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNationalityKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataNationality extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataNationalityKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataNationality build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataNationality self = new RecognizeTurkeyIdentityCardResponseBodyDataNationality();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNationality setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataNationalityKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataNationalityKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNationality setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNationality setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillageKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillageKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillageKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillageKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillageKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillageKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillage extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillageKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillage build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillage self = new RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillage();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillage setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillageKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillageKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillage setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillage setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataPageNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataPageNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataPageNumberKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataPageNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPageNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPageNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataPageNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataPageNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataPageNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataPageNumber self = new RecognizeTurkeyIdentityCardResponseBodyDataPageNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPageNumber setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataPageNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataPageNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPageNumber setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPageNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataPassportNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataPassportNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataPassportNumberKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataPassportNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPassportNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPassportNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataPassportNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataPassportNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataPassportNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataPassportNumber self = new RecognizeTurkeyIdentityCardResponseBodyDataPassportNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPassportNumber setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataPassportNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataPassportNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPassportNumber setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPassportNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataPortraitBoxKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataPortraitBoxKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataPortraitBoxKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataPortraitBoxKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPortraitBoxKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPortraitBoxKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataPortraitBox extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataPortraitBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataPortraitBox self = new RecognizeTurkeyIdentityCardResponseBodyDataPortraitBox();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPortraitBox setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataPortraitBoxKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataPortraitBoxKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPortraitBox setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataPortraitBox setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataProvinceKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataProvinceKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataProvinceKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataProvinceKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataProvinceKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataProvinceKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataProvince extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataProvinceKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataProvince build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataProvince self = new RecognizeTurkeyIdentityCardResponseBodyDataProvince();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataProvince setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataProvinceKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataProvinceKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataProvince setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataProvince setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidenceKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidenceKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidenceKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidenceKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidenceKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidenceKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidence extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidenceKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidence build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidence self = new RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidence();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidence setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidenceKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidenceKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidence setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidence setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssueKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssueKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssueKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssueKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssueKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssueKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssue extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssueKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssue build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssue self = new RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssue();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssue setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssueKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssueKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssue setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssue setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumberKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumber self = new RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumber setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumber setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataReligionKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataReligionKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataReligionKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataReligionKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataReligionKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataReligionKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataReligion extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataReligionKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataReligion build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataReligion self = new RecognizeTurkeyIdentityCardResponseBodyDataReligion();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataReligion setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataReligionKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataReligionKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataReligion setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataReligion setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataSayfaKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataSayfaKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataSayfaKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataSayfaKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSayfaKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSayfaKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataSayfa extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSayfaKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataSayfa build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataSayfa self = new RecognizeTurkeyIdentityCardResponseBodyDataSayfa();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSayfa setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSayfaKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSayfaKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSayfa setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSayfa setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataSeriKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataSeriKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataSeriKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataSeriKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSeriKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSeriKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataSeri extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSeriKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataSeri build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataSeri self = new RecognizeTurkeyIdentityCardResponseBodyDataSeri();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSeri setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSeriKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSeriKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSeri setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSeri setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataSexKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataSexKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataSexKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataSexKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSexKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSexKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataSex extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSexKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataSex build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataSex self = new RecognizeTurkeyIdentityCardResponseBodyDataSex();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSex setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSexKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSexKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSex setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSex setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataSurnameKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataSurnameKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataSurnameKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataSurnameKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSurnameKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSurnameKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataSurname extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSurnameKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataSurname build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataSurname self = new RecognizeTurkeyIdentityCardResponseBodyDataSurname();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSurname setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSurnameKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataSurnameKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSurname setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataSurname setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermitKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermitKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermitKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermitKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermitKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermitKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermit extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermitKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermit build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermit self = new RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermit();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermit setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermitKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermitKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermit setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermit setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataValidUntilKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataValidUntilKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataValidUntilKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataValidUntilKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataValidUntilKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataValidUntilKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataValidUntil extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataValidUntilKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataValidUntil build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataValidUntil self = new RecognizeTurkeyIdentityCardResponseBodyDataValidUntil();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataValidUntil setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataValidUntilKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataValidUntilKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataValidUntil setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataValidUntil setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataVillageKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataVillageKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataVillageKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataVillageKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataVillageKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataVillageKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataVillage extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataVillageKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataVillage build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataVillage self = new RecognizeTurkeyIdentityCardResponseBodyDataVillage();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataVillage setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataVillageKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataVillageKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataVillage setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataVillage setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumberKeyPoints extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumberKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumberKeyPoints self = new RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumberKeyPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumberKeyPoints setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumberKeyPoints setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumber extends TeaModel {
        @NameInMap("KeyPoints")
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumberKeyPoints> keyPoints;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        public static RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumber build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumber self = new RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumber();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumber setKeyPoints(java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumberKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumberKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumber setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumber setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeTurkeyIdentityCardResponseBodyData extends TeaModel {
        @NameInMap("AuxiliaryTools")
        public RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryTools auxiliaryTools;

        @NameInMap("BirthDate")
        public RecognizeTurkeyIdentityCardResponseBodyDataBirthDate birthDate;

        @NameInMap("BirthPlace")
        public RecognizeTurkeyIdentityCardResponseBodyDataBirthPlace birthPlace;

        @NameInMap("BloodType")
        public RecognizeTurkeyIdentityCardResponseBodyDataBloodType bloodType;

        @NameInMap("CardBox")
        public RecognizeTurkeyIdentityCardResponseBodyDataCardBox cardBox;

        @NameInMap("Cilt")
        public RecognizeTurkeyIdentityCardResponseBodyDataCilt cilt;

        @NameInMap("DocumentNumber")
        public RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumber documentNumber;

        @NameInMap("DriveClass")
        public RecognizeTurkeyIdentityCardResponseBodyDataDriveClass driveClass;

        @NameInMap("DueDate")
        public RecognizeTurkeyIdentityCardResponseBodyDataDueDate dueDate;

        @NameInMap("Duzenleyen")
        public RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyen duzenleyen;

        @NameInMap("EntryNumber")
        public RecognizeTurkeyIdentityCardResponseBodyDataEntryNumber entryNumber;

        @NameInMap("ExpiryDate")
        public RecognizeTurkeyIdentityCardResponseBodyDataExpiryDate expiryDate;

        @NameInMap("FatherName")
        public RecognizeTurkeyIdentityCardResponseBodyDataFatherName fatherName;

        @NameInMap("ForeignersId")
        public RecognizeTurkeyIdentityCardResponseBodyDataForeignersId foreignersId;

        @NameInMap("Gender")
        public RecognizeTurkeyIdentityCardResponseBodyDataGender gender;

        @NameInMap("GivenName")
        public RecognizeTurkeyIdentityCardResponseBodyDataGivenName givenName;

        @NameInMap("IdNumber")
        public RecognizeTurkeyIdentityCardResponseBodyDataIdNumber idNumber;

        @NameInMap("IssueBy")
        public RecognizeTurkeyIdentityCardResponseBodyDataIssueBy issueBy;

        @NameInMap("IssueCounty")
        public RecognizeTurkeyIdentityCardResponseBodyDataIssueCounty issueCounty;

        @NameInMap("IssueDate")
        public RecognizeTurkeyIdentityCardResponseBodyDataIssueDate issueDate;

        @NameInMap("IssuePlace")
        public RecognizeTurkeyIdentityCardResponseBodyDataIssuePlace issuePlace;

        @NameInMap("Kutuk")
        public RecognizeTurkeyIdentityCardResponseBodyDataKutuk kutuk;

        @NameInMap("LicenseNumber")
        public RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumber licenseNumber;

        @NameInMap("MaritalStatus")
        public RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatus maritalStatus;

        @NameInMap("MotherName")
        public RecognizeTurkeyIdentityCardResponseBodyDataMotherName motherName;

        @NameInMap("Name")
        public RecognizeTurkeyIdentityCardResponseBodyDataName name;

        @NameInMap("Nationality")
        public RecognizeTurkeyIdentityCardResponseBodyDataNationality nationality;

        @NameInMap("NeighborhoodVillage")
        public RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillage neighborhoodVillage;

        @NameInMap("PageNumber")
        public RecognizeTurkeyIdentityCardResponseBodyDataPageNumber pageNumber;

        @NameInMap("PassportNumber")
        public RecognizeTurkeyIdentityCardResponseBodyDataPassportNumber passportNumber;

        @NameInMap("PortraitBox")
        public RecognizeTurkeyIdentityCardResponseBodyDataPortraitBox portraitBox;

        @NameInMap("Province")
        public RecognizeTurkeyIdentityCardResponseBodyDataProvince province;

        @NameInMap("ProvinceOfResidence")
        public RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidence provinceOfResidence;

        @NameInMap("ReasonOfIssue")
        public RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssue reasonOfIssue;

        @NameInMap("RegisterNumber")
        public RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumber registerNumber;

        @NameInMap("Religion")
        public RecognizeTurkeyIdentityCardResponseBodyDataReligion religion;

        @NameInMap("Sayfa")
        public RecognizeTurkeyIdentityCardResponseBodyDataSayfa sayfa;

        @NameInMap("Seri")
        public RecognizeTurkeyIdentityCardResponseBodyDataSeri seri;

        @NameInMap("Sex")
        public RecognizeTurkeyIdentityCardResponseBodyDataSex sex;

        @NameInMap("Surname")
        public RecognizeTurkeyIdentityCardResponseBodyDataSurname surname;

        @NameInMap("TypeOfResidencePermit")
        public RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermit typeOfResidencePermit;

        @NameInMap("ValidUntil")
        public RecognizeTurkeyIdentityCardResponseBodyDataValidUntil validUntil;

        @NameInMap("Village")
        public RecognizeTurkeyIdentityCardResponseBodyDataVillage village;

        @NameInMap("VolumeNumber")
        public RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumber volumeNumber;

        public static RecognizeTurkeyIdentityCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTurkeyIdentityCardResponseBodyData self = new RecognizeTurkeyIdentityCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setAuxiliaryTools(RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryTools auxiliaryTools) {
            this.auxiliaryTools = auxiliaryTools;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataAuxiliaryTools getAuxiliaryTools() {
            return this.auxiliaryTools;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setBirthDate(RecognizeTurkeyIdentityCardResponseBodyDataBirthDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataBirthDate getBirthDate() {
            return this.birthDate;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setBirthPlace(RecognizeTurkeyIdentityCardResponseBodyDataBirthPlace birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataBirthPlace getBirthPlace() {
            return this.birthPlace;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setBloodType(RecognizeTurkeyIdentityCardResponseBodyDataBloodType bloodType) {
            this.bloodType = bloodType;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataBloodType getBloodType() {
            return this.bloodType;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setCardBox(RecognizeTurkeyIdentityCardResponseBodyDataCardBox cardBox) {
            this.cardBox = cardBox;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataCardBox getCardBox() {
            return this.cardBox;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setCilt(RecognizeTurkeyIdentityCardResponseBodyDataCilt cilt) {
            this.cilt = cilt;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataCilt getCilt() {
            return this.cilt;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setDocumentNumber(RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumber documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataDocumentNumber getDocumentNumber() {
            return this.documentNumber;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setDriveClass(RecognizeTurkeyIdentityCardResponseBodyDataDriveClass driveClass) {
            this.driveClass = driveClass;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataDriveClass getDriveClass() {
            return this.driveClass;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setDueDate(RecognizeTurkeyIdentityCardResponseBodyDataDueDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataDueDate getDueDate() {
            return this.dueDate;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setDuzenleyen(RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyen duzenleyen) {
            this.duzenleyen = duzenleyen;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataDuzenleyen getDuzenleyen() {
            return this.duzenleyen;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setEntryNumber(RecognizeTurkeyIdentityCardResponseBodyDataEntryNumber entryNumber) {
            this.entryNumber = entryNumber;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataEntryNumber getEntryNumber() {
            return this.entryNumber;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setExpiryDate(RecognizeTurkeyIdentityCardResponseBodyDataExpiryDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataExpiryDate getExpiryDate() {
            return this.expiryDate;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setFatherName(RecognizeTurkeyIdentityCardResponseBodyDataFatherName fatherName) {
            this.fatherName = fatherName;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataFatherName getFatherName() {
            return this.fatherName;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setForeignersId(RecognizeTurkeyIdentityCardResponseBodyDataForeignersId foreignersId) {
            this.foreignersId = foreignersId;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataForeignersId getForeignersId() {
            return this.foreignersId;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setGender(RecognizeTurkeyIdentityCardResponseBodyDataGender gender) {
            this.gender = gender;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataGender getGender() {
            return this.gender;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setGivenName(RecognizeTurkeyIdentityCardResponseBodyDataGivenName givenName) {
            this.givenName = givenName;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataGivenName getGivenName() {
            return this.givenName;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setIdNumber(RecognizeTurkeyIdentityCardResponseBodyDataIdNumber idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataIdNumber getIdNumber() {
            return this.idNumber;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setIssueBy(RecognizeTurkeyIdentityCardResponseBodyDataIssueBy issueBy) {
            this.issueBy = issueBy;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataIssueBy getIssueBy() {
            return this.issueBy;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setIssueCounty(RecognizeTurkeyIdentityCardResponseBodyDataIssueCounty issueCounty) {
            this.issueCounty = issueCounty;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataIssueCounty getIssueCounty() {
            return this.issueCounty;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setIssueDate(RecognizeTurkeyIdentityCardResponseBodyDataIssueDate issueDate) {
            this.issueDate = issueDate;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataIssueDate getIssueDate() {
            return this.issueDate;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setIssuePlace(RecognizeTurkeyIdentityCardResponseBodyDataIssuePlace issuePlace) {
            this.issuePlace = issuePlace;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataIssuePlace getIssuePlace() {
            return this.issuePlace;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setKutuk(RecognizeTurkeyIdentityCardResponseBodyDataKutuk kutuk) {
            this.kutuk = kutuk;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataKutuk getKutuk() {
            return this.kutuk;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setLicenseNumber(RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumber licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataLicenseNumber getLicenseNumber() {
            return this.licenseNumber;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setMaritalStatus(RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatus maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataMaritalStatus getMaritalStatus() {
            return this.maritalStatus;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setMotherName(RecognizeTurkeyIdentityCardResponseBodyDataMotherName motherName) {
            this.motherName = motherName;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataMotherName getMotherName() {
            return this.motherName;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setName(RecognizeTurkeyIdentityCardResponseBodyDataName name) {
            this.name = name;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataName getName() {
            return this.name;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setNationality(RecognizeTurkeyIdentityCardResponseBodyDataNationality nationality) {
            this.nationality = nationality;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataNationality getNationality() {
            return this.nationality;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setNeighborhoodVillage(RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillage neighborhoodVillage) {
            this.neighborhoodVillage = neighborhoodVillage;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataNeighborhoodVillage getNeighborhoodVillage() {
            return this.neighborhoodVillage;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setPageNumber(RecognizeTurkeyIdentityCardResponseBodyDataPageNumber pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataPageNumber getPageNumber() {
            return this.pageNumber;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setPassportNumber(RecognizeTurkeyIdentityCardResponseBodyDataPassportNumber passportNumber) {
            this.passportNumber = passportNumber;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataPassportNumber getPassportNumber() {
            return this.passportNumber;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setPortraitBox(RecognizeTurkeyIdentityCardResponseBodyDataPortraitBox portraitBox) {
            this.portraitBox = portraitBox;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataPortraitBox getPortraitBox() {
            return this.portraitBox;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setProvince(RecognizeTurkeyIdentityCardResponseBodyDataProvince province) {
            this.province = province;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataProvince getProvince() {
            return this.province;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setProvinceOfResidence(RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidence provinceOfResidence) {
            this.provinceOfResidence = provinceOfResidence;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataProvinceOfResidence getProvinceOfResidence() {
            return this.provinceOfResidence;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setReasonOfIssue(RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssue reasonOfIssue) {
            this.reasonOfIssue = reasonOfIssue;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataReasonOfIssue getReasonOfIssue() {
            return this.reasonOfIssue;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setRegisterNumber(RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumber registerNumber) {
            this.registerNumber = registerNumber;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataRegisterNumber getRegisterNumber() {
            return this.registerNumber;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setReligion(RecognizeTurkeyIdentityCardResponseBodyDataReligion religion) {
            this.religion = religion;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataReligion getReligion() {
            return this.religion;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setSayfa(RecognizeTurkeyIdentityCardResponseBodyDataSayfa sayfa) {
            this.sayfa = sayfa;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataSayfa getSayfa() {
            return this.sayfa;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setSeri(RecognizeTurkeyIdentityCardResponseBodyDataSeri seri) {
            this.seri = seri;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataSeri getSeri() {
            return this.seri;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setSex(RecognizeTurkeyIdentityCardResponseBodyDataSex sex) {
            this.sex = sex;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataSex getSex() {
            return this.sex;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setSurname(RecognizeTurkeyIdentityCardResponseBodyDataSurname surname) {
            this.surname = surname;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataSurname getSurname() {
            return this.surname;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setTypeOfResidencePermit(RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermit typeOfResidencePermit) {
            this.typeOfResidencePermit = typeOfResidencePermit;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataTypeOfResidencePermit getTypeOfResidencePermit() {
            return this.typeOfResidencePermit;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setValidUntil(RecognizeTurkeyIdentityCardResponseBodyDataValidUntil validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataValidUntil getValidUntil() {
            return this.validUntil;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setVillage(RecognizeTurkeyIdentityCardResponseBodyDataVillage village) {
            this.village = village;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataVillage getVillage() {
            return this.village;
        }

        public RecognizeTurkeyIdentityCardResponseBodyData setVolumeNumber(RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumber volumeNumber) {
            this.volumeNumber = volumeNumber;
            return this;
        }
        public RecognizeTurkeyIdentityCardResponseBodyDataVolumeNumber getVolumeNumber() {
            return this.volumeNumber;
        }

    }

}
