// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeWatchItemsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("WatchItemIds")
    public String watchItemIds;

    @NameInMap("WatchPolicyId")
    public String watchPolicyId;

    public static DescribeWatchItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWatchItemsRequest self = new DescribeWatchItemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWatchItemsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeWatchItemsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeWatchItemsRequest setWatchItemIds(String watchItemIds) {
        this.watchItemIds = watchItemIds;
        return this;
    }
    public String getWatchItemIds() {
        return this.watchItemIds;
    }

    public DescribeWatchItemsRequest setWatchPolicyId(String watchPolicyId) {
        this.watchPolicyId = watchPolicyId;
        return this;
    }
    public String getWatchPolicyId() {
        return this.watchPolicyId;
    }

}
