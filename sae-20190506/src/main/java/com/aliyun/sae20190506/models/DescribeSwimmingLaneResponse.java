// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSwimmingLaneResponseBody body;

    public static DescribeSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSwimmingLaneResponse self = new DescribeSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSwimmingLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSwimmingLaneResponse setBody(DescribeSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
