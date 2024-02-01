// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddIPv6TranslatorAclListEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddIPv6TranslatorAclListEntryResponseBody body;

    public static AddIPv6TranslatorAclListEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIPv6TranslatorAclListEntryResponse self = new AddIPv6TranslatorAclListEntryResponse();
        return TeaModel.build(map, self);
    }

    public AddIPv6TranslatorAclListEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIPv6TranslatorAclListEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddIPv6TranslatorAclListEntryResponse setBody(AddIPv6TranslatorAclListEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIPv6TranslatorAclListEntryResponseBody getBody() {
        return this.body;
    }

}
