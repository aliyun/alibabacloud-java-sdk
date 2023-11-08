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
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The name of the gateway.</p>
         */
        @NameInMap("GatewayName")
        public String gatewayName;

        /**
         * <p>The time when the certificate was issued.</p>
         */
        @NameInMap("IssueTime")
        public String issueTime;

        /**
         * <p>*   An error message is returned if the status of the gateway is abnormal. Examples: `tls.crt not exist`, `tls.key not exist`, and `secret type must be kubernetes.io/tls`.</p>
         * <p>*   An empty value is returned if the status of the gateway is normal.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The Server Name Indication (SNI) value.</p>
         */
        @NameInMap("SNI")
        public String SNI;

        /**
         * <p>The name of the secret.</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <br>
         * <p>*   `normal`</p>
         * <p>*   `abnormal`</p>
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
