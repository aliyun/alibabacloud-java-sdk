// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetLoadBalancerAttributeResponseBody extends TeaModel {
    /**
     * <p>The protocol version. Valid values:</p>
     * <ul>
     * <li><strong>ipv4</strong>: IPv4.</li>
     * <li><strong>DualStack</strong>: dual stack.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The IPv4 network address type of the NLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: The load balancing instance has a public IP address. The DNS domain name is resolved to the public IP address. Therefore, the instance can be accessed over the Internet.</li>
     * <li><strong>Intranet</strong>: The load balancing instance has only a private IP address. The DNS domain name is resolved to the private IP address. Therefore, the instance can be accessed only within the internal network of the VPC where the load balancing instance is deployed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the Internet Shared Bandwidth instance associated with the Internet-facing NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cbwp-bp1vevu8h3ieh****</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The maximum number of new connections per second that the NLB instance can process per zone (VIP). Valid values: <strong>0</strong> to <strong>1000000</strong>.</p>
     * <p><strong>0</strong> indicates that no limit is imposed.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Cps")
    public Integer cps;

    /**
     * <p>The time when the resource was created. The time is displayed in UTC in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-02T02:49:05Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether cross-zone is enabled for the NLB instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CrossZoneEnabled")
    public Boolean crossZoneEnabled;

    /**
     * <p>The domain name of the NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-wb7r6dlwetvt5j****.cn-hangzhou.nlb.aliyuncs.com</p>
     */
    @NameInMap("DNSName")
    public String DNSName;

    /**
     * <p>The deletion protection configuration.</p>
     */
    @NameInMap("DeletionProtectionConfig")
    public GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig deletionProtectionConfig;

    /**
     * <p>The IPv6 address type of the NLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: The load balancing instance has a public IP address. The DNS domain name is resolved to the public IP address. Therefore, the instance can be accessed over the Internet.</li>
     * <li><strong>Intranet</strong>: The load balancing instance has only a private IP address. The DNS domain name is resolved to the private IP address. Therefore, the instance can be accessed only within the internal network of the VPC where the load balancing instance is deployed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("Ipv6AddressType")
    public String ipv6AddressType;

    /**
     * <p>The billing configuration of the load balancing instance.</p>
     */
    @NameInMap("LoadBalancerBillingConfig")
    public GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig loadBalancerBillingConfig;

    /**
     * <p>The business status of the NLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Abnormal</strong>: The NLB instance is in an abnormal state.</li>
     * <li><strong>Normal</strong>: The NLB instance is in a normal state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("LoadBalancerBusinessStatus")
    public String loadBalancerBusinessStatus;

    /**
     * <p>The NLB instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-83ckzc8d4xlp8o****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the NLB instance.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter or a Chinese character.</p>
     * 
     * <strong>example:</strong>
     * <p>NLB1</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The NLB instance status. Valid values:</p>
     * <ul>
     * <li><strong>Inactive</strong>: The NLB instance is stopped. The listeners of the instance no longer forward traffic.</li>
     * <li><strong>Active</strong>: The NLB instance is running.</li>
     * <li><strong>Provisioning</strong>: The NLB instance is being created.</li>
     * <li><strong>Configuring</strong>: The NLB instance is being reconfigured (Upgrade/Downgrade).</li>
     * <li><strong>CreateFailed</strong>: The NLB instance failed to be created. In this case, no fees are incurred, and the instance can only be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The load balancing type. Only <strong>network</strong> is returned, which indicates Network Load Balancer (NLB).</p>
     * 
     * <strong>example:</strong>
     * <p>network</p>
     */
    @NameInMap("LoadBalancerType")
    public String loadBalancerType;

    /**
     * <p>The modification protection configuration.</p>
     */
    @NameInMap("ModificationProtectionConfig")
    public GetLoadBalancerAttributeResponseBodyModificationProtectionConfig modificationProtectionConfig;

    /**
     * <p>The lock state list of the NLB instance. This parameter is returned only when <code>LoadBalancerBussinessStatus</code> is <strong>Abnormal</strong>.</p>
     */
    @NameInMap("OperationLocks")
    public java.util.List<GetLoadBalancerAttributeResponseBodyOperationLocks> operationLocks;

    /**
     * <p>The region ID of the NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security group IDs associated with the NLB instance.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetLoadBalancerAttributeResponseBodyTags> tags;

    /**
     * <p>The VPC ID of the NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1b49rqrybk45nio****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The mappings between zones and vSwitches. A maximum of 10 zones are returned. If the current region supports two or more zones, at least two zones are returned.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappings> zoneMappings;

    public static GetLoadBalancerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoadBalancerAttributeResponseBody self = new GetLoadBalancerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoadBalancerAttributeResponseBody setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public GetLoadBalancerAttributeResponseBody setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public GetLoadBalancerAttributeResponseBody setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public GetLoadBalancerAttributeResponseBody setCps(Integer cps) {
        this.cps = cps;
        return this;
    }
    public Integer getCps() {
        return this.cps;
    }

    public GetLoadBalancerAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetLoadBalancerAttributeResponseBody setCrossZoneEnabled(Boolean crossZoneEnabled) {
        this.crossZoneEnabled = crossZoneEnabled;
        return this;
    }
    public Boolean getCrossZoneEnabled() {
        return this.crossZoneEnabled;
    }

    public GetLoadBalancerAttributeResponseBody setDNSName(String DNSName) {
        this.DNSName = DNSName;
        return this;
    }
    public String getDNSName() {
        return this.DNSName;
    }

    public GetLoadBalancerAttributeResponseBody setDeletionProtectionConfig(GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig deletionProtectionConfig) {
        this.deletionProtectionConfig = deletionProtectionConfig;
        return this;
    }
    public GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig getDeletionProtectionConfig() {
        return this.deletionProtectionConfig;
    }

    public GetLoadBalancerAttributeResponseBody setIpv6AddressType(String ipv6AddressType) {
        this.ipv6AddressType = ipv6AddressType;
        return this;
    }
    public String getIpv6AddressType() {
        return this.ipv6AddressType;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerBillingConfig(GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig loadBalancerBillingConfig) {
        this.loadBalancerBillingConfig = loadBalancerBillingConfig;
        return this;
    }
    public GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.loadBalancerBillingConfig;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
        this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
        return this;
    }
    public String getLoadBalancerBusinessStatus() {
        return this.loadBalancerBusinessStatus;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerType(String loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    public GetLoadBalancerAttributeResponseBody setModificationProtectionConfig(GetLoadBalancerAttributeResponseBodyModificationProtectionConfig modificationProtectionConfig) {
        this.modificationProtectionConfig = modificationProtectionConfig;
        return this;
    }
    public GetLoadBalancerAttributeResponseBodyModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    public GetLoadBalancerAttributeResponseBody setOperationLocks(java.util.List<GetLoadBalancerAttributeResponseBodyOperationLocks> operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public java.util.List<GetLoadBalancerAttributeResponseBodyOperationLocks> getOperationLocks() {
        return this.operationLocks;
    }

    public GetLoadBalancerAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoadBalancerAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetLoadBalancerAttributeResponseBody setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public GetLoadBalancerAttributeResponseBody setTags(java.util.List<GetLoadBalancerAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetLoadBalancerAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetLoadBalancerAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetLoadBalancerAttributeResponseBody setZoneMappings(java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig extends TeaModel {
        /**
         * <p>The deletion protection status. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time when deletion protection was enabled. The time is displayed in UTC in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-02T02:49:05Z</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The reason for changing the deletion protection status. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter or a Chinese character.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance running.</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig self = new GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig extends TeaModel {
        /**
         * <p>The billing type of the NLB instance.
         * Only <strong>PostPay</strong> is returned, which indicates the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPay</p>
         */
        @NameInMap("PayType")
        public String payType;

        public static GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig self = new GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyModificationProtectionConfig extends TeaModel {
        /**
         * <p>The time when modification protection was enabled. The time is displayed in UTC in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02T02:49:05Z</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The reason for enabling modification protection. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter or a Chinese character.</p>
         * <p>This parameter is valid and required only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Business protection period.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The modification protection status of the Network Load Balancer (NLB) instance. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection</strong>: Modification protection is disabled. You cannot specify the <strong>Reason</strong> parameter. If the <strong>Reason</strong> parameter is specified, the value is cleared.</li>
         * <li><strong>ConsoleProtection</strong>: Console modification protection is enabled. You can specify the <strong>Reason</strong> parameter.</li>
         * </ul>
         * <blockquote>
         * <p>If the value is <strong>ConsoleProtection</strong>, you cannot modify the instance configuration in the load balancing console, but you can modify the instance configuration by invoking API operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetLoadBalancerAttributeResponseBodyModificationProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyModificationProtectionConfig self = new GetLoadBalancerAttributeResponseBodyModificationProtectionConfig();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyModificationProtectionConfig setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public GetLoadBalancerAttributeResponseBodyModificationProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetLoadBalancerAttributeResponseBodyModificationProtectionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyOperationLocks extends TeaModel {
        /**
         * <p>The reason for the lock.</p>
         * 
         * <strong>example:</strong>
         * <p>Business exception.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The type of the lock. Valid values:</p>
         * <ul>
         * <li><strong>SecurityLocked</strong>: The instance is locked due to security reasons.</li>
         * <li><strong>RelatedResourceLocked</strong>: The instance is locked due to associate lock.</li>
         * <li><strong>FinancialLocked</strong>: The instance is locked due to overdue payment.</li>
         * <li><strong>ResidualLocked</strong>: The instance is locked due to residual resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SecurityLocked</p>
         */
        @NameInMap("LockType")
        public String lockType;

        public static GetLoadBalancerAttributeResponseBodyOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyOperationLocks self = new GetLoadBalancerAttributeResponseBodyOperationLocks();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public GetLoadBalancerAttributeResponseBodyOperationLocks setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ValueTest</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetLoadBalancerAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyTags self = new GetLoadBalancerAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetLoadBalancerAttributeResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses extends TeaModel {
        /**
         * <p>The Elastic IP Address (EIP) instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1aedxso6u80u0qf****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The ID of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp12f1xhs5yal61a****</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The list of IPv4 local addresses. These are the addresses used for communication between the NLB instance and backend servers.</p>
         */
        @NameInMap("Ipv4LocalAddresses")
        public java.util.List<String> ipv4LocalAddresses;

        /**
         * <p>The IPv6 VIP address. The IPv6 address that the NLB instance uses to provide services.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1:1:1:1:1:1</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        /**
         * <p>The list of IPv6 local addresses. These are the addresses used for communication between the NLB instance and backend servers.</p>
         */
        @NameInMap("Ipv6LocalAddresses")
        public java.util.List<String> ipv6LocalAddresses;

        /**
         * <p>The private IPv4 VIP address. The private IPv4 address that the NLB instance uses to provide services.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.3.32</p>
         */
        @NameInMap("PrivateIPv4Address")
        public String privateIPv4Address;

        /**
         * <p>The health check status of the private IPv4 address of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Healthy</strong>: healthy.</li>
         * <li><strong>Unhealthy</strong>: unhealthy.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when the zone status (<strong>Status</strong>) is Active.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Healthy</p>
         */
        @NameInMap("PrivateIPv4HcStatus")
        public String privateIPv4HcStatus;

        /**
         * <p>The health check status of the IPv6 address of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Healthy</strong>: healthy.</li>
         * <li><strong>Unhealthy</strong>: unhealthy.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when the zone status (<strong>Status</strong>) is Active.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Healthy</p>
         */
        @NameInMap("PrivateIPv6HcStatus")
        public String privateIPv6HcStatus;

        /**
         * <p>The public IPv4 address of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>120.XX.XX.69</p>
         */
        @NameInMap("PublicIPv4Address")
        public String publicIPv4Address;

        public static GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses self = new GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setIpv4LocalAddresses(java.util.List<String> ipv4LocalAddresses) {
            this.ipv4LocalAddresses = ipv4LocalAddresses;
            return this;
        }
        public java.util.List<String> getIpv4LocalAddresses() {
            return this.ipv4LocalAddresses;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setIpv6LocalAddresses(java.util.List<String> ipv6LocalAddresses) {
            this.ipv6LocalAddresses = ipv6LocalAddresses;
            return this;
        }
        public java.util.List<String> getIpv6LocalAddresses() {
            return this.ipv6LocalAddresses;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setPrivateIPv4Address(String privateIPv4Address) {
            this.privateIPv4Address = privateIPv4Address;
            return this;
        }
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setPrivateIPv4HcStatus(String privateIPv4HcStatus) {
            this.privateIPv4HcStatus = privateIPv4HcStatus;
            return this;
        }
        public String getPrivateIPv4HcStatus() {
            return this.privateIPv4HcStatus;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setPrivateIPv6HcStatus(String privateIPv6HcStatus) {
            this.privateIPv6HcStatus = privateIPv6HcStatus;
            return this;
        }
        public String getPrivateIPv6HcStatus() {
            return this.privateIPv6HcStatus;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setPublicIPv4Address(String publicIPv4Address) {
            this.publicIPv4Address = publicIPv4Address;
            return this;
        }
        public String getPublicIPv4Address() {
            return this.publicIPv4Address;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyZoneMappings extends TeaModel {
        /**
         * <p>The Network Load Balancing (NLB) instance address information.</p>
         */
        @NameInMap("LoadBalancerAddresses")
        public java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses> loadBalancerAddresses;

        /**
         * <p>The zone status. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: enabled.</li>
         * <li><strong>Stopped</strong>: stopped. This status can be set only through the CADT disaster recovery management service invocation.</li>
         * <li><strong>Shifted</strong>: DNS manually removed. You can call the <a href="https://help.aliyun.com/document_detail/2412000.html">CancelShiftLoadBalancerZones</a> operation to restore the DNS of the zone.</li>
         * <li><strong>AutoShifted</strong>: DNS automatically removed. When a zone encounters an exception, the system automatically removes the IP address of the abnormal zone to ensure that you can access services normally through the NLB domain name. The IP address is automatically restored when the zone recovers. No manual operation is required.</li>
         * <li><strong>Starting</strong>: starting. This status can be set only through the CADT disaster recovery management service invocation.</li>
         * <li><strong>Stopping</strong>: stopping. This status can be set only through the CADT disaster recovery management service invocation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch in the zone. Each zone uses one vSwitch and one subnet by default.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1rmcrwg3erh1fh8****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/443890.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetLoadBalancerAttributeResponseBodyZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyZoneMappings self = new GetLoadBalancerAttributeResponseBodyZoneMappings();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappings setLoadBalancerAddresses(java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses> loadBalancerAddresses) {
            this.loadBalancerAddresses = loadBalancerAddresses;
            return this;
        }
        public java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses> getLoadBalancerAddresses() {
            return this.loadBalancerAddresses;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
