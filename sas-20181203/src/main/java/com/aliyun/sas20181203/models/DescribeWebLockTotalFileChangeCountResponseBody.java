// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockTotalFileChangeCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeWebLockTotalFileChangeCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockTotalFileChangeCountResponseBody self = new DescribeWebLockTotalFileChangeCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockTotalFileChangeCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockTotalFileChangeCountResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
