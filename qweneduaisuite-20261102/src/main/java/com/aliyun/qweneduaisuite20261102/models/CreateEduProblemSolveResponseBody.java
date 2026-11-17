// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class CreateEduProblemSolveResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateEduProblemSolveResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("event")
    public String event;

    public static CreateEduProblemSolveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEduProblemSolveResponseBody self = new CreateEduProblemSolveResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEduProblemSolveResponseBody setData(CreateEduProblemSolveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEduProblemSolveResponseBodyData getData() {
        return this.data;
    }

    public CreateEduProblemSolveResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public static class CreateEduProblemSolveResponseBodyDataItemsThinking extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8ci7nsj9WPYXvQb9MJfA</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateEduProblemSolveResponseBodyDataItemsThinking build(java.util.Map<String, ?> map) throws Exception {
            CreateEduProblemSolveResponseBodyDataItemsThinking self = new CreateEduProblemSolveResponseBodyDataItemsThinking();
            return TeaModel.build(map, self);
        }

        public CreateEduProblemSolveResponseBodyDataItemsThinking setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateEduProblemSolveResponseBodyDataItemsThinking setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateEduProblemSolveResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("content")
        public String content;

        @NameInMap("imageUrl")
        public String imageUrl;

        @NameInMap("questionId")
        public String questionId;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("thinking")
        public CreateEduProblemSolveResponseBodyDataItemsThinking thinking;

        public static CreateEduProblemSolveResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            CreateEduProblemSolveResponseBodyDataItems self = new CreateEduProblemSolveResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public CreateEduProblemSolveResponseBodyDataItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateEduProblemSolveResponseBodyDataItems setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public CreateEduProblemSolveResponseBodyDataItems setQuestionId(String questionId) {
            this.questionId = questionId;
            return this;
        }
        public String getQuestionId() {
            return this.questionId;
        }

        public CreateEduProblemSolveResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateEduProblemSolveResponseBodyDataItems setThinking(CreateEduProblemSolveResponseBodyDataItemsThinking thinking) {
            this.thinking = thinking;
            return this;
        }
        public CreateEduProblemSolveResponseBodyDataItemsThinking getThinking() {
            return this.thinking;
        }

    }

    public static class CreateEduProblemSolveResponseBodyDataUsage extends TeaModel {
        @NameInMap("completionTokens")
        public Integer completionTokens;

        @NameInMap("promptTokens")
        public Integer promptTokens;

        public static CreateEduProblemSolveResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            CreateEduProblemSolveResponseBodyDataUsage self = new CreateEduProblemSolveResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public CreateEduProblemSolveResponseBodyDataUsage setCompletionTokens(Integer completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }
        public Integer getCompletionTokens() {
            return this.completionTokens;
        }

        public CreateEduProblemSolveResponseBodyDataUsage setPromptTokens(Integer promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }
        public Integer getPromptTokens() {
            return this.promptTokens;
        }

    }

    public static class CreateEduProblemSolveResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>change_batch</p>
         */
        @NameInMap("code")
        public String code;

        @NameInMap("finished")
        public Boolean finished;

        @NameInMap("items")
        public java.util.List<CreateEduProblemSolveResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>098E23F7-A74C-5584-87A1-39734D5B83CE</p>
         */
        @NameInMap("requestId")
        public String requestId;

        @NameInMap("resultType")
        public String resultType;

        @NameInMap("retryable")
        public Boolean retryable;

        @NameInMap("usage")
        public CreateEduProblemSolveResponseBodyDataUsage usage;

        public static CreateEduProblemSolveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEduProblemSolveResponseBodyData self = new CreateEduProblemSolveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEduProblemSolveResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateEduProblemSolveResponseBodyData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public CreateEduProblemSolveResponseBodyData setItems(java.util.List<CreateEduProblemSolveResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<CreateEduProblemSolveResponseBodyDataItems> getItems() {
            return this.items;
        }

        public CreateEduProblemSolveResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateEduProblemSolveResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateEduProblemSolveResponseBodyData setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        public String getResultType() {
            return this.resultType;
        }

        public CreateEduProblemSolveResponseBodyData setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

        public CreateEduProblemSolveResponseBodyData setUsage(CreateEduProblemSolveResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public CreateEduProblemSolveResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
