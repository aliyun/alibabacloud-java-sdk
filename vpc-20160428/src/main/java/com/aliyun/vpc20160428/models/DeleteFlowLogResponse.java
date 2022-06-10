// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteFlowLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowLogResponseBody body;

    public static DeleteFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowLogResponse self = new DeleteFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlowLogResponse setBody(DeleteFlowLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowLogResponseBody getBody() {
        return this.body;
    }

}
