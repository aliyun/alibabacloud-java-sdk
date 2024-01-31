// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOssScanConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOssScanConfigResponseBody body;

    public static UpdateOssScanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssScanConfigResponse self = new UpdateOssScanConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOssScanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOssScanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOssScanConfigResponse setBody(UpdateOssScanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOssScanConfigResponseBody getBody() {
        return this.body;
    }

}
