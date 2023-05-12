// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddZoneResponseBody body;

    public static AddZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        AddZoneResponse self = new AddZoneResponse();
        return TeaModel.build(map, self);
    }

    public AddZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddZoneResponse setBody(AddZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public AddZoneResponseBody getBody() {
        return this.body;
    }

}
