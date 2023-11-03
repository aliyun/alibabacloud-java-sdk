// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVirusScanConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetVirusScanConfigResponseBody body;

    public static GetVirusScanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVirusScanConfigResponse self = new GetVirusScanConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetVirusScanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVirusScanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVirusScanConfigResponse setBody(GetVirusScanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVirusScanConfigResponseBody getBody() {
        return this.body;
    }

}
