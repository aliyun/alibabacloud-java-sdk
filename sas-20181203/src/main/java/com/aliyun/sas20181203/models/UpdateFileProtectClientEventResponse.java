// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectClientEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFileProtectClientEventResponseBody body;

    public static UpdateFileProtectClientEventResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectClientEventResponse self = new UpdateFileProtectClientEventResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectClientEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileProtectClientEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileProtectClientEventResponse setBody(UpdateFileProtectClientEventResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileProtectClientEventResponseBody getBody() {
        return this.body;
    }

}
