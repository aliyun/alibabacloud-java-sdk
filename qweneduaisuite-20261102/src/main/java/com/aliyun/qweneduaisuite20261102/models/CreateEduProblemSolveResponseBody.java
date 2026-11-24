// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class CreateEduProblemSolveResponseBody extends TeaModel {
    /**
     * <p>The API data identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>change_batch</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Specifies whether the response is the final full snapshot. This value is fixed to true in the complete event.</p>
     */
    @NameInMap("finished")
    public Boolean finished;

    /**
     * <p>The current list of complete question results.</p>
     */
    @NameInMap("items")
    public java.util.List<CreateEduProblemSolveResponseBodyItems> items;

    /**
     * <p>The actual message returned by the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Echo request ID echoed from echo request.</p>
     * 
     * <strong>example:</strong>
     * <p>098E23F7-A74C-5584-87A1-39734D5B83CE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The type of the question resolution result. Valid values:</p>
     * <ul>
     * <li>single: A single question.</li>
     * <li>multiple: Multiple questions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("resultType")
    public String resultType;

    /**
     * <p>Specifies whether the error is retryable. Default value: true.</p>
     */
    @NameInMap("retryable")
    public Boolean retryable;

    /**
     * <p>The token usage. Only the complete event carries the final value. This field is not returned in message events.</p>
     */
    @NameInMap("usage")
    public CreateEduProblemSolveResponseBodyUsage usage;

    public static CreateEduProblemSolveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEduProblemSolveResponseBody self = new CreateEduProblemSolveResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEduProblemSolveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEduProblemSolveResponseBody setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public CreateEduProblemSolveResponseBody setItems(java.util.List<CreateEduProblemSolveResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<CreateEduProblemSolveResponseBodyItems> getItems() {
        return this.items;
    }

    public CreateEduProblemSolveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEduProblemSolveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEduProblemSolveResponseBody setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public CreateEduProblemSolveResponseBody setRetryable(Boolean retryable) {
        this.retryable = retryable;
        return this;
    }
    public Boolean getRetryable() {
        return this.retryable;
    }

    public CreateEduProblemSolveResponseBody setUsage(CreateEduProblemSolveResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public CreateEduProblemSolveResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class CreateEduProblemSolveResponseBodyItemsThinking extends TeaModel {
        /**
         * <p>The current thinking content.</p>
         * 
         * <strong>example:</strong>
         * <p>8ci7nsj9WPYXvQb9MJfA</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The thinking status. Valid values:</p>
         * <ul>
         * <li>processing: The thinking process is in progress.</li>
         * <li>complete: The thinking process is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateEduProblemSolveResponseBodyItemsThinking build(java.util.Map<String, ?> map) throws Exception {
            CreateEduProblemSolveResponseBodyItemsThinking self = new CreateEduProblemSolveResponseBodyItemsThinking();
            return TeaModel.build(map, self);
        }

        public CreateEduProblemSolveResponseBodyItemsThinking setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateEduProblemSolveResponseBodyItemsThinking setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateEduProblemSolveResponseBodyItems extends TeaModel {
        /**
         * <p>The complete question resolution content in Markdown format, including the deduction process and the final result.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The URL of the unique image for the current question. The URL may be time-sensitive. If the question is not associated with an image resource and no request URL is available for fallback, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.jpg">https://xxx.jpg</a></p>
         */
        @NameInMap("imageUrl")
        public String imageUrl;

        /**
         * <p>The question identifier. The value is the question title, such as Question 1. The server does not return a separate title field. If the downstream service does not provide a question title, which is always the case in single-question scenarios, titles such as Question 1 and Question 2 are generated in the order of the questions.</p>
         * 
         * <strong>example:</strong>
         * <p>50a10e43a33e36179e355556d319ebd5</p>
         */
        @NameInMap("questionId")
        public String questionId;

        /**
         * <p>The current question status. Valid values:</p>
         * <ul>
         * <li>processing: The question is being processed.</li>
         * <li>complete: The question processing is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The thinking process. This field is returned only when result_type is single. It is not returned for multiple questions.</p>
         */
        @NameInMap("thinking")
        public CreateEduProblemSolveResponseBodyItemsThinking thinking;

        public static CreateEduProblemSolveResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            CreateEduProblemSolveResponseBodyItems self = new CreateEduProblemSolveResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public CreateEduProblemSolveResponseBodyItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateEduProblemSolveResponseBodyItems setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public CreateEduProblemSolveResponseBodyItems setQuestionId(String questionId) {
            this.questionId = questionId;
            return this;
        }
        public String getQuestionId() {
            return this.questionId;
        }

        public CreateEduProblemSolveResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateEduProblemSolveResponseBodyItems setThinking(CreateEduProblemSolveResponseBodyItemsThinking thinking) {
            this.thinking = thinking;
            return this;
        }
        public CreateEduProblemSolveResponseBodyItemsThinking getThinking() {
            return this.thinking;
        }

    }

    public static class CreateEduProblemSolveResponseBodyUsage extends TeaModel {
        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("completionTokens")
        public Integer completionTokens;

        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("promptTokens")
        public Integer promptTokens;

        public static CreateEduProblemSolveResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            CreateEduProblemSolveResponseBodyUsage self = new CreateEduProblemSolveResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public CreateEduProblemSolveResponseBodyUsage setCompletionTokens(Integer completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }
        public Integer getCompletionTokens() {
            return this.completionTokens;
        }

        public CreateEduProblemSolveResponseBodyUsage setPromptTokens(Integer promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }
        public Integer getPromptTokens() {
            return this.promptTokens;
        }

    }

}
