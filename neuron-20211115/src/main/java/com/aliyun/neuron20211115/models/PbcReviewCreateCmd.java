// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcReviewCreateCmd extends TeaModel {
    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("pbcUrl")
    public String pbcUrl;

    @NameInMap("pbcVersion")
    public String pbcVersion;

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

    public PbcReviewCreateCmd setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public PbcReviewCreateCmd setPbcUrl(String pbcUrl) {
        this.pbcUrl = pbcUrl;
        return this;
    }
    public String getPbcUrl() {
        return this.pbcUrl;
    }

    public PbcReviewCreateCmd setPbcVersion(String pbcVersion) {
        this.pbcVersion = pbcVersion;
        return this;
    }
    public String getPbcVersion() {
        return this.pbcVersion;
    }

    public PbcReviewCreateCmd setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }
    public Long getReviewerId() {
        return this.reviewerId;
    }

}
