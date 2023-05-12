// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddZoneRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddZoneRecordResponseBody body;

    public static AddZoneRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        AddZoneRecordResponse self = new AddZoneRecordResponse();
        return TeaModel.build(map, self);
    }

    public AddZoneRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddZoneRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddZoneRecordResponse setBody(AddZoneRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public AddZoneRecordResponseBody getBody() {
        return this.body;
    }

}
