// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class QueryConversationsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Conversations")
    public java.util.List<QueryConversationsResponseBodyConversations> conversations;

    public static QueryConversationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationsResponseBody self = new QueryConversationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConversationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public QueryConversationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryConversationsResponseBody setConversations(java.util.List<QueryConversationsResponseBodyConversations> conversations) {
        this.conversations = conversations;
        return this;
    }
    public java.util.List<QueryConversationsResponseBodyConversations> getConversations() {
        return this.conversations;
    }

    public static class QueryConversationsResponseBodyConversations extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EffectiveAnswerCount")
        public Integer effectiveAnswerCount;

        @NameInMap("TransferredToAgent")
        public Boolean transferredToAgent;

        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("ConversationId")
        public String conversationId;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("UserUtteranceCount")
        public Integer userUtteranceCount;

        public static QueryConversationsResponseBodyConversations build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationsResponseBodyConversations self = new QueryConversationsResponseBodyConversations();
            return TeaModel.build(map, self);
        }

        public QueryConversationsResponseBodyConversations setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryConversationsResponseBodyConversations setEffectiveAnswerCount(Integer effectiveAnswerCount) {
            this.effectiveAnswerCount = effectiveAnswerCount;
            return this;
        }
        public Integer getEffectiveAnswerCount() {
            return this.effectiveAnswerCount;
        }

        public QueryConversationsResponseBodyConversations setTransferredToAgent(Boolean transferredToAgent) {
            this.transferredToAgent = transferredToAgent;
            return this;
        }
        public Boolean getTransferredToAgent() {
            return this.transferredToAgent;
        }

        public QueryConversationsResponseBodyConversations setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public QueryConversationsResponseBodyConversations setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public QueryConversationsResponseBodyConversations setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public QueryConversationsResponseBodyConversations setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
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
