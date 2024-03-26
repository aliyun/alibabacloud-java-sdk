// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVodDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVodDomainResponseBody body;

    public static UpdateVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVodDomainResponse self = new UpdateVodDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVodDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVodDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVodDomainResponse setBody(UpdateVodDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVodDomainResponseBody getBody() {
        return this.body;
    }

}
