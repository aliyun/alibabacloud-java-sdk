// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDownloadUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public String resultObject;

    public static DescribeDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadUrlResponseBody self = new DescribeDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadUrlResponseBody setResultObject(String resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public String getResultObject() {
        return this.resultObject;
    }

}
