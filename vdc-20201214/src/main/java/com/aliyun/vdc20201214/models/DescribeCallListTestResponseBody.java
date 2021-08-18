// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallListTestResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCallListTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallListTestResponseBody self = new DescribeCallListTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCallListTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
