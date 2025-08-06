// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class StopVodDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopVodDomainResponseBody body;

    public static StopVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopVodDomainResponse self = new StopVodDomainResponse();
        return TeaModel.build(map, self);
    }

    public StopVodDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopVodDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopVodDomainResponse setBody(StopVodDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StopVodDomainResponseBody getBody() {
        return this.body;
    }

}
