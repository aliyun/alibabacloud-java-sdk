// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasSQLDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOasSQLDetailsResponseBody body;

    public static DescribeOasSQLDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasSQLDetailsResponse self = new DescribeOasSQLDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOasSQLDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOasSQLDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOasSQLDetailsResponse setBody(DescribeOasSQLDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOasSQLDetailsResponseBody getBody() {
        return this.body;
    }

}
