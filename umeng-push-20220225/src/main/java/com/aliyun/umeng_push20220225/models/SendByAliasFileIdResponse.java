// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByAliasFileIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendByAliasFileIdResponseBody body;

    public static SendByAliasFileIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SendByAliasFileIdResponse self = new SendByAliasFileIdResponse();
        return TeaModel.build(map, self);
    }

    public SendByAliasFileIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendByAliasFileIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendByAliasFileIdResponse setBody(SendByAliasFileIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SendByAliasFileIdResponseBody getBody() {
        return this.body;
    }

}
