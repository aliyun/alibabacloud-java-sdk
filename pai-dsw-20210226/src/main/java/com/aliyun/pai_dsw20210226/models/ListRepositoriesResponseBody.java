// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListRepositoriesResponseBody extends TeaModel {
    @NameInMap("Repositories")
    public java.util.List<ImageRepository> repositories;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListRepositoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoriesResponseBody self = new ListRepositoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoriesResponseBody setRepositories(java.util.List<ImageRepository> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<ImageRepository> getRepositories() {
        return this.repositories;
    }

    public ListRepositoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
