// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyDataSourceDeployResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDataSourceDeployResponseBody body;

    public static ModifyDataSourceDeployResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceDeployResponse self = new ModifyDataSourceDeployResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceDeployResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataSourceDeployResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDataSourceDeployResponse setBody(ModifyDataSourceDeployResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataSourceDeployResponseBody getBody() {
        return this.body;
    }

}
