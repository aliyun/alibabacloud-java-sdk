// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test51_0_0.models;

import com.aliyun.tea.*;

public class TbTestApiBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TbTestApiBResponseBody body;

    public static TbTestApiBResponse build(java.util.Map<String, ?> map) throws Exception {
        TbTestApiBResponse self = new TbTestApiBResponse();
        return TeaModel.build(map, self);
    }

    public TbTestApiBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TbTestApiBResponse setBody(TbTestApiBResponseBody body) {
        this.body = body;
        return this;
    }
    public TbTestApiBResponseBody getBody() {
        return this.body;
    }

}
