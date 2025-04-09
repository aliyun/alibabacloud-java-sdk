// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>The IP version of the NLB instance. Valid values:</p>
     * <ul>
     * <li><strong>ipv4</strong> (default): IPv4</li>
     * <li><strong>DualStack</strong>: dual-stack</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The type of the IPv4 address used by the NLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: The NLB instance uses a public IP address. The domain name of the instance is resolved to the public IP address. The instance is accessible over the Internet.</li>
     * <li><strong>Intranet</strong>: The NLB instance uses a private IP address. The domain name of the instance is resolved to the private IP address. The instance is accessible only within the virtual private cloud (VPC) where the instance is deployed.</li>
     * </ul>
     * <blockquote>
     * <p> To enable a public IPv6 address for a dual-stack NLB instance, call the <a href="https://help.aliyun.com/document_detail/445878.html">EnableLoadBalancerIpv6Internet</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the Internet Shared Bandwidth instance that is associated with the Internet-facing NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cbwp-bp1vevu8h3ieh****</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token. Ensure that the token is unique among different requests. Only ASCII characters are allowed.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the value of <strong>RequestId</strong> is used.**** The value of <strong>RequestId</strong> is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration of the deletion protection feature.</p>
     */
    @NameInMap("DeletionProtectionConfig")
    public CreateLoadBalancerRequestDeletionProtectionConfig deletionProtectionConfig;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the validation, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The billing settings of the NLB instance.</p>
     */
    @NameInMap("LoadBalancerBillingConfig")
    public CreateLoadBalancerRequestLoadBalancerBillingConfig loadBalancerBillingConfig;

    /**
     * <p>The name of the NLB instance.</p>
     * <p>It must be 2 to 128 characters in length, can contain letters, digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>NLB1</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The type of the Server Load Balancer (SLB) instance. Set the value to <strong>network</strong>, which specifies NLB.</p>
     * 
     * <strong>example:</strong>
     * <p>network</p>
     */
    @NameInMap("LoadBalancerType")
    public String loadBalancerType;

    /**
     * <p>The configuration of the configuration read-only mode.</p>
     */
    @NameInMap("ModificationProtectionConfig")
    public CreateLoadBalancerRequestModificationProtectionConfig modificationProtectionConfig;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLoadBalancerRequestTag> tag;

    /**
     * <p>The ID of the VPC where you want to create the NLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1b49rqrybk45nio****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The mappings between zones and vSwitches. An NLB instance can be deployed in up to 10 zones. If the region supports two or more zones, you must specify at least two zones.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<CreateLoadBalancerRequestZoneMappings> zoneMappings;

    public static CreateLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerRequest self = new CreateLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public CreateLoadBalancerRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateLoadBalancerRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CreateLoadBalancerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLoadBalancerRequest setDeletionProtectionConfig(CreateLoadBalancerRequestDeletionProtectionConfig deletionProtectionConfig) {
        this.deletionProtectionConfig = deletionProtectionConfig;
        return this;
    }
    public CreateLoadBalancerRequestDeletionProtectionConfig getDeletionProtectionConfig() {
        return this.deletionProtectionConfig;
    }

    public CreateLoadBalancerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateLoadBalancerRequest setLoadBalancerBillingConfig(CreateLoadBalancerRequestLoadBalancerBillingConfig loadBalancerBillingConfig) {
        this.loadBalancerBillingConfig = loadBalancerBillingConfig;
        return this;
    }
    public CreateLoadBalancerRequestLoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.loadBalancerBillingConfig;
    }

    public CreateLoadBalancerRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public CreateLoadBalancerRequest setLoadBalancerType(String loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    public CreateLoadBalancerRequest setModificationProtectionConfig(CreateLoadBalancerRequestModificationProtectionConfig modificationProtectionConfig) {
        this.modificationProtectionConfig = modificationProtectionConfig;
        return this;
    }
    public CreateLoadBalancerRequestModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    public CreateLoadBalancerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLoadBalancerRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLoadBalancerRequest setTag(java.util.List<CreateLoadBalancerRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLoadBalancerRequestTag> getTag() {
        return this.tag;
    }

    public CreateLoadBalancerRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateLoadBalancerRequest setZoneMappings(java.util.List<CreateLoadBalancerRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<CreateLoadBalancerRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class CreateLoadBalancerRequestDeletionProtectionConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable the deletion protection feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The reason why the deletion protection feature is enabled or disabled. The reason must be 2 to 128 characters in length, can contain letters, digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance is running</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static CreateLoadBalancerRequestDeletionProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestDeletionProtectionConfig self = new CreateLoadBalancerRequestDeletionProtectionConfig();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestDeletionProtectionConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateLoadBalancerRequestDeletionProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class CreateLoadBalancerRequestLoadBalancerBillingConfig extends TeaModel {
        /**
         * <p>The billing method of the NLB instance.</p>
         * <p>Set the value to <strong>PostPay</strong>, which specifies the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPay</p>
         */
        @NameInMap("PayType")
        public String payType;

        public static CreateLoadBalancerRequestLoadBalancerBillingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestLoadBalancerBillingConfig self = new CreateLoadBalancerRequestLoadBalancerBillingConfig();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestLoadBalancerBillingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class CreateLoadBalancerRequestModificationProtectionConfig extends TeaModel {
        /**
         * <p>The reason for enabling the configuration read-only mode. The reason must be 2 to 128 characters in length, can contain letters, digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Service guarantee period</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection</strong>: does not enable the configuration read-only mode. You cannot set the <strong>Reason</strong> parameter. If the <strong>Reason</strong> parameter is set, the value is cleared.</li>
         * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode. You can set the <strong>Reason</strong> parameter.</li>
         * </ul>
         * <blockquote>
         * <p> If the parameter is set to <strong>ConsoleProtection</strong>, the configuration read-only mode is enabled. You cannot modify the configurations of the NLB instance in the NLB console. However, you can call API operations to modify the configurations of the NLB instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateLoadBalancerRequestModificationProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestModificationProtectionConfig self = new CreateLoadBalancerRequestModificationProtectionConfig();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestModificationProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CreateLoadBalancerRequestModificationProtectionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateLoadBalancerRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. The tag key can be up to 64 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag key can contain letters, digits, and the following special characters: _ . : / = + - @</p>
         * <p>You can specify up to 20 tags in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value can be up to 128 characters in length, cannot start with <code>acs:</code> or <code>aliyun</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag value can contain letters, digits, and the following special characters: _ . : / = + - @</p>
         * <p>You can specify up to 20 tags in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateLoadBalancerRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestTag self = new CreateLoadBalancerRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLoadBalancerRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLoadBalancerRequestZoneMappings extends TeaModel {
        /**
         * <p>The ID of the elastic IP address (EIP) that is associated with the Internet-facing NLB instance. Each zone is assigned one EIP. An NLB instance can be deployed in up to 10 zones. If the region supports two or more zones, specify at least two zones.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1aedxso6u80u0qf****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The local IPv4 addresses. The IP addresses that the NLB instance uses to communicate with the backend servers. The number of IP addresses must be an even number, which must be at least 2 and at most 8.</p>
         */
        @NameInMap("Ipv4LocalAddresses")
        public java.util.List<String> ipv4LocalAddresses;

        /**
         * <p>The VIP of the IPv6 version. The IPv6 address that the NLB instance uses to provide external services.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:400a:d5:3080:b409:840a:ca:e8e5</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        /**
         * <p>The local IPv6 addresses. The IP addresses that the NLB instance uses to communicate with the backend servers. The number of IP addresses must be an even number, which must be at least 2 and at most 8.</p>
         */
        @NameInMap("Ipv6LocalAddresses")
        public java.util.List<String> ipv6LocalAddresses;

        /**
         * <p>The private virtual IP address (VIP) of the IPv4 version. The private IPv4 address that the NLB instance uses to provide external services.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.1</p>
         */
        @NameInMap("PrivateIPv4Address")
        public String privateIPv4Address;

        /**
         * <p>The ID of the vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an NLB instance. An NLB instance can be deployed in up to 10 zones. If the region supports two or more zones, you must specify at least two zones.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-sersdf****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone where the NLB instance is deployed. An NLB instance can be deployed in up to 10 zones. If the region supports two or more zones, specify at least two zones.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443890.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateLoadBalancerRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestZoneMappings self = new CreateLoadBalancerRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestZoneMappings setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public CreateLoadBalancerRequestZoneMappings setIpv4LocalAddresses(java.util.List<String> ipv4LocalAddresses) {
            this.ipv4LocalAddresses = ipv4LocalAddresses;
            return this;
        }
        public java.util.List<String> getIpv4LocalAddresses() {
            return this.ipv4LocalAddresses;
        }

        public CreateLoadBalancerRequestZoneMappings setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public CreateLoadBalancerRequestZoneMappings setIpv6LocalAddresses(java.util.List<String> ipv6LocalAddresses) {
            this.ipv6LocalAddresses = ipv6LocalAddresses;
            return this;
        }
        public java.util.List<String> getIpv6LocalAddresses() {
            return this.ipv6LocalAddresses;
        }

        public CreateLoadBalancerRequestZoneMappings setPrivateIPv4Address(String privateIPv4Address) {
            this.privateIPv4Address = privateIPv4Address;
            return this;
        }
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        public CreateLoadBalancerRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateLoadBalancerRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
