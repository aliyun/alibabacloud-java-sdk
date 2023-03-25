// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the domain name that you want to query. Valid values:</p>
     * <br>
     * <p>*   **root**: root domain name</p>
     * <p>*   **sub**: subdomain name</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The keyword that is used to query domain names. Fuzzy match is supported.</p>
     */
    @NameInMap("FuzzyDomain")
    public String fuzzyDomain;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainListRequest self = new DescribeDomainListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDomainListRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeDomainListRequest setFuzzyDomain(String fuzzyDomain) {
        this.fuzzyDomain = fuzzyDomain;
        return this;
    }
    public String getFuzzyDomain() {
        return this.fuzzyDomain;
    }

    public DescribeDomainListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
