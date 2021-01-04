// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRemoteAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagRemoteAccessResponseBody body;

    public static DescribeSagRemoteAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRemoteAccessResponse self = new DescribeSagRemoteAccessResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagRemoteAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagRemoteAccessResponse setBody(DescribeSagRemoteAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagRemoteAccessResponseBody getBody() {
        return this.body;
    }

}
