// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class CollectedNumberRequest extends TeaModel {
    @NameInMap("AdditionalContext")
    public String additionalContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb0</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1426738157626835</p>
     */
    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>1500060224</p>
     */
    @NameInMap("Number")
    public String number;

    public static CollectedNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        CollectedNumberRequest self = new CollectedNumberRequest();
        return TeaModel.build(map, self);
    }

    public CollectedNumberRequest setAdditionalContext(String additionalContext) {
        this.additionalContext = additionalContext;
        return this;
    }
    public String getAdditionalContext() {
        return this.additionalContext;
    }

    public CollectedNumberRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CollectedNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CollectedNumberRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public CollectedNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
