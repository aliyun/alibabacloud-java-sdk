// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultPlayDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultPlayDomainResponseBody body;

    public static SetDefaultPlayDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultPlayDomainResponse self = new SetDefaultPlayDomainResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultPlayDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultPlayDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultPlayDomainResponse setBody(SetDefaultPlayDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultPlayDomainResponseBody getBody() {
        return this.body;
    }

}
