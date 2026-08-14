// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachProjectsFromProjectAuthorizationRequest extends TeaModel {
    /**
     * <p>The project authorization ID.</p>
     * <blockquote>
     * <p>You can call the ListProjectAuthorizations operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthorizationId")
    public Long authorizationId;

    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The array of project IDs to remove from the project authorization.</p>
     * <blockquote>
     * <p>You can call the GetProjectAuthorization operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
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

    public static DetachProjectsFromProjectAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachProjectsFromProjectAuthorizationRequest self = new DetachProjectsFromProjectAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public DetachProjectsFromProjectAuthorizationRequest setAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public Long getAuthorizationId() {
        return this.authorizationId;
    }

    public DetachProjectsFromProjectAuthorizationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachProjectsFromProjectAuthorizationRequest setProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public String getProjectIds() {
        return this.projectIds;
    }

    public DetachProjectsFromProjectAuthorizationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
