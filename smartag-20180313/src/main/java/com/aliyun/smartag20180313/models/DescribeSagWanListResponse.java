// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWanListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagWanListResponseBody body;

    public static DescribeSagWanListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWanListResponse self = new DescribeSagWanListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagWanListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagWanListResponse setBody(DescribeSagWanListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagWanListResponseBody getBody() {
        return this.body;
    }

}
