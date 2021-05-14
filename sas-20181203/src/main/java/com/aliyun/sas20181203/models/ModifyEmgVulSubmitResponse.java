// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyEmgVulSubmitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyEmgVulSubmitResponseBody body;

    public static ModifyEmgVulSubmitResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEmgVulSubmitResponse self = new ModifyEmgVulSubmitResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEmgVulSubmitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEmgVulSubmitResponse setBody(ModifyEmgVulSubmitResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEmgVulSubmitResponseBody getBody() {
        return this.body;
    }

}
