// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210602_214152752.models;

import com.aliyun.tea.*;

public class YxTestApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public YxTestApiResponseBody body;

    public static YxTestApiResponse build(java.util.Map<String, ?> map) throws Exception {
        YxTestApiResponse self = new YxTestApiResponse();
        return TeaModel.build(map, self);
    }

    public YxTestApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public YxTestApiResponse setBody(YxTestApiResponseBody body) {
        this.body = body;
        return this;
    }
    public YxTestApiResponseBody getBody() {
        return this.body;
    }

}
