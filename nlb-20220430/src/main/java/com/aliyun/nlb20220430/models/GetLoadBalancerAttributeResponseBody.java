// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetLoadBalancerAttributeResponseBody extends TeaModel {
    /**
     * <p>The IP version. Valid values:</p>
     * <br>
     * <p>*   **ipv4**: IPv4</p>
     * <p>*   **DualStack**: dual stack</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The type of IPv4 address that is used by the NLB instance. Valid values:</p>
     * <br>
     * <p>*   **Internet**: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.</p>
     * <p>*   **Intranet**: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the virtual private cloud (VPC) where the NLB instance is deployed.</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the EIP bandwidth plan that is associated with the NLB instance if the NLB instance uses a public IP address.</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The maximum number of connections that can be created per second on the NLB instance. Valid values: **0** to **1000000**.</p>
     * <br>
     * <p>**0** indicates that the number of connections is unlimited.</p>
     */
    @NameInMap("Cps")
    public Integer cps;

    /**
     * <p>The time when the resource was created. The time is displayed in UTC in the `yyyy-MM-ddTHH:mm:ssZ` format.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether cross-zone load balancing is enabled for the NLB instance. Valid values:</p>
     * <br>
     * <p>*   **true**: enabled</p>
     * <p>*   **false**: disabled</p>
     */
    @NameInMap("CrossZoneEnabled")
    public Boolean crossZoneEnabled;

    /**
     * <p>The domain name of the NLB instance.</p>
     */
    @NameInMap("DNSName")
    public String DNSName;

    /**
     * <p>The configuration of the deletion protection feature.</p>
     */
    @NameInMap("DeletionProtectionConfig")
    public GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig deletionProtectionConfig;

    /**
     * <p>The type of IPv6 address used by the NLB instance. Valid values:</p>
     * <br>
     * <p>*   **Internet**: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.</p>
     * <p>*   **Intranet**: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the VPC where the NLB instance is deployed.</p>
     */
    @NameInMap("Ipv6AddressType")
    public String ipv6AddressType;

    /**
     * <p>The configuration of the billing method.</p>
     */
    @NameInMap("LoadBalancerBillingConfig")
    public GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig loadBalancerBillingConfig;

    /**
     * <p>The business status of the NLB instance. Valid values:</p>
     * <br>
     * <p>*   **Abnormal**: The NLB instance is not working as expected.</p>
     * <p>*   **Normal**: The NLB instance is working as expected.</p>
     */
    @NameInMap("LoadBalancerBusinessStatus")
    public String loadBalancerBusinessStatus;

    /**
     * <p>The ID of the NLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the NLB instance.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The status of the NLB instance. Valid values:</p>
     * <br>
     * <p>*   **Inactive**: The NLB instance is disabled. Listeners of NLB instances in the Inactive state do not forward traffic.</p>
     * <p>*   **Active**: The NLB instance is running.</p>
     * <p>*   **Provisioning**: The NLB instance is being created.</p>
     * <p>*   **Configuring**: The NLB instance is being modified.</p>
     * <p>*   **CreateFailed**: The system failed to create the NLB instance. In this case, you are not charged for the NLB instance. You can only delete the NLB instance.</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The type of the Server Load Balancer (SLB) instance. Only **network** is returned, which indicates an NLB instance.</p>
     */
    @NameInMap("LoadBalancerType")
    public String loadBalancerType;

    /**
     * <p>The configuration of the configuration read-only mode.</p>
     */
    @NameInMap("ModificationProtectionConfig")
    public GetLoadBalancerAttributeResponseBodyModificationProtectionConfig modificationProtectionConfig;

    /**
     * <p>The list of NLB instances that are locked. This parameter takes effect if the value of `LoadBalancerBussinessStatus` is **Abnormal**.</p>
     */
    @NameInMap("OperationLocks")
    public java.util.List<GetLoadBalancerAttributeResponseBodyOperationLocks> operationLocks;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group that is associated with the NLB instance.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The ID of the VPC where the NLB instance is deployed.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The list of zones and vSwitches in the zones. You must specify 2 to 10 zones.</p>
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
         * <p>Indicates whether deletion protection is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: enabled</p>
         * <p>*   **false**: disabled</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time when deletion protection was enabled. The time is displayed in UTC in `yyyy-MM-ddTHH:mm:ssZ` format.</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The reason why the deletion protection feature is enabled or disabled. The reason must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The reason must start with a letter.</p>
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
         * <p>The billing method of the NLB instance. Only **PostPay** is supported, which indicates the pay-as-you-go billing method.</p>
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
         * <p>The time when the configuration read-only mode was enabled. The time is displayed in UTC in the `yyyy-MM-ddTHH:mm:ssZ` format.</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The reason why the configuration read-only mode is enabled. The reason must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The reason must start with a letter.</p>
         * <br>
         * <p>This parameter is valid only if the **Status** parameter is set to **ConsoleProtection**.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Indicates whether the configuration read-only mode is enabled. Valid values:</p>
         * <br>
         * <p>*   **NonProtection**: disabled. The **Reason** parameter cannot be set. If **Reason** is set, the value is cleared.</p>
         * <p>*   **ConsoleProtection**: enabled. In this case, the **Reason** parameter is returned.</p>
         * <br>
         * <p>>  If you set this parameter to **ConsoleProtection**, you cannot use the NLB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
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
         * <p>The reason why the NLB instance is locked.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The type of lock. Valid values:</p>
         * <br>
         * <p>*   **SecurityLocked**: The NLB instance is locked due to security reasons.</p>
         * <p>*   **RelatedResourceLocked**: The NLB instance is locked due to association issues.</p>
         * <p>*   **FinancialLocked**: The NLB instance is locked due to overdue payments.</p>
         * <p>*   **ResidualLocked**: The NLB instance is locked because the payments of the associated resources are overdue and the resources are released.</p>
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

    public static class GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses extends TeaModel {
        /**
         * <p>The ID of the elastic IP address (EIP).</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The IPv6 address of the NLB instance.</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        /**
         * <p>The private IPv4 address of the NLB instance.</p>
         */
        @NameInMap("PrivateIPv4Address")
        public String privateIPv4Address;

        @NameInMap("PrivateIPv4HcStatus")
        public String privateIPv4HcStatus;

        @NameInMap("PrivateIPv6HcStatus")
        public String privateIPv6HcStatus;

        /**
         * <p>The public IPv4 address of the NLB instance.</p>
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

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
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
         * <p>The information about the IP addresses used by the NLB instance.</p>
         */
        @NameInMap("LoadBalancerAddresses")
        public java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses> loadBalancerAddresses;

        /**
         * <p>The ID of the vSwitch in the zone. By default, each zone contains one vSwitch and one subnet.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone. You can call the [DescribeZones](~~443890~~) operation to query the zones.</p>
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
