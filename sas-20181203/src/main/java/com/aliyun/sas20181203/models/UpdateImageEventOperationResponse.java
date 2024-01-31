// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageEventOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateImageEventOperationResponseBody body;

    public static UpdateImageEventOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageEventOperationResponse self = new UpdateImageEventOperationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageEventOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageEventOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateImageEventOperationResponse setBody(UpdateImageEventOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageEventOperationResponseBody getBody() {
        return this.body;
    }

}
