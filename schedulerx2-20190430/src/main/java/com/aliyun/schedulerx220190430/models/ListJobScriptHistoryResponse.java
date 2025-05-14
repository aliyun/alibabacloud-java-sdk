// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListJobScriptHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobScriptHistoryResponseBody body;

    public static ListJobScriptHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobScriptHistoryResponse self = new ListJobScriptHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListJobScriptHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobScriptHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobScriptHistoryResponse setBody(ListJobScriptHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobScriptHistoryResponseBody getBody() {
        return this.body;
    }

}
