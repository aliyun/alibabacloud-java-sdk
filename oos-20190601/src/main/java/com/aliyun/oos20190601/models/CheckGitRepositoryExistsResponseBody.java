// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CheckGitRepositoryExistsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RepoExists")
    public Boolean repoExists;

    /**
     * <strong>example:</strong>
     * <p>AA9FA778-AE4B-55EC-81CC-C46BAF08A166</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckGitRepositoryExistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckGitRepositoryExistsResponseBody self = new CheckGitRepositoryExistsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckGitRepositoryExistsResponseBody setRepoExists(Boolean repoExists) {
        this.repoExists = repoExists;
        return this;
    }
    public Boolean getRepoExists() {
        return this.repoExists;
    }

    public CheckGitRepositoryExistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
