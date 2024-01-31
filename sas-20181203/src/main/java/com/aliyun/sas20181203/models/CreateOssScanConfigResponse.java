// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOssScanConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOssScanConfigResponseBody body;

    public static CreateOssScanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOssScanConfigResponse self = new CreateOssScanConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateOssScanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOssScanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOssScanConfigResponse setBody(CreateOssScanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOssScanConfigResponseBody getBody() {
        return this.body;
    }

}
