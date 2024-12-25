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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8B9DB03B-ED39-5DB8-9C9F-1ED5F548D61E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of instances returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
         * <p>The endpoint of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100.XX.XX.28</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The IP version that is used by the CLB instance. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        /**
         * <p>The network type of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>internet:</strong> After an Internet-facing CLB instance is created, the system assigns a public IP address to the CLB instance. Then, the CLB instance can forward requests over the Internet.</li>
         * <li><strong>intranet:</strong> After an internal-facing CLB instance is created, the system assigns a private IP address to the CLB instance. Then, the CLB instance can forward requests only over internal networks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The time when the CLB instance was created. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-02T02:49:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The timestamp when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1504147745000</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <p>Indicates whether deletion protection is enabled for the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>on:</strong> Deletion protection is enabled.</li>
         * <li><strong>off:</strong> Deletion protection is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("DeleteProtection")
        public String deleteProtection;

        /**
         * <p>The metering method of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>PayBySpec:</strong> pay-by-specification.</li>
         * <li><strong>PayByCLCU:</strong> pay-by-LCU.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only for accounts registered on the China site (aliyun.com) and when the <strong>PayType</strong> parameter is set to <strong>PayOnDemand</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PayBySpec</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The metering method of the Internet-facing CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>3:</strong> pay-by-bandwidth (<strong>paybybandwidth</strong>).</li>
         * <li><strong>4:</strong> pay-by-data-transfer (<strong>paybytraffic</strong>).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The metering method of Internet data transfer. Valid values:</p>
         * <ul>
         * <li><strong>paybybandwidth:</strong> pay-by-bandwidth.</li>
         * <li><strong>paybytraffic:</strong> pay-by-data-transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>paybybandwidth</p>
         */
        @NameInMap("InternetChargeTypeAlias")
        public String internetChargeTypeAlias;

        /**
         * <p>The ID of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1b6c719dfa****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1o94dp5i6ea****</p>
         */
        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        /**
         * <p>The specification of the CLB instance.</p>
         * <blockquote>
         * <p> Pay-as-you-go CLB instances are not subject to specifications. <strong>slb.lcu.elastic</strong> is returned by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>slb.s1.small</p>
         */
        @NameInMap("LoadBalancerSpec")
        public String loadBalancerSpec;

        /**
         * <p>The status of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>inactive:</strong> The CLB instance is disabled. CLB instances in the inactive state do not forward traffic.</li>
         * <li><strong>active:</strong> The CLB instance runs as expected. By default, newly created CLB instances are in the <strong>active</strong> state.</li>
         * <li><strong>locked:</strong> The CLB instance is locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        /**
         * <p>The ID of the primary zone to which the CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("MasterZoneId")
        public String masterZoneId;

        /**
         * <p>The reason why the configuration read-only mode was enabled. The reason must be 1 to 80 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you set the <code>ModificationProtectionStatus</code> parameter to <strong>ConsoleProtection</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ManagedInstance</p>
         */
        @NameInMap("ModificationProtectionReason")
        public String modificationProtectionReason;

        /**
         * <p>Indicates whether the configuration read-only mode is enabled for the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection:</strong> The configuration read-only mode is disabled. In this case, you cannot specify the ModificationProtectionReason parameter. If you specify the <code>ModificationProtectionReason</code> parameter, the value is cleared.</li>
         * <li><strong>ConsoleProtection:</strong> The configuration read-only mode is enabled.</li>
         * </ul>
         * <blockquote>
         * <p> If you set this parameter to <strong>ConsoleProtection</strong>, you cannot modify the configurations of the CLB instance in the CLB console. However, you can call API operations to modify the configurations of the CLB instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        @NameInMap("ModificationProtectionStatus")
        public String modificationProtectionStatus;

        /**
         * <p>The network type of the internal-facing CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>vpc:</strong> VPC.</li>
         * <li><strong>classic:</strong> classic network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The billing method of the CLB instance.</p>
         * <ul>
         * <li><strong>PayOnDemand</strong> is returned, which indicates the pay-as-you-go billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayOnDemand</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the region where the CLB instance was deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region where the CLB instance was deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        @NameInMap("RegionIdAlias")
        public String regionIdAlias;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3r****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the secondary zone to which the CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-d</p>
         */
        @NameInMap("SlaveZoneId")
        public String slaveZoneId;

        /**
         * <p>The tags of the CLB instance.</p>
         */
        @NameInMap("Tags")
        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancerTags tags;

        /**
         * <p>The ID of the vSwitch to which the internal-facing CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-255ecr****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC in which the internal-facing CLB instance was deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-25dvzy9f8****</p>
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
