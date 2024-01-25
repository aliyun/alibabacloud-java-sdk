// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcRtFlowUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterRtcRtFlowUsageResponseBody body;

    public static DescribeMeterRtcRtFlowUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcRtFlowUsageResponse self = new DescribeMeterRtcRtFlowUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcRtFlowUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcRtFlowUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterRtcRtFlowUsageResponse setBody(DescribeMeterRtcRtFlowUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcRtFlowUsageResponseBody getBody() {
        return this.body;
    }

}
