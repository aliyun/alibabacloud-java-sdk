// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the routing automatic propagation feature is enabled for the VPN gateway. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPropagate")
    public Boolean autoPropagate;

    /**
     * <p>The payment status of the VPN gateway. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: Normal.</p>
     * </li>
     * <li><p><strong>FinancialLocked</strong>: locked due to overdue payment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The billing method. Value:</p>
     * <p>&lt;props=&quot;intl&quot;&gt;<strong>POSTPAY</strong>: pay-as-you-go billing method.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;<strong>POSTPAY</strong>: pay-as-you-go billing method.</p>
     * <p>&lt;props=&quot;china&quot;&gt;<strong>Prepay</strong>: subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>中国站示例值：Prepay，国际站示例值：POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The timestamp when the VPN gateway was created. Unit: milliseconds.</p>
     * <p>The timestamp follows the UNIX time format, which represents the total number of milliseconds elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1495382400000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The description of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpngatewaydescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The second IP address assigned by the system to the VPN gateway instance for creating IPsec-VPN connections.</p>
     * <p>This parameter is returned only for VPN gateway instances that support creating dual-tunnel IPsec-VPN connections.</p>
     * 
     * <strong>example:</strong>
     * <p>47.91.XX.XX</p>
     */
    @NameInMap("DisasterRecoveryInternetIp")
    public String disasterRecoveryInternetIp;

    /**
     * <p>The ID of the second vSwitch associated with the VPN gateway instance.</p>
     * <p>This parameter is returned only for VPN gateway instances that support creating dual-tunnel IPsec-VPN connections.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-p0w95ql6tmr2ludkt****</p>
     */
    @NameInMap("DisasterRecoveryVSwitchId")
    public String disasterRecoveryVSwitchId;

    /**
     * <p>The enabling status of the BGP feature for the VPN gateway. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBgp")
    public Boolean enableBgp;

    /**
     * <p>The expiration timestamp of the VPN gateway. Unit: milliseconds.</p>
     * <p>The timestamp follows the UNIX time format, which represents the total number of milliseconds elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1544666102000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EniInstanceIds")
    public DescribeVpnGatewayResponseBodyEniInstanceIds eniInstanceIds;

    /**
     * <p>The type of the VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>Traditional</strong>: traditional VPN gateway that supports both IPsec and SSL features.</li>
     * <li><strong>Enhanced.SiteToSite</strong>: enhanced site-to-cloud VPN gateway that supports only the IPsec feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enhanced.SiteToSite</p>
     */
    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <ul>
     * <li><p>If the VPN gateway instance supports creating single-tunnel IPsec-VPN connections, this address is the IP address of the VPN gateway instance and can be used to create IPsec-VPN connections or SSL-VPN connections.</p>
     * </li>
     * <li><p>If the VPN gateway instance supports creating dual-tunnel IPsec-VPN connections, this address is the first IP address used to create IPsec-VPN connections and cannot be used to create SSL-VPN connections.</p>
     * <p>  If the VPN gateway instance supports creating dual-tunnel IPsec-VPN connections, the system assigns two IPsec IP addresses to the VPN gateway instance for creating dual-tunnel IPsec-VPN connections.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>47.22.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>Indicates whether the IPsec-VPN feature is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>enable</strong>: enabled.</p>
     * </li>
     * <li><p><strong>disable</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("IpsecVpn")
    public String ipsecVpn;

    /**
     * <p>The name of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpngatewayname</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the VPN gateway.</p>
     * <ul>
     * <li><strong>public</strong>: public VPN gateway.</li>
     * <li><strong>private</strong>: private VPN gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>27E4E088-8DE0-4672-BF5C-0A412389DB9E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The pending order data.</p>
     * <blockquote>
     * <p>This parameter is returned only when <strong>IncludeReservationData</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     */
    @NameInMap("ReservationData")
    public DescribeVpnGatewayResponseBodyReservationData reservationData;

    /**
     * <p>The ID of the resource group to which the VPN gateway belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource group information.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The bandwidth specification of the VPN gateway. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The maximum number of concurrent SSL-VPN connections.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SslMaxConnections")
    public Long sslMaxConnections;

    /**
     * <p>The enabling status of the SSL-VPN feature. Valid values:</p>
     * <ul>
     * <li><p><strong>enable</strong>: enabled.</p>
     * </li>
     * <li><p><strong>disable</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("SslVpn")
    public String sslVpn;

    /**
     * <p>The IP address of the SSL-VPN connection.</p>
     * <p>This parameter is returned only when the SSL-VPN feature is enabled on a VPN gateway instance of the public network type that supports creating dual-tunnel IPsec-VPN connections.</p>
     * 
     * <strong>example:</strong>
     * <p>47.74.XX.XX</p>
     */
    @NameInMap("SslVpnInternetIp")
    public String sslVpnInternetIp;

    /**
     * <p>The status of the VPN gateway. Valid values:</p>
     * <ul>
     * <li><p><strong>init</strong>: initializing.</p>
     * </li>
     * <li><p><strong>provisioning</strong>: preparing.</p>
     * </li>
     * <li><p><strong>active</strong>: Normal.</p>
     * </li>
     * <li><p><strong>updating</strong>: updating.</p>
     * </li>
     * <li><p><strong>deleting</strong>: deleting.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>init</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The labels automatically generated by the system for the VPN gateway.</p>
     * <ul>
     * <li><strong>VpnEnableBgp</strong>: indicates whether the VPN gateway supports the BGP feature.<ul>
     * <li><strong>true</strong>: Supported.</li>
     * <li><strong>false</strong>: Not supported.</li>
     * </ul>
     * </li>
     * <li><strong>VisuallySsl</strong>: indicates whether the VPN gateway supports viewing connection information of SSL clients.<ul>
     * <li><strong>true</strong>: Supported.</li>
     * <li><strong>false</strong>: Not supported.</li>
     * </ul>
     * </li>
     * <li><strong>PbrPriority</strong>: indicates whether the VPN gateway supports configuring policy priority for policy-based routing.<ul>
     * <li><strong>true</strong>: Supported.</li>
     * <li><strong>false</strong>: Not supported.</li>
     * </ul>
     * </li>
     * <li><strong>VpnNewImage</strong>: indicates whether the VPN gateway is a new-generation VPN gateway.<ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * </li>
     * <li><strong>description</strong>: the description of the VPN gateway, which is used only for internal system purposes.</li>
     * <li><strong>VpnVersion</strong>: the version number of the VPN gateway.</li>
     * <li><strong>IDaaSNewVersion</strong>: indicates whether the VPN gateway supports attaching to an EIAM 2.0 instance.<ul>
     * <li><strong>true</strong>: Supported.</li>
     * <li><strong>false</strong>: Not supported.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;VpnEnableBgp\&quot;:\&quot;true\&quot;,\&quot;VisuallySsl\&quot;:\&quot;true\&quot;,\&quot;PbrPriority\&quot;:\&quot;true\&quot;,\&quot;VpnNewImage\&quot;:\&quot;true\&quot;,\&quot;description\&quot;:\&quot;转发1.3.24\&quot;,\&quot;VpnVersion\&quot;:\&quot;v1.2.4\&quot;,\&quot;IDaaSNewVersion\&quot;:\&quot;true\&quot;}</p>
     */
    @NameInMap("Tag")
    public String tag;

    @NameInMap("Tags")
    public DescribeVpnGatewayResponseBodyTags tags;

    /**
     * <p>The ID of the vSwitch to which the VPN gateway belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1dmzugdikc6hdgx****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which the VPN gateway belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp19m2yx1m5q0avyq****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The instance ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1r3v1xqkl0w519g****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    /**
     * <p>&lt;props=&quot;intl&quot;&gt;The type of the VPN gateway. Value: <strong>Normal</strong>, which indicates a standard VPN gateway.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The type of the VPN gateway. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: standard.</p>
     * </li>
     * <li><p><strong>NationalStandard</strong>: Chinese SM algorithm-based.</p>
     * </li>
     * </ul>
     * <p>.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
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

    public DescribeVpnGatewayResponseBody setEniInstanceIds(DescribeVpnGatewayResponseBodyEniInstanceIds eniInstanceIds) {
        this.eniInstanceIds = eniInstanceIds;
        return this;
    }
    public DescribeVpnGatewayResponseBodyEniInstanceIds getEniInstanceIds() {
        return this.eniInstanceIds;
    }

    public DescribeVpnGatewayResponseBody setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
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

    public DescribeVpnGatewayResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static class DescribeVpnGatewayResponseBodyEniInstanceIds extends TeaModel {
        @NameInMap("EniInstanceId")
        public java.util.List<String> eniInstanceId;

        public static DescribeVpnGatewayResponseBodyEniInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseBodyEniInstanceIds self = new DescribeVpnGatewayResponseBodyEniInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayResponseBodyEniInstanceIds setEniInstanceId(java.util.List<String> eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public java.util.List<String> getEniInstanceId() {
            return this.eniInstanceId;
        }

    }

    public static class DescribeVpnGatewayResponseBodyReservationData extends TeaModel {
        /**
         * <p>If the pending order type is <strong>TEMP_UPGRADE</strong> (temporary upgrade), this parameter indicates the revert time for the temporary upgrade.</p>
         * <p>If the pending order type is <strong>RENEWCHANGE</strong> (renewal with specification change) or <strong>RENEW</strong> (renewal), this parameter indicates the effective period when the renewal or renewal with specification change takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-20T16:00:00Z</p>
         */
        @NameInMap("ReservationEndTime")
        public String reservationEndTime;

        /**
         * <p>The enabling status of the IPsec-VPN feature for the pending order. Valid values:</p>
         * <ul>
         * <li><p><strong>enable</strong>: enabled.</p>
         * </li>
         * <li><p><strong>disable</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("ReservationIpsec")
        public String reservationIpsec;

        /**
         * <p>The maximum number of concurrent SSL-VPN connections of the pending order.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReservationMaxConnections")
        public Integer reservationMaxConnections;

        /**
         * <p>The type of the pending order. Valid values:</p>
         * <ul>
         * <li><p><strong>RENEWCHANGE</strong>: renewal with specification change.</p>
         * </li>
         * <li><p><strong>TEMP_UPGRADE</strong>: temporary upgrade.</p>
         * </li>
         * <li><p><strong>RENEW</strong>: renewal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEMP_UPGRADE</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>The bandwidth specification of the pending order. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReservationSpec")
        public String reservationSpec;

        /**
         * <p>The enabling status of the SSL-VPN feature for the pending order. Valid values:</p>
         * <ul>
         * <li><p><strong>enable</strong>: enabled.</p>
         * </li>
         * <li><p><strong>disable</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("ReservationSsl")
        public String reservationSsl;

        /**
         * <p>The status of the pending order. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: The renewal or renewal with specification change order has not taken effect.</p>
         * </li>
         * <li><p><strong>2</strong>: The temporary upgrade order has taken effect. After the restoration time is reached, the system restores the VPN gateway to the specification before the temporary upgrade. In this case, <strong>ReservationIpsec</strong>, <strong>ReservationMaxConnections</strong>, <strong>ReservationSpec</strong>, and <strong>ReservationSsl</strong> indicate the specifications before the temporary upgrade.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
        @NameInMap("Key")
        public String key;

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
