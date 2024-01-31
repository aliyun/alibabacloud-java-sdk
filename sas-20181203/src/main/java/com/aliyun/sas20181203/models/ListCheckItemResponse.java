// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckItemResponseBody body;

    public static ListCheckItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemResponse self = new ListCheckItemResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckItemResponse setBody(ListCheckItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckItemResponseBody getBody() {
        return this.body;
    }

}
