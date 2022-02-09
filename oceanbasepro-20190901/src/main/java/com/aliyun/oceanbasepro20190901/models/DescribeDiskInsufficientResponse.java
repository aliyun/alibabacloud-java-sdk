// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDiskInsufficientResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDiskInsufficientResponseBody body;

    public static DescribeDiskInsufficientResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskInsufficientResponse self = new DescribeDiskInsufficientResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskInsufficientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskInsufficientResponse setBody(DescribeDiskInsufficientResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskInsufficientResponseBody getBody() {
        return this.body;
    }

}
