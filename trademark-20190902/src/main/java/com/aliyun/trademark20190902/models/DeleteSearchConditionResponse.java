// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DeleteSearchConditionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSearchConditionResponseBody body;

    public static DeleteSearchConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSearchConditionResponse self = new DeleteSearchConditionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSearchConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSearchConditionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSearchConditionResponse setBody(DeleteSearchConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSearchConditionResponseBody getBody() {
        return this.body;
    }

}
