// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyProjectRequest extends TeaModel {
    /**
     * <p>The new description of the project. The description can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Bastionhost demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID of the bastion host for which you want to modify project information.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-7mz2v120f0y</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The UIDs of the member accounts to associate with the project after modification.</p>
     * <blockquote>
     * <p>You can call the ListMembersNotForProject operation to obtain this parameter. If you do not specify this parameter, no changes are made.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>160****5312</p>
     */
    @NameInMap("MemberIds")
    public String memberIds;

    /**
     * <p>The new name of the project. The name must be 1 to 128 characters in length, cannot start with a special character, and can contain only the following special characters: periods (.), underscores (_), hyphens (-), backslashes (\), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>projectname</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the project that you want to modify.</p>
     * <blockquote>
     * <p>You can call the ListProjects operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectRequest self = new ModifyProjectRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyProjectRequest setMemberIds(String memberIds) {
        this.memberIds = memberIds;
        return this;
    }
    public String getMemberIds() {
        return this.memberIds;
    }

    public ModifyProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
