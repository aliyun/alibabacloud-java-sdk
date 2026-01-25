// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetMessagesResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetMessagesResponseBodyData> data;

    /**
     * <p>Indicates whether the current page is followed by a page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessagesResponseBody self = new GetMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessagesResponseBody setData(java.util.List<GetMessagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetMessagesResponseBodyData> getData() {
        return this.data;
    }

    public GetMessagesResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public GetMessagesResponseBody setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMessagesResponseBodyDataEvents extends TeaModel {
        @NameInMap("answer")
        public String answer;

        @NameInMap("event")
        public String event;

        public static GetMessagesResponseBodyDataEvents build(java.util.Map<String, ?> map) throws Exception {
            GetMessagesResponseBodyDataEvents self = new GetMessagesResponseBodyDataEvents();
            return TeaModel.build(map, self);
        }

        public GetMessagesResponseBodyDataEvents setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public GetMessagesResponseBodyDataEvents setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

    }

    public static class GetMessagesResponseBodyData extends TeaModel {
        /**
         * <p>The response to the query.</p>
         */
        @NameInMap("Answer")
        public String answer;

        /**
         * <p>The ID of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>9cbbe885-b240-4803-9d15-6781a3fd****</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <p>The creation time of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>1763986004</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Events")
        public java.util.List<GetMessagesResponseBodyDataEvents> events;

        /**
         * <p>The feedback.</p>
         * 
         * <strong>example:</strong>
         * <p>like</p>
         */
        @NameInMap("Feedback")
        public String feedback;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The query statement.</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The retriever resources.</p>
         */
        @NameInMap("RetrieverResources")
        public java.util.List<?> retrieverResources;

        public static GetMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMessagesResponseBodyData self = new GetMessagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMessagesResponseBodyData setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public GetMessagesResponseBodyData setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public GetMessagesResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetMessagesResponseBodyData setEvents(java.util.List<GetMessagesResponseBodyDataEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<GetMessagesResponseBodyDataEvents> getEvents() {
            return this.events;
        }

        public GetMessagesResponseBodyData setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public GetMessagesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMessagesResponseBodyData setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public GetMessagesResponseBodyData setRetrieverResources(java.util.List<?> retrieverResources) {
            this.retrieverResources = retrieverResources;
            return this;
        }
        public java.util.List<?> getRetrieverResources() {
            return this.retrieverResources;
        }

    }

}
