// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyProcessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyProcessWhiteListResponseBody body;

    public static ModifyProcessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProcessWhiteListResponse self = new ModifyProcessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProcessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProcessWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProcessWhiteListResponse setBody(ModifyProcessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProcessWhiteListResponseBody getBody() {
        return this.body;
    }

}
