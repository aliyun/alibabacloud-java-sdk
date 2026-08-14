// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteProjectsRequest extends TeaModel {
    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the DescribeInstances operation to obtain the bastion host instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the projects that you want to delete.</p>
     * <blockquote>
     * <p>You can call the ListProjects operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("ProjectIds")
    public String projectIds;

    /**
     * <p>The region ID of the bastion host. </p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectsRequest self = new DeleteProjectsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteProjectsRequest setProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public String getProjectIds() {
        return this.projectIds;
    }

    public DeleteProjectsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
