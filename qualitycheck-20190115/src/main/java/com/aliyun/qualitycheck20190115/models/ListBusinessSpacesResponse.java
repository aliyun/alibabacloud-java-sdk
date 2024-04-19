// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListBusinessSpacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBusinessSpacesResponseBody body;

    public static ListBusinessSpacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessSpacesResponse self = new ListBusinessSpacesResponse();
        return TeaModel.build(map, self);
    }

    public ListBusinessSpacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBusinessSpacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBusinessSpacesResponse setBody(ListBusinessSpacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBusinessSpacesResponseBody getBody() {
        return this.body;
    }

}
