// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachProjectManagersFromProjectAuthorizationRequest extends TeaModel {
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
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-zpr3h2zo60l</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The array of project administrator IDs to remove.</p>
     * <blockquote>
     * <p>You can call the GetProjectAuthorization operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2036****6767</p>
     */
    @NameInMap("PrincipalIds")
    public String principalIds;

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

    public static DetachProjectManagersFromProjectAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachProjectManagersFromProjectAuthorizationRequest self = new DetachProjectManagersFromProjectAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public DetachProjectManagersFromProjectAuthorizationRequest setAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public Long getAuthorizationId() {
        return this.authorizationId;
    }

    public DetachProjectManagersFromProjectAuthorizationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachProjectManagersFromProjectAuthorizationRequest setPrincipalIds(String principalIds) {
        this.principalIds = principalIds;
        return this;
    }
    public String getPrincipalIds() {
        return this.principalIds;
    }

    public DetachProjectManagersFromProjectAuthorizationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
