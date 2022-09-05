// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetSubtaskItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSubtaskItemResponseBody body;

    public static GetSubtaskItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubtaskItemResponse self = new GetSubtaskItemResponse();
        return TeaModel.build(map, self);
    }

    public GetSubtaskItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubtaskItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubtaskItemResponse setBody(GetSubtaskItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubtaskItemResponseBody getBody() {
        return this.body;
    }

}
