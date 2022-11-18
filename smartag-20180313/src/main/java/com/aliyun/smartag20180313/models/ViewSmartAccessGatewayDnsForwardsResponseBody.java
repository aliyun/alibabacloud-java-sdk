// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayDnsForwardsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<ViewSmartAccessGatewayDnsForwardsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ViewSmartAccessGatewayDnsForwardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayDnsForwardsResponseBody self = new ViewSmartAccessGatewayDnsForwardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayDnsForwardsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ViewSmartAccessGatewayDnsForwardsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ViewSmartAccessGatewayDnsForwardsResponseBody setData(java.util.List<ViewSmartAccessGatewayDnsForwardsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ViewSmartAccessGatewayDnsForwardsResponseBodyData> getData() {
        return this.data;
    }

    public ViewSmartAccessGatewayDnsForwardsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ViewSmartAccessGatewayDnsForwardsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ViewSmartAccessGatewayDnsForwardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ViewSmartAccessGatewayDnsForwardsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ViewSmartAccessGatewayDnsForwardsResponseBodyData extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MasterIp")
        public String masterIp;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("OutboundPortIndex")
        public Integer outboundPortIndex;

        @NameInMap("OutboundPortName")
        public String outboundPortName;

        @NameInMap("OutboundPortType")
        public String outboundPortType;

        @NameInMap("SlaveIp")
        public String slaveIp;

        public static ViewSmartAccessGatewayDnsForwardsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ViewSmartAccessGatewayDnsForwardsResponseBodyData self = new ViewSmartAccessGatewayDnsForwardsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ViewSmartAccessGatewayDnsForwardsResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ViewSmartAccessGatewayDnsForwardsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ViewSmartAccessGatewayDnsForwardsResponseBodyData setMasterIp(String masterIp) {
            this.masterIp = masterIp;
            return this;
        }
        public String getMasterIp() {
            return this.masterIp;
        }

        public ViewSmartAccessGatewayDnsForwardsResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ViewSmartAccessGatewayDnsForwardsResponseBodyData setOutboundPortIndex(Integer outboundPortIndex) {
            this.outboundPortIndex = outboundPortIndex;
            return this;
        }
        public Integer getOutboundPortIndex() {
            return this.outboundPortIndex;
        }

        public ViewSmartAccessGatewayDnsForwardsResponseBodyData setOutboundPortName(String outboundPortName) {
            this.outboundPortName = outboundPortName;
            return this;
        }
        public String getOutboundPortName() {
            return this.outboundPortName;
        }

        public ViewSmartAccessGatewayDnsForwardsResponseBodyData setOutboundPortType(String outboundPortType) {
            this.outboundPortType = outboundPortType;
            return this;
        }
        public String getOutboundPortType() {
            return this.outboundPortType;
        }

        public ViewSmartAccessGatewayDnsForwardsResponseBodyData setSlaveIp(String slaveIp) {
            this.slaveIp = slaveIp;
            return this;
        }
        public String getSlaveIp() {
            return this.slaveIp;
        }

    }

}
