// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDmsTopicsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDmsTopicsResponseBody body;

    public static GetDmsTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDmsTopicsResponse self = new GetDmsTopicsResponse();
        return TeaModel.build(map, self);
    }

    public GetDmsTopicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDmsTopicsResponse setBody(GetDmsTopicsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDmsTopicsResponseBody getBody() {
        return this.body;
    }

}
