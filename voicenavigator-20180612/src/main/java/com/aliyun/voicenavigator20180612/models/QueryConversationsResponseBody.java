// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class QueryConversationsResponseBody extends TeaModel {
    @NameInMap("Conversations")
    public java.util.List<QueryConversationsResponseBodyConversations> conversations;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryConversationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationsResponseBody self = new QueryConversationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConversationsResponseBody setConversations(java.util.List<QueryConversationsResponseBodyConversations> conversations) {
        this.conversations = conversations;
        return this;
    }
    public java.util.List<QueryConversationsResponseBodyConversations> getConversations() {
        return this.conversations;
    }

    public QueryConversationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryConversationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryConversationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConversationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryConversationsResponseBodyConversations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1582183381000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <strong>example:</strong>
         * <p>02811111111</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("EffectiveAnswerCount")
        public Integer effectiveAnswerCount;

        /**
         * <strong>example:</strong>
         * <p>1582183481000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>AAA</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TransferredToAgent")
        public Boolean transferredToAgent;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UserUtteranceCount")
        public Integer userUtteranceCount;

        public static QueryConversationsResponseBodyConversations build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationsResponseBodyConversations self = new QueryConversationsResponseBodyConversations();
            return TeaModel.build(map, self);
        }

        public QueryConversationsResponseBodyConversations setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public QueryConversationsResponseBodyConversations setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public QueryConversationsResponseBodyConversations setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public QueryConversationsResponseBodyConversations setEffectiveAnswerCount(Integer effectiveAnswerCount) {
            this.effectiveAnswerCount = effectiveAnswerCount;
            return this;
        }
        public Integer getEffectiveAnswerCount() {
            return this.effectiveAnswerCount;
        }

        public QueryConversationsResponseBodyConversations setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryConversationsResponseBodyConversations setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public QueryConversationsResponseBodyConversations setTransferredToAgent(Boolean transferredToAgent) {
            this.transferredToAgent = transferredToAgent;
            return this;
        }
        public Boolean getTransferredToAgent() {
            return this.transferredToAgent;
        }

        public QueryConversationsResponseBodyConversations setUserUtteranceCount(Integer userUtteranceCount) {
            this.userUtteranceCount = userUtteranceCount;
            return this;
        }
        public Integer getUserUtteranceCount() {
            return this.userUtteranceCount;
        }

    }

}
