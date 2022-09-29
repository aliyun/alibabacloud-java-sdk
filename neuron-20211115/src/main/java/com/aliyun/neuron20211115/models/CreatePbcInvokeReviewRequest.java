// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInvokeReviewRequest extends TeaModel {
    @NameInMap("pbcName")
    public String pbcName;

    public static CreatePbcInvokeReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInvokeReviewRequest self = new CreatePbcInvokeReviewRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcInvokeReviewRequest setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

}
