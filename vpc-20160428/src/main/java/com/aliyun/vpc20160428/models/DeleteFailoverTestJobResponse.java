// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteFailoverTestJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFailoverTestJobResponseBody body;

    public static DeleteFailoverTestJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFailoverTestJobResponse self = new DeleteFailoverTestJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFailoverTestJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFailoverTestJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFailoverTestJobResponse setBody(DeleteFailoverTestJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFailoverTestJobResponseBody getBody() {
        return this.body;
    }

}
