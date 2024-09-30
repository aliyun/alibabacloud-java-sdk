// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListSupportResourceTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupportResourceTypesResponseBody body;

    public static ListSupportResourceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupportResourceTypesResponse self = new ListSupportResourceTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListSupportResourceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupportResourceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupportResourceTypesResponse setBody(ListSupportResourceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupportResourceTypesResponseBody getBody() {
        return this.body;
    }

}
