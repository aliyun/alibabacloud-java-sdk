// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawCronJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePolarClawCronJobResponseBody body;

    public static UpdatePolarClawCronJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawCronJobResponse self = new UpdatePolarClawCronJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawCronJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolarClawCronJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePolarClawCronJobResponse setBody(UpdatePolarClawCronJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolarClawCronJobResponseBody getBody() {
        return this.body;
    }

}
