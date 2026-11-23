// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class GetEduHomeworkCorrectionResultResponseBody extends TeaModel {
    /**
     * <p>The API status.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The business data. This field is usually empty when the task fails.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;request_id&quot;: &quot;req-20261116-0001&quot;,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;data&quot;: {
     *     &quot;task_id&quot;: &quot;task-20261116-abc123&quot;,
     *     &quot;status&quot;: &quot;finished&quot;,
     *     &quot;course&quot;: &quot;math&quot;,
     *     &quot;dewarp_url&quot;: &quot;<a href="https://example.com/dewarp.jpg">https://example.com/dewarp.jpg</a>&quot;,
     *     &quot;angle&quot;: 0,
     *     &quot;render_url&quot;: &quot;<a href="https://example.com/render.jpg">https://example.com/render.jpg</a>&quot;,
     *     &quot;question_results&quot;: [
     *       {
     *         &quot;question_id&quot;: &quot;q-001&quot;,
     *         &quot;question_type&quot;: &quot;choice&quot;,
     *         &quot;question_content&quot;: &quot;1 + 1 = ?&quot;,
     *         &quot;question_points&quot;: [
     *           [
     *             {&quot;x&quot;: 100, &quot;y&quot;: 100},
     *             {&quot;x&quot;: 200, &quot;y&quot;: 100},
     *             {&quot;x&quot;: 200, &quot;y&quot;: 150},
     *             {&quot;x&quot;: 100, &quot;y&quot;: 150}
     *           ]
     *         ],
     *         &quot;finish&quot;: true,
     *         &quot;answer_results&quot;: [
     *           {
     *             &quot;check_result&quot;: &quot;correct&quot;,
     *             &quot;check_point&quot;: {&quot;x&quot;: 150, &quot;y&quot;: 125},
     *             &quot;answer_points&quot;: [
     *               {&quot;x&quot;: 120, &quot;y&quot;: 120},
     *               {&quot;x&quot;: 180, &quot;y&quot;: 120},
     *               {&quot;x&quot;: 180, &quot;y&quot;: 130},
     *               {&quot;x&quot;: 120, &quot;y&quot;: 130}
     *             ],
     *             &quot;user_answer&quot;: &quot;2&quot;,
     *             &quot;standard_answer&quot;: &quot;2&quot;
     *           }
     *         ],
     *         &quot;solution&quot;: &quot;1 + 1 = 2&quot;
     *       }
     *     ],
     *     &quot;usage&quot;: {
     *       &quot;prompt_tokens&quot;: 1000,
     *       &quot;completion_tokens&quot;: 200,
     *       &quot;total_tokens&quot;: 1200
     *     }
     *   }
     * }</p>
     */
    @NameInMap("data")
    public GetEduHomeworkCorrectionResultResponseBodyData data;

    /**
     * <p>The request error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>req-20261116-0001</p>
     */
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
        /**
         * <p>The coordinate group of the user\&quot;s answering area. It generally contains four vertex coordinate values, arranged in the order of top-left, top-right, bottom-right, and bottom-left, such as <code>[{&quot;x&quot;: ..., &quot;y&quot;: ...}, ...]</code>.</p>
         */
        @NameInMap("answerPoints")
        public java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsAnswerPoints> answerPoints;

        /**
         * <p>The coordinates of the grading mark point, such as <code>{ &quot;x&quot;: ..., &quot;y&quot;: ... }</code>.</p>
         */
        @NameInMap("checkPoint")
        public GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResultsCheckPoint checkPoint;

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
         * <p>120</p>
         */
        @NameInMap("standardAnswer")
        public String standardAnswer;

        /**
         * <p>The student\&quot;s answer.</p>
         * 
         * <strong>example:</strong>
         * <p>980</p>
         */
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
        /**
         * <p>The array of answering and grading results for the question. For more information, see the following table.</p>
         */
        @NameInMap("answerResults")
        public java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsAnswerResults> answerResults;

        /**
         * <p>Indicates whether the task is finished:</p>
         * <ul>
         * <li><strong>true</strong>: The task is finished.</li>
         * <li><strong>false</strong>: The task is not finished.</li>
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
         * <p>The coordinate group of the question area. It generally contains four vertex coordinate values, arranged in the order of top-left, top-right, bottom-right, and bottom-left.</p>
         * 
         * <strong>example:</strong>
         * <p><code>[[{&quot;x&quot;: 120, &quot;y&quot;: 980}, ...]]</code></p>
         */
        @NameInMap("questionPoints")
        public java.util.List<java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResultsQuestionPoints>> questionPoints;

        /**
         * <p>The question type.</p>
         * 
         * <strong>example:</strong>
         * <p>Multiple-choice question, applied subjective question, problem-solving question, calculation question, etc</p>
         */
        @NameInMap("questionType")
        public String questionType;

        /**
         * <p>The question analysis or solution.</p>
         * 
         * <strong>example:</strong>
         * <p>Question analysis or solution</p>
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
        /**
         * <p>The rotation angle of the image in the clockwise direction, in degrees.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("angle")
        public Long angle;

        /**
         * <p>The URL of the dewarped image. If dewarp is set to false, the URL of the original image is returned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/dewarp.jpg">https://example.com/dewarp.jpg</a></p>
         */
        @NameInMap("dewarpUrl")
        public String dewarpUrl;

        /**
         * <p>The array of question recognition and grading results. For more information, see the following table.</p>
         */
        @NameInMap("questionResults")
        public java.util.List<GetEduHomeworkCorrectionResultResponseBodyDataQuestionResults> questionResults;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>submitted, processing, finished, or failed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The unique identifier of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-20261116-abc123</p>
         */
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
