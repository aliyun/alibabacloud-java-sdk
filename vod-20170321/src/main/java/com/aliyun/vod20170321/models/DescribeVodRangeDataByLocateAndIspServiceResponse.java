// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRangeDataByLocateAndIspServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodRangeDataByLocateAndIspServiceResponseBody body;

    public static DescribeVodRangeDataByLocateAndIspServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRangeDataByLocateAndIspServiceResponse self = new DescribeVodRangeDataByLocateAndIspServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodRangeDataByLocateAndIspServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodRangeDataByLocateAndIspServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodRangeDataByLocateAndIspServiceResponse setBody(DescribeVodRangeDataByLocateAndIspServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodRangeDataByLocateAndIspServiceResponseBody getBody() {
        return this.body;
    }

}
