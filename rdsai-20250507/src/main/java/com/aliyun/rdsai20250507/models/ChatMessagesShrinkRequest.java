// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ChatMessagesShrinkRequest extends TeaModel {
    /**
     * <p>The conversation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fea7bdca-e848-44dd-b1ae-852472b8****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The event output type. Valid values: inline and separate. Default value: inline. When set to inline, tool invocation events, sub-node events, and document events are included in the answer field of event = message. When set to separate, tool invocation events, sub-node events, and document events each have their own event.</p>
     * 
     * <strong>example:</strong>
     * <p>inline</p>
     */
    @NameInMap("EventMode")
    public String eventMode;

    @NameInMap("Files")
    public String filesShrink;

    /**
     * <p>The task input.</p>
     */
    @NameInMap("Inputs")
    public String inputsShrink;

    /**
     * <p>The parent message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
     */
    @NameInMap("ParentMessageId")
    public String parentMessageId;

    /**
     * <p>The query content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Disk usage of instance rm-bp14as9914vd3****, is capacity expansion needed</p>
     */
    @NameInMap("Query")
    public String query;

    public static ChatMessagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatMessagesShrinkRequest self = new ChatMessagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChatMessagesShrinkRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ChatMessagesShrinkRequest setEventMode(String eventMode) {
        this.eventMode = eventMode;
        return this;
    }
    public String getEventMode() {
        return this.eventMode;
    }

    public ChatMessagesShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public ChatMessagesShrinkRequest setInputsShrink(String inputsShrink) {
        this.inputsShrink = inputsShrink;
        return this;
    }
    public String getInputsShrink() {
        return this.inputsShrink;
    }

    public ChatMessagesShrinkRequest setParentMessageId(String parentMessageId) {
        this.parentMessageId = parentMessageId;
        return this;
    }
    public String getParentMessageId() {
        return this.parentMessageId;
    }

    public ChatMessagesShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
