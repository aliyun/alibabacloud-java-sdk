// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListFacegroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFacegroupsResponseBody body;

    public static ListFacegroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFacegroupsResponse self = new ListFacegroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListFacegroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFacegroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFacegroupsResponse setBody(ListFacegroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFacegroupsResponseBody getBody() {
        return this.body;
    }

}
