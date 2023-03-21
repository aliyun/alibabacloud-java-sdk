// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareItemRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    @NameInMap("Name")
    public String name;

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
