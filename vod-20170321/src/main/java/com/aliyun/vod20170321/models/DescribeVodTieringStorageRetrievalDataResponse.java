// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTieringStorageRetrievalDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodTieringStorageRetrievalDataResponseBody body;

    public static DescribeVodTieringStorageRetrievalDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTieringStorageRetrievalDataResponse self = new DescribeVodTieringStorageRetrievalDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodTieringStorageRetrievalDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodTieringStorageRetrievalDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodTieringStorageRetrievalDataResponse setBody(DescribeVodTieringStorageRetrievalDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodTieringStorageRetrievalDataResponseBody getBody() {
        return this.body;
    }

}
