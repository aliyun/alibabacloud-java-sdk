// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAclAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIPv6TranslatorAclAttributeResponseBody body;

    public static ModifyIPv6TranslatorAclAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAclAttributeResponse self = new ModifyIPv6TranslatorAclAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorAclAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIPv6TranslatorAclAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIPv6TranslatorAclAttributeResponse setBody(ModifyIPv6TranslatorAclAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIPv6TranslatorAclAttributeResponseBody getBody() {
        return this.body;
    }

}
