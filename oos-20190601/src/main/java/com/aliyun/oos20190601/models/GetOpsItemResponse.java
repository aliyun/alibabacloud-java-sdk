// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetOpsItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpsItemResponseBody body;

    public static GetOpsItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpsItemResponse self = new GetOpsItemResponse();
        return TeaModel.build(map, self);
    }

    public GetOpsItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpsItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpsItemResponse setBody(GetOpsItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpsItemResponseBody getBody() {
        return this.body;
    }

}
