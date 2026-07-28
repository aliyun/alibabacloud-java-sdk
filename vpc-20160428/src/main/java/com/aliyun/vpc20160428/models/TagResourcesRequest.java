// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the resource to which you want to create and bind tags.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <li><strong>VSWITCH</strong>: virtual switch instance.</li>
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
     * <li><strong>HAVIP</strong>: high-availability (HA) virtual IP address instance.</li>
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
     * <p>The tag information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TagResources</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TagResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(java.util.List<TagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagResourcesRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You must specify at least 1 and can specify up to 20 tag keys.</p>
         * <p>The tag key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * <blockquote>
         * <p>The <strong>Tag.N.Key</strong> parameter is required when you call this operation, and cannot be an empty string.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You must specify at least 1 and can specify up to 20 tag values.</p>
         * <p>The tag value can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * <blockquote>
         * <p>The <strong>Tag.N.Value</strong> parameter is required when you call this operation, and can be an empty string.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
