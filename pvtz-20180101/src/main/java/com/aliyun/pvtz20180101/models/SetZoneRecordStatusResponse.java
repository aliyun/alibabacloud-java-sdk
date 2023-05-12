// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetZoneRecordStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetZoneRecordStatusResponseBody body;

    public static SetZoneRecordStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetZoneRecordStatusResponse self = new SetZoneRecordStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetZoneRecordStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetZoneRecordStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetZoneRecordStatusResponse setBody(SetZoneRecordStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetZoneRecordStatusResponseBody getBody() {
        return this.body;
    }

}
