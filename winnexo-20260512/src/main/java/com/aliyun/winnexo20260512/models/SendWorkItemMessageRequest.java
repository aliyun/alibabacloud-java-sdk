// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SendWorkItemMessageRequest extends TeaModel {
    /**
     * <p>目标会话所属的协作空间ID，必填，长度1至64，不能为空白。调用者须具有目标话题的查看和发送权限。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>用户发送的文本正文，必填，长度1至32768，不能全为空白；保留原有文本格式。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>请根据刚才的讨论整理下一步行动清单。</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>已有自由探索话题的会话ID，长度1至128，可使用创建自由探索接口返回的conversation_id。与workItemId至少传一个，同时传入时须指向同一会话。</p>
     * 
     * <strong>example:</strong>
     * <p>01234567-89ab-4def-8123-456789abcdef</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <p>业务租户ID，可选。必须属于当前调用身份的可访问租户；无权访问时拒绝请求。未传时按现有鉴权规则解析租户，多租户用户无法唯一确定时需显式指定。</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>自由探索工作项ID，长度1至256；兼容legacy-topic:<conversationId>形式。与conversationId至少传一个，同时传入时须指向同一会话。普通工作项必须为FREE_EXPLORATION类型。</p>
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
