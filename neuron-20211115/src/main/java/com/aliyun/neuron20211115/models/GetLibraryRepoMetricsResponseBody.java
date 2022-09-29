// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLibraryRepoMetricsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<RepoMetric> result;

    public static GetLibraryRepoMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryRepoMetricsResponseBody self = new GetLibraryRepoMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLibraryRepoMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLibraryRepoMetricsResponseBody setResult(java.util.List<RepoMetric> result) {
        this.result = result;
        return this;
    }
    public java.util.List<RepoMetric> getResult() {
        return this.result;
    }

}
