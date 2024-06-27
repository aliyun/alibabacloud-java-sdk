// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleListResponseBody body;

    public static DescribeSampleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleListResponse self = new DescribeSampleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleListResponse setBody(DescribeSampleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleListResponseBody getBody() {
        return this.body;
    }

}
