// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSAcrRepoRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoNamespace")
    public String repoNamespace;

    public static GetAKSAcrRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSAcrRepoRequest self = new GetAKSAcrRepoRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSAcrRepoRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetAKSAcrRepoRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public GetAKSAcrRepoRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

}
