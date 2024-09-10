// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the domain name that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>root</strong>: root domain name</li>
     * <li><strong>sub</strong>: subdomain name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The keyword that is used to query domain names. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("FuzzyDomain")
    public String fuzzyDomain;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The source IP address of the request.</p>
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
