// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateRevisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Revision body;

    public static UpdateRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRevisionResponse self = new UpdateRevisionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRevisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRevisionResponse setBody(Revision body) {
        this.body = body;
        return this;
    }
    public Revision getBody() {
        return this.body;
    }

}
