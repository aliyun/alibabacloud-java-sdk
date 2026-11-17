// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendWorkItemMessageRequest extends TeaModel {
    /**
     * <p>The ID of the collaboration space.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The body of the user message. The value cannot be empty and can be up to 32,768 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Compile a list of next steps based on the previous discussion</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The conversation ID returned by the API operation for creating a free exploration. You must specify at least one of this parameter and workItemId. If both are specified, they must match.</p>
     * 
     * <strong>example:</strong>
     * <p>01234567-89ab-4def-8123-456789abcdef</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <p>The tenant ID. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The ID of the free exploration work item. This parameter is compatible with the legacy-topic:<conversationId> format. You must specify at least one of workItemId and conversationId. If both are specified, they must point to the same session.</p>
     * 
     * <strong>example:</strong>
     * <p>wi_0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    public static SendWorkItemMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendWorkItemMessageRequest self = new SendWorkItemMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendWorkItemMessageRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public SendWorkItemMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendWorkItemMessageRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public SendWorkItemMessageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendWorkItemMessageRequest setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

}
