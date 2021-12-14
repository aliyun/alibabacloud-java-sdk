// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainListResponseBody extends TeaModel {
    @NameInMap("DomainNames")
    public java.util.List<String> domainNames;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainListResponseBody self = new DescribeDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainListResponseBody setDomainNames(java.util.List<String> domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public java.util.List<String> getDomainNames() {
        return this.domainNames;
    }

    public DescribeDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
