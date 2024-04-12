// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteHistoryJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHistoryJobResponseBody body;

    public static DeleteHistoryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHistoryJobResponse self = new DeleteHistoryJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHistoryJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHistoryJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHistoryJobResponse setBody(DeleteHistoryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHistoryJobResponseBody getBody() {
        return this.body;
    }

}
