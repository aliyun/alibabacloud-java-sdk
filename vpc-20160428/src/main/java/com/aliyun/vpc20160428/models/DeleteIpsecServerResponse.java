// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpsecServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpsecServerResponseBody body;

    public static DeleteIpsecServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpsecServerResponse self = new DeleteIpsecServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpsecServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpsecServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpsecServerResponse setBody(DeleteIpsecServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpsecServerResponseBody getBody() {
        return this.body;
    }

}
