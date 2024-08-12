// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListFbIssueLabelsByLCResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFbIssueLabelsByLCResponseBody body;

    public static ListFbIssueLabelsByLCResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFbIssueLabelsByLCResponse self = new ListFbIssueLabelsByLCResponse();
        return TeaModel.build(map, self);
    }

    public ListFbIssueLabelsByLCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFbIssueLabelsByLCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFbIssueLabelsByLCResponse setBody(ListFbIssueLabelsByLCResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFbIssueLabelsByLCResponseBody getBody() {
        return this.body;
    }

}
