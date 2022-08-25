// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class VerifyVodDomainOwnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
