// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnsGroupCreateResponseBody body;

    public static OnsGroupCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupCreateResponse self = new OnsGroupCreateResponse();
        return TeaModel.build(map, self);
    }

    public OnsGroupCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsGroupCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsGroupCreateResponse setBody(OnsGroupCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsGroupCreateResponseBody getBody() {
        return this.body;
    }

}
