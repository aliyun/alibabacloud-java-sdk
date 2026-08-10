// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetMessagesResponseBody extends TeaModel {
    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetMessagesResponseBodyData> data;

    /**
     * <p>Indicates whether there is a next page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>The maximum number of entries returned.</p>
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

    public static class GetMessagesResponseBodyDataMessageFiles extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("Type")
        public String type;

        public static GetMessagesResponseBodyDataMessageFiles build(java.util.Map<String, ?> map) throws Exception {
            GetMessagesResponseBodyDataMessageFiles self = new GetMessagesResponseBodyDataMessageFiles();
            return TeaModel.build(map, self);
        }

        public GetMessagesResponseBodyDataMessageFiles setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMessagesResponseBodyDataMessageFiles setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public GetMessagesResponseBodyDataMessageFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMessagesResponseBodyData extends TeaModel {
        /**
         * <p>The answer.</p>
         * 
         * <strong>example:</strong>
         * <p>The disk usage of instance rm-bp14as9914vd3**** is 23%, and scaling is not required for now. If you need to view the detailed configurations or performance monitoring of a specific instance, or perform other operations, let me know your specific requirements!</p>
         */
        @NameInMap("Answer")
        public String answer;

        /**
         * <p>The conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9cbbe885-b240-4803-9d15-6781a3fd****</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <p>The creation time.</p>
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

        @NameInMap("GenerationFinishedAt")
        public String generationFinishedAt;

        @NameInMap("GenerationStartedAt")
        public String generationStartedAt;

        @NameInMap("GenerationStatus")
        public String generationStatus;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("LastSentEntryId")
        public String lastSentEntryId;

        @NameInMap("MessageFiles")
        public java.util.List<GetMessagesResponseBodyDataMessageFiles> messageFiles;

        /**
         * <p>The query statement.</p>
         * 
         * <strong>example:</strong>
         * <p>What is the disk usage of instance rm-bp14as9914vd3****, and is scaling required?</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The retrieval resources.</p>
         */
        @NameInMap("RetrieverResources")
        public java.util.List<?> retrieverResources;

        @NameInMap("StreamKey")
        public String streamKey;

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

        public GetMessagesResponseBodyData setGenerationFinishedAt(String generationFinishedAt) {
            this.generationFinishedAt = generationFinishedAt;
            return this;
        }
        public String getGenerationFinishedAt() {
            return this.generationFinishedAt;
        }

        public GetMessagesResponseBodyData setGenerationStartedAt(String generationStartedAt) {
            this.generationStartedAt = generationStartedAt;
            return this;
        }
        public String getGenerationStartedAt() {
            return this.generationStartedAt;
        }

        public GetMessagesResponseBodyData setGenerationStatus(String generationStatus) {
            this.generationStatus = generationStatus;
            return this;
        }
        public String getGenerationStatus() {
            return this.generationStatus;
        }

        public GetMessagesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMessagesResponseBodyData setLastSentEntryId(String lastSentEntryId) {
            this.lastSentEntryId = lastSentEntryId;
            return this;
        }
        public String getLastSentEntryId() {
            return this.lastSentEntryId;
        }

        public GetMessagesResponseBodyData setMessageFiles(java.util.List<GetMessagesResponseBodyDataMessageFiles> messageFiles) {
            this.messageFiles = messageFiles;
            return this;
        }
        public java.util.List<GetMessagesResponseBodyDataMessageFiles> getMessageFiles() {
            return this.messageFiles;
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

        public GetMessagesResponseBodyData setStreamKey(String streamKey) {
            this.streamKey = streamKey;
            return this;
        }
        public String getStreamKey() {
            return this.streamKey;
        }

    }

}
