// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAclListEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIPv6TranslatorAclListEntryResponseBody body;

    public static ModifyIPv6TranslatorAclListEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAclListEntryResponse self = new ModifyIPv6TranslatorAclListEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorAclListEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIPv6TranslatorAclListEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIPv6TranslatorAclListEntryResponse setBody(ModifyIPv6TranslatorAclListEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIPv6TranslatorAclListEntryResponseBody getBody() {
        return this.body;
    }

}
