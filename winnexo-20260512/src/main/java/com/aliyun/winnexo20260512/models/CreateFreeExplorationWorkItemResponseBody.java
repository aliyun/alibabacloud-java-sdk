// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateFreeExplorationWorkItemResponseBody extends TeaModel {
    /**
     * <p>The technical names of the selected digital workers.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sales-agent&quot;]</p>
     */
    @NameInMap("agentNames")
    public java.util.List<String> agentNames;

    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The ID of the collaboration workspace to which the work item belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The actual group topic ID, which can be associated in queryWorkItemFeed. It cannot be used as a workItemId in Workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>conv_20261105_9f2c</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <p>The user ID of the creator on the platform.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("createdByUserId")
    public Long createdByUserId;

    /**
     * <p>The work item mode. The value is fixed to FREE_EXPLORATION.</p>
     * 
     * <strong>example:</strong>
     * <p>FREE_EXPLORATION</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>The actual members of the topic, including the creator. For public topics, members of the entire workspace are not enumerated.</p>
     * 
     * <strong>example:</strong>
     * <p>[43]</p>
     */
    @NameInMap("memberUserIds")
    public java.util.List<Long> memberUserIds;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The title of the work item.</p>
     * 
     * <strong>example:</strong>
     * <p>Investigate sales opportunities</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The actual visibility scope. Valid values: PRIVATE, COLLABORATIVE, and PUBLIC.</p>
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
