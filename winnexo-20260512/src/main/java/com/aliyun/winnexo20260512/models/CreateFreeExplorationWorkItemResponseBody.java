// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateFreeExplorationWorkItemResponseBody extends TeaModel {
    /**
     * <p>已选择的数字员工技术名称</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sales-agent&quot;]</p>
     */
    @NameInMap("agentNames")
    public java.util.List<String> agentNames;

    /**
     * <p>业务状态码，成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>所属协作空间 ID</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>真实群话题 ID，可在 queryWorkItemFeed 中关联；不可作为 Workflow workItemId</p>
     * 
     * <strong>example:</strong>
     * <p>conv_20261105_9f2c</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <p>平台创建人用户 ID</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("createdByUserId")
    public Long createdByUserId;

    /**
     * <p>工作项模式，固定 FREE_EXPLORATION</p>
     * 
     * <strong>example:</strong>
     * <p>FREE_EXPLORATION</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>实际话题成员，含创建人；公开档不枚举全空间成员</p>
     * 
     * <strong>example:</strong>
     * <p>[43]</p>
     */
    @NameInMap("memberUserIds")
    public java.util.List<Long> memberUserIds;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>工作项标题</p>
     * 
     * <strong>example:</strong>
     * <p>调查销售机会</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>实际可见范围 PRIVATE/COLLABORATIVE/PUBLIC</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("visibility")
    public String visibility;

    public static CreateFreeExplorationWorkItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFreeExplorationWorkItemResponseBody self = new CreateFreeExplorationWorkItemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFreeExplorationWorkItemResponseBody setAgentNames(java.util.List<String> agentNames) {
        this.agentNames = agentNames;
        return this;
    }
    public java.util.List<String> getAgentNames() {
        return this.agentNames;
    }

    public CreateFreeExplorationWorkItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFreeExplorationWorkItemResponseBody setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateFreeExplorationWorkItemResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CreateFreeExplorationWorkItemResponseBody setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }
    public Long getCreatedByUserId() {
        return this.createdByUserId;
    }

    public CreateFreeExplorationWorkItemResponseBody setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public CreateFreeExplorationWorkItemResponseBody setMemberUserIds(java.util.List<Long> memberUserIds) {
        this.memberUserIds = memberUserIds;
        return this;
    }
    public java.util.List<Long> getMemberUserIds() {
        return this.memberUserIds;
    }

    public CreateFreeExplorationWorkItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFreeExplorationWorkItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFreeExplorationWorkItemResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateFreeExplorationWorkItemResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
