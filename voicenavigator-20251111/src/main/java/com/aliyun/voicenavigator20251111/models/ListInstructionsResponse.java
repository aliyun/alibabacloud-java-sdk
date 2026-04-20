// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListInstructionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstructionsResponseBody body;

    public static ListInstructionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstructionsResponse self = new ListInstructionsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstructionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstructionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstructionsResponse setBody(ListInstructionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstructionsResponseBody getBody() {
        return this.body;
    }

}
