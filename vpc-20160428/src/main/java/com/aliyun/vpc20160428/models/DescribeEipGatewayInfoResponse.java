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

    public DescribeEipGatewayInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEipGatewayInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEipGatewayInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEipGatewayInfoResponse setEipInfos(DescribeEipGatewayInfoResponseEipInfos eipInfos) {
        this.eipInfos = eipInfos;
        return this;
    }
    public DescribeEipGatewayInfoResponseEipInfos getEipInfos() {
        return this.eipInfos;
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

        public DescribeEipGatewayInfoResponseEipInfosEipInfo setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeEipGatewayInfoResponseEipInfosEipInfo setIpGw(String ipGw) {
            this.ipGw = ipGw;
            return this;
        }
        public String getIpGw() {
            return this.ipGw;
        }

        public DescribeEipGatewayInfoResponseEipInfosEipInfo setIpMask(String ipMask) {
            this.ipMask = ipMask;
            return this;
        }
        public String getIpMask() {
            return this.ipMask;
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

        public DescribeEipGatewayInfoResponseEipInfos setEipInfo(java.util.List<DescribeEipGatewayInfoResponseEipInfosEipInfo> eipInfo) {
            this.eipInfo = eipInfo;
            return this;
        }
        public java.util.List<DescribeEipGatewayInfoResponseEipInfosEipInfo> getEipInfo() {
            return this.eipInfo;
        }

    }

}
