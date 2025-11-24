// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayDomainsResponseBody extends TeaModel {
    /**
     * <p>The domain names that are exposed by the ASM gateway.</p>
     */
    @NameInMap("GatewaySecretDetails")
    public java.util.List<DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails> gatewaySecretDetails;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIstioGatewayDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIstioGatewayDomainsResponseBody self = new DescribeIstioGatewayDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIstioGatewayDomainsResponseBody setGatewaySecretDetails(java.util.List<DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails> gatewaySecretDetails) {
        this.gatewaySecretDetails = gatewaySecretDetails;
        return this;
    }
    public java.util.List<DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails> getGatewaySecretDetails() {
        return this.gatewaySecretDetails;
    }

    public DescribeIstioGatewayDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails extends TeaModel {
        /**
         * <p>The name of the secret that contains the Transport Layer Security (TLS) certificate and certificate authority (CA) certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>bookinfo-secret</p>
         */
        @NameInMap("CredentialName")
        public String credentialName;

        /**
         * <p>The details of the domain name in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;servers&quot;: [     {       &quot;port&quot;: {         &quot;number&quot;: 27018,         &quot;name&quot;: &quot;mongo&quot;,         &quot;protocol&quot;: &quot;MONGO&quot;       },       &quot;hosts&quot;: [         &quot;*&quot;       ]     }   ] }</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The list of domain names.</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The name of the Istio gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ingressgateway</p>
         */
        @NameInMap("GatewayCRName")
        public String gatewayCRName;

        /**
         * <p>The namespace in which the ASM gateway resides.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The port name.</p>
         * 
         * <strong>example:</strong>
         * <p>https-demo</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>The type of the protocol. Valid values: <code>HTTP</code>, <code>HTTPS</code>, <code>GRPC</code>, <code>HTTP2</code>, <code>MONGO</code>, <code>TCP</code>, and <code>TLS</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails self = new DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails setCredentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }
        public String getCredentialName() {
            return this.credentialName;
        }

        public DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails setGatewayCRName(String gatewayCRName) {
            this.gatewayCRName = gatewayCRName;
            return this;
        }
        public String getGatewayCRName() {
            return this.gatewayCRName;
        }

        public DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
