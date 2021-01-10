// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllCasDatabaseEngineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllCasDatabaseEngineResponseBody body;

    public static AllCasDatabaseEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        AllCasDatabaseEngineResponse self = new AllCasDatabaseEngineResponse();
        return TeaModel.build(map, self);
    }

    public AllCasDatabaseEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllCasDatabaseEngineResponse setBody(AllCasDatabaseEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public AllCasDatabaseEngineResponseBody getBody() {
        return this.body;
    }

}
