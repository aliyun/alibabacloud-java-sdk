// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcInvokeCreateCmd extends TeaModel {
    @NameInMap("applicant")
    public String applicant;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("invokePbcId")
    public Long invokePbcId;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("reviewer")
    public String reviewer;

    @NameInMap("usage")
    public String usage;

    @NameInMap("visible")
    public Boolean visible;

    public static PbcInvokeCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PbcInvokeCreateCmd self = new PbcInvokeCreateCmd();
        return TeaModel.build(map, self);
    }

    public PbcInvokeCreateCmd setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public PbcInvokeCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PbcInvokeCreateCmd setInvokePbcId(Long invokePbcId) {
        this.invokePbcId = invokePbcId;
        return this;
    }
    public Long getInvokePbcId() {
        return this.invokePbcId;
    }

    public PbcInvokeCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public PbcInvokeCreateCmd setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public PbcInvokeCreateCmd setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

    public PbcInvokeCreateCmd setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public PbcInvokeCreateCmd setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
    public Boolean getVisible() {
        return this.visible;
    }

}
