// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIPv6TranslatorAclListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIPv6TranslatorAclListResponseBody body;

    public static DeleteIPv6TranslatorAclListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPv6TranslatorAclListResponse self = new DeleteIPv6TranslatorAclListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIPv6TranslatorAclListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIPv6TranslatorAclListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIPv6TranslatorAclListResponse setBody(DeleteIPv6TranslatorAclListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIPv6TranslatorAclListResponseBody getBody() {
        return this.body;
    }

}
