// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainConfigsResponseBody extends TeaModel {
    @NameInMap("DomainConfigs")
    public DescribeScdnDomainConfigsResponseBodyDomainConfigs domainConfigs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScdnDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainConfigsResponseBody self = new DescribeScdnDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainConfigsResponseBody setDomainConfigs(DescribeScdnDomainConfigsResponseBodyDomainConfigs domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public DescribeScdnDomainConfigsResponseBodyDomainConfigs getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeScdnDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg extends TeaModel {
        @NameInMap("ArgName")
        public String argName;

        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg self = new DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
        public java.util.List<DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg;

        public static DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs self = new DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs setFunctionArg(java.util.List<DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg) {
            this.functionArg = functionArg;
            return this;
        }
        public java.util.List<DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> getFunctionArg() {
            return this.functionArg;
        }

    }

    public static class DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("FunctionArgs")
        public DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Status")
        public String status;

        public static DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig self = new DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionArgs(DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeScdnDomainConfigsResponseBodyDomainConfigs extends TeaModel {
        @NameInMap("DomainConfig")
        public java.util.List<DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig> domainConfig;

        public static DescribeScdnDomainConfigsResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainConfigsResponseBodyDomainConfigs self = new DescribeScdnDomainConfigsResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainConfigsResponseBodyDomainConfigs setDomainConfig(java.util.List<DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig> domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }
        public java.util.List<DescribeScdnDomainConfigsResponseBodyDomainConfigsDomainConfig> getDomainConfig() {
            return this.domainConfig;
        }

    }

}
