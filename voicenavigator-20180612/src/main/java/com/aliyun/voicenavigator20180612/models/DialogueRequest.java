// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DialogueRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("Utterance")
    public String utterance;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("AdditionalContext")
    public String additionalContext;

    public static DialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        DialogueRequest self = new DialogueRequest();
        return TeaModel.build(map, self);
    }

    public DialogueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DialogueRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DialogueRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

    public DialogueRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public DialogueRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public DialogueRequest setAdditionalContext(String additionalContext) {
        this.additionalContext = additionalContext;
        return this;
    }
    public String getAdditionalContext() {
        return this.additionalContext;
    }

}
