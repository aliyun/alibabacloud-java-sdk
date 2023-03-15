// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RevokeReviewCmd extends TeaModel {
    @NameInMap("pbcVersionId")
    public Long pbcVersionId;

    public static RevokeReviewCmd build(java.util.Map<String, ?> map) throws Exception {
        RevokeReviewCmd self = new RevokeReviewCmd();
        return TeaModel.build(map, self);
    }

    public RevokeReviewCmd setPbcVersionId(Long pbcVersionId) {
        this.pbcVersionId = pbcVersionId;
        return this;
    }
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

}
