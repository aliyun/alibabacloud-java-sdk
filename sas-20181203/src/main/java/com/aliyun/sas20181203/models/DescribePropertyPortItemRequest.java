// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortItemRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether to forcefully refresh the data that you want to query.
    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The port number.
    @NameInMap("Port")
    public String port;

    public static DescribePropertyPortItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyPortItemRequest self = new DescribePropertyPortItemRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyPortItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyPortItemRequest setForceFlush(Boolean forceFlush) {
        this.forceFlush = forceFlush;
        return this;
    }
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    public DescribePropertyPortItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyPortItemRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

}
