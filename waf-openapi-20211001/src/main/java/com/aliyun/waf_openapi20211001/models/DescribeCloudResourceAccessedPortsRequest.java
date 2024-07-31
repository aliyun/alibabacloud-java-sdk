// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceAccessedPortsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-tl32ast****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1*****jqnnqk5uj2p</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    /**
     * <strong>example:</strong>
     * <p>rg-aekzwwkpn****5i</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeCloudResourceAccessedPortsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceAccessedPortsRequest self = new DescribeCloudResourceAccessedPortsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceAccessedPortsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCloudResourceAccessedPortsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudResourceAccessedPortsRequest setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    public DescribeCloudResourceAccessedPortsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
