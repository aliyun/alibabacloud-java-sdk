// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipGatewayInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("EipInfos")
    public DescribeEipGatewayInfoResponseBodyEipInfos eipInfos;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEipGatewayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipGatewayInfoResponseBody self = new DescribeEipGatewayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEipGatewayInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEipGatewayInfoResponseBody setEipInfos(DescribeEipGatewayInfoResponseBodyEipInfos eipInfos) {
        this.eipInfos = eipInfos;
        return this;
    }
    public DescribeEipGatewayInfoResponseBodyEipInfos getEipInfos() {
        return this.eipInfos;
    }

    public DescribeEipGatewayInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEipGatewayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEipGatewayInfoResponseBodyEipInfosEipInfo extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("IpGw")
        public String ipGw;

        @NameInMap("IpMask")
        public String ipMask;

        public static DescribeEipGatewayInfoResponseBodyEipInfosEipInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipGatewayInfoResponseBodyEipInfosEipInfo self = new DescribeEipGatewayInfoResponseBodyEipInfosEipInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEipGatewayInfoResponseBodyEipInfosEipInfo setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeEipGatewayInfoResponseBodyEipInfosEipInfo setIpGw(String ipGw) {
            this.ipGw = ipGw;
            return this;
        }
        public String getIpGw() {
            return this.ipGw;
        }

        public DescribeEipGatewayInfoResponseBodyEipInfosEipInfo setIpMask(String ipMask) {
            this.ipMask = ipMask;
            return this;
        }
        public String getIpMask() {
            return this.ipMask;
        }

    }

    public static class DescribeEipGatewayInfoResponseBodyEipInfos extends TeaModel {
        @NameInMap("EipInfo")
        public java.util.List<DescribeEipGatewayInfoResponseBodyEipInfosEipInfo> eipInfo;

        public static DescribeEipGatewayInfoResponseBodyEipInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipGatewayInfoResponseBodyEipInfos self = new DescribeEipGatewayInfoResponseBodyEipInfos();
            return TeaModel.build(map, self);
        }

        public DescribeEipGatewayInfoResponseBodyEipInfos setEipInfo(java.util.List<DescribeEipGatewayInfoResponseBodyEipInfosEipInfo> eipInfo) {
            this.eipInfo = eipInfo;
            return this;
        }
        public java.util.List<DescribeEipGatewayInfoResponseBodyEipInfosEipInfo> getEipInfo() {
            return this.eipInfo;
        }

    }

}
