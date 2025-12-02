// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class ListPlaybooksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPlaybooksResponseBody body;

    public static ListPlaybooksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPlaybooksResponse self = new ListPlaybooksResponse();
        return TeaModel.build(map, self);
    }

    public ListPlaybooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPlaybooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPlaybooksResponse setBody(ListPlaybooksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPlaybooksResponseBody getBody() {
        return this.body;
    }

}
