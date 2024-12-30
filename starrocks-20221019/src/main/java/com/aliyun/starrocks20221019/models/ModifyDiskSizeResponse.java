// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyDiskSizeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDiskSizeResponseBody body;

    public static ModifyDiskSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskSizeResponse self = new ModifyDiskSizeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskSizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskSizeResponse setBody(ModifyDiskSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskSizeResponseBody getBody() {
        return this.body;
    }

}
