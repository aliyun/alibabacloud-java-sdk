// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIPv6TranslatorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIPv6TranslatorResponseBody body;

    public static DeleteIPv6TranslatorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPv6TranslatorResponse self = new DeleteIPv6TranslatorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIPv6TranslatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIPv6TranslatorResponse setBody(DeleteIPv6TranslatorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIPv6TranslatorResponseBody getBody() {
        return this.body;
    }

}
