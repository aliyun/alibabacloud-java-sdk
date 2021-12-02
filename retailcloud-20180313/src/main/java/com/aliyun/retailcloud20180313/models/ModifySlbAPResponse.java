// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ModifySlbAPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySlbAPResponseBody body;

    public static ModifySlbAPResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySlbAPResponse self = new ModifySlbAPResponse();
        return TeaModel.build(map, self);
    }

    public ModifySlbAPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySlbAPResponse setBody(ModifySlbAPResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySlbAPResponseBody getBody() {
        return this.body;
    }

}
