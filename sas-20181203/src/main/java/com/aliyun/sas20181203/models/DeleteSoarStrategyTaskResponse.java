// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSoarStrategyTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSoarStrategyTaskResponseBody body;

    public static DeleteSoarStrategyTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSoarStrategyTaskResponse self = new DeleteSoarStrategyTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSoarStrategyTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSoarStrategyTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSoarStrategyTaskResponse setBody(DeleteSoarStrategyTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSoarStrategyTaskResponseBody getBody() {
        return this.body;
    }

}
