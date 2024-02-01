// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateIPv6TranslatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIPv6TranslatorResponse setBody(CreateIPv6TranslatorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIPv6TranslatorResponseBody getBody() {
        return this.body;
    }

}
