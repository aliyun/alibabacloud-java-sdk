// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockExclusiveFileTypeResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the types of the files that are excluded from web tamper proofing.</p>
     */
    @NameInMap("ExclusiveFileType")
    public java.util.List<String> exclusiveFileType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9CCD7D51-5E81-5FF5-BD74-813DDD248430</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of types of the files that are excluded from web tamper proofing.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockExclusiveFileTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockExclusiveFileTypeResponseBody self = new DescribeWebLockExclusiveFileTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockExclusiveFileTypeResponseBody setExclusiveFileType(java.util.List<String> exclusiveFileType) {
        this.exclusiveFileType = exclusiveFileType;
        return this;
    }
    public java.util.List<String> getExclusiveFileType() {
        return this.exclusiveFileType;
    }

    public DescribeWebLockExclusiveFileTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockExclusiveFileTypeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
