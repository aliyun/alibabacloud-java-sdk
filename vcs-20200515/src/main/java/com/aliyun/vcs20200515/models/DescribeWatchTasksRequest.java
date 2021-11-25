// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeWatchTasksRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("WatchTaskIds")
    public String watchTaskIds;

    public static DescribeWatchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWatchTasksRequest self = new DescribeWatchTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWatchTasksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeWatchTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeWatchTasksRequest setWatchTaskIds(String watchTaskIds) {
        this.watchTaskIds = watchTaskIds;
        return this;
    }
    public String getWatchTaskIds() {
        return this.watchTaskIds;
    }

}
