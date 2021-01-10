// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskOdpsSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskOdpsSchemaResponseBody body;

    public static GetClriskOdpsSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskOdpsSchemaResponse self = new GetClriskOdpsSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskOdpsSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskOdpsSchemaResponse setBody(GetClriskOdpsSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskOdpsSchemaResponseBody getBody() {
        return this.body;
    }

}
