// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RepoMetric extends TeaModel {
    @NameInMap("codeLines")
    public Long codeLines;

    @NameInMap("commitCnt")
    public Long commitCnt;

    @NameInMap("developerCnt")
    public Long developerCnt;

    @NameInMap("refreshDate")
    public String refreshDate;

    @NameInMap("repoShortUrl")
    public String repoShortUrl;

    @NameInMap("repoUrl")
    public String repoUrl;

    public static RepoMetric build(java.util.Map<String, ?> map) throws Exception {
        RepoMetric self = new RepoMetric();
        return TeaModel.build(map, self);
    }

    public RepoMetric setCodeLines(Long codeLines) {
        this.codeLines = codeLines;
        return this;
    }
    public Long getCodeLines() {
        return this.codeLines;
    }

    public RepoMetric setCommitCnt(Long commitCnt) {
        this.commitCnt = commitCnt;
        return this;
    }
    public Long getCommitCnt() {
        return this.commitCnt;
    }

    public RepoMetric setDeveloperCnt(Long developerCnt) {
        this.developerCnt = developerCnt;
        return this;
    }
    public Long getDeveloperCnt() {
        return this.developerCnt;
    }

    public RepoMetric setRefreshDate(String refreshDate) {
        this.refreshDate = refreshDate;
        return this;
    }
    public String getRefreshDate() {
        return this.refreshDate;
    }

    public RepoMetric setRepoShortUrl(String repoShortUrl) {
        this.repoShortUrl = repoShortUrl;
        return this;
    }
    public String getRepoShortUrl() {
        return this.repoShortUrl;
    }

    public RepoMetric setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }
    public String getRepoUrl() {
        return this.repoUrl;
    }

}
