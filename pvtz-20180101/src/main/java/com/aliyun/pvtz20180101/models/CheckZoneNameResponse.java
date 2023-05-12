// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class CheckZoneNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckZoneNameResponseBody body;

    public static CheckZoneNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckZoneNameResponse self = new CheckZoneNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckZoneNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckZoneNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckZoneNameResponse setBody(CheckZoneNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckZoneNameResponseBody getBody() {
        return this.body;
    }

}
