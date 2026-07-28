// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnTagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to unbind all tags from the resources. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Unbinds all tags from the resources.</li>
     * <li><strong>false</strong> (default): Does not unbind all tags from the resources.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the resources.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource IDs. You can specify up to 50 resource IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp16qjewdsunr41m1****</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: virtual private cloud (VPC) instance.</li>
     * <li><strong>VSWITCH</strong>: vSwitch instance.</li>
     * <li><strong>ROUTETABLE</strong>: route table instance.</li>
     * <li><strong>EIP</strong>: elastic IP address (EIP) instance.</li>
     * <li><strong>VPNGATEWAY</strong>: VPN gateway instance.</li>
     * <li><strong>NATGATEWAY</strong>: NAT gateway instance.</li>
     * <li><strong>COMMONBANDWIDTHPACKAGE</strong>: Internet Shared Bandwidth instance.</li>
     * <li><strong>PREFIXLIST</strong>: prefix list instance.</li>
     * <li><strong>PUBLICIPADDRESSPOOL</strong>: IP address pool instance.</li>
     * <li><strong>IPV4GATEWAY</strong>: IPv4 gateway instance.</li>
     * <li><strong>IPV6GATEWAY</strong>: IPv6 gateway instance.</li>
     * <li><strong>NETWORKACL</strong>: network ACL instance.</li>
     * <li><strong>TRAFFICMIRRORFILTER</strong>: traffic mirror filter instance.</li>
     * <li><strong>TRAFFICMIRRORSESSION</strong>: traffic mirror session instance.</li>
     * <li><strong>FLOWLOG</strong>: flow log instance.</li>
     * <li><strong>HAVIP</strong>: high-availability virtual IP address (HaVip) instance.</li>
     * <li><strong>DHCPOPTIONSSET</strong>: DHCP options set instance.</li>
     * <li><strong>GATEWAYENDPOINT</strong>: gateway endpoint instance.</li>
     * <li><strong>IPV6ADDRESS</strong>: IPv6 address instance.</li>
     * </ul>
     * <blockquote>
     * <p>The resource type value is case-insensitive.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag keys to unbind. You can specify up to 20 tag keys.</p>
     * <p>Each tag key can be up to 128 characters in length, can be an empty string, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>FinanceDept</p>
     */
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UnTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesRequest self = new UnTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UnTagResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnTagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UnTagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnTagResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UnTagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
