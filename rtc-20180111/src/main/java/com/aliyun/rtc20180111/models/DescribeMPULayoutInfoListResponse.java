// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPULayoutInfoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeMPULayoutInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMPULayoutInfoListResponse setBody(DescribeMPULayoutInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMPULayoutInfoListResponseBody getBody() {
        return this.body;
    }

}
