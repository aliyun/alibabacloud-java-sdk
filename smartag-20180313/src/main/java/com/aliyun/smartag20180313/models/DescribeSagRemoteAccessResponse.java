// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRemoteAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSagRemoteAccessResponseBody body;

    public static DescribeSagRemoteAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRemoteAccessResponse self = new DescribeSagRemoteAccessResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagRemoteAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagRemoteAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagRemoteAccessResponse setBody(DescribeSagRemoteAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagRemoteAccessResponseBody getBody() {
        return this.body;
    }

}
