// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteWildcardByTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWildcardByTopicResponseBody body;

    public static DeleteWildcardByTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWildcardByTopicResponse self = new DeleteWildcardByTopicResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWildcardByTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWildcardByTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWildcardByTopicResponse setBody(DeleteWildcardByTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWildcardByTopicResponseBody getBody() {
        return this.body;
    }

}
