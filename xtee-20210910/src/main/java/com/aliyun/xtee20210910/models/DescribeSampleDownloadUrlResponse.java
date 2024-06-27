// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleDownloadUrlResponseBody body;

    public static DescribeSampleDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDownloadUrlResponse self = new DescribeSampleDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleDownloadUrlResponse setBody(DescribeSampleDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
