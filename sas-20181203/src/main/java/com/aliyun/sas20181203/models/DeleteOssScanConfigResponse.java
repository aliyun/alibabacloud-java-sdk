// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteOssScanConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOssScanConfigResponseBody body;

    public static DeleteOssScanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOssScanConfigResponse self = new DeleteOssScanConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOssScanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOssScanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOssScanConfigResponse setBody(DeleteOssScanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOssScanConfigResponseBody getBody() {
        return this.body;
    }

}
