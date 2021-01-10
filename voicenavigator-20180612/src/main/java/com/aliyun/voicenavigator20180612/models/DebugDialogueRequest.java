// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugDialogueRequest extends TeaModel {
    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("AdditionalContext")
    public String additionalContext;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Utterance")
    public String utterance;

    public static DebugDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugDialogueRequest self = new DebugDialogueRequest();
        return TeaModel.build(map, self);
    }

    public DebugDialogueRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DebugDialogueRequest setAdditionalContext(String additionalContext) {
        this.additionalContext = additionalContext;
        return this;
    }
    public String getAdditionalContext() {
        return this.additionalContext;
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
