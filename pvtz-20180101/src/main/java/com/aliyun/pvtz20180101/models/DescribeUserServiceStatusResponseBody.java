// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserServiceStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserServiceStatusResponseBody self = new DescribeUserServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserServiceStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeUserServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
