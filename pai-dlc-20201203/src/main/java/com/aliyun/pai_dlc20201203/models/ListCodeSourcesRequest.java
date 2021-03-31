// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListCodeSourcesRequest extends TeaModel {
    // 代码源显示名称，支持模糊匹配
    @NameInMap("DisplayName")
    public String displayName;

    // 取第几页的数据
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 用于排序的字段名，可选字段名：'DisplayName' 'GmtCreateTime' 'GmtModifyTime'
    @NameInMap("SortBy")
    public String sortBy;

    // 排序顺序, 枚举值 desc 或者 asc
    @NameInMap("Order")
    public String order;

    public static ListCodeSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCodeSourcesRequest self = new ListCodeSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListCodeSourcesRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListCodeSourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCodeSourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCodeSourcesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListCodeSourcesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
