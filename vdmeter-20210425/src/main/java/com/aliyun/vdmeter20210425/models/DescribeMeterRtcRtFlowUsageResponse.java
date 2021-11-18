// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcRtFlowUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMeterRtcRtFlowUsageResponse setBody(DescribeMeterRtcRtFlowUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcRtFlowUsageResponseBody getBody() {
        return this.body;
    }

}
