// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataLimitSetResponseBody body;

    public static DescribeDataLimitSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitSetResponse self = new DescribeDataLimitSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataLimitSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataLimitSetResponse setBody(DescribeDataLimitSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataLimitSetResponseBody getBody() {
        return this.body;
    }

}
