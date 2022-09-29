// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibraryDeveloperRepoMetricResult extends TeaModel {
    @NameInMap("developerRepoMetrics")
    public java.util.List<ReposDeveloperGroupMetric> developerRepoMetrics;

    public static LibraryDeveloperRepoMetricResult build(java.util.Map<String, ?> map) throws Exception {
        LibraryDeveloperRepoMetricResult self = new LibraryDeveloperRepoMetricResult();
        return TeaModel.build(map, self);
    }

    public LibraryDeveloperRepoMetricResult setDeveloperRepoMetrics(java.util.List<ReposDeveloperGroupMetric> developerRepoMetrics) {
        this.developerRepoMetrics = developerRepoMetrics;
        return this;
    }
    public java.util.List<ReposDeveloperGroupMetric> getDeveloperRepoMetrics() {
        return this.developerRepoMetrics;
    }

}
