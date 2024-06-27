// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSafConsoleResponseBody body;

    public static DescribeSafConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafConsoleResponse self = new DescribeSafConsoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSafConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSafConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSafConsoleResponse setBody(DescribeSafConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSafConsoleResponseBody getBody() {
        return this.body;
    }

}
