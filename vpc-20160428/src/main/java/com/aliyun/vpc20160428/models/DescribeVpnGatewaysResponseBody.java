// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewaysResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DF11D6F6-E35A-41C3-9B20-6FC8A901FE65</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The VPN gateways.</p>
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

    public static class DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayEniInstanceIds extends TeaModel {
        @NameInMap("EniInstanceId")
        public java.util.List<String> eniInstanceId;

        public static DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayEniInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayEniInstanceIds self = new DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayEniInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayEniInstanceIds setEniInstanceId(java.util.List<String> eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public java.util.List<String> getEniInstanceId() {
            return this.eniInstanceId;
        }

    }

    public static class DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData extends TeaModel {
        /**
         * <p>If the value of ReservationOrderType is <strong>TEMP_UPGRADE</strong>, this parameter indicates the time when the temporary upgrade expires.</p>
         * <p>If the value of ReservationOrderType is <strong>RENEWCHANGE</strong> or <strong>RENEW</strong>, this parameter indicates the time when the renewal or renewal with a specification change takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-20T16:00:00Z</p>
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
         * <p>The type of the order that has not taken effect. Valid values:</p>
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
         * <p>The status of the pending order.</p>
         * <ul>
         * <li><strong>1</strong>: indicates that the order for renewal or the order for renewal with a specification change has not taken effect.</li>
         * <li><strong>2</strong>: indicates that the order of the temporary upgrade has taken effect. After the temporary upgrade expires, the system restores the VPN gateway to its previous specifications. In this case, the values of <strong>ReservationIpsec</strong>, <strong>ReservationMaxConnections</strong>, <strong>ReservationSpec</strong>, and <strong>ReservationSsl</strong> indicate the previous specifications of the VPN gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
         * <p>Indicates whether BGP routes are automatically advertised to the VPC.</p>
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
         * <p>The payment status of the VPN gateway.</p>
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
         * <p>The billing method of the VPN gateway.</p>
         * <p>Only <strong>POSTPAY</strong> may be returned, which indicates the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>Example value for the China site (aliyun.com): Prepay. Example value for the International site (alibabacloud.com): POSTPAY.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The timestamp generated when the VPN gateway was created. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1515383700000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The second IP address that is assigned to the VPN gateway to create IPsec-VPN connections.</p>
         * <p>This parameter is returned only if the VPN gateway supports IPsec-VPN connections in dual-tunnel mode.</p>
         * 
         * <strong>example:</strong>
         * <p>47.91.XX.XX</p>
         */
        @NameInMap("DisasterRecoveryInternetIp")
        public String disasterRecoveryInternetIp;

        /**
         * <p>The ID of the second vSwitch that is associated with the VPN gateway.</p>
         * <p>This parameter is returned only if the VPN gateway supports IPsec-VPN connections in dual-tunnel mode.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-p0w95ql6tmr2ludkt****</p>
         */
        @NameInMap("DisasterRecoveryVSwitchId")
        public String disasterRecoveryVSwitchId;

        /**
         * <p>The BGP status of the VPN gateway. Valid values:</p>
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
         * <p>The timestamp generated when the VPN gateway expires. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1518105600000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The ENIs created by the system for the VPN gateway.</p>
         */
        @NameInMap("EniInstanceIds")
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayEniInstanceIds eniInstanceIds;

        /**
         * <ul>
         * <li><p>If the VPN gateway supports IPsec-VPN connections in single-tunnel mode, the value of this parameter is the IP address of the VPN gateway, which can be used to create IPsec-VPN or SSL-VPN connections.</p>
         * </li>
         * <li><p>If the VPN gateway supports IPsec-VPN connections in dual-tunnel mode, the value of this parameter is the first IP address that is used to create an IPsec-VPN connection. The IP address cannot be used to create SSL-VPN connections.</p>
         * <p>If the VPN gateway supports IPsec-VPN connections in dual-tunnel mode, the system assigns two IPsec addresses to the VPN gateway to create IPsec-VPN connections in dual-tunnel mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>47.12.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>Indicates whether IPsec-VPN is enabled for the VPN gateway. Valid values:</p>
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
         * <p>test</p>
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
         * <p>The information about pending orders.</p>
         * <blockquote>
         * <p>This parameter is returned only if <strong>IncludeReservationData</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         */
        @NameInMap("ReservationData")
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData reservationData;

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
         * <p>The maximum bandwidth of the VPN gateway. Unit: <strong>M</strong>, which indicates Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5M</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The number of SSL-VPN connections supported by the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SslMaxConnections")
        public Long sslMaxConnections;

        /**
         * <p>Indicates whether SSL-VPN is enabled for the VPN gateway. Valid values:</p>
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
         * <p>This parameter is returned only if the VPN gateway is a public VPN gateway and supports IPsec-VPN connections in dual-tunnel mode. In addition, SSL-VPN must be enabled for the VPN gateway.</p>
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
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag that is automatically generated for the VPN gateway. The tag consists of the following parameters:</p>
         * <ul>
         * <li><p><strong>VpnEnableBgp</strong>: indicates whether the VPN gateway supports BGP. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>VisuallySsl</strong>: indicates whether the VPN gateway allows you to view the connection information of SSL clients. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>PbrPriority</strong>: indicates whether the VPN gateway allows you to configure priorities for policy-based routes. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>VpnNewImage</strong>: indicates whether the VPN gateway is upgraded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong>: does not query only SQL statements that need to be optimized.</li>
         * </ul>
         * </li>
         * <li><p><strong>description</strong>: the description of the VPN gateway. This parameter is only for internal use.</p>
         * </li>
         * <li><p><strong>VpnVersion</strong>: the version of the VPN gateway.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;VpnEnableBgp\&quot;:\&quot;true\&quot;,\&quot;VisuallySsl\&quot;:\&quot;true\&quot;,\&quot;PbrPriority\&quot;:\&quot;true\&quot;,\&quot;VpnNewImage\&quot;:\&quot;true\&quot;,\&quot;description\&quot;:\&quot;forwarding1.3.7\&quot;,\&quot;VpnVersion\&quot;:\&quot;v1.2.4\&quot;}</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The tags that are added to the VPN gateway.</p>
         */
        @NameInMap("Tags")
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTags tags;

        /**
         * <p>The ID of the vSwitch to which the VPN gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp15lbk8sgtr6r5b0****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC to which the VPN gateway belongs.</p>
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

        /**
         * <p>The type of VPN gateway.</p>
         * <p>Only <strong>Normal</strong> may be returned, which indicates a standard VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
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

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setEniInstanceIds(DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayEniInstanceIds eniInstanceIds) {
            this.eniInstanceIds = eniInstanceIds;
            return this;
        }
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayEniInstanceIds getEniInstanceIds() {
            return this.eniInstanceIds;
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

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
