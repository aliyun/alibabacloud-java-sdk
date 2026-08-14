// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachMembersFromProjectRequest extends TeaModel {
    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The UIDs of the member accounts to remove.</p>
     * <blockquote>
     * <p>You can call the GetProject operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>161****6121</p>
     */
    @NameInMap("MemberIds")
    public String memberIds;

    /**
     * <p>The project ID.</p>
     * <blockquote>
     * <p>You can call the ListProjects operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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

    public static DetachMembersFromProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachMembersFromProjectRequest self = new DetachMembersFromProjectRequest();
        return TeaModel.build(map, self);
    }

    public DetachMembersFromProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachMembersFromProjectRequest setMemberIds(String memberIds) {
        this.memberIds = memberIds;
        return this;
    }
    public String getMemberIds() {
        return this.memberIds;
    }

    public DetachMembersFromProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DetachMembersFromProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
