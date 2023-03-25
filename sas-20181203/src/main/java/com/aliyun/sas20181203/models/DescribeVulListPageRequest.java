// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListPageRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.</p>
     */
    @NameInMap("CveId")
    public String cveId;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the vulnerability.</p>
     */
    @NameInMap("VulNameLike")
    public String vulNameLike;

    public static DescribeVulListPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListPageRequest self = new DescribeVulListPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulListPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulListPageRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public DescribeVulListPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulListPageRequest setVulNameLike(String vulNameLike) {
        this.vulNameLike = vulNameLike;
        return this;
    }
    public String getVulNameLike() {
        return this.vulNameLike;
    }

}
