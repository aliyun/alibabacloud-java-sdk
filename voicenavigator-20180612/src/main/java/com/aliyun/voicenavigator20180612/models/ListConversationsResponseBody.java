// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Conversations")
    public java.util.List<ListConversationsResponseBodyConversations> conversations;

    public static ListConversationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConversationsResponseBody self = new ListConversationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConversationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListConversationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConversationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConversationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConversationsResponseBody setConversations(java.util.List<ListConversationsResponseBodyConversations> conversations) {
        this.conversations = conversations;
        return this;
    }
    public java.util.List<ListConversationsResponseBodyConversations> getConversations() {
        return this.conversations;
    }

    public static class ListConversationsResponseBodyConversations extends TeaModel {
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

        public static ListConversationsResponseBodyConversations build(java.util.Map<String, ?> map) throws Exception {
            ListConversationsResponseBodyConversations self = new ListConversationsResponseBodyConversations();
            return TeaModel.build(map, self);
        }

        public ListConversationsResponseBodyConversations setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListConversationsResponseBodyConversations setEffectiveAnswerCount(Integer effectiveAnswerCount) {
            this.effectiveAnswerCount = effectiveAnswerCount;
            return this;
        }
        public Integer getEffectiveAnswerCount() {
            return this.effectiveAnswerCount;
        }

        public ListConversationsResponseBodyConversations setTransferredToAgent(Boolean transferredToAgent) {
            this.transferredToAgent = transferredToAgent;
            return this;
        }
        public Boolean getTransferredToAgent() {
            return this.transferredToAgent;
        }

        public ListConversationsResponseBodyConversations setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ListConversationsResponseBodyConversations setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListConversationsResponseBodyConversations setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListConversationsResponseBodyConversations setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListConversationsResponseBodyConversations setUserUtteranceCount(Integer userUtteranceCount) {
            this.userUtteranceCount = userUtteranceCount;
            return this;
        }
        public Integer getUserUtteranceCount() {
            return this.userUtteranceCount;
        }

    }

}
