// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateFreeExplorationWorkItemShrinkRequest extends TeaModel {
    /**
     * <p>The technical names of the selected digital workers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sales-agent&quot;]</p>
     */
    @NameInMap("agentNames")
    public String agentNamesShrink;

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
    public String memberUserIdsShrink;

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

    public static CreateFreeExplorationWorkItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFreeExplorationWorkItemShrinkRequest self = new CreateFreeExplorationWorkItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFreeExplorationWorkItemShrinkRequest setAgentNamesShrink(String agentNamesShrink) {
        this.agentNamesShrink = agentNamesShrink;
        return this;
    }
    public String getAgentNamesShrink() {
        return this.agentNamesShrink;
    }

    public CreateFreeExplorationWorkItemShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateFreeExplorationWorkItemShrinkRequest setMemberUserIdsShrink(String memberUserIdsShrink) {
        this.memberUserIdsShrink = memberUserIdsShrink;
        return this;
    }
    public String getMemberUserIdsShrink() {
        return this.memberUserIdsShrink;
    }

    public CreateFreeExplorationWorkItemShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateFreeExplorationWorkItemShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateFreeExplorationWorkItemShrinkRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
