// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ParamListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ParamListResponseBody body;

    public static ParamListResponse build(java.util.Map<String, ?> map) throws Exception {
        ParamListResponse self = new ParamListResponse();
        return TeaModel.build(map, self);
    }

    public ParamListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ParamListResponse setBody(ParamListResponseBody body) {
        this.body = body;
        return this;
    }
    public ParamListResponseBody getBody() {
        return this.body;
    }

}
