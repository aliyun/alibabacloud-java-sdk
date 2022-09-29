// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcRepoMetricResult extends TeaModel {
    @NameInMap("repoMetrics")
    public java.util.List<RepoMetric> repoMetrics;

    public static PbcRepoMetricResult build(java.util.Map<String, ?> map) throws Exception {
        PbcRepoMetricResult self = new PbcRepoMetricResult();
        return TeaModel.build(map, self);
    }

    public PbcRepoMetricResult setRepoMetrics(java.util.List<RepoMetric> repoMetrics) {
        this.repoMetrics = repoMetrics;
        return this;
    }
    public java.util.List<RepoMetric> getRepoMetrics() {
        return this.repoMetrics;
    }

}
