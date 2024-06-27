// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDemoDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleDemoDownloadUrlResponseBody body;

    public static DescribeSampleDemoDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDemoDownloadUrlResponse self = new DescribeSampleDemoDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDemoDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleDemoDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleDemoDownloadUrlResponse setBody(DescribeSampleDemoDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleDemoDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
