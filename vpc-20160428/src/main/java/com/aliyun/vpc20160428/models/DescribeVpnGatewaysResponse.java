// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewaysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("VpnGateways")
    @Validation(required = true)
    public DescribeVpnGatewaysResponseVpnGateways vpnGateways;

    public static DescribeVpnGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewaysResponse self = new DescribeVpnGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewaysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnGatewaysResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpnGatewaysResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnGatewaysResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnGatewaysResponse setVpnGateways(DescribeVpnGatewaysResponseVpnGateways vpnGateways) {
        this.vpnGateways = vpnGateways;
        return this;
    }
    public DescribeVpnGatewaysResponseVpnGateways getVpnGateways() {
        return this.vpnGateways;
    }

    public static class DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTagsTag self = new DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTagsTag> tag;

        public static DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags self = new DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags setTag(java.util.List<DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ReservationEndTime")
        @Validation(required = true)
        public String reservationEndTime;

        @NameInMap("ReservationOrderType")
        @Validation(required = true)
        public String reservationOrderType;

        @NameInMap("ReservationSpec")
        @Validation(required = true)
        public String reservationSpec;

        @NameInMap("ReservationIpsec")
        @Validation(required = true)
        public String reservationIpsec;

        @NameInMap("ReservationSsl")
        @Validation(required = true)
        public String reservationSsl;

        @NameInMap("ReservationMaxConnections")
        @Validation(required = true)
        public Integer reservationMaxConnections;

        public static DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData self = new DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData setReservationEndTime(String reservationEndTime) {
            this.reservationEndTime = reservationEndTime;
            return this;
        }
        public String getReservationEndTime() {
            return this.reservationEndTime;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData setReservationSpec(String reservationSpec) {
            this.reservationSpec = reservationSpec;
            return this;
        }
        public String getReservationSpec() {
            return this.reservationSpec;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData setReservationIpsec(String reservationIpsec) {
            this.reservationIpsec = reservationIpsec;
            return this;
        }
        public String getReservationIpsec() {
            return this.reservationIpsec;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData setReservationSsl(String reservationSsl) {
            this.reservationSsl = reservationSsl;
            return this;
        }
        public String getReservationSsl() {
            return this.reservationSsl;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData setReservationMaxConnections(Integer reservationMaxConnections) {
            this.reservationMaxConnections = reservationMaxConnections;
            return this;
        }
        public Integer getReservationMaxConnections() {
            return this.reservationMaxConnections;
        }

    }

    public static class DescribeVpnGatewaysResponseVpnGatewaysVpnGateway extends TeaModel {
        @NameInMap("VpnGatewayId")
        @Validation(required = true)
        public String vpnGatewayId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("InternetIp")
        @Validation(required = true)
        public String internetIp;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("IpsecVpn")
        @Validation(required = true)
        public String ipsecVpn;

        @NameInMap("SslVpn")
        @Validation(required = true)
        public String sslVpn;

        @NameInMap("SslMaxConnections")
        @Validation(required = true)
        public Long sslMaxConnections;

        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("EnableBgp")
        @Validation(required = true)
        public Boolean enableBgp;

        @NameInMap("AutoPropagate")
        @Validation(required = true)
        public Boolean autoPropagate;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags tags;

        @NameInMap("ReservationData")
        @Validation(required = true)
        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData reservationData;

        public static DescribeVpnGatewaysResponseVpnGatewaysVpnGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseVpnGatewaysVpnGateway self = new DescribeVpnGatewaysResponseVpnGatewaysVpnGateway();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setIpsecVpn(String ipsecVpn) {
            this.ipsecVpn = ipsecVpn;
            return this;
        }
        public String getIpsecVpn() {
            return this.ipsecVpn;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setSslVpn(String sslVpn) {
            this.sslVpn = sslVpn;
            return this;
        }
        public String getSslVpn() {
            return this.sslVpn;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setSslMaxConnections(Long sslMaxConnections) {
            this.sslMaxConnections = sslMaxConnections;
            return this;
        }
        public Long getSslMaxConnections() {
            return this.sslMaxConnections;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setEnableBgp(Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public Boolean getEnableBgp() {
            return this.enableBgp;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setAutoPropagate(Boolean autoPropagate) {
            this.autoPropagate = autoPropagate;
            return this;
        }
        public Boolean getAutoPropagate() {
            return this.autoPropagate;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setTags(DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags getTags() {
            return this.tags;
        }

        public DescribeVpnGatewaysResponseVpnGatewaysVpnGateway setReservationData(DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData reservationData) {
            this.reservationData = reservationData;
            return this;
        }
        public DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayReservationData getReservationData() {
            return this.reservationData;
        }

    }

    public static class DescribeVpnGatewaysResponseVpnGateways extends TeaModel {
        @NameInMap("VpnGateway")
        @Validation(required = true)
        public java.util.List<DescribeVpnGatewaysResponseVpnGatewaysVpnGateway> vpnGateway;

        public static DescribeVpnGatewaysResponseVpnGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseVpnGateways self = new DescribeVpnGatewaysResponseVpnGateways();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewaysResponseVpnGateways setVpnGateway(java.util.List<DescribeVpnGatewaysResponseVpnGatewaysVpnGateway> vpnGateway) {
            this.vpnGateway = vpnGateway;
            return this;
        }
        public java.util.List<DescribeVpnGatewaysResponseVpnGatewaysVpnGateway> getVpnGateway() {
            return this.vpnGateway;
        }

    }

}
