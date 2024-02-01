// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateIpsecServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIpsecServerResponseBody body;

    public static UpdateIpsecServerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpsecServerResponse self = new UpdateIpsecServerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpsecServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpsecServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpsecServerResponse setBody(UpdateIpsecServerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpsecServerResponseBody getBody() {
        return this.body;
    }

}
