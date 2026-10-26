// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateAgentConversationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>conversation-request-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>消息堆积排查</p>
     */
    @NameInMap("title")
    public String title;

    public static UpdateAgentConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentConversationRequest self = new UpdateAgentConversationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentConversationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAgentConversationRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
