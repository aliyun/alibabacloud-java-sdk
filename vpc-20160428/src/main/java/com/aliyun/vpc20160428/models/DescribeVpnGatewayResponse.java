// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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
    public DescribeVpnGatewayResponseTags tags;

    @NameInMap("ReservationData")
    @Validation(required = true)
    public DescribeVpnGatewayResponseReservationData reservationData;

    public static DescribeVpnGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewayResponse self = new DescribeVpnGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnGatewayResponse setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public DescribeVpnGatewayResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVpnGatewayResponse setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeVpnGatewayResponse setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public DescribeVpnGatewayResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeVpnGatewayResponse setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeVpnGatewayResponse setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeVpnGatewayResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVpnGatewayResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVpnGatewayResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVpnGatewayResponse setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeVpnGatewayResponse setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeVpnGatewayResponse setIpsecVpn(String ipsecVpn) {
        this.ipsecVpn = ipsecVpn;
        return this;
    }
    public String getIpsecVpn() {
        return this.ipsecVpn;
    }

    public DescribeVpnGatewayResponse setSslVpn(String sslVpn) {
        this.sslVpn = sslVpn;
        return this;
    }
    public String getSslVpn() {
        return this.sslVpn;
    }

    public DescribeVpnGatewayResponse setSslMaxConnections(Long sslMaxConnections) {
        this.sslMaxConnections = sslMaxConnections;
        return this;
    }
    public Long getSslMaxConnections() {
        return this.sslMaxConnections;
    }

    public DescribeVpnGatewayResponse setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeVpnGatewayResponse setEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }
    public Boolean getEnableBgp() {
        return this.enableBgp;
    }

    public DescribeVpnGatewayResponse setAutoPropagate(Boolean autoPropagate) {
        this.autoPropagate = autoPropagate;
        return this;
    }
    public Boolean getAutoPropagate() {
        return this.autoPropagate;
    }

    public DescribeVpnGatewayResponse setTags(DescribeVpnGatewayResponseTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeVpnGatewayResponseTags getTags() {
        return this.tags;
    }

    public DescribeVpnGatewayResponse setReservationData(DescribeVpnGatewayResponseReservationData reservationData) {
        this.reservationData = reservationData;
        return this;
    }
    public DescribeVpnGatewayResponseReservationData getReservationData() {
        return this.reservationData;
    }

    public static class DescribeVpnGatewayResponseTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVpnGatewayResponseTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseTagsTag self = new DescribeVpnGatewayResponseTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayResponseTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpnGatewayResponseTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpnGatewayResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeVpnGatewayResponseTagsTag> tag;

        public static DescribeVpnGatewayResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseTags self = new DescribeVpnGatewayResponseTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayResponseTags setTag(java.util.List<DescribeVpnGatewayResponseTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpnGatewayResponseTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVpnGatewayResponseReservationData extends TeaModel {
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

        public static DescribeVpnGatewayResponseReservationData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseReservationData self = new DescribeVpnGatewayResponseReservationData();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayResponseReservationData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnGatewayResponseReservationData setReservationEndTime(String reservationEndTime) {
            this.reservationEndTime = reservationEndTime;
            return this;
        }
        public String getReservationEndTime() {
            return this.reservationEndTime;
        }

        public DescribeVpnGatewayResponseReservationData setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeVpnGatewayResponseReservationData setReservationSpec(String reservationSpec) {
            this.reservationSpec = reservationSpec;
            return this;
        }
        public String getReservationSpec() {
            return this.reservationSpec;
        }

        public DescribeVpnGatewayResponseReservationData setReservationIpsec(String reservationIpsec) {
            this.reservationIpsec = reservationIpsec;
            return this;
        }
        public String getReservationIpsec() {
            return this.reservationIpsec;
        }

        public DescribeVpnGatewayResponseReservationData setReservationSsl(String reservationSsl) {
            this.reservationSsl = reservationSsl;
            return this;
        }
        public String getReservationSsl() {
            return this.reservationSsl;
        }

        public DescribeVpnGatewayResponseReservationData setReservationMaxConnections(Integer reservationMaxConnections) {
            this.reservationMaxConnections = reservationMaxConnections;
            return this;
        }
        public Integer getReservationMaxConnections() {
            return this.reservationMaxConnections;
        }

    }

}
