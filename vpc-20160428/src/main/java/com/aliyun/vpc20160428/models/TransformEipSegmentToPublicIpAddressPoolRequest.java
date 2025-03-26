// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TransformEipSegmentToPublicIpAddressPoolRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the IP address pool.</p>
     * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>AddressPoolDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the contiguous EIP group to be migrated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eipsg-2zett8ba055tbsxme****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the IP address pool.</p>
     * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>AddressPoolName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region to which the contiguous EIP group belongs. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the address pool belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4pcdvf****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static TransformEipSegmentToPublicIpAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        TransformEipSegmentToPublicIpAddressPoolRequest self = new TransformEipSegmentToPublicIpAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public TransformEipSegmentToPublicIpAddressPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TransformEipSegmentToPublicIpAddressPoolRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TransformEipSegmentToPublicIpAddressPoolRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransformEipSegmentToPublicIpAddressPoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TransformEipSegmentToPublicIpAddressPoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TransformEipSegmentToPublicIpAddressPoolRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
