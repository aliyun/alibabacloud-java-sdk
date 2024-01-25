// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcRtBandWidthUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterRtcRtBandWidthUsageResponseBody body;

    public static DescribeMeterRtcRtBandWidthUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcRtBandWidthUsageResponse self = new DescribeMeterRtcRtBandWidthUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcRtBandWidthUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcRtBandWidthUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterRtcRtBandWidthUsageResponse setBody(DescribeMeterRtcRtBandWidthUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcRtBandWidthUsageResponseBody getBody() {
        return this.body;
    }

}
