// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListRecyclebinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecyclebinResponseBody body;

    public static ListRecyclebinResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecyclebinResponse self = new ListRecyclebinResponse();
        return TeaModel.build(map, self);
    }

    public ListRecyclebinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecyclebinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecyclebinResponse setBody(ListRecyclebinResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecyclebinResponseBody getBody() {
        return this.body;
    }

}
