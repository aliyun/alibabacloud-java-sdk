// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteZoneRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteZoneRecordResponseBody body;

    public static DeleteZoneRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteZoneRecordResponse self = new DeleteZoneRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteZoneRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteZoneRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteZoneRecordResponse setBody(DeleteZoneRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteZoneRecordResponseBody getBody() {
        return this.body;
    }

}
