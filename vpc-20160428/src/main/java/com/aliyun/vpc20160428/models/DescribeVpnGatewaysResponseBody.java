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
         * <p>如果未生效订单类型为<strong>TEMP_UPGRADE</strong>（临时升配）时，该参数表示为临时升配的还原时间。</p>
         * <p>如果未生效订单类型为<strong>RENEWCHANGE</strong>（续费变配）或<strong>RENEW</strong>（续费）时，该参数表示为续费或续费变配开始生效时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-20T16:00:00Z</p>
         */
        @NameInMap("ReservationEndTime")
        public String reservationEndTime;

        /**
         * <p>未生效订单IPsec-VPN功能开启状态。</p>
         * <ul>
         * <li><p><strong>enable</strong>：已开启。</p>
         * </li>
         * <li><p><strong>disable</strong>：未开启。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("ReservationIpsec")
        public String reservationIpsec;

        /**
         * <p>未生效订单SSL-VPN并发连接用户数的规格。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReservationMaxConnections")
        public Integer reservationMaxConnections;

        /**
         * <p>未生效订单类型。</p>
         * <ul>
         * <li><p><strong>RENEWCHANGE</strong>：续费变配。</p>
         * </li>
         * <li><p><strong>TEMP_UPGRADE</strong>：临时升配。</p>
         * </li>
         * <li><p><strong>RENEW</strong>：续费。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEMP_UPGRADE</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>未生效订单的带宽规格。单位：Mbps。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ReservationSpec")
        public String reservationSpec;

        /**
         * <p>未生效订单SSL-VPN功能开启状态。</p>
         * <ul>
         * <li><p><strong>enable</strong>：已开启。</p>
         * </li>
         * <li><p><strong>disable</strong>：未开启。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("ReservationSsl")
        public String reservationSsl;

        /**
         * <p>未生效订单状态。</p>
         * <ul>
         * <li><p><strong>1</strong>：表示续费或续费变配的订单未生效。</p>
         * </li>
         * <li><p><strong>2</strong>：表示临时升配的订单已生效。在到达还原时间后，系统会将VPN网关规格恢复到临时升配前的规格。此时<strong>ReservationIpsec</strong>、<strong>ReservationMaxConnections</strong>、<strong>ReservationSpec</strong>、<strong>ReservationSsl</strong>表示为VPN网关临时升配前的规格。</p>
         * </li>
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
         * <p>标签键。</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值。</p>
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
         * <p>是否已开启VPN网关的路由自动传播功能。</p>
         * <ul>
         * <li><p><strong>true</strong>：已开启。</p>
         * </li>
         * <li><p><strong>false</strong>：未开启。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPropagate")
        public Boolean autoPropagate;

        /**
         * <p>VPN网关的付费状态。</p>
         * <ul>
         * <li><p><strong>Normal</strong>：正常。</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>：欠费锁定。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>VPN网关的付费类型。</p>
         * <p>&lt;props=&quot;china&quot;&gt;仅取值：<strong>Prepay</strong>，包年包月。</p>
         * <p>&lt;props=&quot;intl&quot;&gt;仅取值：<strong>POSTPAY</strong>，按量计费。</p>
         * <p>&lt;props=&quot;partner&quot;&gt;仅取值： <strong>POSTPAY</strong>，按量计费。</p>
         * 
         * <strong>example:</strong>
         * <p>中国站示例值：Prepay，国际站示例值：POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>创建VPN网关的时间戳。单位：毫秒。</p>
         * <p>时间戳的格式采用Unix时间戳，表示从格林威治时间1970年01月01日00时00分00秒至创建VPN网关实例时的总时长。</p>
         * 
         * <strong>example:</strong>
         * <p>1515383700000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>VPN网关的描述信息。</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>系统为VPN网关实例分配的用于创建IPsec-VPN连接的第二个IP地址。</p>
         * <p>仅支持创建双隧道模式IPsec-VPN连接的VPN网关实例会返回当前参数。</p>
         * 
         * <strong>example:</strong>
         * <p>47.91.XX.XX</p>
         */
        @NameInMap("DisasterRecoveryInternetIp")
        public String disasterRecoveryInternetIp;

        /**
         * <p>VPN网关实例关联的第二个交换机ID。</p>
         * <p>仅支持创建双隧道模式IPsec-VPN连接的VPN网关实例会返回当前参数。</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-p0w95ql6tmr2ludkt****</p>
         */
        @NameInMap("DisasterRecoveryVSwitchId")
        public String disasterRecoveryVSwitchId;

        /**
         * <p>VPN网关BGP功能的开启状态。</p>
         * <ul>
         * <li><p><strong>true</strong>：已开启。</p>
         * </li>
         * <li><p><strong>false</strong>：未开启。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableBgp")
        public Boolean enableBgp;

        /**
         * <p>VPN网关到期时间戳。单位：毫秒。</p>
         * <p>时间戳的格式采用Unix时间戳，表示从格林威治时间1970年01月01日00时00分00秒至VPN网关实例到期时的总时长。</p>
         * 
         * <strong>example:</strong>
         * <p>1518105600000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>系统为VPN网关实例创建的弹性网卡ENI（Elastic Network Interfaces）列表。</p>
         */
        @NameInMap("EniInstanceIds")
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayEniInstanceIds eniInstanceIds;

        /**
         * <p>VPN 网关类型，取值：
         * Traditional：传统型VPN网关，覆盖IPsec功能和SSL功能
         * Enhance.SiteToSite：增强型站点入云VPN，只覆盖IPsec功能</p>
         */
        @NameInMap("GatewayType")
        public String gatewayType;

        /**
         * <ul>
         * <li><p>在VPN网关实例支持创建单隧道模式IPsec-VPN连接的场景下，该地址为VPN网关实例的IP地址，可用于创建IPsec-VPN连接或SSL-VPN连接。</p>
         * </li>
         * <li><p>在VPN网关实例支持创建双隧道模式IPsec-VPN连接的场景下，该地址为用于创建IPsec-VPN连接的第一个IP地址，不能用于创建SSL-VPN连接。</p>
         * <p>  在VPN网关实例支持创建双隧道模式IPsec-VPN连接的场景下，系统会为VPN网关实例分配两个IPsec地址，用于创建双隧道模式的IPsec-VPN连接。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>47.12.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>VPN网关是否开启了IPsec-VPN功能。</p>
         * <ul>
         * <li><p><strong>enable</strong>：已开启。</p>
         * </li>
         * <li><p><strong>disable</strong>：未开启。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("IpsecVpn")
        public String ipsecVpn;

        /**
         * <p>VPN网关的名称。</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>VPN网关的网络类型。</p>
         * <ul>
         * <li><strong>public</strong>：公网VPN网关。</li>
         * <li><strong>private</strong>：私网VPN网关。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>未生效的订购数据。</p>
         * <blockquote>
         * <p>仅<strong>IncludeReservationData</strong>传入<strong>true</strong>才会返回该组参数。</p>
         * </blockquote>
         */
        @NameInMap("ReservationData")
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayReservationData reservationData;

        /**
         * <p>VPN网关所属的资源组ID。</p>
         * <p>您可以调用<a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a>接口查询资源组信息。</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>VPN网关的带宽峰值。<strong>M</strong>表示单位Mbps。</p>
         * 
         * <strong>example:</strong>
         * <p>5M</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>VPN网关SSL连接数的规格。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SslMaxConnections")
        public Long sslMaxConnections;

        /**
         * <p>VPN网关是否开启了SSL-VPN功能。</p>
         * <ul>
         * <li><p><strong>enable</strong>：已开启。</p>
         * </li>
         * <li><p><strong>disable</strong>：未开启。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("SslVpn")
        public String sslVpn;

        /**
         * <p>SSL-VPN连接的IP地址。</p>
         * <p>仅支持创建双隧道模式IPsec-VPN连接的公网网络类型的VPN网关实例开启SSL-VPN功能后，才会返回当前参数。</p>
         * 
         * <strong>example:</strong>
         * <p>47.74.XX.XX</p>
         */
        @NameInMap("SslVpnInternetIp")
        public String sslVpnInternetIp;

        /**
         * <p>VPN网关的状态。</p>
         * <ul>
         * <li><p><strong>init</strong> ：初始化。</p>
         * </li>
         * <li><p><strong>provisioning</strong> ：准备中。</p>
         * </li>
         * <li><p><strong>active</strong> ：正常。</p>
         * </li>
         * <li><p><strong>updating</strong> ：更新中。</p>
         * </li>
         * <li><p><strong>deleting</strong> ：删除中。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>系统自动生成的VPN网关标签。</p>
         * <ul>
         * <li><strong>VpnEnableBgp</strong>：表示VPN网关是否支持BGP功能。<ul>
         * <li><strong>true</strong>：支持。</li>
         * <li><strong>false</strong>：不支持。</li>
         * </ul>
         * </li>
         * <li><strong>VisuallySsl</strong>：表示VPN网关是否支持查看SSL客户端的连接信息。<ul>
         * <li><strong>true</strong>：支持。</li>
         * <li><strong>false</strong>：不支持。</li>
         * </ul>
         * </li>
         * <li><strong>PbrPriority</strong>：表示VPN网关是否支持为策略路由配置策略优先级。<ul>
         * <li><strong>true</strong>：支持。</li>
         * <li><strong>false</strong>：不支持。</li>
         * </ul>
         * </li>
         * <li><strong>VpnNewImage</strong>：表示VPN网关是否为新型VPN网关。<ul>
         * <li><strong>true</strong>：是。</li>
         * <li><strong>false</strong>：否。</li>
         * </ul>
         * </li>
         * <li><strong>description</strong>：表示VPN网关的描述信息，仅供系统内部使用。</li>
         * <li><strong>VpnVersion</strong>：表示VPN网关的版本号。</li>
         * <li><strong>IDaaSNewVersion</strong>：表示VPN网关是否支持绑定EIAM 2.0实例。<ul>
         * <li><strong>true</strong>：支持。</li>
         * <li><strong>false</strong>：不支持。</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;VpnEnableBgp\&quot;:\&quot;true\&quot;,\&quot;VisuallySsl\&quot;:\&quot;true\&quot;,\&quot;PbrPriority\&quot;:\&quot;true\&quot;,\&quot;VpnNewImage\&quot;:\&quot;true\&quot;,\&quot;description\&quot;:\&quot;转发1.3.24\&quot;,\&quot;VpnVersion\&quot;:\&quot;v1.2.4\&quot;,\&quot;IDaaSNewVersion\&quot;:\&quot;true\&quot;}</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>VPN网关绑定的标签列表。</p>
         */
        @NameInMap("Tags")
        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGatewayTags tags;

        /**
         * <p>VPN网关所属交换机的ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp15lbk8sgtr6r5b0****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPN网关所属VPC的ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1m3i0kn1nd4wiw9****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>VPN网关的ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp17lofy9fd0dnvzv****</p>
         */
        @NameInMap("VpnGatewayId")
        public String vpnGatewayId;

        /**
         * <p>VPN网关类型。</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>Normal</strong>：普通型。</li>
         * <li><strong>NationalStandard</strong>：国密型。</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;取值：<strong>Normal</strong>，表示普通型。</p>
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

        public DescribeVpnGatewaysResponseBodyVpnGatewaysVpnGateway setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
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
