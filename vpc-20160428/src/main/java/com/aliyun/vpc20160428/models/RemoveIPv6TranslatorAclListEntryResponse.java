// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveIPv6TranslatorAclListEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveIPv6TranslatorAclListEntryResponseBody body;

    public static RemoveIPv6TranslatorAclListEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveIPv6TranslatorAclListEntryResponse self = new RemoveIPv6TranslatorAclListEntryResponse();
        return TeaModel.build(map, self);
    }

    public RemoveIPv6TranslatorAclListEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveIPv6TranslatorAclListEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveIPv6TranslatorAclListEntryResponse setBody(RemoveIPv6TranslatorAclListEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveIPv6TranslatorAclListEntryResponseBody getBody() {
        return this.body;
    }

}
