// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayDomainsResponseBody extends TeaModel {
    @NameInMap("GatewaySecretDetails")
    public java.util.List<DescribeIstioGatewayDomainsResponseBodyGatewaySecretDetails> gatewaySecretDetails;

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
        @NameInMap("CredentialName")
        public String credentialName;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("Domains")
        public java.util.List<String> domains;

        @NameInMap("PortName")
        public String portName;

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
