// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcItemRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether to forcefully refresh the data that you want to query.
    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    // The name of the process.
    @NameInMap("Name")
    public String name;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribePropertyProcItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyProcItemRequest self = new DescribePropertyProcItemRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyProcItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyProcItemRequest setForceFlush(Boolean forceFlush) {
        this.forceFlush = forceFlush;
        return this;
    }
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    public DescribePropertyProcItemRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePropertyProcItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
