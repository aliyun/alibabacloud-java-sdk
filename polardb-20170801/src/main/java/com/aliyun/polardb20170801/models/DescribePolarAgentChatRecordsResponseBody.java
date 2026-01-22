// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentChatRecordsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribePolarAgentChatRecordsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolarAgentChatRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarAgentChatRecordsResponseBody self = new DescribePolarAgentChatRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarAgentChatRecordsResponseBody setData(java.util.List<DescribePolarAgentChatRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribePolarAgentChatRecordsResponseBodyData> getData() {
        return this.data;
    }

    public DescribePolarAgentChatRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolarAgentChatRecordsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Answer")
        public String answer;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FeedbackType")
        public String feedbackType;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>Query ID。</p>
         * 
         * <strong>example:</strong>
         * <p>sq202506261002hz8b24fe80067683</p>
         */
        @NameInMap("QueryId")
        public String queryId;

        /**
         * <strong>example:</strong>
         * <p>44dcdf31-04cd-4a44-9bae-834dd6657e29</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static DescribePolarAgentChatRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarAgentChatRecordsResponseBodyData self = new DescribePolarAgentChatRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePolarAgentChatRecordsResponseBodyData setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public DescribePolarAgentChatRecordsResponseBodyData setFeedbackType(String feedbackType) {
            this.feedbackType = feedbackType;
            return this;
        }
        public String getFeedbackType() {
            return this.feedbackType;
        }

        public DescribePolarAgentChatRecordsResponseBodyData setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribePolarAgentChatRecordsResponseBodyData setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public DescribePolarAgentChatRecordsResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
