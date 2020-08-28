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

    }

    public static class DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTagsTag> tag;

        public static DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags self = new DescribeVpnGatewaysResponseVpnGatewaysVpnGatewayTags();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeVpnGatewaysResponseVpnGateways extends TeaModel {
        @NameInMap("VpnGateway")
        @Validation(required = true)
        public java.util.List<DescribeVpnGatewaysResponseVpnGatewaysVpnGateway> vpnGateway;

        public static DescribeVpnGatewaysResponseVpnGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysResponseVpnGateways self = new DescribeVpnGatewaysResponseVpnGateways();
            return TeaModel.build(map, self);
        }

    }

}
