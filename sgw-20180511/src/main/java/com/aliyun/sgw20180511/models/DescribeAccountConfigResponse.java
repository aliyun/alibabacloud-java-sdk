// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeAccountConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountConfigResponseBody body;

    public static DescribeAccountConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountConfigResponse self = new DescribeAccountConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountConfigResponse setBody(DescribeAccountConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountConfigResponseBody getBody() {
        return this.body;
    }

}
