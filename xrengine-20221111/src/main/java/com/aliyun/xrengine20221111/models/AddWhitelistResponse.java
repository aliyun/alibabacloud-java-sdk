// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class AddWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddWhitelistResponseBody body;

    public static AddWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWhitelistResponse self = new AddWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public AddWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWhitelistResponse setBody(AddWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWhitelistResponseBody getBody() {
        return this.body;
    }

}
