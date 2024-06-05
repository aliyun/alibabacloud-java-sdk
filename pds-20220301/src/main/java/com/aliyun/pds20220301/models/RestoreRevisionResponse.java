// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RestoreRevisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Revision body;

    public static RestoreRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreRevisionResponse self = new RestoreRevisionResponse();
        return TeaModel.build(map, self);
    }

    public RestoreRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreRevisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreRevisionResponse setBody(Revision body) {
        this.body = body;
        return this;
    }
    public Revision getBody() {
        return this.body;
    }

}
