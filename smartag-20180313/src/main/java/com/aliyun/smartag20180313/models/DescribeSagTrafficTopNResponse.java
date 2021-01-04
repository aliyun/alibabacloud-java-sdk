// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagTrafficTopNResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagTrafficTopNResponseBody body;

    public static DescribeSagTrafficTopNResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagTrafficTopNResponse self = new DescribeSagTrafficTopNResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagTrafficTopNResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagTrafficTopNResponse setBody(DescribeSagTrafficTopNResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagTrafficTopNResponseBody getBody() {
        return this.body;
    }

}
