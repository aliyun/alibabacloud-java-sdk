// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewaysResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>If the order type is **TEMP_UPGRADE** (temporary upgrade), this parameter specifies the time when the temporary upgrade expires.</p>
     * <br>
     * <p>If the order type is **RENEWCHANGE** (renewal with a specification change) or **RENEW** (renewal), this parameter indicates the time when the renewal or renewal with a specification change takes effect.</p>
     */
    @NameInMap("VpnGateways")
    public DescribeVpnGatewaysResponseBodyVpnGateways vpnGateways;

    public static DescribeVpnGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewaysResponseBody self = new DescribeVpnGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpnGatewaysResponseBody setVpnGateways(DescribeVpnGatewaysResponseBodyVpnGateways vpnGateways) {
        this.vpnGateways = vpnGateways;
        return this;
    }
    public DescribeVpnGatewaysResponseBodyVpnGateways getVpnGateways() {
        return this.vpnGateways;
    }

    public static class DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData extends TeaModel {
        /**
         * <p>If the order type is **TEMP_UPGRADE** (temporary upgrade), this parameter specifies the time when the temporary upgrade expires. </p>
         * <br>
         * <p>If the order type is **RENEWCHANGE** (renewal with an upgrade or a downgrade) or **RENEW** (renewal), this parameter indicates the time when the renewal or renewal with an upgrade or a downgrade takes effect.</p>
         */
        @NameInMap("ReservationEndTime")
        public String reservationEndTime;

        /**
         * <p>The IPsec-VPN status of the order that has not taken effect. Valid values: </p>
         * <br>
         * <p>- **enable**: enabled</p>
         * <p>- **disable**: disabled</p>
         */
        @NameInMap("ReservationIpsec")
        public String reservationIpsec;

        /**
         * <p>The maximum number of concurrent SSL-VPN connections of the pending order.</p>
         */
        @NameInMap("ReservationMaxConnections")
        public Integer reservationMaxConnections;

        /**
         * <p>The type of the order that has not taken effect. Valid values: </p>
         * <br>
         * <p>- **RENEWCHANGE**: renewal with a specification change</p>
         * <p>- **TEMP_UPGRADE**: temporary upgrade</p>
         * <p>- **RENEW**: renewal</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>The bandwidth specification of the order that has not taken effect. Unit: Mbit/s.</p>
         */
        @NameInMap("ReservationSpec")
        public String reservationSpec;

        /**
         * <p>The SSL-VPN status of the order that has not taken effect. Valid values: </p>
         * <br>
         * <p>- **enable**: enabled</p>
         * <p>- **disable**: disabled</p>
         */
        @NameInMap("ReservationSsl")
        public String reservationSsl;

        /**
         * <p>The status of the pending order. </p>
         * <br>
         * <p>- **1**: indicates that the order for renewal or the order for renewal with a specification change has not taken effect.</p>
         * <p>- **2**: indicates that the order for a temporary upgrade has taken effect. After the temporary upgrade expires, the system restores the VPN gateway to its previous specifications. In this case, **ReservationIpsec**, **ReservationMaxConnections**, **ReservationSpec**, and **ReservationSsl** indicate the previous specification.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData self = new DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData setReservationEndTime(String reservationEndTime) {
            this.reservationEndTime = reservationEndTime;
            return this;
        }
        public String getReservationEndTime() {
            return this.reservationEndTime;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData setReservationIpsec(String reservationIpsec) {
            this.reservationIpsec = reservationIpsec;
            return this;
        }
        public String getReservationIpsec() {
            return this.reservationIpsec;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData setReservationMaxConnections(Integer reservationMaxConnections) {
            this.reservationMaxConnections = reservationMaxConnections;
            return this;
        }
        public Integer getReservationMaxConnections() {
            return this.reservationMaxConnections;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData setReservationSpec(String reservationSpec) {
            this.reservationSpec = reservationSpec;
            return this;
        }
        public String getReservationSpec() {
            return this.reservationSpec;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData setReservationSsl(String reservationSsl) {
            this.reservationSsl = reservationSsl;
            return this;
        }
        public String getReservationSsl() {
            return this.reservationSsl;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTagsTag extends TeaModel {
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

        public static DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTagsTag self = new DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTagsTag> tag;

        public static DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTags self = new DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTags setTag(java.util.List<DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway extends TeaModel {
        /**
         * <p>Indicates whether BGP routes are automatically advertised to the VPC. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("AutoPropagate")
        public Boolean autoPropagate;

        /**
         * <p>The payment status of the VPN gateway.</p>
         * <br>
         * <p>*   **Normal:** The VPN gateway is running as expected.</p>
         * <p>*   **FinancialLocked**: The VPN gateway is locked due to overdue payments.</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the VPN gateway.</p>
         * <br>
         * <p>The value is set to **POSTPAY**, which indicates the pay-as-you-go billing method.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The timestamp when the VPN gateway was created. Unit: milliseconds.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the VPN gateway.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>系统为VPN网关实例分配的用于创建IPsec-VPN连接的第二个IP地址。</p>
         * <br>
         * <p>仅支持创建双隧道模式IPsec-VPN连接的VPN网关实例会返回当前参数。</p>
         */
        @NameInMap("DisasterRecoveryInternetIp")
        public String disasterRecoveryInternetIp;

        /**
         * <p>VPN网关实例关联的第二个交换机ID。</p>
         * <br>
         * <p>仅支持创建双隧道模式IPsec-VPN连接的VPN网关实例会返回当前参数。</p>
         */
        @NameInMap("DisasterRecoveryVSwitchId")
        public String disasterRecoveryVSwitchId;

        /**
         * <p>The BGP status of the VPN gateway.</p>
         * <br>
         * <p>*   **true**: enabled</p>
         * <p>*   **false**: disabled</p>
         */
        @NameInMap("EnableBgp")
        public Boolean enableBgp;

        /**
         * <p>The timestamp when the VPN gateway expires. Unit: milliseconds.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The public IP address of the VPN gateway.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>Indicates whether IPsec-VPN is enabled for the VPN gateway.</p>
         * <br>
         * <p>*   **enable**: enabled</p>
         * <p>*   **disable**: disabled</p>
         */
        @NameInMap("IpsecVpn")
        public String ipsecVpn;

        /**
         * <p>The name of the VPN gateway.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network type of the VPN gateway.</p>
         * <br>
         * <p>*   **public**: public VPN gateway</p>
         * <p>*   **private**: private VPN gateway</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The information about the pending orders. </p>
         * <br>
         * <p>>  This parameter is returned only when **IncludeReservationData** is set to **true**.</p>
         */
        @NameInMap("ReservationData")
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData reservationData;

        /**
         * <p>The maximum bandwidth of the VPN gateway. **M** indicates Mbit/s.</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The number of SSL-VPN connections supported by the VPN gateway.</p>
         */
        @NameInMap("SslMaxConnections")
        public Long sslMaxConnections;

        /**
         * <p>Indicates whether SSL-VPN is enabled for the VPN gateway.</p>
         * <br>
         * <p>*   **enable**: enabled</p>
         * <p>*   **disable**: disabled</p>
         */
        @NameInMap("SslVpn")
        public String sslVpn;

        /**
         * <p>SSL-VPN连接的IP地址。</p>
         * <br>
         * <p>仅支持创建双隧道模式IPsec-VPN连接的公网网络类型的VPN网关实例开启SSL-VPN功能后，才会返回当前参数。</p>
         */
        @NameInMap("SslVpnInternetIp")
        public String sslVpnInternetIp;

        /**
         * <p>The status of the pending order.</p>
         * <br>
         * <p>*   **1**: indicates that the order for renewal or the order for renewal with a specification change has not taken effect.</p>
         * <p>*   **2**: indicates that the order for a temporary upgrade has taken effect. After the temporary upgrade expires, the system restores the VPN gateway to its previous specifications. In this case, **ReservationIpsec**, **ReservationMaxConnections**, **ReservationSpec**, and **ReservationSsl** indicate the previous specification.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The automatically generated tag of the VPN gateway.</p>
         * <br>
         * <p>*   **VpnEnableBgp**: indicates whether the VPN gateway supports BGP. Valid values:</p>
         * <br>
         * <p>    *   **true**: yes</p>
         * <p>    *   **false**: no</p>
         * <br>
         * <p>*   **VisuallySsl**: indicates whether the VPN gateway allows you to view information about connected SSL clients.</p>
         * <br>
         * <p>    *   **true**: yes</p>
         * <p>    *   **false**: no</p>
         * <br>
         * <p>*   **PbrPriority**: indicates whether the VPN gateway allows you to configure priorities for policy-based routes.</p>
         * <br>
         * <p>    *   **true**: yes</p>
         * <p>    *   **false**: no</p>
         * <br>
         * <p>*   **VpnNewImage**: indicates whether the VPN gateway is upgraded.</p>
         * <br>
         * <p>    *   **true**: yes</p>
         * <p>    *   **false**: no</p>
         * <br>
         * <p>*   **description**: the description of the VPN gateway. This parameter is for internal system use only.</p>
         * <br>
         * <p>*   **VpnVersion**: the version of the VPN gateway.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The list of tags added to the VPN gateway.</p>
         */
        @NameInMap("Tags")
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTags tags;

        /**
         * <p>The ID of the vSwitch to which the VPN gateway belongs.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC to which the VPN gateway belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the VPN gateway.</p>
         */
        @NameInMap("VpnGatewayId")
        public String vpnGatewayId;

        /**
         * <p>The type of the VPN gateway.</p>
         * <br>
         * <p>The value is set to **Normal**, which indicates a standard NAT gateway.</p>
         */
        @NameInMap("VpnType")
        public String vpnType;

        public static DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway self = new DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setAutoPropagate(Boolean autoPropagate) {
            this.autoPropagate = autoPropagate;
            return this;
        }
        public Boolean getAutoPropagate() {
            return this.autoPropagate;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setDisasterRecoveryInternetIp(String disasterRecoveryInternetIp) {
            this.disasterRecoveryInternetIp = disasterRecoveryInternetIp;
            return this;
        }
        public String getDisasterRecoveryInternetIp() {
            return this.disasterRecoveryInternetIp;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setDisasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
            this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
            return this;
        }
        public String getDisasterRecoveryVSwitchId() {
            return this.disasterRecoveryVSwitchId;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setEnableBgp(Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public Boolean getEnableBgp() {
            return this.enableBgp;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setIpsecVpn(String ipsecVpn) {
            this.ipsecVpn = ipsecVpn;
            return this;
        }
        public String getIpsecVpn() {
            return this.ipsecVpn;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setReservationData(DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData reservationData) {
            this.reservationData = reservationData;
            return this;
        }
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData getReservationData() {
            return this.reservationData;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setSslMaxConnections(Long sslMaxConnections) {
            this.sslMaxConnections = sslMaxConnections;
            return this;
        }
        public Long getSslMaxConnections() {
            return this.sslMaxConnections;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setSslVpn(String sslVpn) {
            this.sslVpn = sslVpn;
            return this;
        }
        public String getSslVpn() {
            return this.sslVpn;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setSslVpnInternetIp(String sslVpnInternetIp) {
            this.sslVpnInternetIp = sslVpnInternetIp;
            return this;
        }
        public String getSslVpnInternetIp() {
            return this.sslVpnInternetIp;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setTags(DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTags getTags() {
            return this.tags;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setVpnType(String vpnType) {
            this.vpnType = vpnType;
            return this;
        }
        public String getVpnType() {
            return this.vpnType;
        }

    }

    public static class DescribeVpnGatewaysResponseBodyVpnGateways extends TeaModel {
        @NameInMap("VpnGateway")
        public java.util.List<DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway> vpnGateway;

        public static DescribeVpnGatewaysResponseBodyVpnGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseBodyVpnGateways self = new DescribeVpnGatewaysResponseBodyVpnGateways();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseBodyVpnGateways setVpnGateway(java.util.List<DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway> vpnGateway) {
            this.vpnGateway = vpnGateway;
            return this;
        }
        public java.util.List<DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway> getVpnGateway() {
            return this.vpnGateway;
        }

    }

}
