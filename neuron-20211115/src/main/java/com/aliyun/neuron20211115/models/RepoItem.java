// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RepoItem extends TeaModel {
    @NameInMap("codeLines")
    public Long codeLines;

    @NameInMap("gitProjectUrl")
    public String gitProjectUrl;

    @NameInMap("owner")
    public String owner;

    @NameInMap("repoShortUrl")
    public String repoShortUrl;

    @NameInMap("repoUrl")
    public String repoUrl;

    @NameInMap("summary")
    public String summary;

    public static RepoItem build(java.util.Map<String, ?> map) throws Exception {
        RepoItem self = new RepoItem();
        return TeaModel.build(map, self);
    }

    public RepoItem setCodeLines(Long codeLines) {
        this.codeLines = codeLines;
        return this;
    }
    public Long getCodeLines() {
        return this.codeLines;
    }

    public RepoItem setGitProjectUrl(String gitProjectUrl) {
        this.gitProjectUrl = gitProjectUrl;
        return this;
    }
    public String getGitProjectUrl() {
        return this.gitProjectUrl;
    }

    public RepoItem setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public RepoItem setRepoShortUrl(String repoShortUrl) {
        this.repoShortUrl = repoShortUrl;
        return this;
    }
    public String getRepoShortUrl() {
        return this.repoShortUrl;
    }

    public RepoItem setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }
    public String getRepoUrl() {
        return this.repoUrl;
    }

    public RepoItem setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
