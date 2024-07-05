// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePublishStreamStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public Long message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePublishStreamStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePublishStreamStatusResponseBody self = new DescribePublishStreamStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePublishStreamStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribePublishStreamStatusResponseBody setMessage(Long message) {
        this.message = message;
        return this;
    }
    public Long getMessage() {
        return this.message;
    }

    public DescribePublishStreamStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
