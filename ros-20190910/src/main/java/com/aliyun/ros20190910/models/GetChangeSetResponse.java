// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetChangeSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChangeSetResponseBody body;

    public static GetChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChangeSetResponse self = new GetChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public GetChangeSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChangeSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChangeSetResponse setBody(GetChangeSetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChangeSetResponseBody getBody() {
        return this.body;
    }

}
