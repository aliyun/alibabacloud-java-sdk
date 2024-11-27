// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnsInstanceUpdateResponseBody body;

    public static OnsInstanceUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceUpdateResponse self = new OnsInstanceUpdateResponse();
        return TeaModel.build(map, self);
    }

    public OnsInstanceUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsInstanceUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsInstanceUpdateResponse setBody(OnsInstanceUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsInstanceUpdateResponseBody getBody() {
        return this.body;
    }

}
