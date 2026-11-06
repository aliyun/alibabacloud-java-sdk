// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateFreeExplorationWorkItemRequest extends TeaModel {
    /**
     * <p>空间内数字员工技术名称，1–5 个，不可重复</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sales-agent&quot;]</p>
     */
    @NameInMap("agentNames")
    public java.util.List<String> agentNames;

    /**
     * <p>协作空间 ID；调用者须为有效成员</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>协作档至少一个创建人以外的有效空间成员；最多 1000 人；私密和公开档忽略；创建人始终加入</p>
     * 
     * <strong>example:</strong>
     * <p>[43]</p>
     */
    @NameInMap("memberUserIds")
    public java.util.List<Long> memberUserIds;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>自由探索工作项标题，去首尾空格后 1–200 字符</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>调查销售机会</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>可见范围：PRIVATE 私密；COLLABORATIVE 指定成员协作；PUBLIC 空间内公开</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("visibility")
    public String visibility;

    public static CreateFreeExplorationWorkItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFreeExplorationWorkItemRequest self = new CreateFreeExplorationWorkItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateFreeExplorationWorkItemRequest setAgentNames(java.util.List<String> agentNames) {
        this.agentNames = agentNames;
        return this;
    }
    public java.util.List<String> getAgentNames() {
        return this.agentNames;
    }

    public CreateFreeExplorationWorkItemRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateFreeExplorationWorkItemRequest setMemberUserIds(java.util.List<Long> memberUserIds) {
        this.memberUserIds = memberUserIds;
        return this;
    }
    public java.util.List<Long> getMemberUserIds() {
        return this.memberUserIds;
    }

    public CreateFreeExplorationWorkItemRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateFreeExplorationWorkItemRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateFreeExplorationWorkItemRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
