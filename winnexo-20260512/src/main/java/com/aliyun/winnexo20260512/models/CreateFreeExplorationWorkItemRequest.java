// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateFreeExplorationWorkItemRequest extends TeaModel {
    /**
     * <p>The technical names of the selected digital workers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sales-agent&quot;]</p>
     */
    @NameInMap("agentNames")
    public java.util.List<String> agentNames;

    /**
     * <p>The ID of the collaboration workspace to which the work item belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The actual members of the topic, including the creator. For public topics, members of the entire workspace are not enumerated.</p>
     * 
     * <strong>example:</strong>
     * <p>[43]</p>
     */
    @NameInMap("memberUserIds")
    public java.util.List<Long> memberUserIds;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The title of the work item.</p>
     * <p>This parameter is required.</p>
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
