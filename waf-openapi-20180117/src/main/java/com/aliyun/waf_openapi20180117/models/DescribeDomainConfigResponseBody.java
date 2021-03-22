// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeDomainConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDomainConfigResponseBodyResult result;

    public static DescribeDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainConfigResponseBody self = new DescribeDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainConfigResponseBody setResult(DescribeDomainConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDomainConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDomainConfigResponseBodyResultDomainConfig extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        @NameInMap("ProtocolType")
        public Integer protocolType;

        @NameInMap("SourceIps")
        public String sourceIps;

        public static DescribeDomainConfigResponseBodyResultDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainConfigResponseBodyResultDomainConfig self = new DescribeDomainConfigResponseBodyResultDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDomainConfigResponseBodyResultDomainConfig setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainConfigResponseBodyResultDomainConfig setProtocolType(Integer protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public Integer getProtocolType() {
            return this.protocolType;
        }

        public DescribeDomainConfigResponseBodyResultDomainConfig setSourceIps(String sourceIps) {
            this.sourceIps = sourceIps;
            return this;
        }
        public String getSourceIps() {
            return this.sourceIps;
        }

    }

    public static class DescribeDomainConfigResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WafTaskId")
        public String wafTaskId;

        @NameInMap("DomainConfig")
        public DescribeDomainConfigResponseBodyResultDomainConfig domainConfig;

        public static DescribeDomainConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainConfigResponseBodyResult self = new DescribeDomainConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDomainConfigResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDomainConfigResponseBodyResult setWafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }
        public String getWafTaskId() {
            return this.wafTaskId;
        }

        public DescribeDomainConfigResponseBodyResult setDomainConfig(DescribeDomainConfigResponseBodyResultDomainConfig domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }
        public DescribeDomainConfigResponseBodyResultDomainConfig getDomainConfig() {
            return this.domainConfig;
        }

    }

}
