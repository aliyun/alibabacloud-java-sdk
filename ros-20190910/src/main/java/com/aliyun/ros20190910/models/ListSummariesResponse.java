// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListSummariesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSummariesResponseBody body;

    public static ListSummariesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSummariesResponse self = new ListSummariesResponse();
        return TeaModel.build(map, self);
    }

    public ListSummariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSummariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSummariesResponse setBody(ListSummariesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSummariesResponseBody getBody() {
        return this.body;
    }

}
