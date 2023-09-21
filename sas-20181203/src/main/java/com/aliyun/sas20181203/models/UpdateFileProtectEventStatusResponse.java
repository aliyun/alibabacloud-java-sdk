// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectEventStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFileProtectEventStatusResponseBody body;

    public static UpdateFileProtectEventStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectEventStatusResponse self = new UpdateFileProtectEventStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectEventStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileProtectEventStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileProtectEventStatusResponse setBody(UpdateFileProtectEventStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileProtectEventStatusResponseBody getBody() {
        return this.body;
    }

}
