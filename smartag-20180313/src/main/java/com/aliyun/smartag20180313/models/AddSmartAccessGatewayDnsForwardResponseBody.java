// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddSmartAccessGatewayDnsForwardResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddSmartAccessGatewayDnsForwardResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddSmartAccessGatewayDnsForwardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSmartAccessGatewayDnsForwardResponseBody self = new AddSmartAccessGatewayDnsForwardResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSmartAccessGatewayDnsForwardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddSmartAccessGatewayDnsForwardResponseBody setData(AddSmartAccessGatewayDnsForwardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddSmartAccessGatewayDnsForwardResponseBodyData getData() {
        return this.data;
    }

    public AddSmartAccessGatewayDnsForwardResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddSmartAccessGatewayDnsForwardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddSmartAccessGatewayDnsForwardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSmartAccessGatewayDnsForwardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddSmartAccessGatewayDnsForwardResponseBodyData extends TeaModel {
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

        public static AddSmartAccessGatewayDnsForwardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddSmartAccessGatewayDnsForwardResponseBodyData self = new AddSmartAccessGatewayDnsForwardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddSmartAccessGatewayDnsForwardResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public AddSmartAccessGatewayDnsForwardResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddSmartAccessGatewayDnsForwardResponseBodyData setMasterIp(String masterIp) {
            this.masterIp = masterIp;
            return this;
        }
        public String getMasterIp() {
            return this.masterIp;
        }

        public AddSmartAccessGatewayDnsForwardResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public AddSmartAccessGatewayDnsForwardResponseBodyData setOutboundPortIndex(Integer outboundPortIndex) {
            this.outboundPortIndex = outboundPortIndex;
            return this;
        }
        public Integer getOutboundPortIndex() {
            return this.outboundPortIndex;
        }

        public AddSmartAccessGatewayDnsForwardResponseBodyData setOutboundPortName(String outboundPortName) {
            this.outboundPortName = outboundPortName;
            return this;
        }
        public String getOutboundPortName() {
            return this.outboundPortName;
        }

        public AddSmartAccessGatewayDnsForwardResponseBodyData setOutboundPortType(String outboundPortType) {
            this.outboundPortType = outboundPortType;
            return this;
        }
        public String getOutboundPortType() {
            return this.outboundPortType;
        }

        public AddSmartAccessGatewayDnsForwardResponseBodyData setSlaveIp(String slaveIp) {
            this.slaveIp = slaveIp;
            return this;
        }
        public String getSlaveIp() {
            return this.slaveIp;
        }

    }

}
