// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersRequest extends TeaModel {
    /**
     * <p>The IP address that the CLB instance uses to provide services.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
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
     * <p>The metering method of Internet data transfer. Valid values:</p>
     * <ul>
     * <li><strong>paybybandwidth:</strong> pay-by-bandwidth.</li>
     * <li><strong>paybytraffic:</strong> pay-by-data-transfer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>paybytraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The ID of the CLB instance.</p>
     * <p>You can specify up to 10 IDs. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1b6c719dfa****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the CLB instance.</p>
     * <p>The name must be 1 to 80 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * <p>You can specify up to 10 names. Separate multiple names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The status of the CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>inactive:</strong> The CLB instance is disabled. CLB instances in the inactive state do not forward traffic.</li>
     * <li><strong>active:</strong> The CLB instance runs as expected. By default, newly created CLB instances are in the <strong>active</strong> state.</li>
     * <li><strong>locked:</strong> The CLB instance is locked. After a CLB instance expires, it is locked for seven days. A locked CLB instance cannot forward traffic and you cannot perform operations on the locked CLB instance. However, other settings such as the IP address are retained.</li>
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

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * <blockquote>
     * <p> If you specify the <strong>PageSize</strong> parameter, you must also specify the <strong>PageNumber</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method of the CLB instance. Valid values:</p>
     * <ul>
     * <li>Set the value to <strong>PayOnDemand</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayOnDemand</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the region where the CLB instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/27584.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the backend server that is added to the CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vm-server-23****</p>
     */
    @NameInMap("ServerId")
    public String serverId;

    /**
     * <p>The private IP address of the backend server that is added to the CLB instance.</p>
     * <p>You can specify multiple IP addresses. Separate multiple IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>10.XX.XX.102</p>
     */
    @NameInMap("ServerIntranetAddress")
    public String serverIntranetAddress;

    /**
     * <p>The ID of the secondary zone to which the CLB instance belongs.</p>
     * <p>CLB instances on Alibaba Finance Cloud do not support cross-zone deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
     */
    @NameInMap("SlaveZoneId")
    public String slaveZoneId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeLoadBalancersRequestTag> tag;

    /**
     * <p>The tags that are added to the CLB instance. The tags must be key-value pairs that are contained in a JSON dictionary.</p>
     * <p>You can specify up to 10 tags in each call.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;tagKey&quot;:&quot;Key1&quot;,&quot;tagValue&quot;:&quot;Value1&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The ID of the vSwitch to which the CLB instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp12mw1f8k3****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the CLB instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1aevy8sof****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeLoadBalancersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancersRequest self = new DescribeLoadBalancersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancersRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeLoadBalancersRequest setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public DescribeLoadBalancersRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public DescribeLoadBalancersRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeLoadBalancersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeLoadBalancersRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public DescribeLoadBalancersRequest setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public DescribeLoadBalancersRequest setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public DescribeLoadBalancersRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeLoadBalancersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeLoadBalancersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLoadBalancersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadBalancersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadBalancersRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeLoadBalancersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLoadBalancersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeLoadBalancersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeLoadBalancersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeLoadBalancersRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public DescribeLoadBalancersRequest setServerIntranetAddress(String serverIntranetAddress) {
        this.serverIntranetAddress = serverIntranetAddress;
        return this;
    }
    public String getServerIntranetAddress() {
        return this.serverIntranetAddress;
    }

    public DescribeLoadBalancersRequest setSlaveZoneId(String slaveZoneId) {
        this.slaveZoneId = slaveZoneId;
        return this;
    }
    public String getSlaveZoneId() {
        return this.slaveZoneId;
    }

    public DescribeLoadBalancersRequest setTag(java.util.List<DescribeLoadBalancersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeLoadBalancersRequestTag> getTag() {
        return this.tag;
    }

    public DescribeLoadBalancersRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DescribeLoadBalancersRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeLoadBalancersRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeLoadBalancersRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key must be 1 to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be at most 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeLoadBalancersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersRequestTag self = new DescribeLoadBalancersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLoadBalancersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
