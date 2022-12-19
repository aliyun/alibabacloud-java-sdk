// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccesskeyLeakListRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries to return on each page.\
    // Maximum value: 100. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
    // 
    // > : We recommend that you do not leave this parameter empty.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The AccessKey ID that you want to query. Only exact match is supported.
    @NameInMap("Query")
    public String query;

    // The beginning of the time range to query. You can query all AccessKey pair leaks that are detected later than this time point. The value of this parameter is a UNIX timestamp. Unit: milliseconds.
    @NameInMap("StartTs")
    public Long startTs;

    // Specifies whether an AccessKey pair leak is handled. Valid values:
    // 
    // *   **pending**: unhandled
    // *   **dealed**: handled
    @NameInMap("Status")
    public String status;

    public static DescribeAccesskeyLeakListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccesskeyLeakListRequest self = new DescribeAccesskeyLeakListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccesskeyLeakListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAccesskeyLeakListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccesskeyLeakListRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DescribeAccesskeyLeakListRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeAccesskeyLeakListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
