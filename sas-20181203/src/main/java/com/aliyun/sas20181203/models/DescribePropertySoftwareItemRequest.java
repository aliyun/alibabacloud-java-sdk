// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareItemRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether to forcefully refresh the data that you want to query.
    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    // The name of the software that you want to query.
    @NameInMap("Name")
    public String name;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribePropertySoftwareItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertySoftwareItemRequest self = new DescribePropertySoftwareItemRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertySoftwareItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertySoftwareItemRequest setForceFlush(Boolean forceFlush) {
        this.forceFlush = forceFlush;
        return this;
    }
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    public DescribePropertySoftwareItemRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePropertySoftwareItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
