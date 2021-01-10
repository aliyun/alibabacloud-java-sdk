// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddAKSHelmRepoRequest extends TeaModel {
    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoUrl")
    public String repoUrl;

    @NameInMap("Workspace")
    public String workspace;

    public static AddAKSHelmRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAKSHelmRepoRequest self = new AddAKSHelmRepoRequest();
        return TeaModel.build(map, self);
    }

    public AddAKSHelmRepoRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public AddAKSHelmRepoRequest setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }
    public String getRepoUrl() {
        return this.repoUrl;
    }

    public AddAKSHelmRepoRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
