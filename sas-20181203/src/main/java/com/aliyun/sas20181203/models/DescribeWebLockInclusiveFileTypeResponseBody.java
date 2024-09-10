// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockInclusiveFileTypeResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the types of files that can be protected by web tamper proofing.</p>
     */
    @NameInMap("InclusiveFileType")
    public java.util.List<String> inclusiveFileType;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the types of files that can be protected by web tamper proofing.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockInclusiveFileTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockInclusiveFileTypeResponseBody self = new DescribeWebLockInclusiveFileTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockInclusiveFileTypeResponseBody setInclusiveFileType(java.util.List<String> inclusiveFileType) {
        this.inclusiveFileType = inclusiveFileType;
        return this;
    }
    public java.util.List<String> getInclusiveFileType() {
        return this.inclusiveFileType;
    }

    public DescribeWebLockInclusiveFileTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockInclusiveFileTypeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
