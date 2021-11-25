// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeWatchPoliciesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("WatchPolicyIds")
    public String watchPolicyIds;

    public static DescribeWatchPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWatchPoliciesRequest self = new DescribeWatchPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWatchPoliciesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeWatchPoliciesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeWatchPoliciesRequest setWatchPolicyIds(String watchPolicyIds) {
        this.watchPolicyIds = watchPolicyIds;
        return this;
    }
    public String getWatchPolicyIds() {
        return this.watchPolicyIds;
    }

}
