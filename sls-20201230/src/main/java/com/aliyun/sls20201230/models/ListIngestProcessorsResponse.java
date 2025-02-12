// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListIngestProcessorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIngestProcessorsResponseBody body;

    public static ListIngestProcessorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIngestProcessorsResponse self = new ListIngestProcessorsResponse();
        return TeaModel.build(map, self);
    }

    public ListIngestProcessorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIngestProcessorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIngestProcessorsResponse setBody(ListIngestProcessorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIngestProcessorsResponseBody getBody() {
        return this.body;
    }

}
