// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyBaseTemplateStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBaseTemplateStateResponseBody body;

    public static ModifyBaseTemplateStateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBaseTemplateStateResponse self = new ModifyBaseTemplateStateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBaseTemplateStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBaseTemplateStateResponse setBody(ModifyBaseTemplateStateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBaseTemplateStateResponseBody getBody() {
        return this.body;
    }

}
