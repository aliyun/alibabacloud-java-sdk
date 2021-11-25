// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    // 是否返回详情(Quotas, Members)
    @NameInMap("NeedDetail")
    public Boolean needDetail;

    // 排列顺序: desc 或者 asc
    @NameInMap("Order")
    public String order;

    // 查询第几页数据,最小值为1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 设置查询的分页大小,最小值为1
    @NameInMap("PageSize")
    public Integer pageSize;

    // 返回结果的排序字段名，枚举值
    @NameInMap("SortBy")
    public String sortBy;

    public static ListWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesRequest self = new ListWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesRequest setNeedDetail(Boolean needDetail) {
        this.needDetail = needDetail;
        return this;
    }
    public Boolean getNeedDetail() {
        return this.needDetail;
    }

    public ListWorkspacesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListWorkspacesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkspacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkspacesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
