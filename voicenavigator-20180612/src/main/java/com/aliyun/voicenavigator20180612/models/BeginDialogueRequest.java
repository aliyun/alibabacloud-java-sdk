// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class BeginDialogueRequest extends TeaModel {
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
     * <p>1358158****</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c28fc549-d88f-4f6e-85ad-a0806e5e39c0</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;channelId\&quot;:\&quot;fe2559d3-5fc9-4fa5-8314-32b9f762791d\&quot;}</p>
     */
    @NameInMap("InitialContext")
    public String initialContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4d7db6670b8e41b5adb1f21560ea9272</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1231639035307976</p>
     */
    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

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

    public BeginDialogueRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

}
