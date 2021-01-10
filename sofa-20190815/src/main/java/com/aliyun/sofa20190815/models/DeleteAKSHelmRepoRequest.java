// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSHelmRepoRequest extends TeaModel {
    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteAKSHelmRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSHelmRepoRequest self = new DeleteAKSHelmRepoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAKSHelmRepoRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DeleteAKSHelmRepoRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
