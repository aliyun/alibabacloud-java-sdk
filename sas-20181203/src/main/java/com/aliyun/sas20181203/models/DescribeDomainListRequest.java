// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("FuzzyDomain")
    public String fuzzyDomain;

    @NameInMap("DomainType")
    public String domainType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static DescribeDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainListRequest self = new DescribeDomainListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDomainListRequest setFuzzyDomain(String fuzzyDomain) {
        this.fuzzyDomain = fuzzyDomain;
        return this;
    }
    public String getFuzzyDomain() {
        return this.fuzzyDomain;
    }

    public DescribeDomainListRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeDomainListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
