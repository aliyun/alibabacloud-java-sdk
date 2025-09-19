// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamPoolRequest extends TeaModel {
    /**
     * <p>The default network mask assigned by the IPAM address pool.  </p>
     * <blockquote>
     * <p>The IPv4 network mask value range is 0 to 32 bits, and the IPv6 network mask value range is 0 to 128 bits.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("AllocationDefaultCidrMask")
    public Integer allocationDefaultCidrMask;

    /**
     * <p>The maximum network mask assigned by the IPAM address pool.  </p>
     * <blockquote>
     * <p>The IPv4 network mask value range is <strong>0 to 32</strong> bits, and the IPv6 network mask value range is <strong>0 to 128</strong> bits.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("AllocationMaxCidrMask")
    public Integer allocationMaxCidrMask;

    /**
     * <p>The minimum network mask assigned by the IPAM address pool.  </p>
     * <blockquote>
     * <p>The IPv4 network mask value range is <strong>0 to 32</strong> bits, and the IPv6 network mask value range is <strong>0 to 128</strong> bits.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("AllocationMinCidrMask")
    public Integer allocationMinCidrMask;

    /**
     * <p>Whether the pool has the auto-import feature enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoImport")
    public Boolean autoImport;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>IP address protocol version. Values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: IPv4 protocol.</li>
     * <li><strong>IPv6</strong>: IPv6 protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>Description of the IPAM address pool. 
     * The length should be between 1 to 256 characters, and it must start with an uppercase or lowercase English letter or a Chinese character, but cannot begin with <code>http://</code> or <code>https://</code>. If left blank, the default value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("IpamPoolDescription")
    public String ipamPoolDescription;

    /**
     * <p>The name of the IPAM pool.</p>
     * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("IpamPoolName")
    public String ipamPoolName;

    /**
     * <p>The ID of the IPAM scope.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-scope-glfmcyldpm8lsy****</p>
     */
    @NameInMap("IpamScopeId")
    public String ipamScopeId;

    /**
     * <p>The type of the IPv6 CIDR block of the VPC. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default)</li>
     * <li><strong>ChinaMobile</strong></li>
     * <li><strong>ChinaUnicom</strong></li>
     * <li><strong>ChinaTelecom</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you are allowed to use single-ISP bandwidth, you can set the value to <strong>ChinaTelecom</strong>, <strong>ChinaUnicom</strong>, or <strong>ChinaMobile</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("Ipv6Isp")
    public String ipv6Isp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The effective region of the IPAM pool.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("PoolRegionId")
    public String poolRegionId;

    /**
     * <p>The ID of the region where the IPAM instance is hosted. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the source IPAM pool.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the pool is a parent pool.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-6rcq3tobayc20t****</p>
     */
    @NameInMap("SourceIpamPoolId")
    public String sourceIpamPoolId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateIpamPoolRequestTag> tag;

    public static CreateIpamPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamPoolRequest self = new CreateIpamPoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpamPoolRequest setAllocationDefaultCidrMask(Integer allocationDefaultCidrMask) {
        this.allocationDefaultCidrMask = allocationDefaultCidrMask;
        return this;
    }
    public Integer getAllocationDefaultCidrMask() {
        return this.allocationDefaultCidrMask;
    }

    public CreateIpamPoolRequest setAllocationMaxCidrMask(Integer allocationMaxCidrMask) {
        this.allocationMaxCidrMask = allocationMaxCidrMask;
        return this;
    }
    public Integer getAllocationMaxCidrMask() {
        return this.allocationMaxCidrMask;
    }

    public CreateIpamPoolRequest setAllocationMinCidrMask(Integer allocationMinCidrMask) {
        this.allocationMinCidrMask = allocationMinCidrMask;
        return this;
    }
    public Integer getAllocationMinCidrMask() {
        return this.allocationMinCidrMask;
    }

    public CreateIpamPoolRequest setAutoImport(Boolean autoImport) {
        this.autoImport = autoImport;
        return this;
    }
    public Boolean getAutoImport() {
        return this.autoImport;
    }

    public CreateIpamPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpamPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIpamPoolRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateIpamPoolRequest setIpamPoolDescription(String ipamPoolDescription) {
        this.ipamPoolDescription = ipamPoolDescription;
        return this;
    }
    public String getIpamPoolDescription() {
        return this.ipamPoolDescription;
    }

    public CreateIpamPoolRequest setIpamPoolName(String ipamPoolName) {
        this.ipamPoolName = ipamPoolName;
        return this;
    }
    public String getIpamPoolName() {
        return this.ipamPoolName;
    }

    public CreateIpamPoolRequest setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
        return this;
    }
    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    public CreateIpamPoolRequest setIpv6Isp(String ipv6Isp) {
        this.ipv6Isp = ipv6Isp;
        return this;
    }
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    public CreateIpamPoolRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateIpamPoolRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIpamPoolRequest setPoolRegionId(String poolRegionId) {
        this.poolRegionId = poolRegionId;
        return this;
    }
    public String getPoolRegionId() {
        return this.poolRegionId;
    }

    public CreateIpamPoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpamPoolRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateIpamPoolRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateIpamPoolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateIpamPoolRequest setSourceIpamPoolId(String sourceIpamPoolId) {
        this.sourceIpamPoolId = sourceIpamPoolId;
        return this;
    }
    public String getSourceIpamPoolId() {
        return this.sourceIpamPoolId;
    }

    public CreateIpamPoolRequest setTag(java.util.List<CreateIpamPoolRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateIpamPoolRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateIpamPoolRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The tag key must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It cannot start with a <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateIpamPoolRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateIpamPoolRequestTag self = new CreateIpamPoolRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateIpamPoolRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateIpamPoolRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
