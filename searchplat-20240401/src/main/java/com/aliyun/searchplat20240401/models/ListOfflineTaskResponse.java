// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListOfflineTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOfflineTaskResponseBody body;

    public static ListOfflineTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineTaskResponse self = new ListOfflineTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListOfflineTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOfflineTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOfflineTaskResponse setBody(ListOfflineTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOfflineTaskResponseBody getBody() {
        return this.body;
    }

}
