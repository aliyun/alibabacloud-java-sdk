// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CreatePlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePlaybookResponseBody body;

    public static CreatePlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePlaybookResponse self = new CreatePlaybookResponse();
        return TeaModel.build(map, self);
    }

    public CreatePlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePlaybookResponse setBody(CreatePlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePlaybookResponseBody getBody() {
        return this.body;
    }

}
