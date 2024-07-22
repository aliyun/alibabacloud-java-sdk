// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugDialogueRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AdditionalContext")
    public String additionalContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7cefbff0-8d50-4d6f-b93c-73cee23c1555</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abb4aa26-3a8e-43dd-82f8-0c3898c9c67f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Utterance")
    public String utterance;

    public static DebugDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugDialogueRequest self = new DebugDialogueRequest();
        return TeaModel.build(map, self);
    }

    public DebugDialogueRequest setAdditionalContext(String additionalContext) {
        this.additionalContext = additionalContext;
        return this;
    }
    public String getAdditionalContext() {
        return this.additionalContext;
    }

    public DebugDialogueRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DebugDialogueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DebugDialogueRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

}
