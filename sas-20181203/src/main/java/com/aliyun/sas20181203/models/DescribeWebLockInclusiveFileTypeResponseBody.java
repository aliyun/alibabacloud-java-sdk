// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockInclusiveFileTypeResponseBody extends TeaModel {
    @NameInMap("InclusiveFileType")
    public java.util.List<String> inclusiveFileType;

    @NameInMap("RequestId")
    public String requestId;

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
