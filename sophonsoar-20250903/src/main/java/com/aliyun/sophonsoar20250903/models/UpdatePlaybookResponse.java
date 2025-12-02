// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class UpdatePlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePlaybookResponseBody body;

    public static UpdatePlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePlaybookResponse self = new UpdatePlaybookResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePlaybookResponse setBody(UpdatePlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePlaybookResponseBody getBody() {
        return this.body;
    }

}
