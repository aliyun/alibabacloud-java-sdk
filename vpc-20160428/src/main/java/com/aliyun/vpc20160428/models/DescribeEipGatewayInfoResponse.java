// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipGatewayInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("EipInfos")
    @Validation(required = true)
    public DescribeEipGatewayInfoResponseEipInfos eipInfos;

    public static DescribeEipGatewayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipGatewayInfoResponse self = new DescribeEipGatewayInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeEipGatewayInfoResponseEipInfosEipInfo extends TeaModel {
        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        @NameInMap("IpGw")
        @Validation(required = true)
        public String ipGw;

        @NameInMap("IpMask")
        @Validation(required = true)
        public String ipMask;

        public static DescribeEipGatewayInfoResponseEipInfosEipInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipGatewayInfoResponseEipInfosEipInfo self = new DescribeEipGatewayInfoResponseEipInfosEipInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEipGatewayInfoResponseEipInfos extends TeaModel {
        @NameInMap("EipInfo")
        @Validation(required = true)
        public java.util.List<DescribeEipGatewayInfoResponseEipInfosEipInfo> eipInfo;

        public static DescribeEipGatewayInfoResponseEipInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipGatewayInfoResponseEipInfos self = new DescribeEipGatewayInfoResponseEipInfos();
            return TeaModel.build(map, self);
        }

    }

}
