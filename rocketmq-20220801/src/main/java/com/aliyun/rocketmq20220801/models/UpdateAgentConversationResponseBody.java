// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateAgentConversationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0198c8a91f4d7f01a3c21e97</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>0198c8a91f4d7f01a3c21e97</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>private</p>
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

    public static UpdateAgentConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentConversationResponseBody self = new UpdateAgentConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAgentConversationResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public UpdateAgentConversationResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAgentConversationResponseBody setShareScope(String shareScope) {
        this.shareScope = shareScope;
        return this;
    }
    public String getShareScope() {
        return this.shareScope;
    }

    public UpdateAgentConversationResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateAgentConversationResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
