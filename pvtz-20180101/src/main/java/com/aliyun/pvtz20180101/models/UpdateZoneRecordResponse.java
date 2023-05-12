// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateZoneRecordResponseBody body;

    public static UpdateZoneRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRecordResponse self = new UpdateZoneRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateZoneRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateZoneRecordResponse setBody(UpdateZoneRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateZoneRecordResponseBody getBody() {
        return this.body;
    }

}
