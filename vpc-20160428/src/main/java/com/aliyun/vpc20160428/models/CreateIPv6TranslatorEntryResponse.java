// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIPv6TranslatorEntryResponseBody body;

    public static CreateIPv6TranslatorEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorEntryResponse self = new CreateIPv6TranslatorEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateIPv6TranslatorEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIPv6TranslatorEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIPv6TranslatorEntryResponse setBody(CreateIPv6TranslatorEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIPv6TranslatorEntryResponseBody getBody() {
        return this.body;
    }

}
