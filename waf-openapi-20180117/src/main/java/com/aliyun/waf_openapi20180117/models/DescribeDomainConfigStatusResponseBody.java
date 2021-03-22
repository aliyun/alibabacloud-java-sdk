// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeDomainConfigStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDomainConfigStatusResponseBodyResult result;

    public static DescribeDomainConfigStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainConfigStatusResponseBody self = new DescribeDomainConfigStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainConfigStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainConfigStatusResponseBody setResult(DescribeDomainConfigStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDomainConfigStatusResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDomainConfigStatusResponseBodyResultDomainConfig extends TeaModel {
        @NameInMap("ConfigStatus")
        public String configStatus;

        public static DescribeDomainConfigStatusResponseBodyResultDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainConfigStatusResponseBodyResultDomainConfig self = new DescribeDomainConfigStatusResponseBodyResultDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDomainConfigStatusResponseBodyResultDomainConfig setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

    }

    public static class DescribeDomainConfigStatusResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WafTaskId")
        public String wafTaskId;

        @NameInMap("DomainConfig")
        public DescribeDomainConfigStatusResponseBodyResultDomainConfig domainConfig;

        public static DescribeDomainConfigStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainConfigStatusResponseBodyResult self = new DescribeDomainConfigStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDomainConfigStatusResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDomainConfigStatusResponseBodyResult setWafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }
        public String getWafTaskId() {
            return this.wafTaskId;
        }

        public DescribeDomainConfigStatusResponseBodyResult setDomainConfig(DescribeDomainConfigStatusResponseBodyResultDomainConfig domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }
        public DescribeDomainConfigStatusResponseBodyResultDomainConfig getDomainConfig() {
            return this.domainConfig;
        }

    }

}
