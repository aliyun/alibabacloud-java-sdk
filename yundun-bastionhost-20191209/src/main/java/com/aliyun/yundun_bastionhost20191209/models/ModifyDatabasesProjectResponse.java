// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabasesProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDatabasesProjectResponseBody body;

    public static ModifyDatabasesProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabasesProjectResponse self = new ModifyDatabasesProjectResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDatabasesProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDatabasesProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDatabasesProjectResponse setBody(ModifyDatabasesProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDatabasesProjectResponseBody getBody() {
        return this.body;
    }

}
