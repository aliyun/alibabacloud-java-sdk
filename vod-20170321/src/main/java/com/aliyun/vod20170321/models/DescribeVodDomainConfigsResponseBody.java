// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainConfigsResponseBody extends TeaModel {
    /**
     * <p>The value of the parameter.</p>
     */
    @NameInMap("DomainConfigs")
    public DescribeVodDomainConfigsResponseBodyDomainConfigs domainConfigs;

    /**
     * <p>The status of the configuration. Valid values:</p>
     * <br>
     * <p>- **success**</p>
     * <p>- **testing**</p>
     * <p>- **failed**</p>
     * <p>- **configuring**</p>
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
        @NameInMap("ArgName")
        public String argName;

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
         * <p>## Feature description</p>
         * <br>
         * <p>| Feature | Description |</p>
         * <p>| ------- | ----------- |</p>
         * <p>| referer_white_list_set | Specifies the referer whitelist. |</p>
         * <p>| referer_black_list_set | Specifies the referer blacklist. |</p>
         * <p>| filetype_based_ttl_set | Specifies the time period after which a file expires. |</p>
         * <p>| path_based_ttl_set | Specifies the time period after which a directory expires. |</p>
         * <p>| cc_defense | Configures protection against HTTP flood attacks. |</p>
         * <p>| oss_auth | Configures authentication for the access to an Object Storage Service (OSS) bucket. |</p>
         * <p>| ip_black_list_set | Specifies the IP address blacklist. |</p>
         * <p>| ip_white_list_set | Specifies the IP address whitelist. |</p>
         * <p>| error_page | Redirects an error page to a specified page. |</p>
         * <p>| tesla | Optimizes pages to accelerate access. |</p>
         * <p>| set_req_host_header | Modifies the custom header of back-to-origin requests. |</p>
         * <p>| set_hashkey_args | Ignores the specified URL parameters. |</p>
         * <p>| aliauth | Configures Alibaba Cloud authentication. |</p>
         * <p>| set_resp_header | Specifies a response header. To verify the setting, you can check the response message in a browser. |</p>
         * <p>| video_seek | Configures video seeking. |</p>
         * <p>| range | Configures object chunking. |</p>
         * <p>| gzip | Optimizes pages by using GNU zip (Gzip) compression. |</p>
         * <p>| https_force | Configures force redirect to HTTPS. |</p>
         * <p>| http_force | Configures force redirect to HTTP. |</p>
         * <p>| alivod | Configures ApsaraVideo VOD. |</p>
         * <p>| forward_scheme | Specifies the origin protocol policy or configures whether to enable adaptive origin fetch. |</p>
         * <p>| tmd_signature | Specifies the self-defined rules for the rate limit. |</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("FunctionArgs")
        public DescribeVodDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs;

        /**
         * <p>Queries the configurations of a specified domain name for CDN. You can query the configurations of one or more features at a time.</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The operation that you want to perform. Set the value to **DescribeVodDomainConfigs**.</p>
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
