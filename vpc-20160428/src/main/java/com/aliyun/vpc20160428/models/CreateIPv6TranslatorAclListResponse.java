// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorAclListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIPv6TranslatorAclListResponseBody body;

    public static CreateIPv6TranslatorAclListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorAclListResponse self = new CreateIPv6TranslatorAclListResponse();
        return TeaModel.build(map, self);
    }

    public CreateIPv6TranslatorAclListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIPv6TranslatorAclListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIPv6TranslatorAclListResponse setBody(CreateIPv6TranslatorAclListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIPv6TranslatorAclListResponseBody getBody() {
        return this.body;
    }

}
