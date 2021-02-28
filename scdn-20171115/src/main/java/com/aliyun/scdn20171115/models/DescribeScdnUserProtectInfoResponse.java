// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnUserProtectInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnUserProtectInfoResponseBody body;

    public static DescribeScdnUserProtectInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnUserProtectInfoResponse self = new DescribeScdnUserProtectInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnUserProtectInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnUserProtectInfoResponse setBody(DescribeScdnUserProtectInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnUserProtectInfoResponseBody getBody() {
        return this.body;
    }

}
