// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGatewaySecretDetailsResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the secret of the ASM gateway.</p>
     */
    @NameInMap("GatewaySecretDetails")
    public java.util.List<DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails> gatewaySecretDetails;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGatewaySecretDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaySecretDetailsResponseBody self = new DescribeGatewaySecretDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaySecretDetailsResponseBody setGatewaySecretDetails(java.util.List<DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails> gatewaySecretDetails) {
        this.gatewaySecretDetails = gatewaySecretDetails;
        return this;
    }
    public java.util.List<DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails> getGatewaySecretDetails() {
        return this.gatewaySecretDetails;
    }

    public DescribeGatewaySecretDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails extends TeaModel {
        /**
         * <p>The time when the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-03 07:45</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The name of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>bookinfo-gateway</p>
         */
        @NameInMap("GatewayName")
        public String gatewayName;

        /**
         * <p>The time when the certificate was issued.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-03 07:45</p>
         */
        @NameInMap("IssueTime")
        public String issueTime;

        /**
         * <ul>
         * <li>An error message is returned if the status of the gateway is abnormal. Examples: <code>tls.crt not exist</code>, <code>tls.key not exist</code>, and <code>secret type must be kubernetes.io/tls</code>.</li>
         * <li>An empty value is returned if the status of the gateway is normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tls.crt not exist</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The Server Name Indication (SNI) value.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.com</p>
         */
        @NameInMap("SNI")
        public String SNI;

        /**
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-secret</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><code>normal</code></li>
         * <li><code>abnormal</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails self = new DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails setIssueTime(String issueTime) {
            this.issueTime = issueTime;
            return this;
        }
        public String getIssueTime() {
            return this.issueTime;
        }

        public DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails setSNI(String SNI) {
            this.SNI = SNI;
            return this;
        }
        public String getSNI() {
            return this.SNI;
        }

        public DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

        public DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
