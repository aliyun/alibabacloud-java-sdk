// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetShareLinkByAnonymousResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetShareLinkByAnonymousResponseBody body;

    public static GetShareLinkByAnonymousResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShareLinkByAnonymousResponse self = new GetShareLinkByAnonymousResponse();
        return TeaModel.build(map, self);
    }

    public GetShareLinkByAnonymousResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShareLinkByAnonymousResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShareLinkByAnonymousResponse setBody(GetShareLinkByAnonymousResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShareLinkByAnonymousResponseBody getBody() {
        return this.body;
    }

}
