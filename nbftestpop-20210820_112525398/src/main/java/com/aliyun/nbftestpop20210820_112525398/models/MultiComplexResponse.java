// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210820_112525398.models;

import com.aliyun.tea.*;

public class MultiComplexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MultiComplexResponseBody body;

    public static MultiComplexResponse build(java.util.Map<String, ?> map) throws Exception {
        MultiComplexResponse self = new MultiComplexResponse();
        return TeaModel.build(map, self);
    }

    public MultiComplexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultiComplexResponse setBody(MultiComplexResponseBody body) {
        this.body = body;
        return this;
    }
    public MultiComplexResponseBody getBody() {
        return this.body;
    }

}
