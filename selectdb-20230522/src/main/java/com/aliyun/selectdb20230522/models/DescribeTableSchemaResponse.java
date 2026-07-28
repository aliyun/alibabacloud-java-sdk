// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeTableSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTableSchemaResponseBody body;

    public static DescribeTableSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableSchemaResponse self = new DescribeTableSchemaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTableSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTableSchemaResponse setBody(DescribeTableSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTableSchemaResponseBody getBody() {
        return this.body;
    }

}
