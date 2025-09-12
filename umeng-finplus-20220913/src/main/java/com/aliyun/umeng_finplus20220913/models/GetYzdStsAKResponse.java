// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetYzdStsAKResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYzdStsAKResponseBody body;

    public static GetYzdStsAKResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYzdStsAKResponse self = new GetYzdStsAKResponse();
        return TeaModel.build(map, self);
    }

    public GetYzdStsAKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYzdStsAKResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYzdStsAKResponse setBody(GetYzdStsAKResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYzdStsAKResponseBody getBody() {
        return this.body;
    }

}
