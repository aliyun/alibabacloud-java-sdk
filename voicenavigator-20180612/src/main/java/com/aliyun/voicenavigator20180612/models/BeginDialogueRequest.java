// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class BeginDialogueRequest extends TeaModel {
    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("InitialContext")
    public String initialContext;

    @NameInMap("InstanceId")
    public String instanceId;

    public static BeginDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        BeginDialogueRequest self = new BeginDialogueRequest();
        return TeaModel.build(map, self);
    }

    public BeginDialogueRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public BeginDialogueRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public BeginDialogueRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public BeginDialogueRequest setInitialContext(String initialContext) {
        this.initialContext = initialContext;
        return this;
    }
    public String getInitialContext() {
        return this.initialContext;
    }

    public BeginDialogueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
