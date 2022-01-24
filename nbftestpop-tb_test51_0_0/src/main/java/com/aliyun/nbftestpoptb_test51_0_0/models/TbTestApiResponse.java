// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test51_0_0.models;

import com.aliyun.tea.*;

public class TbTestApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TbTestApiResponseBody body;

    public static TbTestApiResponse build(java.util.Map<String, ?> map) throws Exception {
        TbTestApiResponse self = new TbTestApiResponse();
        return TeaModel.build(map, self);
    }

    public TbTestApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TbTestApiResponse setBody(TbTestApiResponseBody body) {
        this.body = body;
        return this;
    }
    public TbTestApiResponseBody getBody() {
        return this.body;
    }

}
