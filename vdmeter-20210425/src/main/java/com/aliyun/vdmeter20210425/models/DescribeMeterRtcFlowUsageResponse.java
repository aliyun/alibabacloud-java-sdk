// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcFlowUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterRtcFlowUsageResponseBody body;

    public static DescribeMeterRtcFlowUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcFlowUsageResponse self = new DescribeMeterRtcFlowUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcFlowUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcFlowUsageResponse setBody(DescribeMeterRtcFlowUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcFlowUsageResponseBody getBody() {
        return this.body;
    }

}
