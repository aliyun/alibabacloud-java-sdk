// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetShareLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ShareLink body;

    public static GetShareLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShareLinkResponse self = new GetShareLinkResponse();
        return TeaModel.build(map, self);
    }

    public GetShareLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShareLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShareLinkResponse setBody(ShareLink body) {
        this.body = body;
        return this;
    }
    public ShareLink getBody() {
        return this.body;
    }

}
