// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcReviewCreateCmd extends TeaModel {
    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("pbcUrl")
    public String pbcUrl;

    @NameInMap("pbcVersionId")
    public Long pbcVersionId;

    @NameInMap("reviewerId")
    public Long reviewerId;

    public static PbcReviewCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PbcReviewCreateCmd self = new PbcReviewCreateCmd();
        return TeaModel.build(map, self);
    }

    public PbcReviewCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public PbcReviewCreateCmd setPbcUrl(String pbcUrl) {
        this.pbcUrl = pbcUrl;
        return this;
    }
    public String getPbcUrl() {
        return this.pbcUrl;
    }

    public PbcReviewCreateCmd setPbcVersionId(Long pbcVersionId) {
        this.pbcVersionId = pbcVersionId;
        return this;
    }
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    public PbcReviewCreateCmd setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }
    public Long getReviewerId() {
        return this.reviewerId;
    }

}
