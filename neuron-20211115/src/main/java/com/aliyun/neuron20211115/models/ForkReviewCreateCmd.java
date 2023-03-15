// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ForkReviewCreateCmd extends TeaModel {
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

    public static ForkReviewCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        ForkReviewCreateCmd self = new ForkReviewCreateCmd();
        return TeaModel.build(map, self);
    }

    public ForkReviewCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ForkReviewCreateCmd setGitGroup(String gitGroup) {
        this.gitGroup = gitGroup;
        return this;
    }
    public String getGitGroup() {
        return this.gitGroup;
    }

    public ForkReviewCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public ForkReviewCreateCmd setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public ForkReviewCreateCmd setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
