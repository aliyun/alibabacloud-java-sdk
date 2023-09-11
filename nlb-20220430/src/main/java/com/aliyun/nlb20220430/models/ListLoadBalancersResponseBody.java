// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListLoadBalancersResponseBody extends TeaModel {
    /**
     * <p>The NLB instances.</p>
     */
    @NameInMap("LoadBalancers")
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query and no subsequent queries are to be sent, ignore this parameter.</p>
     * <p>*   If a subsequent query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancersResponseBody self = new ListLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancersResponseBody setLoadBalancers(java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> getLoadBalancers() {
        return this.loadBalancers;
    }

    public ListLoadBalancersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLoadBalancersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLoadBalancersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig extends TeaModel {
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

        public static ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig self = new ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig extends TeaModel {
        /**
         * <p>The billing method of the NLB instance. Only **PostPay** is supported, which indicates the pay-as-you-go billing method.</p>
         */
        @NameInMap("PayType")
        public String payType;

        public static ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig self = new ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig extends TeaModel {
        /**
         * <p>The time when the configuration read-only mode was enabled. The time is displayed in UTC in `yyyy-MM-ddTHH:mm:ssZ` format.</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The reason why the configuration read-only mode is enabled. The reason must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The reason must start with a letter.</p>
         * <br>
         * <p>This parameter takes effect only if **Status** is set to **ConsoleProtection**.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Indicates whether the configuration read-only mode is enabled. Valid values:</p>
         * <br>
         * <p>*   **NonProtection**: disabled. In this case, **Reason** is not returned. If **Reason** is set, the value is cleared.</p>
         * <p>*   **ConsoleProtection**: enabled. In this case, **Reason** is returned.</p>
         * <br>
         * <p>>  If you set this parameter to **ConsoleProtection**, you cannot use the NLB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig self = new ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersOperationLocks extends TeaModel {
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

        public static ListLoadBalancersResponseBodyLoadBalancersOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersOperationLocks self = new ListLoadBalancersResponseBodyLoadBalancersOperationLocks();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListLoadBalancersResponseBodyLoadBalancersOperationLocks setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListLoadBalancersResponseBodyLoadBalancersTags build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersTags self = new ListLoadBalancersResponseBodyLoadBalancersTags();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLoadBalancersResponseBodyLoadBalancersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses extends TeaModel {
        /**
         * <p>The ID of the elastic IP address (EIP).</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The ID of the elastic network interface (ENI) attached to the NLB instance.</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The IPv6 address used by the NLB instance.</p>
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

        public static ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses self = new ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setPrivateIPv4Address(String privateIPv4Address) {
            this.privateIPv4Address = privateIPv4Address;
            return this;
        }
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setPrivateIPv4HcStatus(String privateIPv4HcStatus) {
            this.privateIPv4HcStatus = privateIPv4HcStatus;
            return this;
        }
        public String getPrivateIPv4HcStatus() {
            return this.privateIPv4HcStatus;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setPrivateIPv6HcStatus(String privateIPv6HcStatus) {
            this.privateIPv6HcStatus = privateIPv6HcStatus;
            return this;
        }
        public String getPrivateIPv6HcStatus() {
            return this.privateIPv6HcStatus;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setPublicIPv4Address(String publicIPv4Address) {
            this.publicIPv4Address = publicIPv4Address;
            return this;
        }
        public String getPublicIPv4Address() {
            return this.publicIPv4Address;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersZoneMappings extends TeaModel {
        /**
         * <p>The IP addresses that are used by the NLB instance.</p>
         */
        @NameInMap("LoadBalancerAddresses")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses> loadBalancerAddresses;

        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vSwitch in the zone. By default, each zone contains one vSwitch and one subnet.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the zone. You can call the [DescribeZones](~~443890~~) operation to query the zones.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListLoadBalancersResponseBodyLoadBalancersZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersZoneMappings self = new ListLoadBalancersResponseBodyLoadBalancersZoneMappings();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setLoadBalancerAddresses(java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses> loadBalancerAddresses) {
            this.loadBalancerAddresses = loadBalancerAddresses;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses> getLoadBalancerAddresses() {
            return this.loadBalancerAddresses;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancers extends TeaModel {
        /**
         * <p>The IP version. Valid values:</p>
         * <br>
         * <p>*   **ipv4**: IPv4</p>
         * <p>*   **DualStack**: dual stack</p>
         */
        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        /**
         * <p>The type of IPv4 address used by the NLB instance. Valid values:</p>
         * <br>
         * <p>*   **Internet**: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.</p>
         * <p>*   **Intranet**: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the VPC where the NLB instance is deployed.</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>The ID of the EIP bandwidth plan that is associated with the NLB instance if the NLB instance uses a public IP address.</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

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
        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig deletionProtectionConfig;

        /**
         * <p>The type of IPv6 address used by the NLB instance. Valid values:</p>
         * <br>
         * <p>*   **Internet**: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.</p>
         * <p>*   **Intranet**: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the VPC where the NLB instance is deployed.</p>
         */
        @NameInMap("Ipv6AddressType")
        public String ipv6AddressType;

        /**
         * <p>The billing settings of the NLB instance.</p>
         */
        @NameInMap("LoadBalancerBillingConfig")
        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig loadBalancerBillingConfig;

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
         * <p>*   **Deleting**: The NLB instance is being deleted.</p>
         * <p>*   **Deleted**: The NLB instance is deleted.</p>
         */
        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        /**
         * <p>The type of the SLB instance. Only **Network** is returned, which indicates NLB.</p>
         */
        @NameInMap("LoadBalancerType")
        public String loadBalancerType;

        /**
         * <p>The configuration of the configuration read-only mode.</p>
         */
        @NameInMap("ModificationProtectionConfig")
        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig modificationProtectionConfig;

        /**
         * <p>The configuration of the operation lock. This parameter takes effect if the value of `LoadBalancerBussinessStatus` is **Abnormal**.</p>
         */
        @NameInMap("OperationLocks")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersOperationLocks> operationLocks;

        /**
         * <p>The ID of the region where the NLB instance is deployed.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The security group to which the NLB instance is added.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> tags;

        /**
         * <p>The ID of the VPC where the NLB instance is deployed.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The mappings between zones and vSwitches.</p>
         */
        @NameInMap("ZoneMappings")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappings> zoneMappings;

        public static ListLoadBalancersResponseBodyLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancers self = new ListLoadBalancersResponseBodyLoadBalancers();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancers setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setCrossZoneEnabled(Boolean crossZoneEnabled) {
            this.crossZoneEnabled = crossZoneEnabled;
            return this;
        }
        public Boolean getCrossZoneEnabled() {
            return this.crossZoneEnabled;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setDNSName(String DNSName) {
            this.DNSName = DNSName;
            return this;
        }
        public String getDNSName() {
            return this.DNSName;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setDeletionProtectionConfig(ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig deletionProtectionConfig) {
            this.deletionProtectionConfig = deletionProtectionConfig;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig getDeletionProtectionConfig() {
            return this.deletionProtectionConfig;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setIpv6AddressType(String ipv6AddressType) {
            this.ipv6AddressType = ipv6AddressType;
            return this;
        }
        public String getIpv6AddressType() {
            return this.ipv6AddressType;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerBillingConfig(ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig getLoadBalancerBillingConfig() {
            return this.loadBalancerBillingConfig;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
            this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
            return this;
        }
        public String getLoadBalancerBusinessStatus() {
            return this.loadBalancerBusinessStatus;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setModificationProtectionConfig(ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig modificationProtectionConfig) {
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig getModificationProtectionConfig() {
            return this.modificationProtectionConfig;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setOperationLocks(java.util.List<ListLoadBalancersResponseBodyLoadBalancersOperationLocks> operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersOperationLocks> getOperationLocks() {
            return this.operationLocks;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setTags(java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> getTags() {
            return this.tags;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setZoneMappings(java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappings> getZoneMappings() {
            return this.zoneMappings;
        }

    }

}
