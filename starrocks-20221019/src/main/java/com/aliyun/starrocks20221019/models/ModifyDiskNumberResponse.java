// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyDiskNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDiskNumberResponseBody body;

    public static ModifyDiskNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskNumberResponse self = new ModifyDiskNumberResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskNumberResponse setBody(ModifyDiskNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskNumberResponseBody getBody() {
        return this.body;
    }

}
