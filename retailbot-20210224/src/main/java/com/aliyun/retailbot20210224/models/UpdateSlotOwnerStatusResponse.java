// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateSlotOwnerStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSlotOwnerStatusResponseBody body;

    public static UpdateSlotOwnerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlotOwnerStatusResponse self = new UpdateSlotOwnerStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSlotOwnerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSlotOwnerStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSlotOwnerStatusResponse setBody(UpdateSlotOwnerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSlotOwnerStatusResponseBody getBody() {
        return this.body;
    }

}
