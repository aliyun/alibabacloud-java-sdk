// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class CreateEduHomeworkCorrectSubmitResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateEduHomeworkCorrectSubmitResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static CreateEduHomeworkCorrectSubmitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEduHomeworkCorrectSubmitResponseBody self = new CreateEduHomeworkCorrectSubmitResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEduHomeworkCorrectSubmitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEduHomeworkCorrectSubmitResponseBody setData(CreateEduHomeworkCorrectSubmitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEduHomeworkCorrectSubmitResponseBodyData getData() {
        return this.data;
    }

    public CreateEduHomeworkCorrectSubmitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEduHomeworkCorrectSubmitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsAnswerPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <strong>example:</strong>
         * <p>0.03</p>
         */
        @NameInMap("y")
        public Long y;

        public static CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsAnswerPoints build(java.util.Map<String, ?> map) throws Exception {
            CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsAnswerPoints self = new CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsAnswerPoints();
            return TeaModel.build(map, self);
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsAnswerPoints setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsAnswerPoints setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsCheckPoint extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <strong>example:</strong>
         * <p>0.90</p>
         */
        @NameInMap("y")
        public Long y;

        public static CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsCheckPoint build(java.util.Map<String, ?> map) throws Exception {
            CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsCheckPoint self = new CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsCheckPoint();
            return TeaModel.build(map, self);
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsCheckPoint setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsCheckPoint setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults extends TeaModel {
        @NameInMap("answerPoints")
        public java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsAnswerPoints> answerPoints;

        @NameInMap("checkPoint")
        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsCheckPoint checkPoint;

        @NameInMap("checkResult")
        public String checkResult;

        @NameInMap("standardAnswer")
        public String standardAnswer;

        @NameInMap("userAnswer")
        public String userAnswer;

        public static CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults build(java.util.Map<String, ?> map) throws Exception {
            CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults self = new CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults();
            return TeaModel.build(map, self);
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults setAnswerPoints(java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsAnswerPoints> answerPoints) {
            this.answerPoints = answerPoints;
            return this;
        }
        public java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsAnswerPoints> getAnswerPoints() {
            return this.answerPoints;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults setCheckPoint(CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsCheckPoint checkPoint) {
            this.checkPoint = checkPoint;
            return this;
        }
        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsCheckPoint getCheckPoint() {
            return this.checkPoint;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults setStandardAnswer(String standardAnswer) {
            this.standardAnswer = standardAnswer;
            return this;
        }
        public String getStandardAnswer() {
            return this.standardAnswer;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults setUserAnswer(String userAnswer) {
            this.userAnswer = userAnswer;
            return this;
        }
        public String getUserAnswer() {
            return this.userAnswer;
        }

    }

    public static class CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsQuestionPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("y")
        public Long y;

        public static CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsQuestionPoints build(java.util.Map<String, ?> map) throws Exception {
            CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsQuestionPoints self = new CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsQuestionPoints();
            return TeaModel.build(map, self);
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsQuestionPoints setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsQuestionPoints setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults extends TeaModel {
        @NameInMap("answerResults")
        public java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults> answerResults;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("finish")
        public Boolean finish;

        @NameInMap("questionContent")
        public String questionContent;

        @NameInMap("questionId")
        public String questionId;

        @NameInMap("questionPoints")
        public java.util.List<java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsQuestionPoints>> questionPoints;

        @NameInMap("questionType")
        public String questionType;

        /**
         * <strong>example:</strong>
         * <p>已处理：接口耗时已恢复低于阈值（09:53后分钟平均约1.8s～3.3s）</p>
         */
        @NameInMap("solution")
        public String solution;

        public static CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults build(java.util.Map<String, ?> map) throws Exception {
            CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults self = new CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults();
            return TeaModel.build(map, self);
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults setAnswerResults(java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults> answerResults) {
            this.answerResults = answerResults;
            return this;
        }
        public java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults> getAnswerResults() {
            return this.answerResults;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults setQuestionContent(String questionContent) {
            this.questionContent = questionContent;
            return this;
        }
        public String getQuestionContent() {
            return this.questionContent;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults setQuestionId(String questionId) {
            this.questionId = questionId;
            return this;
        }
        public String getQuestionId() {
            return this.questionId;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults setQuestionPoints(java.util.List<java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsQuestionPoints>> questionPoints) {
            this.questionPoints = questionPoints;
            return this;
        }
        public java.util.List<java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsQuestionPoints>> getQuestionPoints() {
            return this.questionPoints;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults setQuestionType(String questionType) {
            this.questionType = questionType;
            return this;
        }
        public String getQuestionType() {
            return this.questionType;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

    }

    public static class CreateEduHomeworkCorrectSubmitResponseBodyData extends TeaModel {
        @NameInMap("angle")
        public Long angle;

        @NameInMap("dewarpUrl")
        public String dewarpUrl;

        @NameInMap("questionResults")
        public java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults> questionResults;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        public static CreateEduHomeworkCorrectSubmitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEduHomeworkCorrectSubmitResponseBodyData self = new CreateEduHomeworkCorrectSubmitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyData setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyData setDewarpUrl(String dewarpUrl) {
            this.dewarpUrl = dewarpUrl;
            return this;
        }
        public String getDewarpUrl() {
            return this.dewarpUrl;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyData setQuestionResults(java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults> questionResults) {
            this.questionResults = questionResults;
            return this;
        }
        public java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults> getQuestionResults() {
            return this.questionResults;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateEduHomeworkCorrectSubmitResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
