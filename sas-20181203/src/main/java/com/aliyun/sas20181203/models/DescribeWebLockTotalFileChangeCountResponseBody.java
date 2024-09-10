// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockTotalFileChangeCountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E70074C8-DFB4-44C5-96C7-909DD231D68A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of times that the files protected by web tamper proofing are changed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
