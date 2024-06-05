// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateShareLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ShareLink body;

    public static CreateShareLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShareLinkResponse self = new CreateShareLinkResponse();
        return TeaModel.build(map, self);
    }

    public CreateShareLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateShareLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateShareLinkResponse setBody(ShareLink body) {
        this.body = body;
        return this;
    }
    public ShareLink getBody() {
        return this.body;
    }

}
