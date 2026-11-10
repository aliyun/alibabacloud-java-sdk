// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListLoadBalancersResponseBody extends TeaModel {
    /**
     * <p>The list of NLB instances.</p>
     */
    @NameInMap("LoadBalancers")
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If this is the first request or no next request exists, you do not need to specify this parameter.</li>
     * <li>If a next request exists, set the value to the NextToken value returned in the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <p>2022-12-01T17:22:45Z</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The reason for the change of the deletion protection status. The reason must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance running.</p>
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
         * <p>The billing type of the NLB instance. Only <strong>PostPay</strong> is returned, which indicates the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPay</p>
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
         * <p>The time when modification protection was enabled. The time is displayed in UTC in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-01T17:22:45Z</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        /**
         * <p>The reason for enabling modification protection. The reason must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * <p>This parameter takes effect only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Business protection period.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The modification protection status of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection</strong>: Modification protection is disabled. You cannot specify <strong>Reason</strong>. If <strong>Reason</strong> is specified, the value is cleared.</li>
         * <li><strong>ConsoleProtection</strong>: Modification protection is enabled through the console. You can specify <strong>Reason</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>If the value is <strong>ConsoleProtection</strong>, you cannot modify the instance configuration in the load balancing console. However, you can modify the instance configuration by invoking API operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
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
         * <li><strong>SecurityLocked</strong>: locked due to security reasons.</li>
         * <li><strong>RelatedResourceLocked</strong>: locked due to associated resources.</li>
         * <li><strong>FinancialLocked</strong>: financial lock due to overdue payment.</li>
         * <li><strong>ResidualLocked</strong>: locked due to residual resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SecurityLocked</p>
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
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ValueTest</p>
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
         * <p>The ID of the elastic IP address (EIP) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1aedxso6u80u0qf****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The ID of the ENI attached to the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp12f1xhs5yal61a****</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The IPv6 address of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1:1:1:1:1:1</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        /**
         * <p>The private IP IPv4 address of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.3.32</p>
         */
        @NameInMap("PrivateIPv4Address")
        public String privateIPv4Address;

        /**
         * <p>The health check status of the private IP IPv4 address of the NLB instance. Valid values:</p>
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
         * <p>The address information of the NLB instance.</p>
         */
        @NameInMap("LoadBalancerAddresses")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses> loadBalancerAddresses;

        /**
         * <p>The zone status. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: enabled.</li>
         * <li><strong>Stopped</strong>: stopped. This state can only be triggered through service invocation of the CADT disaster recovery management service.</li>
         * <li><strong>Shifted</strong>: DNS manually removed. You can call the <a href="https://help.aliyun.com/document_detail/2412000.html">CancelShiftLoadBalancerZones</a> operation to restore the zone DNS.</li>
         * <li><strong>AutoShifted</strong>: DNS automatically removed. When a zone encounters an exception or other special conditions, the system automatically removes the IP address of the abnormal zone to ensure that you can access services normally through the NLB domain name. The IP address is automatically restored when the zone recovers. No manual operation is required.</li>
         * <li><strong>Starting</strong>: starting. This state can only be triggered through service invocation of the CADT disaster recovery management service.</li>
         * <li><strong>Stopping</strong>: stopping. This state can only be triggered through service invocation of the CADT disaster recovery management service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch that corresponds to the zone. Each zone uses one vSwitch and one subnet by default.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1rmcrwg3erh1fh8****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone name. You can call the <a href="https://help.aliyun.com/document_detail/443890.html">DescribeZones</a> operation to query zones.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
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
         * <p>The protocol version. Valid values:</p>
         * <ul>
         * <li><strong>ipv4</strong>: IPv4.</li>
         * <li><strong>DualStack</strong>: dual-stack.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        /**
         * <p>The IPv4 address type of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: The load balancing instance has a public IP address. The DNS domain name is resolved to the public IP address. Therefore, the instance is accessible over the Internet.</li>
         * <li><strong>Intranet</strong>: The load balancing instance has only a private IP address. The DNS domain name is resolved to the private IP address. Therefore, the instance is accessible only within the internal network environment of the VPC where the load balancing instance is deployed.</li>
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
         * <p>The time when the resource was created. The time is displayed in UTC in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-18T17:22:45Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether cross-zone load balancing is enabled for the NLB instance. Valid values:</p>
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
         * <p>The DNS domain name.</p>
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
        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig deletionProtectionConfig;

        /**
         * <p>The IPv6 address type of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: The load balancing instance has a public IP address. The DNS domain name is resolved to the public IP address. Therefore, the instance is accessible over the Internet.</li>
         * <li><strong>Intranet</strong>: The load balancing instance has only a private IP address. The DNS domain name is resolved to the private IP address. Therefore, the instance is accessible only within the internal network environment of the VPC where the load balancing instance is deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("Ipv6AddressType")
        public String ipv6AddressType;

        /**
         * <p>The billing configuration of the NLB instance.</p>
         */
        @NameInMap("LoadBalancerBillingConfig")
        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig loadBalancerBillingConfig;

        /**
         * <p>The business status of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Abnormal</strong>: The instance is in an abnormal state.</li>
         * <li><strong>Normal</strong>: The instance is in a normal state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("LoadBalancerBusinessStatus")
        public String loadBalancerBusinessStatus;

        /**
         * <p>The ID of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-83ckzc8d4xlp8o****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>NLB1</p>
         */
        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        /**
         * <p>The status of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Inactive</strong>: The instance is stopped. Listeners of the instance no longer forward traffic.</li>
         * <li><strong>Active</strong>: The instance is running.</li>
         * <li><strong>Provisioning</strong>: The instance is being created.</li>
         * <li><strong>Configuring</strong>: Upgrade/Downgrade in progress.</li>
         * <li><strong>Deleting</strong>: The instance is being deleted.</li>
         * <li><strong>Deleted</strong>: The instance is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        /**
         * <p>The type of the load balancing instance. Only <strong>Network</strong> is returned, which indicates Network Load Balancer (NLB).</p>
         * 
         * <strong>example:</strong>
         * <p>Network</p>
         */
        @NameInMap("LoadBalancerType")
        public String loadBalancerType;

        /**
         * <p>The modification protection configuration.</p>
         */
        @NameInMap("ModificationProtectionConfig")
        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig modificationProtectionConfig;

        /**
         * <p>The operation lock configuration of the NLB instance. This parameter takes effect when <code>LoadBalancerBussinessStatus</code> is <strong>Abnormal</strong>.</p>
         */
        @NameInMap("OperationLocks")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersOperationLocks> operationLocks;

        /**
         * <p>The region ID of the NLB instance.</p>
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
         * <p>rg-atstuj3rtop****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The security groups to which the NLB instance is added.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> tags;

        /**
         * <p>The VPC ID of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1b49rqrybk45nio****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The list of zone and vSwitch mappings.</p>
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
