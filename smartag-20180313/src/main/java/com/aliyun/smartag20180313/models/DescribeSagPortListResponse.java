// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagPortListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagPortListResponseBody body;

    public static DescribeSagPortListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagPortListResponse self = new DescribeSagPortListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagPortListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagPortListResponse setBody(DescribeSagPortListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagPortListResponseBody getBody() {
        return this.body;
    }

}
