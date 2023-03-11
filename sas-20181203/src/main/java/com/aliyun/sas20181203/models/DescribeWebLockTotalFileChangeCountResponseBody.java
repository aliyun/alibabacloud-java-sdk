// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockTotalFileChangeCountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of times that the files protected by web tamper proofing are changed.</p>
     */
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
