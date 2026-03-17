// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayDnsForwardsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1914</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>A DNS forwarding list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ViewSmartAccessGatewayDnsForwardsResponseBodyData> data;

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
     * <p>E223E535-AE11-4158-B00F-DC107887A909</p>
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
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.baidu.com">www.baidu.com</a></p>
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
         * <p>172.16.58.20</p>
         */
        @NameInMap("MasterIp")
        public String masterIp;

        /**
         * <p>The forwarding mode.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>This parameter is not in use. Ignore this parameter.</li>
         * </ul>
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
