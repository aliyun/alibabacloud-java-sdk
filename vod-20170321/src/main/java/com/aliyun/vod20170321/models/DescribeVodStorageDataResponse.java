// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodStorageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodStorageDataResponseBody body;

    public static DescribeVodStorageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStorageDataResponse self = new DescribeVodStorageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodStorageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodStorageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodStorageDataResponse setBody(DescribeVodStorageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodStorageDataResponseBody getBody() {
        return this.body;
    }

}
