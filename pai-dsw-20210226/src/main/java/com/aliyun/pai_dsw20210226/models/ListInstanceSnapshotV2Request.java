// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstanceSnapshotV2Request extends TeaModel {
    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    public static ListInstanceSnapshotV2Request build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceSnapshotV2Request self = new ListInstanceSnapshotV2Request();
        return TeaModel.build(map, self);
    }

    public ListInstanceSnapshotV2Request setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListInstanceSnapshotV2Request setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceSnapshotV2Request setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListInstanceSnapshotV2Request setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
