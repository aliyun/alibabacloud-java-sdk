// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppCallbackSecretKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppCallbackSecretKeyResponseBody body;

    public static DescribeAppCallbackSecretKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppCallbackSecretKeyResponse self = new DescribeAppCallbackSecretKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppCallbackSecretKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppCallbackSecretKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppCallbackSecretKeyResponse setBody(DescribeAppCallbackSecretKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppCallbackSecretKeyResponseBody getBody() {
        return this.body;
    }

}
