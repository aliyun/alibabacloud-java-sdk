// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationsResponseBody extends TeaModel {
    @NameInMap("Conversations")
    public java.util.List<ListConversationsResponseBodyConversations> conversations;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListConversationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConversationsResponseBody self = new ListConversationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConversationsResponseBody setConversations(java.util.List<ListConversationsResponseBodyConversations> conversations) {
        this.conversations = conversations;
        return this;
    }
    public java.util.List<ListConversationsResponseBodyConversations> getConversations() {
        return this.conversations;
    }

    public ListConversationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListConversationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListConversationsResponseBodyConversations extends TeaModel {
        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("ConversationId")
        public String conversationId;

        @NameInMap("DsReport")
        public String dsReport;

        @NameInMap("DsReportTitles")
        public java.util.List<String> dsReportTitles;

        @NameInMap("EndReason")
        public Integer endReason;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("HasLastPlaybackCompleted")
        public Boolean hasLastPlaybackCompleted;

        @NameInMap("HasToAgent")
        public Boolean hasToAgent;

        @NameInMap("Rounds")
        public Integer rounds;

        @NameInMap("SandBox")
        public Boolean sandBox;

        @NameInMap("SkillGroup")
        public String skillGroup;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListConversationsResponseBodyConversations build(java.util.Map<String, ?> map) throws Exception {
            ListConversationsResponseBodyConversations self = new ListConversationsResponseBodyConversations();
            return TeaModel.build(map, self);
        }

        public ListConversationsResponseBodyConversations setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListConversationsResponseBodyConversations setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListConversationsResponseBodyConversations setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListConversationsResponseBodyConversations setDsReport(String dsReport) {
            this.dsReport = dsReport;
            return this;
        }
        public String getDsReport() {
            return this.dsReport;
        }

        public ListConversationsResponseBodyConversations setDsReportTitles(java.util.List<String> dsReportTitles) {
            this.dsReportTitles = dsReportTitles;
            return this;
        }
        public java.util.List<String> getDsReportTitles() {
            return this.dsReportTitles;
        }

        public ListConversationsResponseBodyConversations setEndReason(Integer endReason) {
            this.endReason = endReason;
            return this;
        }
        public Integer getEndReason() {
            return this.endReason;
        }

        public ListConversationsResponseBodyConversations setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListConversationsResponseBodyConversations setHasLastPlaybackCompleted(Boolean hasLastPlaybackCompleted) {
            this.hasLastPlaybackCompleted = hasLastPlaybackCompleted;
            return this;
        }
        public Boolean getHasLastPlaybackCompleted() {
            return this.hasLastPlaybackCompleted;
        }

        public ListConversationsResponseBodyConversations setHasToAgent(Boolean hasToAgent) {
            this.hasToAgent = hasToAgent;
            return this;
        }
        public Boolean getHasToAgent() {
            return this.hasToAgent;
        }

        public ListConversationsResponseBodyConversations setRounds(Integer rounds) {
            this.rounds = rounds;
            return this;
        }
        public Integer getRounds() {
            return this.rounds;
        }

        public ListConversationsResponseBodyConversations setSandBox(Boolean sandBox) {
            this.sandBox = sandBox;
            return this;
        }
        public Boolean getSandBox() {
            return this.sandBox;
        }

        public ListConversationsResponseBodyConversations setSkillGroup(String skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public String getSkillGroup() {
            return this.skillGroup;
        }

        public ListConversationsResponseBodyConversations setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
