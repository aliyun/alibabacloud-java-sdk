// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ReposFork extends TeaModel {
    @NameInMap("gitGroup")
    public String gitGroup;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("id")
    public Long id;

    @NameInMap("isOrigin")
    public Boolean isOrigin;

    @NameInMap("pbcRepoItems")
    public java.util.List<RepoItem> pbcRepoItems;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("usage")
    public String usage;

    public static ReposFork build(java.util.Map<String, ?> map) throws Exception {
        ReposFork self = new ReposFork();
        return TeaModel.build(map, self);
    }

    public ReposFork setGitGroup(String gitGroup) {
        this.gitGroup = gitGroup;
        return this;
    }
    public String getGitGroup() {
        return this.gitGroup;
    }

    public ReposFork setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ReposFork setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ReposFork setIsOrigin(Boolean isOrigin) {
        this.isOrigin = isOrigin;
        return this;
    }
    public Boolean getIsOrigin() {
        return this.isOrigin;
    }

    public ReposFork setPbcRepoItems(java.util.List<RepoItem> pbcRepoItems) {
        this.pbcRepoItems = pbcRepoItems;
        return this;
    }
    public java.util.List<RepoItem> getPbcRepoItems() {
        return this.pbcRepoItems;
    }

    public ReposFork setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReposFork setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
