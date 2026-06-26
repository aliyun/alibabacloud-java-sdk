// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationsResponseBody extends TeaModel {
    /**
     * <p>The list of conversation objects.</p>
     */
    @NameInMap("Conversations")
    public java.util.List<ListConversationsResponseBodyConversations> conversations;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a2c26e67-5984-4935-984e-bcee52971993</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of conversations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>12356</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>135815884***</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>The unique ID of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>82b2eaae-ce5c-45f8-8231-f15b6b27e55c</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        @NameInMap("DsReport")
        public String dsReport;

        @NameInMap("DsReportTitles")
        public java.util.List<String> dsReportTitles;

        /**
         * <p>The reason that the conversation ended. Valid values:<br>1: The conversation completed normally.<br>2: The bot hung up after a recognition failure.<br>3: The call was disconnected due to a silence timeout.<br>4: The user hung up after a recognition failure.<br>5: The user hung up for an unknown reason.<br>6: The call was transferred to an agent because an intent was matched.<br>7: The call was transferred to an agent due to a recognition failure.<br>8: No interaction from the user.<br>9: The call was interrupted by a system error.<br>10: The call was transferred to an IVR system because an intent was matched.<br>11: The call was transferred to an IVR system due to a recognition failure.<br><br><br><br><br><br><br><br><br><br><br></p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EndReason")
        public Integer endReason;

        /**
         * <p>The end time of the conversation, represented as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1582266750353</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Indicates whether the final audio playback was completed before the call was disconnected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasLastPlaybackCompleted")
        public Boolean hasLastPlaybackCompleted;

        /**
         * <p>Indicates whether the conversation was transferred to an agent.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasToAgent")
        public Boolean hasToAgent;

        /**
         * <p>The number of rounds in the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Rounds")
        public Integer rounds;

        /**
         * <p>Indicates whether the conversation was run in a sandbox environment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SandBox")
        public Boolean sandBox;

        /**
         * <p>The ID of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>skg-123</p>
         */
        @NameInMap("SkillGroup")
        public String skillGroup;

        /**
         * <p>The start time of the conversation, represented as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1641625694286</p>
         */
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
