// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteZoneRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteZoneRecordResponse setBody(DeleteZoneRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteZoneRecordResponseBody getBody() {
        return this.body;
    }

}
