// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateAgentConversationShareScopeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0198c8a91f4d7f01a3c21e97</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>tenant_viewer</p>
     */
    @NameInMap("shareScope")
    public String shareScope;

    /**
     * <strong>example:</strong>
     * <p>消息堆积排查</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>2026-08-26T12:00:00.000Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    public static UpdateAgentConversationShareScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentConversationShareScopeResponseBody self = new UpdateAgentConversationShareScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAgentConversationShareScopeResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAgentConversationShareScopeResponseBody setShareScope(String shareScope) {
        this.shareScope = shareScope;
        return this;
    }
    public String getShareScope() {
        return this.shareScope;
    }

    public UpdateAgentConversationShareScopeResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateAgentConversationShareScopeResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
