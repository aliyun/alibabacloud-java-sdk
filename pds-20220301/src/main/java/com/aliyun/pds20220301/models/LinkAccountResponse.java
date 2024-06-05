// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class LinkAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Token body;

    public static LinkAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        LinkAccountResponse self = new LinkAccountResponse();
        return TeaModel.build(map, self);
    }

    public LinkAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LinkAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LinkAccountResponse setBody(Token body) {
        this.body = body;
        return this;
    }
    public Token getBody() {
        return this.body;
    }

}
