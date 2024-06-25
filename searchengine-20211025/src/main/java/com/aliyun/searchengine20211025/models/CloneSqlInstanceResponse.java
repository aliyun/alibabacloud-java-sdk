// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CloneSqlInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneSqlInstanceResponseBody body;

    public static CloneSqlInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneSqlInstanceResponse self = new CloneSqlInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CloneSqlInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneSqlInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneSqlInstanceResponse setBody(CloneSqlInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneSqlInstanceResponseBody getBody() {
        return this.body;
    }

}
