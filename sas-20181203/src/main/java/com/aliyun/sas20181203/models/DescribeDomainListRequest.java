// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainListRequest extends TeaModel {
    /**
     * <p>The page number of the page to return in a paged query. Default value: <strong>1</strong>, which indicates that the first page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the domain name to query. Valid values:</p>
     * <ul>
     * <li><strong>root</strong>: root domain name</li>
     * <li><strong>sub</strong>: subdomain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The search keyword for the domain name to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("FuzzyDomain")
    public String fuzzyDomain;

    /**
     * <p>The number of domain names to display on each page in a paged query. Default value: <strong>10</strong>, which indicates that 10 domain names are displayed on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>192.122.XX.XX</p>
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
