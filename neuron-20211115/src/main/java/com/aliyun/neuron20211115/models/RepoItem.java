// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RepoItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2034</p>
     */
    @NameInMap("codeLines")
    public Long codeLines;

    /**
     * <strong>example:</strong>
     * <p><a href="https://code.aone.alibaba-inc.com/yunmall/yunmall-custome">https://code.aone.alibaba-inc.com/yunmall/yunmall-custome</a></p>
     */
    @NameInMap("gitProjectUrl")
    public String gitProjectUrl;

    /**
     * <strong>example:</strong>
     * <p>中驿</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>yunmall/product.git</p>
     */
    @NameInMap("repoShortUrl")
    public String repoShortUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:git@gitlab.alibaba-inc.com">git@gitlab.alibaba-inc.com</a>:yunmall/product.git</p>
     */
    @NameInMap("repoUrl")
    public String repoUrl;

    /**
     * <strong>example:</strong>
     * <p>类目</p>
     */
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
