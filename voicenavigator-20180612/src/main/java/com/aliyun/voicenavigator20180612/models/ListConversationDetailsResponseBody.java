// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConversationDetails")
    public java.util.List<ListConversationDetailsResponseBodyConversationDetails> conversationDetails;

    public static ListConversationDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConversationDetailsResponseBody self = new ListConversationDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConversationDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConversationDetailsResponseBody setConversationDetails(java.util.List<ListConversationDetailsResponseBodyConversationDetails> conversationDetails) {
        this.conversationDetails = conversationDetails;
        return this;
    }
    public java.util.List<ListConversationDetailsResponseBodyConversationDetails> getConversationDetails() {
        return this.conversationDetails;
    }

    public static class ListConversationDetailsResponseBodyConversationDetails extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Speaker")
        public String speaker;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ConversationId")
        public String conversationId;

        @NameInMap("ActionParams")
        public String actionParams;

        @NameInMap("SequenceId")
        public String sequenceId;

        @NameInMap("Utterance")
        public String utterance;

        public static ListConversationDetailsResponseBodyConversationDetails build(java.util.Map<String, ?> map) throws Exception {
            ListConversationDetailsResponseBodyConversationDetails self = new ListConversationDetailsResponseBodyConversationDetails();
            return TeaModel.build(map, self);
        }

        public ListConversationDetailsResponseBodyConversationDetails setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListConversationDetailsResponseBodyConversationDetails setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public ListConversationDetailsResponseBodyConversationDetails setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListConversationDetailsResponseBodyConversationDetails setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListConversationDetailsResponseBodyConversationDetails setActionParams(String actionParams) {
            this.actionParams = actionParams;
            return this;
        }
        public String getActionParams() {
            return this.actionParams;
        }

        public ListConversationDetailsResponseBodyConversationDetails setSequenceId(String sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }
        public String getSequenceId() {
            return this.sequenceId;
        }

        public ListConversationDetailsResponseBodyConversationDetails setUtterance(String utterance) {
            this.utterance = utterance;
            return this;
        }
        public String getUtterance() {
            return this.utterance;
        }

    }

}
