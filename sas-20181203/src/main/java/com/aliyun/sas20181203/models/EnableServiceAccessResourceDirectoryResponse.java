// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableServiceAccessResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableServiceAccessResourceDirectoryResponseBody body;

    public static EnableServiceAccessResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceAccessResourceDirectoryResponse self = new EnableServiceAccessResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public EnableServiceAccessResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableServiceAccessResourceDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableServiceAccessResourceDirectoryResponse setBody(EnableServiceAccessResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableServiceAccessResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
