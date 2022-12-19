// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainCountResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The number of root domains.
    @NameInMap("RootDomainsCount")
    public Integer rootDomainsCount;

    // The number of subdomains.
    @NameInMap("SubDomainsCount")
    public Integer subDomainsCount;

    // The total number of entries returned.
    @NameInMap("TotalDomainsCount")
    public Integer totalDomainsCount;

    public static DescribeDomainCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCountResponseBody self = new DescribeDomainCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainCountResponseBody setRootDomainsCount(Integer rootDomainsCount) {
        this.rootDomainsCount = rootDomainsCount;
        return this;
    }
    public Integer getRootDomainsCount() {
        return this.rootDomainsCount;
    }

    public DescribeDomainCountResponseBody setSubDomainsCount(Integer subDomainsCount) {
        this.subDomainsCount = subDomainsCount;
        return this;
    }
    public Integer getSubDomainsCount() {
        return this.subDomainsCount;
    }

    public DescribeDomainCountResponseBody setTotalDomainsCount(Integer totalDomainsCount) {
        this.totalDomainsCount = totalDomainsCount;
        return this;
    }
    public Integer getTotalDomainsCount() {
        return this.totalDomainsCount;
    }

}
