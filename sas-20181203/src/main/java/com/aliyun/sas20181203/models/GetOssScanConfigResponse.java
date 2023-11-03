// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOssScanConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssScanConfigResponseBody body;

    public static GetOssScanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssScanConfigResponse self = new GetOssScanConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetOssScanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssScanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssScanConfigResponse setBody(GetOssScanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssScanConfigResponseBody getBody() {
        return this.body;
    }

}
