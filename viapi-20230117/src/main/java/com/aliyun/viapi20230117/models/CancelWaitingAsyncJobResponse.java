// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20230117.models;

import com.aliyun.tea.*;

public class CancelWaitingAsyncJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelWaitingAsyncJobResponseBody body;

    public static CancelWaitingAsyncJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelWaitingAsyncJobResponse self = new CancelWaitingAsyncJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelWaitingAsyncJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelWaitingAsyncJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelWaitingAsyncJobResponse setBody(CancelWaitingAsyncJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelWaitingAsyncJobResponseBody getBody() {
        return this.body;
    }

}
