// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyDiskTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDiskTypeResponseBody body;

    public static ModifyDiskTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskTypeResponse self = new ModifyDiskTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskTypeResponse setBody(ModifyDiskTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskTypeResponseBody getBody() {
        return this.body;
    }

}
