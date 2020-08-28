// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainConfigsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainConfigs")
    @Validation(required = true)
    public DescribeVodDomainConfigsResponseDomainConfigs domainConfigs;

    public static DescribeVodDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainConfigsResponse self = new DescribeVodDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg extends TeaModel {
        @NameInMap("ArgName")
        @Validation(required = true)
        public String argName;

        @NameInMap("ArgValue")
        @Validation(required = true)
        public String argValue;

        public static DescribeVodDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg self = new DescribeVodDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg;

        public static DescribeVodDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs self = new DescribeVodDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainConfigsResponseDomainConfigsDomainConfig extends TeaModel {
        @NameInMap("FunctionName")
        @Validation(required = true)
        public String functionName;

        @NameInMap("ConfigId")
        @Validation(required = true)
        public String configId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FunctionArgs")
        @Validation(required = true)
        public DescribeVodDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs functionArgs;

        public static DescribeVodDomainConfigsResponseDomainConfigsDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainConfigsResponseDomainConfigsDomainConfig self = new DescribeVodDomainConfigsResponseDomainConfigsDomainConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainConfigsResponseDomainConfigs extends TeaModel {
        @NameInMap("DomainConfig")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainConfigsResponseDomainConfigsDomainConfig> domainConfig;

        public static DescribeVodDomainConfigsResponseDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainConfigsResponseDomainConfigs self = new DescribeVodDomainConfigsResponseDomainConfigs();
            return TeaModel.build(map, self);
        }

    }

}
