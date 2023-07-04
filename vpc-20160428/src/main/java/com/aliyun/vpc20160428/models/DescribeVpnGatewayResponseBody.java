// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayResponseBody extends TeaModel {
    /**
     * <p>The billing method of the VPN gateway. Valid values:</p>
     * <br>
     * <p>Only **POSTPAY** is returned, which indicates the pay-as-you-go billing method.</p>
     */
    @NameInMap("AutoPropagate")
    public Boolean autoPropagate;

    /**
     * <p>The status of the SSL-VPN feature. Valid values:</p>
     * <br>
     * <p>*   **enable**: enabled</p>
     * <p>*   **disable**: disabled</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The ID of the VPN gateway.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Indicates whether BGP routes are automatically advertised to VPCs. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Indicates whether BGP is enabled for the VPN gateway. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("DisasterRecoveryInternetIp")
    public String disasterRecoveryInternetIp;

    @NameInMap("DisasterRecoveryVSwitchId")
    public String disasterRecoveryVSwitchId;

    /**
     * <p>The payment status of the VPN gateway. Valid values:</p>
     * <br>
     * <p>*   **Normal**: The VPN gateway is normal.</p>
     * <p>*   **FinancialLocked**: The VPN gateway is locked due to overdue payments.</p>
     */
    @NameInMap("EnableBgp")
    public Boolean enableBgp;

    /**
     * <p>The ID of the vSwitch to which the VPN gateway belongs.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The timestamp that indicates when the VPN gateway was created. Unit: milliseconds.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The timestamp that indicates when the VPN gateway expires. Unit: milliseconds.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("IpsecVpn")
    public String ipsecVpn;

    /**
     * <p>The information about pending orders.</p>
     * <br>
     * <p>>  This parameter is returned only when **IncludeReservationData** is set to **true**.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The description of the VPN gateway.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the pending order. Valid values:</p>
     * <br>
     * <p>*   **1**: indicates that the order of the renewal or specification change has not taken effect.</p>
     * <p>*   **2**: indicates that the order of the temporary upgrade has taken effect. After the temporary upgrade expires, the system restores the VPN gateway to its previous specification. In this case, **ReservationIpsec**, **ReservationMaxConnections**, **ReservationSpec**, and **ReservationSsl** indicate the previous specifications.</p>
     */
    @NameInMap("ReservationData")
    public DescribeVpnGatewayResponseBodyReservationData reservationData;

    /**
     * <p>The public IP address of the VPN gateway.</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The maximum bandwidth of the VPN gateway. Unit: Mbit/s.</p>
     */
    @NameInMap("SslMaxConnections")
    public Long sslMaxConnections;

    /**
     * <p>The name of the VPN gateway.</p>
     */
    @NameInMap("SslVpn")
    public String sslVpn;

    @NameInMap("SslVpnInternetIp")
    public String sslVpnInternetIp;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the VPN gateway belongs.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the IPsec-VPN feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **enable**: enabled</p>
     * <p>*   **disable**: disabled</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The tag key</p>
     */
    @NameInMap("Tags")
    public DescribeVpnGatewayResponseBodyTags tags;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The maximum number of concurrent SSL-VPN connections.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

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
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    /**
     * <p>The status of the VPN gateway. Valid values:</p>
     * <br>
     * <p>*   **init**: being initialized</p>
     * <p>*   **provisioning**: being prepared</p>
     * <p>*   **active**: active</p>
     * <p>*   **updating**: being updated</p>
     * <p>*   **deleting**: being deleted</p>
     */
    @NameInMap("VpnType")
    public String vpnType;

    public static DescribeVpnGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewayResponseBody self = new DescribeVpnGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewayResponseBody setAutoPropagate(Boolean autoPropagate) {
        this.autoPropagate = autoPropagate;
        return this;
    }
    public Boolean getAutoPropagate() {
        return this.autoPropagate;
    }

    public DescribeVpnGatewayResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeVpnGatewayResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeVpnGatewayResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeVpnGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVpnGatewayResponseBody setDisasterRecoveryInternetIp(String disasterRecoveryInternetIp) {
        this.disasterRecoveryInternetIp = disasterRecoveryInternetIp;
        return this;
    }
    public String getDisasterRecoveryInternetIp() {
        return this.disasterRecoveryInternetIp;
    }

    public DescribeVpnGatewayResponseBody setDisasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
        this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
        return this;
    }
    public String getDisasterRecoveryVSwitchId() {
        return this.disasterRecoveryVSwitchId;
    }

    public DescribeVpnGatewayResponseBody setEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }
    public Boolean getEnableBgp() {
        return this.enableBgp;
    }

    public DescribeVpnGatewayResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeVpnGatewayResponseBody setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public DescribeVpnGatewayResponseBody setIpsecVpn(String ipsecVpn) {
        this.ipsecVpn = ipsecVpn;
        return this;
    }
    public String getIpsecVpn() {
        return this.ipsecVpn;
    }

    public DescribeVpnGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVpnGatewayResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeVpnGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnGatewayResponseBody setReservationData(DescribeVpnGatewayResponseBodyReservationData reservationData) {
        this.reservationData = reservationData;
        return this;
    }
    public DescribeVpnGatewayResponseBodyReservationData getReservationData() {
        return this.reservationData;
    }

    public DescribeVpnGatewayResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeVpnGatewayResponseBody setSslMaxConnections(Long sslMaxConnections) {
        this.sslMaxConnections = sslMaxConnections;
        return this;
    }
    public Long getSslMaxConnections() {
        return this.sslMaxConnections;
    }

    public DescribeVpnGatewayResponseBody setSslVpn(String sslVpn) {
        this.sslVpn = sslVpn;
        return this;
    }
    public String getSslVpn() {
        return this.sslVpn;
    }

    public DescribeVpnGatewayResponseBody setSslVpnInternetIp(String sslVpnInternetIp) {
        this.sslVpnInternetIp = sslVpnInternetIp;
        return this;
    }
    public String getSslVpnInternetIp() {
        return this.sslVpnInternetIp;
    }

    public DescribeVpnGatewayResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVpnGatewayResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeVpnGatewayResponseBody setTags(DescribeVpnGatewayResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeVpnGatewayResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeVpnGatewayResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeVpnGatewayResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVpnGatewayResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public DescribeVpnGatewayResponseBody setVpnType(String vpnType) {
        this.vpnType = vpnType;
        return this;
    }
    public String getVpnType() {
        return this.vpnType;
    }

    public static class DescribeVpnGatewayResponseBodyReservationData extends TeaModel {
        /**
         * <p>The custom tag of the VPN gateway.</p>
         */
        @NameInMap("ReservationEndTime")
        public String reservationEndTime;

        /**
         * <p>The bandwidth specification of the pending order. Unit: Mbit/s.</p>
         */
        @NameInMap("ReservationIpsec")
        public String reservationIpsec;

        /**
         * <p>If the order type is **TEMP_UPGRADE** (temporary upgrade), this parameter indicates the time when the temporary upgrade expires.</p>
         * <br>
         * <p>If the order type is **RENEWCHANGE** (specification change) or **RENEW** (renewal), this parameter indicates the time when the renewal or specification change takes effect.</p>
         */
        @NameInMap("ReservationMaxConnections")
        public Integer reservationMaxConnections;

        /**
         * <p>The IPsec-VPN status of the pending order. Valid values:</p>
         * <br>
         * <p>*   **enable**: enabled</p>
         * <p>*   **disable**: disabled</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>The SSL-VPN status of the pending order. Valid values:</p>
         * <br>
         * <p>*   **enable**: enabled</p>
         * <p>*   **disable**: disabled</p>
         */
        @NameInMap("ReservationSpec")
        public String reservationSpec;

        /**
         * <p>The maximum number of concurrent SSL-VPN connections for the pending order.</p>
         */
        @NameInMap("ReservationSsl")
        public String reservationSsl;

        /**
         * <p>The type of the pending order. Valid values:</p>
         * <br>
         * <p>*   **RENEWCHANGE**: renewal with upgrade or downgrade</p>
         * <p>*   **TEMP_UPGRADE**: temporary upgrade</p>
         * <p>*   **RENEW**: renewal</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeVpnGatewayResponseBodyReservationData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseBodyReservationData self = new DescribeVpnGatewayResponseBodyReservationData();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationEndTime(String reservationEndTime) {
            this.reservationEndTime = reservationEndTime;
            return this;
        }
        public String getReservationEndTime() {
            return this.reservationEndTime;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationIpsec(String reservationIpsec) {
            this.reservationIpsec = reservationIpsec;
            return this;
        }
        public String getReservationIpsec() {
            return this.reservationIpsec;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationMaxConnections(Integer reservationMaxConnections) {
            this.reservationMaxConnections = reservationMaxConnections;
            return this;
        }
        public Integer getReservationMaxConnections() {
            return this.reservationMaxConnections;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationSpec(String reservationSpec) {
            this.reservationSpec = reservationSpec;
            return this;
        }
        public String getReservationSpec() {
            return this.reservationSpec;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationSsl(String reservationSsl) {
            this.reservationSsl = reservationSsl;
            return this;
        }
        public String getReservationSsl() {
            return this.reservationSsl;
        }

        public DescribeVpnGatewayResponseBodyReservationData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVpnGatewayResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The network type of the VPN gateway. </p>
         * <br>
         * <p>- **public**: public VPN gateway</p>
         * <p>- **private**: private VPN gateway</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVpnGatewayResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseBodyTagsTag self = new DescribeVpnGatewayResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpnGatewayResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpnGatewayResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVpnGatewayResponseBodyTagsTag> tag;

        public static DescribeVpnGatewayResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseBodyTags self = new DescribeVpnGatewayResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayResponseBodyTags setTag(java.util.List<DescribeVpnGatewayResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpnGatewayResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
