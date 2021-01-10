// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsDrmAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsDrmAttributesResponseBody body;

    public static GetMsDrmAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsDrmAttributesResponse self = new GetMsDrmAttributesResponse();
        return TeaModel.build(map, self);
    }

    public GetMsDrmAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsDrmAttributesResponse setBody(GetMsDrmAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsDrmAttributesResponseBody getBody() {
        return this.body;
    }

}
