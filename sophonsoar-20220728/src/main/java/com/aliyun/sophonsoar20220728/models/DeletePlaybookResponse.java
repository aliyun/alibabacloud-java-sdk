// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DeletePlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePlaybookResponseBody body;

    public static DeletePlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePlaybookResponse self = new DeletePlaybookResponse();
        return TeaModel.build(map, self);
    }

    public DeletePlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePlaybookResponse setBody(DeletePlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePlaybookResponseBody getBody() {
        return this.body;
    }

}
