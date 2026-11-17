// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class GetEduHomeworkCorrectionResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEduHomeworkCorrectionResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static GetEduHomeworkCorrectionResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEduHomeworkCorrectionResultResponseBody self = new GetEduHomeworkCorrectionResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEduHomeworkCorrectionResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEduHomeworkCorrectionResultResponseBody setData(GetEduHomeworkCorrectionResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEduHomeworkCorrectionResultResponseBodyData getData() {
        return this.data;
    }

    public GetEduHomeworkCorrectionResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEduHomeworkCorrectionResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsAnswerPoints extends TeaModel {
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

        public static GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsAnswerPoints build(java.util.Map<String, ?> map) throws Exception {
            GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsAnswerPoints self = new GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsAnswerPoints();
            return TeaModel.build(map, self);
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsAnswerPoints setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsAnswerPoints setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsCheckPoint extends TeaModel {
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

        public static GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsCheckPoint build(java.util.Map<String, ?> map) throws Exception {
            GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsCheckPoint self = new GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsCheckPoint();
            return TeaModel.build(map, self);
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsCheckPoint setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsCheckPoint setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults extends TeaModel {
        @NameInMap("answerPoints")
        public java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsAnswerPoints> answerPoints;

        @NameInMap("checkPoint")
        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsCheckPoint checkPoint;

        @NameInMap("checkResult")
        public String checkResult;

        @NameInMap("standardAnswer")
        public String standardAnswer;

        @NameInMap("userAnswer")
        public String userAnswer;

        public static GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults build(java.util.Map<String, ?> map) throws Exception {
            GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults self = new GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults();
            return TeaModel.build(map, self);
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults setAnswerPoints(java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsAnswerPoints> answerPoints) {
            this.answerPoints = answerPoints;
            return this;
        }
        public java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsAnswerPoints> getAnswerPoints() {
            return this.answerPoints;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults setCheckPoint(GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsCheckPoint checkPoint) {
            this.checkPoint = checkPoint;
            return this;
        }
        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsCheckPoint getCheckPoint() {
            return this.checkPoint;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults setStandardAnswer(String standardAnswer) {
            this.standardAnswer = standardAnswer;
            return this;
        }
        public String getStandardAnswer() {
            return this.standardAnswer;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults setUserAnswer(String userAnswer) {
            this.userAnswer = userAnswer;
            return this;
        }
        public String getUserAnswer() {
            return this.userAnswer;
        }

    }

    public static class GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsQuestionPoints extends TeaModel {
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

        public static GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsQuestionPoints build(java.util.Map<String, ?> map) throws Exception {
            GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsQuestionPoints self = new GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsQuestionPoints();
            return TeaModel.build(map, self);
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsQuestionPoints setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsQuestionPoints setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults extends TeaModel {
        @NameInMap("answerResults")
        public java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults> answerResults;

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
        public java.util.List<java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsQuestionPoints>> questionPoints;

        @NameInMap("questionType")
        public String questionType;

        /**
         * <strong>example:</strong>
         * <p>已处理：接口耗时已恢复低于阈值（09:53后分钟平均约1.8s～3.3s）</p>
         */
        @NameInMap("solution")
        public String solution;

        public static GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults build(java.util.Map<String, ?> map) throws Exception {
            GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults self = new GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults();
            return TeaModel.build(map, self);
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults setAnswerResults(java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults> answerResults) {
            this.answerResults = answerResults;
            return this;
        }
        public java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults> getAnswerResults() {
            return this.answerResults;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults setQuestionContent(String questionContent) {
            this.questionContent = questionContent;
            return this;
        }
        public String getQuestionContent() {
            return this.questionContent;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults setQuestionId(String questionId) {
            this.questionId = questionId;
            return this;
        }
        public String getQuestionId() {
            return this.questionId;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults setQuestionPoints(java.util.List<java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsQuestionPoints>> questionPoints) {
            this.questionPoints = questionPoints;
            return this;
        }
        public java.util.List<java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsQuestionPoints>> getQuestionPoints() {
            return this.questionPoints;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults setQuestionType(String questionType) {
            this.questionType = questionType;
            return this;
        }
        public String getQuestionType() {
            return this.questionType;
        }

        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

    }

    public static class GetEduHomeworkCorrectionResultResponseBodyData extends TeaModel {
        @NameInMap("angle")
        public Long angle;

        @NameInMap("dewarpUrl")
        public String dewarpUrl;

        @NameInMap("questionResults")
        public java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults> questionResults;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        public static GetEduHomeworkCorrectionResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEduHomeworkCorrectionResultResponseBodyData self = new GetEduHomeworkCorrectionResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEduHomeworkCorrectionResultResponseBodyData setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public GetEduHomeworkCorrectionResultResponseBodyData setDewarpUrl(String dewarpUrl) {
            this.dewarpUrl = dewarpUrl;
            return this;
        }
        public String getDewarpUrl() {
            return this.dewarpUrl;
        }

        public GetEduHomeworkCorrectionResultResponseBodyData setQuestionResults(java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults> questionResults) {
            this.questionResults = questionResults;
            return this;
        }
        public java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults> getQuestionResults() {
            return this.questionResults;
        }

        public GetEduHomeworkCorrectionResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEduHomeworkCorrectionResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
