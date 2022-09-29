// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDeveloperRepoMetricSumRequest extends TeaModel {
    @NameInMap("RepoUrls")
    public java.util.List<String> repoUrls;

    public static ListDeveloperRepoMetricSumRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeveloperRepoMetricSumRequest self = new ListDeveloperRepoMetricSumRequest();
        return TeaModel.build(map, self);
    }

    public ListDeveloperRepoMetricSumRequest setRepoUrls(java.util.List<String> repoUrls) {
        this.repoUrls = repoUrls;
        return this;
    }
    public java.util.List<String> getRepoUrls() {
        return this.repoUrls;
    }

}
