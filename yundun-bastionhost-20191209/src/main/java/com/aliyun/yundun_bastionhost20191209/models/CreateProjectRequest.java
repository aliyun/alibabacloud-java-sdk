// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <p>The project description.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-zvp282aly06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of member account UIDs to associate with the project.</p>
     * <blockquote>
     * <p>You can call the ListMembersNotForProject operation to query this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>161****6121</p>
     */
    @NameInMap("MemberIds")
    public String memberIds;

    /**
     * <p>The project name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("Name")
    public String name;

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

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateProjectRequest setMemberIds(String memberIds) {
        this.memberIds = memberIds;
        return this;
    }
    public String getMemberIds() {
        return this.memberIds;
    }

    public CreateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
