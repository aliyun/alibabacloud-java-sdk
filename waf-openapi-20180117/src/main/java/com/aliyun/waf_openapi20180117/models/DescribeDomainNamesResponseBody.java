// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeDomainNamesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDomainNamesResponseBodyResult result;

    public static DescribeDomainNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainNamesResponseBody self = new DescribeDomainNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainNamesResponseBody setResult(DescribeDomainNamesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDomainNamesResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDomainNamesResponseBodyResult extends TeaModel {
        @NameInMap("DomainNames")
        public java.util.List<String> domainNames;

        public static DescribeDomainNamesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainNamesResponseBodyResult self = new DescribeDomainNamesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDomainNamesResponseBodyResult setDomainNames(java.util.List<String> domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public java.util.List<String> getDomainNames() {
            return this.domainNames;
        }

    }

}
