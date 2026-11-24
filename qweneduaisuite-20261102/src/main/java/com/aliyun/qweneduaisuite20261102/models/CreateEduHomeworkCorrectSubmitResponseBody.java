// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class CreateEduHomeworkCorrectSubmitResponseBody extends TeaModel {
    /**
     * <p>The API status.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The import command.</p>
     */
    @NameInMap("data")
    public CreateEduHomeworkCorrectSubmitResponseBodyData data;

    /**
     * <p>The request error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID of the caller.</p>
     * 
     * <strong>example:</strong>
     * <p>req-20261116-0001</p>
     */
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
         * <p>The X-axis coordinate value.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <p>The Y-axis coordinate value.</p>
         * 
         * <strong>example:</strong>
         * <p>980</p>
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
         * <p>The X-axis coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <p>The Y-axis coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>980</p>
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
        /**
         * <p>The coordinate group of the user\&quot;s answering area. It generally contains four vertex coordinates, arranged in the order of top-left, top-right, bottom-right, and bottom-left, such as <code>[{&quot;x&quot;: ..., &quot;y&quot;: ...}, ...]</code>.</p>
         */
        @NameInMap("answerPoints")
        public java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsAnswerPoints> answerPoints;

        /**
         * <p>The coordinates of the grading mark point, such as <code>{ &quot;x&quot;: ..., &quot;y&quot;: ... }</code>.</p>
         */
        @NameInMap("checkPoint")
        public CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResultsCheckPoint checkPoint;

        /**
         * <p>The grading conclusion, such as <code>correct</code>, <code>wrong</code>, or <code>partial</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>correct</p>
         */
        @NameInMap("checkResult")
        public String checkResult;

        /**
         * <p>The ground truth.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("standardAnswer")
        public String standardAnswer;

        /**
         * <p>The student\&quot;s answer.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
         * <p>The X-axis coordinate value.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <p>The Y-axis coordinate value.</p>
         * 
         * <strong>example:</strong>
         * <p>980</p>
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
        /**
         * <p>The array of answering and grading results for the question.</p>
         */
        @NameInMap("answerResults")
        public java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsAnswerResults> answerResults;

        /**
         * <p>Specifies whether the task is completed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The task is completed.</li>
         * <li><strong>false</strong>: The task is not completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("finish")
        public Boolean finish;

        /**
         * <p>The text content of the question.</p>
         * 
         * <strong>example:</strong>
         * <p>1 + 1 = ?</p>
         */
        @NameInMap("questionContent")
        public String questionContent;

        /**
         * <p>The question ID.</p>
         * 
         * <strong>example:</strong>
         * <p>q-001</p>
         */
        @NameInMap("questionId")
        public String questionId;

        /**
         * <p>The coordinate group of the question area. It generally contains four vertex coordinates, arranged in the order of top-left, top-right, bottom-right, and bottom-left.</p>
         * 
         * <strong>example:</strong>
         * <p>Example: <code>[[{&quot;x&quot;: 0, &quot;y&quot;: 0}, ...]]</code></p>
         */
        @NameInMap("questionPoints")
        public java.util.List<java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResultsQuestionPoints>> questionPoints;

        /**
         * <p>The question type.</p>
         * 
         * <strong>example:</strong>
         * <p>choice</p>
         */
        @NameInMap("questionType")
        public String questionType;

        /**
         * <p>The question analysis and solution.</p>
         * 
         * <strong>example:</strong>
         * <p>Question analysis and solution</p>
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
        /**
         * <p>The rotation angle of the image in the clockwise direction, in degrees.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("angle")
        public Long angle;

        /**
         * <p>The URL of the corrected image. If <code>dewarp</code> is set to <code>false</code>, the original image is returned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/dewarp.jpg">https://example.com/dewarp.jpg</a></p>
         */
        @NameInMap("dewarpUrl")
        public String dewarpUrl;

        /**
         * <p>The array of question recognition and grading results.</p>
         */
        @NameInMap("questionResults")
        public java.util.List<CreateEduHomeworkCorrectSubmitResponseBodyDataQuestionResults> questionResults;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Examples: submitted, processing, finished, and failed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The unique identifier of the task, which must be included in subsequent queries.</p>
         * 
         * <strong>example:</strong>
         * <p>task-20261116-abc123</p>
         */
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
