// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationDetailsResponseBody extends TeaModel {
    /**
     * <p>The list of conversation details.</p>
     */
    @NameInMap("ConversationDetails")
    public java.util.List<ListConversationDetailsResponseBodyConversationDetails> conversationDetails;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConversationDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConversationDetailsResponseBody self = new ListConversationDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConversationDetailsResponseBody setConversationDetails(java.util.List<ListConversationDetailsResponseBodyConversationDetails> conversationDetails) {
        this.conversationDetails = conversationDetails;
        return this;
    }
    public java.util.List<ListConversationDetailsResponseBodyConversationDetails> getConversationDetails() {
        return this.conversationDetails;
    }

    public ListConversationDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConversationDetailsResponseBodyConversationDetails extends TeaModel {
        /**
         * <p>The action performed during the turn.</p>
         * 
         * <strong>example:</strong>
         * <p>Dialogue</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The action parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ActionParams")
        public String actionParams;

        /**
         * <p>The conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1582266750353</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The sequence ID of the conversational turn.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        @NameInMap("SequenceId")
        public String sequenceId;

        /**
         * <p>The speaker. Valid values: <code>customer</code> and <code>chatbot</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Chatbot</p>
         */
        @NameInMap("Speaker")
        public String speaker;

        /**
         * <p>The speaker\&quot;s utterance.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
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

        public ListConversationDetailsResponseBodyConversationDetails setActionParams(String actionParams) {
            this.actionParams = actionParams;
            return this;
        }
        public String getActionParams() {
            return this.actionParams;
        }

        public ListConversationDetailsResponseBodyConversationDetails setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListConversationDetailsResponseBodyConversationDetails setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListConversationDetailsResponseBodyConversationDetails setSequenceId(String sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }
        public String getSequenceId() {
            return this.sequenceId;
        }

        public ListConversationDetailsResponseBodyConversationDetails setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
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
