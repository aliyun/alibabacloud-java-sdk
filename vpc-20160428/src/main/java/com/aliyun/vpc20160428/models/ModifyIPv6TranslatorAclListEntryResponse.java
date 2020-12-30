// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAclListEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyIPv6TranslatorAclListEntryResponse setBody(ModifyIPv6TranslatorAclListEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIPv6TranslatorAclListEntryResponseBody getBody() {
        return this.body;
    }

}
