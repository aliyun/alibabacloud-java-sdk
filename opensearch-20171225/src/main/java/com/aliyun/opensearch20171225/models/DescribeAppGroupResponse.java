// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppGroupResponseBody body;

    public static DescribeAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppGroupResponse self = new DescribeAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppGroupResponse setBody(DescribeAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppGroupResponseBody getBody() {
        return this.body;
    }

}
