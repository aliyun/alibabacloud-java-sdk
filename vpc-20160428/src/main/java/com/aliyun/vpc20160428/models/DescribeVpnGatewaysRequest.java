// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewaysRequest extends TeaModel {
    /**
     * <p>The payment status of the VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong></li>
     * <li><strong>FinancialLocked</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <p>Specifies whether to return information about pending orders. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the VPN gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the VPN gateway belongs.</p>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the resource group list.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>init</strong></li>
     * <li><strong>provisioning</strong></li>
     * <li><strong>active</strong></li>
     * <li><strong>updating</strong></li>
     * <li><strong>deleting</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags that are added to the VPN gateway.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeVpnGatewaysRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the VPN gateway belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1m3i0kn1nd4wiw9****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp17lofy9fd0dnvzv****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static DescribeVpnGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewaysRequest self = new DescribeVpnGatewaysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewaysRequest setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeVpnGatewaysRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public DescribeVpnGatewaysRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribeVpnGatewaysRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVpnGatewaysRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpnGatewaysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnGatewaysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnGatewaysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpnGatewaysRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVpnGatewaysRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVpnGatewaysRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVpnGatewaysRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVpnGatewaysRequest setTag(java.util.List<DescribeVpnGatewaysRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVpnGatewaysRequestTag> getTag() {
        return this.tag;
    }

    public DescribeVpnGatewaysRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVpnGatewaysRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static class DescribeVpnGatewaysRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>You can specify at most 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>Each tag key corresponds to one tag value. You can specify at most 20 tag values at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVpnGatewaysRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysRequestTag self = new DescribeVpnGatewaysRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpnGatewaysRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
