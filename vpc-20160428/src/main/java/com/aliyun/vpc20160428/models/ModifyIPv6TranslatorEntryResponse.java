// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIPv6TranslatorEntryResponseBody body;

    public static ModifyIPv6TranslatorEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorEntryResponse self = new ModifyIPv6TranslatorEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIPv6TranslatorEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIPv6TranslatorEntryResponse setBody(ModifyIPv6TranslatorEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIPv6TranslatorEntryResponseBody getBody() {
        return this.body;
    }

}
