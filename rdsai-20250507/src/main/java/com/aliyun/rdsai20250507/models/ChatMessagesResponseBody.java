// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ChatMessagesResponseBody extends TeaModel {
    /**
     * <p>The answer.</p>
     */
    @NameInMap("Answer")
    public String answer;

    /**
     * <p>The ID of the conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>9cbbe885-b240-4803-9d15-6781a3fd****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The creation time of the conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>1763986004</p>
     */
    @NameInMap("CreatedAt")
    public Long createdAt;

    /**
     * <p>The event.</p>
     * 
     * <strong>example:</strong>
     * <p>MysqlIOException</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <p>The message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>60b335ca-124d-4ee1-864b-de554987****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>oas8pwy2-slxw-sf98-bx83-cb2hkktl****</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The query mode.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>01c3d43d-9466-4bd5-8196-4cbbce08****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ChatMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatMessagesResponseBody self = new ChatMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatMessagesResponseBody setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public ChatMessagesResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ChatMessagesResponseBody setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public ChatMessagesResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public ChatMessagesResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChatMessagesResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ChatMessagesResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ChatMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatMessagesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
