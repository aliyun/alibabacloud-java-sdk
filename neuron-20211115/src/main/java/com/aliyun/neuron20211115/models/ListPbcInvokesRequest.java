// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcInvokesRequest extends TeaModel {
    @NameInMap("applicant")
    public String applicant;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("pbcId")
    public Long pbcId;

    public static ListPbcInvokesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPbcInvokesRequest self = new ListPbcInvokesRequest();
        return TeaModel.build(map, self);
    }

    public ListPbcInvokesRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public ListPbcInvokesRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ListPbcInvokesRequest setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public ListPbcInvokesRequest setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

}
