// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210806_151255420.models;

import com.aliyun.tea.*;

public class MutilComplexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MutilComplexResponseBody body;

    public static MutilComplexResponse build(java.util.Map<String, ?> map) throws Exception {
        MutilComplexResponse self = new MutilComplexResponse();
        return TeaModel.build(map, self);
    }

    public MutilComplexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MutilComplexResponse setBody(MutilComplexResponseBody body) {
        this.body = body;
        return this;
    }
    public MutilComplexResponseBody getBody() {
        return this.body;
    }

}
