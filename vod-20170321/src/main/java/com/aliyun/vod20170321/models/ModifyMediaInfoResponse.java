// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ModifyMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMediaInfoResponseBody body;

    public static ModifyMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMediaInfoResponse self = new ModifyMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMediaInfoResponse setBody(ModifyMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMediaInfoResponseBody getBody() {
        return this.body;
    }

}
