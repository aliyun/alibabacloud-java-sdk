// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetZoneLbaStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetZoneLbaStatusResponseBody body;

    public static SetZoneLbaStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetZoneLbaStatusResponse self = new SetZoneLbaStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetZoneLbaStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetZoneLbaStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetZoneLbaStatusResponse setBody(SetZoneLbaStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetZoneLbaStatusResponseBody getBody() {
        return this.body;
    }

}
