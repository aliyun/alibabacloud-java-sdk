// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktRiskpositionRequest extends TeaModel {
    @NameInMap("AfterId")
    public String afterId;

    @NameInMap("BeforeId")
    public String beforeId;

    @NameInMap("TargetId")
    public String targetId;

    public static UpdateLinkeLinktRiskpositionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktRiskpositionRequest self = new UpdateLinkeLinktRiskpositionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktRiskpositionRequest setAfterId(String afterId) {
        this.afterId = afterId;
        return this;
    }
    public String getAfterId() {
        return this.afterId;
    }

    public UpdateLinkeLinktRiskpositionRequest setBeforeId(String beforeId) {
        this.beforeId = beforeId;
        return this;
    }
    public String getBeforeId() {
        return this.beforeId;
    }

    public UpdateLinkeLinktRiskpositionRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
