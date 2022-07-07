// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSortScriptsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSortScriptsResponseBody body;

    public static ListSortScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSortScriptsResponse self = new ListSortScriptsResponse();
        return TeaModel.build(map, self);
    }

    public ListSortScriptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSortScriptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSortScriptsResponse setBody(ListSortScriptsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSortScriptsResponseBody getBody() {
        return this.body;
    }

}
