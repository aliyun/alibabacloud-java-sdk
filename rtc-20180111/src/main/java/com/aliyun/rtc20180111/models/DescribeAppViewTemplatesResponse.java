// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppViewTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppViewTemplatesResponseBody body;

    public static DescribeAppViewTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppViewTemplatesResponse self = new DescribeAppViewTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppViewTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppViewTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppViewTemplatesResponse setBody(DescribeAppViewTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppViewTemplatesResponseBody getBody() {
        return this.body;
    }

}
