// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class SilenceTimeoutRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("InitialContext")
    public String initialContext;

    public static SilenceTimeoutRequest build(java.util.Map<String, ?> map) throws Exception {
        SilenceTimeoutRequest self = new SilenceTimeoutRequest();
        return TeaModel.build(map, self);
    }

    public SilenceTimeoutRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

}
