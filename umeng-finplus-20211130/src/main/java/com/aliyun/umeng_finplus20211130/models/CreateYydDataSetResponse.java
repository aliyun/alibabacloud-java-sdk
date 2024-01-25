// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateYydDataSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateYydDataSetResponseBody body;

    public static CreateYydDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateYydDataSetResponse self = new CreateYydDataSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateYydDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateYydDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateYydDataSetResponse setBody(CreateYydDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateYydDataSetResponseBody getBody() {
        return this.body;
    }

}
