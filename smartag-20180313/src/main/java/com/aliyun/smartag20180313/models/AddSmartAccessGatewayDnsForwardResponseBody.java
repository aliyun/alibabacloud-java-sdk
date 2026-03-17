// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddSmartAccessGatewayDnsForwardResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information returned for the request.</p>
     */
    @NameInMap("Data")
    public AddSmartAccessGatewayDnsForwardResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E93884AC-6C21-4FEA-8E3A-7377D33B194F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>yfiy.cn</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sagv3dnsforward-nc7qabskj17werc7su</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The primary DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>14.104.81.13</p>
         */
        @NameInMap("MasterIp")
        public String masterIp;

        /**
         * <p>The forwarding mode.</p>
         * 
         * <strong>example:</strong>
         * <p>first</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The number of the egress port.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OutboundPortIndex")
        public Integer outboundPortIndex;

        /**
         * <p>The egress port.</p>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        @NameInMap("OutboundPortName")
        public String outboundPortName;

        /**
         * <p>The type of the egress port.</p>
         * 
         * <strong>example:</strong>
         * <p>PhysicalPort</p>
         */
        @NameInMap("OutboundPortType")
        public String outboundPortType;

        /**
         * <p>The secondary DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.14</p>
         */
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
