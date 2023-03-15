// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcRepoForkListResult extends TeaModel {
    @NameInMap("reposForks")
    public java.util.List<ReposFork> reposForks;

    @NameInMap("requestId")
    public String requestId;

    public static PbcRepoForkListResult build(java.util.Map<String, ?> map) throws Exception {
        PbcRepoForkListResult self = new PbcRepoForkListResult();
        return TeaModel.build(map, self);
    }

    public PbcRepoForkListResult setReposForks(java.util.List<ReposFork> reposForks) {
        this.reposForks = reposForks;
        return this;
    }
    public java.util.List<ReposFork> getReposForks() {
        return this.reposForks;
    }

    public PbcRepoForkListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
