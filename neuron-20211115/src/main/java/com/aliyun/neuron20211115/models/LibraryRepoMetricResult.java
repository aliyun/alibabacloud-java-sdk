// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibraryRepoMetricResult extends TeaModel {
    @NameInMap("repoMetrics")
    public java.util.List<RepoMetric> repoMetrics;

    @NameInMap("requestId")
    public String requestId;

    public static LibraryRepoMetricResult build(java.util.Map<String, ?> map) throws Exception {
        LibraryRepoMetricResult self = new LibraryRepoMetricResult();
        return TeaModel.build(map, self);
    }

    public LibraryRepoMetricResult setRepoMetrics(java.util.List<RepoMetric> repoMetrics) {
        this.repoMetrics = repoMetrics;
        return this;
    }
    public java.util.List<RepoMetric> getRepoMetrics() {
        return this.repoMetrics;
    }

    public LibraryRepoMetricResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
