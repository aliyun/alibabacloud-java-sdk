// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcRepoMetricsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcRepoMetricResult result;

    public static GetPbcRepoMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPbcRepoMetricsResponseBody self = new GetPbcRepoMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPbcRepoMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPbcRepoMetricsResponseBody setResult(PbcRepoMetricResult result) {
        this.result = result;
        return this;
    }
    public PbcRepoMetricResult getResult() {
        return this.result;
    }

}
