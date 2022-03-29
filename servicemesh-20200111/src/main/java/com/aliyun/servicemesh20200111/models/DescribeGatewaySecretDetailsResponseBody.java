// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGatewaySecretDetailsResponseBody extends TeaModel {
    @NameInMap("GatewaySecretDetails")
    public java.util.List<DescribeGatewaySecretDetailsResponseBodyGatewaySecretDetails> gatewaySecretDetails;

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
        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("GatewayName")
        public String gatewayName;

        @NameInMap("IssueTime")
        public String issueTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("SNI")
        public String SNI;

        @NameInMap("SecretName")
        public String secretName;

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
