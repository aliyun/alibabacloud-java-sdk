// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListAreasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAreasResponseBody body;

    public static ListAreasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAreasResponse self = new ListAreasResponse();
        return TeaModel.build(map, self);
    }

    public ListAreasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAreasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAreasResponse setBody(ListAreasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAreasResponseBody getBody() {
        return this.body;
    }

}
