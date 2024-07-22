// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugBeginDialogueRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>135815*****</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8a503680-815d-473e-a9b0-e010f47a64d2</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("InitialContext")
    public String initialContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8a503680-815d-473e-a9b0-e010f47a64d2</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DebugBeginDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugBeginDialogueRequest self = new DebugBeginDialogueRequest();
        return TeaModel.build(map, self);
    }

    public DebugBeginDialogueRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public DebugBeginDialogueRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public DebugBeginDialogueRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DebugBeginDialogueRequest setInitialContext(String initialContext) {
        this.initialContext = initialContext;
        return this;
    }
    public String getInitialContext() {
        return this.initialContext;
    }

    public DebugBeginDialogueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
