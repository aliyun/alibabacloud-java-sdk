// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class GetPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPlaybookResponseBody body;

    public static GetPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlaybookResponse self = new GetPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public GetPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPlaybookResponse setBody(GetPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPlaybookResponseBody getBody() {
        return this.body;
    }

}
