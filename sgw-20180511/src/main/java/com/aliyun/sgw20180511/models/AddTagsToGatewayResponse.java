// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class AddTagsToGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTagsToGatewayResponseBody body;

    public static AddTagsToGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToGatewayResponse self = new AddTagsToGatewayResponse();
        return TeaModel.build(map, self);
    }

    public AddTagsToGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTagsToGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTagsToGatewayResponse setBody(AddTagsToGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagsToGatewayResponseBody getBody() {
        return this.body;
    }

}
