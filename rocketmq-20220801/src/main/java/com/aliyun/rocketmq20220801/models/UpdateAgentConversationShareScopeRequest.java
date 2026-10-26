// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateAgentConversationShareScopeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant_viewer</p>
     */
    @NameInMap("shareScope")
    public String shareScope;

    public static UpdateAgentConversationShareScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentConversationShareScopeRequest self = new UpdateAgentConversationShareScopeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentConversationShareScopeRequest setShareScope(String shareScope) {
        this.shareScope = shareScope;
        return this;
    }
    public String getShareScope() {
        return this.shareScope;
    }

}
