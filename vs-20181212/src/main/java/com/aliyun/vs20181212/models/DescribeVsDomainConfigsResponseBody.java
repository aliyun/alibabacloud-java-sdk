// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainConfigsResponseBody extends TeaModel {
    @NameInMap("DomainConfigs")
    public java.util.List<DescribeVsDomainConfigsResponseBodyDomainConfigs> domainConfigs;

    /**
     * <strong>example:</strong>
     * <p>D94D0E1E-E71B-562D-8C18-969BB3653FBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainConfigsResponseBody self = new DescribeVsDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainConfigsResponseBody setDomainConfigs(java.util.List<DescribeVsDomainConfigsResponseBodyDomainConfigs> domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public java.util.List<DescribeVsDomainConfigsResponseBodyDomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeVsDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVsDomainConfigsResponseBodyDomainConfigsFunctionArgs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>auth_type</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <strong>example:</strong>
         * <p>req_auth</p>
         */
        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeVsDomainConfigsResponseBodyDomainConfigsFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainConfigsResponseBodyDomainConfigsFunctionArgs self = new DescribeVsDomainConfigsResponseBodyDomainConfigsFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainConfigsResponseBodyDomainConfigsFunctionArgs setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeVsDomainConfigsResponseBodyDomainConfigsFunctionArgs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeVsDomainConfigsResponseBodyDomainConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6295</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("FunctionArgs")
        public java.util.List<DescribeVsDomainConfigsResponseBodyDomainConfigsFunctionArgs> functionArgs;

        /**
         * <strong>example:</strong>
         * <p>aliauth</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeVsDomainConfigsResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainConfigsResponseBodyDomainConfigs self = new DescribeVsDomainConfigsResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainConfigsResponseBodyDomainConfigs setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeVsDomainConfigsResponseBodyDomainConfigs setFunctionArgs(java.util.List<DescribeVsDomainConfigsResponseBodyDomainConfigsFunctionArgs> functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public java.util.List<DescribeVsDomainConfigsResponseBodyDomainConfigsFunctionArgs> getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeVsDomainConfigsResponseBodyDomainConfigs setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeVsDomainConfigsResponseBodyDomainConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
