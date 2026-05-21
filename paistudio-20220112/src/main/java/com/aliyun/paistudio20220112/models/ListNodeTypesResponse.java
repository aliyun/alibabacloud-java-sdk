// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodeTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodeTypesResponseBody body;

    public static ListNodeTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeTypesResponse self = new ListNodeTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeTypesResponse setBody(ListNodeTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeTypesResponseBody getBody() {
        return this.body;
    }

}
