// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDefenseResourceResponseBody body;

    public static DeleteDefenseResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseResourceResponse self = new DeleteDefenseResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDefenseResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDefenseResourceResponse setBody(DeleteDefenseResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDefenseResourceResponseBody getBody() {
        return this.body;
    }

}
