// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDefenseResourceResponseBody body;

    public static CreateDefenseResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseResourceResponse self = new CreateDefenseResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefenseResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefenseResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDefenseResourceResponse setBody(CreateDefenseResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefenseResourceResponseBody getBody() {
        return this.body;
    }

}
