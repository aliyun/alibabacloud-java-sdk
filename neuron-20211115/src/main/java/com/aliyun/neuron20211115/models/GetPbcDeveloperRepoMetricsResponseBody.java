// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcDeveloperRepoMetricsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcDeveloperRepoMetricResult result;

    public static GetPbcDeveloperRepoMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPbcDeveloperRepoMetricsResponseBody self = new GetPbcDeveloperRepoMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPbcDeveloperRepoMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPbcDeveloperRepoMetricsResponseBody setResult(PbcDeveloperRepoMetricResult result) {
        this.result = result;
        return this;
    }
    public PbcDeveloperRepoMetricResult getResult() {
        return this.result;
    }

}
