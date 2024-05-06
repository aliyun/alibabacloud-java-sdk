// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class BindSecureMobilePhoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindSecureMobilePhoneResponseBody body;

    public static BindSecureMobilePhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        BindSecureMobilePhoneResponse self = new BindSecureMobilePhoneResponse();
        return TeaModel.build(map, self);
    }

    public BindSecureMobilePhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindSecureMobilePhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindSecureMobilePhoneResponse setBody(BindSecureMobilePhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public BindSecureMobilePhoneResponseBody getBody() {
        return this.body;
    }

}
