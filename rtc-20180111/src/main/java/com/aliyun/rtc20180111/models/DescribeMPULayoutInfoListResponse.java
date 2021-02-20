// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPULayoutInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMPULayoutInfoListResponseBody body;

    public static DescribeMPULayoutInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPULayoutInfoListResponse self = new DescribeMPULayoutInfoListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMPULayoutInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMPULayoutInfoListResponse setBody(DescribeMPULayoutInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMPULayoutInfoListResponseBody getBody() {
        return this.body;
    }

}
