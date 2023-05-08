// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainListRequest extends TeaModel {
    /**
     * <p>Queries the information about the domain assets within your Alibaba Cloud account.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page. Default value: **10**.</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The name of the domain or website.</p>
     */
    @NameInMap("FuzzyDomain")
    public String fuzzyDomain;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
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
