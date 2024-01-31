// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FixCheckWarningsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FixCheckWarningsResponseBody body;

    public static FixCheckWarningsResponse build(java.util.Map<String, ?> map) throws Exception {
        FixCheckWarningsResponse self = new FixCheckWarningsResponse();
        return TeaModel.build(map, self);
    }

    public FixCheckWarningsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FixCheckWarningsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FixCheckWarningsResponse setBody(FixCheckWarningsResponseBody body) {
        this.body = body;
        return this;
    }
    public FixCheckWarningsResponseBody getBody() {
        return this.body;
    }

}
