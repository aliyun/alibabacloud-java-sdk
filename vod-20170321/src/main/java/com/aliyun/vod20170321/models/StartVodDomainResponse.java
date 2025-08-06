// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class StartVodDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartVodDomainResponseBody body;

    public static StartVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StartVodDomainResponse self = new StartVodDomainResponse();
        return TeaModel.build(map, self);
    }

    public StartVodDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartVodDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartVodDomainResponse setBody(StartVodDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StartVodDomainResponseBody getBody() {
        return this.body;
    }

}
