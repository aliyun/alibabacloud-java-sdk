// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class VerifyVodDomainOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyVodDomainOwnerResponseBody body;

    public static VerifyVodDomainOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyVodDomainOwnerResponse self = new VerifyVodDomainOwnerResponse();
        return TeaModel.build(map, self);
    }

    public VerifyVodDomainOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyVodDomainOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyVodDomainOwnerResponse setBody(VerifyVodDomainOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyVodDomainOwnerResponseBody getBody() {
        return this.body;
    }

}
