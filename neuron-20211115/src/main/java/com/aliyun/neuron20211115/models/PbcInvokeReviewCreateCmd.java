// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcInvokeReviewCreateCmd extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("invokePbcId")
    public Long invokePbcId;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("usage")
    public String usage;

    public static PbcInvokeReviewCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PbcInvokeReviewCreateCmd self = new PbcInvokeReviewCreateCmd();
        return TeaModel.build(map, self);
    }

    public PbcInvokeReviewCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PbcInvokeReviewCreateCmd setInvokePbcId(Long invokePbcId) {
        this.invokePbcId = invokePbcId;
        return this;
    }
    public Long getInvokePbcId() {
        return this.invokePbcId;
    }

    public PbcInvokeReviewCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public PbcInvokeReviewCreateCmd setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public PbcInvokeReviewCreateCmd setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
