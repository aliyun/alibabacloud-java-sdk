// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class SilenceTimeoutRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb0</p>
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
     * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1231639035307976</p>
     */
    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    public static SilenceTimeoutRequest build(java.util.Map<String, ?> map) throws Exception {
        SilenceTimeoutRequest self = new SilenceTimeoutRequest();
        return TeaModel.build(map, self);
    }

    public SilenceTimeoutRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public SilenceTimeoutRequest setInitialContext(String initialContext) {
        this.initialContext = initialContext;
        return this;
    }
    public String getInitialContext() {
        return this.initialContext;
    }

    public SilenceTimeoutRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SilenceTimeoutRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

}
