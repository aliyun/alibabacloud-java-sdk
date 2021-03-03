// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainNamesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainNames")
    public java.util.List<String> domainNames;

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

    public DescribeDomainNamesResponseBody setDomainNames(java.util.List<String> domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public java.util.List<String> getDomainNames() {
        return this.domainNames;
    }

}
