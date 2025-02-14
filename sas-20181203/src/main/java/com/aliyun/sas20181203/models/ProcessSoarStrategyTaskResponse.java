// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ProcessSoarStrategyTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProcessSoarStrategyTaskResponseBody body;

    public static ProcessSoarStrategyTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessSoarStrategyTaskResponse self = new ProcessSoarStrategyTaskResponse();
        return TeaModel.build(map, self);
    }

    public ProcessSoarStrategyTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessSoarStrategyTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProcessSoarStrategyTaskResponse setBody(ProcessSoarStrategyTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessSoarStrategyTaskResponseBody getBody() {
        return this.body;
    }

}
