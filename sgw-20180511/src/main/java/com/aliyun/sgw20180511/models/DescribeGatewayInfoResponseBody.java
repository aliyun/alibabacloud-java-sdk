// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GatewayInfos")
    public DescribeGatewayInfoResponseBodyGatewayInfos gatewayInfos;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayInfoResponseBody self = new DescribeGatewayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayInfoResponseBody setGatewayInfos(DescribeGatewayInfoResponseBodyGatewayInfos gatewayInfos) {
        this.gatewayInfos = gatewayInfos;
        return this;
    }
    public DescribeGatewayInfoResponseBodyGatewayInfos getGatewayInfos() {
        return this.gatewayInfos;
    }

    public DescribeGatewayInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGatewayInfoResponseBodyGatewayInfosGatewayInfo extends TeaModel {
        @NameInMap("Info")
        public String info;

        @NameInMap("Time")
        public Long time;

        public static DescribeGatewayInfoResponseBodyGatewayInfosGatewayInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayInfoResponseBodyGatewayInfosGatewayInfo self = new DescribeGatewayInfoResponseBodyGatewayInfosGatewayInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayInfoResponseBodyGatewayInfosGatewayInfo setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public DescribeGatewayInfoResponseBodyGatewayInfosGatewayInfo setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class DescribeGatewayInfoResponseBodyGatewayInfos extends TeaModel {
        @NameInMap("GatewayInfo")
        public java.util.List<DescribeGatewayInfoResponseBodyGatewayInfosGatewayInfo> gatewayInfo;

        public static DescribeGatewayInfoResponseBodyGatewayInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayInfoResponseBodyGatewayInfos self = new DescribeGatewayInfoResponseBodyGatewayInfos();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayInfoResponseBodyGatewayInfos setGatewayInfo(java.util.List<DescribeGatewayInfoResponseBodyGatewayInfosGatewayInfo> gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public java.util.List<DescribeGatewayInfoResponseBodyGatewayInfosGatewayInfo> getGatewayInfo() {
            return this.gatewayInfo;
        }

    }

}
