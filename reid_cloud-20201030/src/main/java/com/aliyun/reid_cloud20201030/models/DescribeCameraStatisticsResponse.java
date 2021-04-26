// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeCameraStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCameraStatisticsResponseBody body;

    public static DescribeCameraStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCameraStatisticsResponse self = new DescribeCameraStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCameraStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCameraStatisticsResponse setBody(DescribeCameraStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCameraStatisticsResponseBody getBody() {
        return this.body;
    }

}
