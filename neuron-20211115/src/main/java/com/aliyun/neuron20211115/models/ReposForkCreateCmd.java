// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ReposForkCreateCmd extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("gitGroup")
    public String gitGroup;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("usage")
    public String usage;

    @NameInMap("visible")
    public Boolean visible;

    public static ReposForkCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        ReposForkCreateCmd self = new ReposForkCreateCmd();
        return TeaModel.build(map, self);
    }

    public ReposForkCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ReposForkCreateCmd setGitGroup(String gitGroup) {
        this.gitGroup = gitGroup;
        return this;
    }
    public String getGitGroup() {
        return this.gitGroup;
    }

    public ReposForkCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public ReposForkCreateCmd setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public ReposForkCreateCmd setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public ReposForkCreateCmd setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
    public Boolean getVisible() {
        return this.visible;
    }

}
