// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayResponseBody extends TeaModel {
    /**
     * <p>Indicates whether BGP routes are automatically advertised to the VPC. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
     * <li><strong>Normal</strong></li>
     * <li><strong>FinancialLocked</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The billing method. Valid value:</p>
     * <p><strong>POSTPAY</strong>: pay-as-you-go</p>
     * 
     * <strong>example:</strong>
     * <p>China site (aliyun.com): Prepay. International site (alibabacloud.com): POSTPAY.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The timestamp when the VPN gateway was created. Unit: milliseconds.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
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
     * <p>The second IP address assigned by the system to create an IPsec-VPN connection.</p>
     * <p>This parameter is returned only when the VPN gateway supports the dual-tunnel mode.</p>
     * 
     * <strong>example:</strong>
     * <p>47.91.XX.XX</p>
     */
    @NameInMap("DisasterRecoveryInternetIp")
    public String disasterRecoveryInternetIp;

    /**
     * <p>The ID of the second vSwitch associated with the VPN gateway.</p>
     * <p>This parameter is returned only when the VPN gateway supports the dual-tunnel mode.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-p0w95ql6tmr2ludkt****</p>
     */
    @NameInMap("DisasterRecoveryVSwitchId")
    public String disasterRecoveryVSwitchId;

    /**
     * <p>Indicates whether BGP is enabled for the VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBgp")
    public Boolean enableBgp;

    /**
     * <p>The timestamp when the VPN gateway expires. Unit: milliseconds.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1544666102000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ENIs created by the system for the VPN gateway.</p>
     */
    @NameInMap("EniInstanceIds")
    public DescribeVpnGatewayResponseBodyEniInstanceIds eniInstanceIds;

    /**
     * <ul>
     * <li><p>If the VPN gateway supports IPsec-VPN connections in single-tunnel mode, the address is the IP address of the VPN gateway and can be used to create an IPsec-VPN connection or an SSL-VPN connection.</p>
     * </li>
     * <li><p>If the VPN gateway supports IPsec-VPN connections in dual-tunnel mode, the address is the first IP address used to create an IPsec-VPN connection. The address cannot be used to create an SSL-VPN connection.</p>
     * <p>If the VPN gateway supports IPsec-VPN connections in dual-tunnel mode, the system assigns two IP addresses to the VPN gateway to create two encrypted tunnels.</p>
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
     * <li><strong>enable</strong></li>
     * <li><strong>disable</strong></li>
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
     * <li><strong>public</strong></li>
     * <li><strong>private</strong></li>
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
     * <p>The information about pending orders.</p>
     * <blockquote>
     * <p>This set of parameters is returned only when <strong>IncludeReservationData</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     */
    @NameInMap("ReservationData")
    public DescribeVpnGatewayResponseBodyReservationData reservationData;

    /**
     * <p>The ID of the resource group to which the VPN gateway belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The maximum bandwidth of the VPN gateway. Unit: Mbit/s.</p>
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
     * <p>The status of the SSL-VPN feature. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong></li>
     * <li><strong>disable</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("SslVpn")
    public String sslVpn;

    /**
     * <p>The IP address of the SSL-VPN connection.</p>
     * <p>This parameter is returned only when the VPN gateway is a public VPN gateway and supports only the single-tunnel mode. In addition, the VPN gateway must have the SSL-VPN feature enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>47.74.XX.XX</p>
     */
    @NameInMap("SslVpnInternetIp")
    public String sslVpnInternetIp;

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
     * <p>init</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The automatically generated tag of the VPN gateway.</p>
     * <ul>
     * <li><p><strong>VpnEnableBgp</strong>: indicates whether the VPN gateway supports BGP. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * </li>
     * <li><p><strong>VisuallySsl</strong>: indicates whether the VPN gateway allows you to view information about connected SSL clients.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * </li>
     * <li><p><strong>PbrPriority</strong>: indicates whether the VPN gateway allows you to configure priorities for policy-based routes.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * </li>
     * <li><p><strong>VpnNewImage</strong>: indicates whether the VPN gateway is upgraded.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * </li>
     * <li><p><strong>description</strong></p>
     * </li>
     * <li><p><strong>VpnVersion</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;VpnEnableBgp\&quot;:\&quot;true\&quot;,\&quot;VisuallySsl\&quot;:\&quot;true\&quot;,\&quot;PbrPriority\&quot;:\&quot;true\&quot;,\&quot;VpnNewImage\&quot;:\&quot;true\&quot;,\&quot;description\&quot;:\&quot;forwarding1.3.7\&quot;,\&quot;VpnVersion\&quot;:\&quot;v1.2.4\&quot;}</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The tag value.</p>
     */
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
     * <p>The ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1r3v1xqkl0w519g****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    /**
     * <p>The type of the VPN gateway.</p>
     * <p>Only <strong>Normal</strong> may be returned, which indicates a standard VPN gateway.</p>
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
         * <p>If the order type is <strong>TEMP_UPGRADE</strong> (temporary upgrade), this parameter specifies the time when the temporary upgrade expires.</p>
         * <p>If the order type is <strong>RENEWCHANGE</strong> (renewal with a specification change) or <strong>RENEW</strong> (renewal), this parameter indicates the time when the renewal or renewal with a specification change takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-20T16:00:00Z</p>
         */
        @NameInMap("ReservationEndTime")
        public String reservationEndTime;

        /**
         * <p>The IPsec-VPN status of the pending order. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong></li>
         * <li><strong>disable</strong></li>
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
         * <li><strong>RENEWCHANGE</strong>: renewal with upgrade or downgrade</li>
         * <li><strong>TEMP_UPGRADE</strong>: temporary upgrade</li>
         * <li><strong>RENEW</strong>: renewal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEMP_UPGRADE</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>The bandwidth of the pending order. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReservationSpec")
        public String reservationSpec;

        /**
         * <p>The SSL-VPN status of the pending order. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong></li>
         * <li><strong>disable</strong></li>
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
         * <li><strong>1</strong>: indicates that the order of the renewal or specification change has not taken effect.</li>
         * <li><strong>2</strong>: indicates that the order is an order for temporary upgrade and the order has taken effect. After the temporary upgrade expires, the system restores the VPN gateway to its previous specifications. In this case, <strong>ReservationIpsec</strong>, <strong>ReservationMaxConnections</strong>, <strong>ReservationSpec</strong>, and <strong>ReservationSsl</strong> indicate the previous specification.</li>
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>bbb</p>
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
