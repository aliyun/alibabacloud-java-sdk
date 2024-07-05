// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainConfigsResponseBody extends TeaModel {
    /**
     * <p>The configurations of the domain name.</p>
     */
    @NameInMap("DomainConfigs")
    public DescribeVodDomainConfigsResponseBodyDomainConfigs domainConfigs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8AA0364-0FDB-4AD5-****-D69FAB8924ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainConfigsResponseBody self = new DescribeVodDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainConfigsResponseBody setDomainConfigs(DescribeVodDomainConfigsResponseBodyDomainConfigs domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public DescribeVodDomainConfigsResponseBodyDomainConfigs getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeVodDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>file_type</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>txt</p>
         */
        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg self = new DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
        public java.util.List<DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg;

        public static DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs self = new DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs setFunctionArg(java.util.List<DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg) {
            this.functionArg = functionArg;
            return this;
        }
        public java.util.List<DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> getFunctionArg() {
            return this.functionArg;
        }

    }

    public static class DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5003576</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The feature parameters.</p>
         */
        @NameInMap("FunctionArgs")
        public DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs;

        /**
         * <p>The feature name.</p>
         * 
         * <strong>example:</strong>
         * <p>set_req_host_header</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The configuration status. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>testing</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>configuring</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig self = new DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionArgs(DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVodDomainConfigsResponseBodyDomainConfigs extends TeaModel {
        @NameInMap("DomainConfig")
        public java.util.List<DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig> domainConfig;

        public static DescribeVodDomainConfigsResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainConfigsResponseBodyDomainConfigs self = new DescribeVodDomainConfigsResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainConfigsResponseBodyDomainConfigs setDomainConfig(java.util.List<DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig> domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }
        public java.util.List<DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfig> getDomainConfig() {
            return this.domainConfig;
        }

    }

}
