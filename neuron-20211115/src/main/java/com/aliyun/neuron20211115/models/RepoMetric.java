// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RepoMetric extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>294</p>
     */
    @NameInMap("codeLines")
    public Long codeLines;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("commitCnt")
    public Long commitCnt;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("developerCnt")
    public Long developerCnt;

    /**
     * <strong>example:</strong>
     * <p>2022-05-03T00:00:00.000Z</p>
     */
    @NameInMap("refreshDate")
    public String refreshDate;

    /**
     * <strong>example:</strong>
     * <p>neuron/catalog.git</p>
     */
    @NameInMap("repoShortUrl")
    public String repoShortUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:git@gitlab.alibaba-inc.com">git@gitlab.alibaba-inc.com</a>:neuron/catalog.git</p>
     */
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
