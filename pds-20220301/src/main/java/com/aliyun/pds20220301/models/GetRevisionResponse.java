// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetRevisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Revision body;

    public static GetRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRevisionResponse self = new GetRevisionResponse();
        return TeaModel.build(map, self);
    }

    public GetRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRevisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRevisionResponse setBody(Revision body) {
        this.body = body;
        return this;
    }
    public Revision getBody() {
        return this.body;
    }

}
