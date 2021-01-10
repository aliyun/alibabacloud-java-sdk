// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyQueryProcessorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyQueryProcessorResponseBody body;

    public static ModifyQueryProcessorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyQueryProcessorResponse self = new ModifyQueryProcessorResponse();
        return TeaModel.build(map, self);
    }

    public ModifyQueryProcessorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyQueryProcessorResponse setBody(ModifyQueryProcessorResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyQueryProcessorResponseBody getBody() {
        return this.body;
    }

}
