// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class BuildStsAKResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BuildStsAKResponseBody body;

    public static BuildStsAKResponse build(java.util.Map<String, ?> map) throws Exception {
        BuildStsAKResponse self = new BuildStsAKResponse();
        return TeaModel.build(map, self);
    }

    public BuildStsAKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BuildStsAKResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BuildStsAKResponse setBody(BuildStsAKResponseBody body) {
        this.body = body;
        return this;
    }
    public BuildStsAKResponseBody getBody() {
        return this.body;
    }

}
