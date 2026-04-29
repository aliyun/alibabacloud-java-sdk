// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarClawCronJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolarClawCronJobResponseBody body;

    public static DeletePolarClawCronJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarClawCronJobResponse self = new DeletePolarClawCronJobResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolarClawCronJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolarClawCronJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolarClawCronJobResponse setBody(DeletePolarClawCronJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolarClawCronJobResponseBody getBody() {
        return this.body;
    }

}
