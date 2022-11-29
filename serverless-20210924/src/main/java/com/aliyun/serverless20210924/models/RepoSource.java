// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class RepoSource extends TeaModel {
    @NameInMap("owner")
    public String owner;

    @NameInMap("provider")
    public String provider;

    @NameInMap("repo")
    public String repo;

    public static RepoSource build(java.util.Map<String, ?> map) throws Exception {
        RepoSource self = new RepoSource();
        return TeaModel.build(map, self);
    }

    public RepoSource setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public RepoSource setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public RepoSource setRepo(String repo) {
        this.repo = repo;
        return this;
    }
    public String getRepo() {
        return this.repo;
    }

}
