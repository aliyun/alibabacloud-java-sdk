// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigDirResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAdvanceConfigDirResponseBody body;

    public static ListAdvanceConfigDirResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAdvanceConfigDirResponse self = new ListAdvanceConfigDirResponse();
        return TeaModel.build(map, self);
    }

    public ListAdvanceConfigDirResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAdvanceConfigDirResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAdvanceConfigDirResponse setBody(ListAdvanceConfigDirResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAdvanceConfigDirResponseBody getBody() {
        return this.body;
    }

}
