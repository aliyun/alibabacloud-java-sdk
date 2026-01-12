// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ChatMessagesShrinkRequest extends TeaModel {
    /**
     * <p>The query content.</p>
     * 
     * <strong>example:</strong>
     * <p>fea7bdca-e848-44dd-b1ae-852472b8****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The ID of the parent message.</p>
     */
    @NameInMap("Inputs")
    public String inputsShrink;

    /**
     * <p>The ID of the conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
     */
    @NameInMap("ParentMessageId")
    public String parentMessageId;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>ChatMessages</strong>.</p>
     * <p>This parameter is required.</p>
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
