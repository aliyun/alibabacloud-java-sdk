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

    }

    public static class DescribeVpnGatewayResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeVpnGatewayResponseTagsTag> tag;

        public static DescribeVpnGatewayResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseTags self = new DescribeVpnGatewayResponseTags();
            return TeaModel.build(map, self);
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

    }

}
