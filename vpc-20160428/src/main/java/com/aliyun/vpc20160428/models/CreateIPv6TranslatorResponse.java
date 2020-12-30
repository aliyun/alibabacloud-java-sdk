// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIPv6TranslatorResponseBody body;

    public static CreateIPv6TranslatorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorResponse self = new CreateIPv6TranslatorResponse();
        return TeaModel.build(map, self);
    }

    public CreateIPv6TranslatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIPv6TranslatorResponse setBody(CreateIPv6TranslatorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIPv6TranslatorResponseBody getBody() {
        return this.body;
    }

}
