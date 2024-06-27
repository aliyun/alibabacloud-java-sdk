// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOssAuthStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public String resultObject;

    public static DescribeOssAuthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssAuthStatusResponseBody self = new DescribeOssAuthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssAuthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssAuthStatusResponseBody setResultObject(String resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public String getResultObject() {
        return this.resultObject;
    }

}
