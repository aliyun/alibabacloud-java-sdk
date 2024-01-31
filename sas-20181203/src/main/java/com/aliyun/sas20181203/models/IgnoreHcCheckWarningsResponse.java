// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreHcCheckWarningsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IgnoreHcCheckWarningsResponseBody body;

    public static IgnoreHcCheckWarningsResponse build(java.util.Map<String, ?> map) throws Exception {
        IgnoreHcCheckWarningsResponse self = new IgnoreHcCheckWarningsResponse();
        return TeaModel.build(map, self);
    }

    public IgnoreHcCheckWarningsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IgnoreHcCheckWarningsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IgnoreHcCheckWarningsResponse setBody(IgnoreHcCheckWarningsResponseBody body) {
        this.body = body;
        return this;
    }
    public IgnoreHcCheckWarningsResponseBody getBody() {
        return this.body;
    }

}
