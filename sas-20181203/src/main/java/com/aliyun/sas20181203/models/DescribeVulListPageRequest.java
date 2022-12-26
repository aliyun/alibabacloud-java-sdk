// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListPageRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("CveId")
    public String cveId;

    @NameInMap("PageSize")
    public Integer pageSize;

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
