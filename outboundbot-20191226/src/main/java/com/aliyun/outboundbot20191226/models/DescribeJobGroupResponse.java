// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeJobGroupResponseBody body;

    public static DescribeJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobGroupResponse self = new DescribeJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobGroupResponse setBody(DescribeJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobGroupResponseBody getBody() {
        return this.body;
    }

}
