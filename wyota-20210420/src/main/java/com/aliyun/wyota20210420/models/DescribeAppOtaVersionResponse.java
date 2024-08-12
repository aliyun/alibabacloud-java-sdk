// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeAppOtaVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppOtaVersionResponseBody body;

    public static DescribeAppOtaVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppOtaVersionResponse self = new DescribeAppOtaVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppOtaVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppOtaVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppOtaVersionResponse setBody(DescribeAppOtaVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppOtaVersionResponseBody getBody() {
        return this.body;
    }

}
