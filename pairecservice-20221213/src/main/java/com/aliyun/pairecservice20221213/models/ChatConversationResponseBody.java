// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ChatConversationResponseBody extends TeaModel {
    /**
     * <p>The reply content.</p>
     * 
     * <strong>example:</strong>
     * <p>FeatureDB近7天读写量为xxx</p>
     */
    @NameInMap("Answer")
    public String answer;

    /**
     * <p>The call ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e47cfae9-c0cc-42e1-91e2-e67cdb0e7b96</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SERVER_ERROR</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>connection failed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The event.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <p>The function name.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Func")
    public String func;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>chat-abcdefg</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    public static ChatConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatConversationResponseBody self = new ChatConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatConversationResponseBody setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public ChatConversationResponseBody setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public ChatConversationResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ChatConversationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ChatConversationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ChatConversationResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public ChatConversationResponseBody setFunc(String func) {
        this.func = func;
        return this;
    }
    public String getFunc() {
        return this.func;
    }

    public ChatConversationResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public ChatConversationResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ChatConversationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatConversationResponseBody setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
