// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewaysRequest extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The type of the VPN gateway.</p>
     * <br>
     * <p>The value is set to **Normal**, which indicates a standard NAT gateway.</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The list of VPN gateways.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The tag key. The tag key cannot be an empty string.</p>
     * <br>
     * <p>It can be at most 64 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
     * <br>
     * <p>You can specify at most 20 tag keys in each call.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<DescribeVpnGatewaysRequestTag> tag;

    /**
     * <p>The tag value.</p>
     * <br>
     * <p>The tag value can be an empty string and cannot exceed 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
     * <br>
     * <p>Each tag key corresponds to one tag value. You can specify at most 20 tag values in each call.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The number of entries returned per page.</p>
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
         * <p>The status of the pending order.</p>
         * <br>
         * <p>*   **1**: indicates that the order for renewal or the order for renewal with a specification change has not taken effect.</p>
         * <p>*   **2**: indicates that the order for a temporary upgrade has taken effect. After the temporary upgrade expires, the system restores the VPN gateway to its previous specifications. In this case, **ReservationIpsec**, **ReservationMaxConnections**, **ReservationSpec**, and **ReservationSsl** indicate the previous specification.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the VPC to which the VPN gateway belongs.</p>
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
