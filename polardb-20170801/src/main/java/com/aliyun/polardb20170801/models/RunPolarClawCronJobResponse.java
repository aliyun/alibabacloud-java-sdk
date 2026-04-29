// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RunPolarClawCronJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunPolarClawCronJobResponseBody body;

    public static RunPolarClawCronJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RunPolarClawCronJobResponse self = new RunPolarClawCronJobResponse();
        return TeaModel.build(map, self);
    }

    public RunPolarClawCronJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunPolarClawCronJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunPolarClawCronJobResponse setBody(RunPolarClawCronJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RunPolarClawCronJobResponseBody getBody() {
        return this.body;
    }

}
