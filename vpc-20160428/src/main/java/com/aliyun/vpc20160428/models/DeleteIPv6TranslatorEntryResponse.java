// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIPv6TranslatorEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIPv6TranslatorEntryResponseBody body;

    public static DeleteIPv6TranslatorEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPv6TranslatorEntryResponse self = new DeleteIPv6TranslatorEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIPv6TranslatorEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIPv6TranslatorEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIPv6TranslatorEntryResponse setBody(DeleteIPv6TranslatorEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIPv6TranslatorEntryResponseBody getBody() {
        return this.body;
    }

}
