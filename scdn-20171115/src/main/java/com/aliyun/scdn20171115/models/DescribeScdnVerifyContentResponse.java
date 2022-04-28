// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnVerifyContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnVerifyContentResponseBody body;

    public static DescribeScdnVerifyContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnVerifyContentResponse self = new DescribeScdnVerifyContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnVerifyContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnVerifyContentResponse setBody(DescribeScdnVerifyContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnVerifyContentResponseBody getBody() {
        return this.body;
    }

}
