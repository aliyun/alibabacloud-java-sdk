// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ChatConversationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>e47cfae9-c0cc-42e1-91e2-e67cdb0e7b96</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ChatConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatConversationRequest self = new ChatConversationRequest();
        return TeaModel.build(map, self);
    }

    public ChatConversationRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ChatConversationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ChatConversationRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ChatConversationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
