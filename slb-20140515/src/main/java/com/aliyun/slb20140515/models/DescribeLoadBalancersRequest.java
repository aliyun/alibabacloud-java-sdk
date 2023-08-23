// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersRequest extends TeaModel {
    /**
     * <p>The IP address that the CLB instance uses to provide services.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The IP version that is used by the CLB instance. Valid values: **ipv4** and **ipv6**.</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The network type of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   **internet:** After an Internet-facing CLB instance is created, the system assigns a public IP address to the CLB instance. Then, the CLB instance can forward requests over the Internet.</p>
     * <p>*   **intranet:** After an internal-facing CLB instance is created, the system assigns a private IP address to the CLB instance. Then, the CLB instance can forward requests only over internal networks.</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The metering method of Internet data transfer. Valid values:</p>
     * <br>
     * <p>*   **paybybandwidth:** pay-by-bandwidth.</p>
     * <p>*   **paybytraffic:** pay-by-data-transfer.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The ID of the CLB instance.</p>
     * <br>
     * <p>You can specify up to 10 IDs. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the CLB instance.</p>
     * <br>
     * <p>The name must be 1 to 80 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
     * <br>
     * <p>You can specify up to 10 names. Separate multiple names with commas (,).</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The status of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   **inactive:** The CLB instance is disabled. CLB instances in the inactive state do not forward traffic.</p>
     * <p>*   **active:** The CLB instance runs as expected. By default, newly created CLB instances are in the **active** state.</p>
     * <p>*   **locked:** The CLB instance is locked. After a CLB instance expires, it is locked for seven days. A locked CLB instance cannot forward traffic and you cannot perform operations on the locked CLB instance. However, other settings such as the IP address are retained.</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The ID of the primary zone to which the CLB instance belongs.</p>
     */
    @NameInMap("MasterZoneId")
    public String masterZoneId;

    /**
     * <p>The network type of the internal-facing CLB instance. Valid values:</p>
     * <br>
     * <p>*   **vpc:** VPC.</p>
     * <p>*   **classic:** classic network.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: **1** to **100**.</p>
     * <br>
     * <p>>  If you specify the **PageSize** parameter, you must also specify the **PageNumber** parameter.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   Set the value to **PayOnDemand**.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the region where the CLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~27584~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the backend server that is added to the CLB instance.</p>
     */
    @NameInMap("ServerId")
    public String serverId;

    /**
     * <p>The private IP address of the backend server that is added to the CLB instance.</p>
     * <br>
     * <p>You can specify multiple IP addresses. Separate multiple IP addresses with commas (,).</p>
     */
    @NameInMap("ServerIntranetAddress")
    public String serverIntranetAddress;

    /**
     * <p>The ID of the secondary zone to which the CLB instance belongs.</p>
     * <br>
     * <p>CLB instances on Alibaba Finance Cloud do not support cross-zone deployment.</p>
     */
    @NameInMap("SlaveZoneId")
    public String slaveZoneId;

    @NameInMap("Tag")
    public java.util.List<DescribeLoadBalancersRequestTag> tag;

    /**
     * <p>The tags that are added to the CLB instance. The tags must be key-value pairs that are contained in a JSON dictionary.</p>
     * <br>
     * <p>You can specify up to 10 tags in each call.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The ID of the vSwitch to which the CLB instance belongs.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the CLB instance belongs.</p>
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
        @NameInMap("Key")
        public String key;

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
