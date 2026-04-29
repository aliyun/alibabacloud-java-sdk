// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisablePolarClawCronJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisablePolarClawCronJobResponseBody body;

    public static DisablePolarClawCronJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DisablePolarClawCronJobResponse self = new DisablePolarClawCronJobResponse();
        return TeaModel.build(map, self);
    }

    public DisablePolarClawCronJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisablePolarClawCronJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisablePolarClawCronJobResponse setBody(DisablePolarClawCronJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DisablePolarClawCronJobResponseBody getBody() {
        return this.body;
    }

}
