// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersResponseBody extends TeaModel {
    /**
     * <p>An array of CLB instances.</p>
     */
    @NameInMap("LoadBalancers")
    public DescribeLoadBalancersResponseBodyLoadBalancers loadBalancers;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of instances returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancersResponseBody self = new DescribeLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancersResponseBody setLoadBalancers(DescribeLoadBalancersResponseBodyLoadBalancers loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public DescribeLoadBalancersResponseBodyLoadBalancers getLoadBalancers() {
        return this.loadBalancers;
    }

    public DescribeLoadBalancersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadBalancersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTagsTag self = new DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTagsTag> tag;

        public static DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTags self = new DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTags();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTags setTag(java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer extends TeaModel {
        /**
         * <p>The IP address that the CLB instance uses to provide services.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The IP version. Valid values: **ipv4** and **ipv6**.</p>
         */
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        /**
         * <p>The network type of the CLB instance. Valid values:</p>
         * <br>
         * <p>*   **internet**: After an Internet-facing CLB instance is created, the system allocates a public IP address to the CLB instance. Then, the CLB instance can forward requests over the Internet.</p>
         * <p>*   **intranet**: After an internal-facing CLB instance is created, the system allocates a private IP address to the CLB instance. Then, the CLB instance can forward only requests within the internal network.</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s. Valid values:</p>
         * <br>
         * <p>*   **-1**: For a pay-by-data-transfer Internet-facing CLB instance, this value is set to -1. This indicates that the bandwidth is unlimited.</p>
         * <p>*   **1 to 5120**: For a pay-by-bandwidth Internet-facing CLB instance, you can specify a maximum bandwidth for each listener. The sum of the maximum bandwidth of all listeners cannot exceed the maximum bandwidth of the CLB instance.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The time when the CLB instance was created. The time follows the `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The timestamp when the instance was created.</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <p>Indicates whether deletion protection is enabled for the CLB instance. Valid values:</p>
         * <br>
         * <p>*   **on**: enabled.</p>
         * <p>*   **off**: disabled.</p>
         */
        @NameInMap("DeleteProtection")
        public String deleteProtection;

        /**
         * <p>The metering method of the CLB instance. Valid values:</p>
         * <br>
         * <p>*   **PayBySpec**: pay-by-specification</p>
         * <p>*   **PayByCLCU**: pay-by-LCU</p>
         * <br>
         * <p>>  This parameter is available only on the China site (aliyun.com) and takes effect when the **PayType** parameter is set to **PayOnDemand** (pay-as-you-go).</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The metering method of the Internet-facing CLB instance. Valid values:</p>
         * <br>
         * <p>*   **3**: pay-by-bandwidth (**paybybandwidth**)</p>
         * <p>*   **4**: pay-by-data-transfer (**paybytraffic**)</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The metering method of Internet data transfer. Valid values:</p>
         * <br>
         * <p>*   **paybybandwidth**: pay-by-bandwidth</p>
         * <p>*   **paybytraffic**: pay-by-data-transfer</p>
         */
        @NameInMap("InternetChargeTypeAlias")
        public String internetChargeTypeAlias;

        /**
         * <p>The ID of the CLB instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the CLB instance.</p>
         */
        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        /**
         * <p>The specification of the CLB instance.</p>
         */
        @NameInMap("LoadBalancerSpec")
        public String loadBalancerSpec;

        /**
         * <p>The status of the CLB instance. Valid values:</p>
         * <br>
         * <p>*   **inactive**: The CLB instance is disabled. CLB instances in the inactive state do not forward traffic.</p>
         * <p>*   **active**: The CLB instance is running as expected. Newly created CLB instances are in the **active** state by default.</p>
         * <p>*   **locked**: The CLB instance is locked.</p>
         */
        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        /**
         * <p>The ID of the primary zone to which the CLB instance belongs.</p>
         */
        @NameInMap("MasterZoneId")
        public String masterZoneId;

        /**
         * <p>The reason why the configuration read-only mode is enabled. The value is 1 to 80 characters in length. It starts with a letter and can contain letters, digits, periods (.), underscores (\_), and hyphens (-).</p>
         * <br>
         * <p>>  This parameter is valid only if the `ModificationProtectionStatus` parameter is set to **ConsoleProtection**.</p>
         */
        @NameInMap("ModificationProtectionReason")
        public String modificationProtectionReason;

        /**
         * <p>Indicates whether the configuration read-only mode is enabled for the CLB instance. Valid values:</p>
         * <br>
         * <p>*   **NonProtection**: The configuration read-only mode is disabled. After you disable the configuration read-only mode, the value of `ModificationProtectionReason` is cleared.</p>
         * <p>*   **ConsoleProtection**: The configuration read-only mode is enabled.</p>
         * <br>
         * <p>>  If this parameter is set to **ConsoleProtection**, you cannot use the CLB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
         */
        @NameInMap("ModificationProtectionStatus")
        public String modificationProtectionStatus;

        /**
         * <p>The network type of the internal-facing CLB instance. Valid values:</p>
         * <br>
         * <p>*   **vpc**: VPC</p>
         * <p>*   **classic**: classic network</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The billing method of the CLB instance.</p>
         * <br>
         * <p>*   **PayOnDemand** is returned, which indicates the pay-as-you-go billing method.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the region where the CLB instance is deployed.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region in which the CLB instance resides.</p>
         */
        @NameInMap("RegionIdAlias")
        public String regionIdAlias;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the secondary zone to which the CLB instance belongs.</p>
         */
        @NameInMap("SlaveZoneId")
        public String slaveZoneId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTags tags;

        /**
         * <p>The ID of the vSwitch to which the internal-facing CLB instance belongs.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC to which the internal-facing CLB instance belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer self = new DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setDeleteProtection(String deleteProtection) {
            this.deleteProtection = deleteProtection;
            return this;
        }
        public String getDeleteProtection() {
            return this.deleteProtection;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setInternetChargeTypeAlias(String internetChargeTypeAlias) {
            this.internetChargeTypeAlias = internetChargeTypeAlias;
            return this;
        }
        public String getInternetChargeTypeAlias() {
            return this.internetChargeTypeAlias;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }
        public String getLoadBalancerSpec() {
            return this.loadBalancerSpec;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setModificationProtectionReason(String modificationProtectionReason) {
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }
        public String getModificationProtectionReason() {
            return this.modificationProtectionReason;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setModificationProtectionStatus(String modificationProtectionStatus) {
            this.modificationProtectionStatus = modificationProtectionStatus;
            return this;
        }
        public String getModificationProtectionStatus() {
            return this.modificationProtectionStatus;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setRegionIdAlias(String regionIdAlias) {
            this.regionIdAlias = regionIdAlias;
            return this;
        }
        public String getRegionIdAlias() {
            return this.regionIdAlias;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setSlaveZoneId(String slaveZoneId) {
            this.slaveZoneId = slaveZoneId;
            return this;
        }
        public String getSlaveZoneId() {
            return this.slaveZoneId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setTags(DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTags getTags() {
            return this.tags;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancers extends TeaModel {
        @NameInMap("LoadBalancer")
        public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> loadBalancer;

        public static DescribeLoadBalancersResponseBodyLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancers self = new DescribeLoadBalancersResponseBodyLoadBalancers();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setLoadBalancer(java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> getLoadBalancer() {
            return this.loadBalancer;
        }

    }

}
