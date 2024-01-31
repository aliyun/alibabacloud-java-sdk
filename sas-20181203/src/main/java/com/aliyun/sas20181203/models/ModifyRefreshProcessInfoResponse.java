// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRefreshProcessInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRefreshProcessInfoResponseBody body;

    public static ModifyRefreshProcessInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefreshProcessInfoResponse self = new ModifyRefreshProcessInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRefreshProcessInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRefreshProcessInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRefreshProcessInfoResponse setBody(ModifyRefreshProcessInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRefreshProcessInfoResponseBody getBody() {
        return this.body;
    }

}
