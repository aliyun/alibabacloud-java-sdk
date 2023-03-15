// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcDeveloperRepoMetricResult extends TeaModel {
    @NameInMap("developerRepoMetrics")
    public java.util.List<ReposDeveloperGroupMetric> developerRepoMetrics;

    @NameInMap("requestId")
    public String requestId;

    public static PbcDeveloperRepoMetricResult build(java.util.Map<String, ?> map) throws Exception {
        PbcDeveloperRepoMetricResult self = new PbcDeveloperRepoMetricResult();
        return TeaModel.build(map, self);
    }

    public PbcDeveloperRepoMetricResult setDeveloperRepoMetrics(java.util.List<ReposDeveloperGroupMetric> developerRepoMetrics) {
        this.developerRepoMetrics = developerRepoMetrics;
        return this;
    }
    public java.util.List<ReposDeveloperGroupMetric> getDeveloperRepoMetrics() {
        return this.developerRepoMetrics;
    }

    public PbcDeveloperRepoMetricResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
