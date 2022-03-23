// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeSearchItemsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SearchItemIds")
    public String searchItemIds;

    @NameInMap("SearchTableId")
    public String searchTableId;

    public static DescribeSearchItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchItemsRequest self = new DescribeSearchItemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSearchItemsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSearchItemsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSearchItemsRequest setSearchItemIds(String searchItemIds) {
        this.searchItemIds = searchItemIds;
        return this;
    }
    public String getSearchItemIds() {
        return this.searchItemIds;
    }

    public DescribeSearchItemsRequest setSearchTableId(String searchTableId) {
        this.searchTableId = searchTableId;
        return this;
    }
    public String getSearchTableId() {
        return this.searchTableId;
    }

}
