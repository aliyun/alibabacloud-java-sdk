// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleTagListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleTagListResponseBody body;

    public static DescribeSampleTagListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleTagListResponse self = new DescribeSampleTagListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleTagListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleTagListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleTagListResponse setBody(DescribeSampleTagListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleTagListResponseBody getBody() {
        return this.body;
    }

}
