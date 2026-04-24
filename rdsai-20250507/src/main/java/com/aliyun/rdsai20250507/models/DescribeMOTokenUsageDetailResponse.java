// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMOTokenUsageDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMOTokenUsageDetailResponseBody body;

    public static DescribeMOTokenUsageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMOTokenUsageDetailResponse self = new DescribeMOTokenUsageDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMOTokenUsageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMOTokenUsageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMOTokenUsageDetailResponse setBody(DescribeMOTokenUsageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMOTokenUsageDetailResponseBody getBody() {
        return this.body;
    }

}
