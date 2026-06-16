// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class OpenTrialPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenTrialPackageResponseBody body;

    public static OpenTrialPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenTrialPackageResponse self = new OpenTrialPackageResponse();
        return TeaModel.build(map, self);
    }

    public OpenTrialPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenTrialPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenTrialPackageResponse setBody(OpenTrialPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenTrialPackageResponseBody getBody() {
        return this.body;
    }

}
