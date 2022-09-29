// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLibraryDeveloperRepoMetricsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public LibraryDeveloperRepoMetricResult result;

    public static GetLibraryDeveloperRepoMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryDeveloperRepoMetricsResponseBody self = new GetLibraryDeveloperRepoMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLibraryDeveloperRepoMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLibraryDeveloperRepoMetricsResponseBody setResult(LibraryDeveloperRepoMetricResult result) {
        this.result = result;
        return this;
    }
    public LibraryDeveloperRepoMetricResult getResult() {
        return this.result;
    }

}
