// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPULayoutListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMPULayoutListResponseBody body;

    public static DescribeMPULayoutListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPULayoutListResponse self = new DescribeMPULayoutListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMPULayoutListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMPULayoutListResponse setBody(DescribeMPULayoutListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMPULayoutListResponseBody getBody() {
        return this.body;
    }

}
