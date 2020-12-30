// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIPv6TranslatorAttributeResponseBody body;

    public static ModifyIPv6TranslatorAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAttributeResponse self = new ModifyIPv6TranslatorAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIPv6TranslatorAttributeResponse setBody(ModifyIPv6TranslatorAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIPv6TranslatorAttributeResponseBody getBody() {
        return this.body;
    }

}
