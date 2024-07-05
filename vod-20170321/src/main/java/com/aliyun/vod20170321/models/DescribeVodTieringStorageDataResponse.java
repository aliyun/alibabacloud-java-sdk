// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTieringStorageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodTieringStorageDataResponseBody body;

    public static DescribeVodTieringStorageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTieringStorageDataResponse self = new DescribeVodTieringStorageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodTieringStorageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodTieringStorageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodTieringStorageDataResponse setBody(DescribeVodTieringStorageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodTieringStorageDataResponseBody getBody() {
        return this.body;
    }

}
