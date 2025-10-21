// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class CreateWordGroupShrinkRequest extends TeaModel {
    /**
     * <p>Request object</p>
     */
    @NameInMap("BodyData")
    public String bodyDataShrink;

    /**
     * <p>Whether to commit.
     * false: Not actually saved, only checked
     * true: Commit and save</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Commit")
    public Boolean commit;

    /**
     * <p>Keyword group name</p>
     * 
     * <strong>example:</strong>
     * <p>testGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>643168</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreateWordGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWordGroupShrinkRequest self = new CreateWordGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWordGroupShrinkRequest setBodyDataShrink(String bodyDataShrink) {
        this.bodyDataShrink = bodyDataShrink;
        return this;
    }
    public String getBodyDataShrink() {
        return this.bodyDataShrink;
    }

    public CreateWordGroupShrinkRequest setCommit(Boolean commit) {
        this.commit = commit;
        return this;
    }
    public Boolean getCommit() {
        return this.commit;
    }

    public CreateWordGroupShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateWordGroupShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWordGroupShrinkRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
