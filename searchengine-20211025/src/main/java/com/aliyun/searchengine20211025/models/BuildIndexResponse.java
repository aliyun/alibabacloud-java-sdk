// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class BuildIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BuildIndexResponseBody body;

    public static BuildIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        BuildIndexResponse self = new BuildIndexResponse();
        return TeaModel.build(map, self);
    }

    public BuildIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BuildIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BuildIndexResponse setBody(BuildIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public BuildIndexResponseBody getBody() {
        return this.body;
    }

}
