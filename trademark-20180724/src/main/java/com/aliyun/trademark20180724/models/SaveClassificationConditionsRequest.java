// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveClassificationConditionsRequest extends TeaModel {
    @NameInMap("Type")
    public Integer type;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Condition")
    public String condition;

    public static SaveClassificationConditionsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveClassificationConditionsRequest self = new SaveClassificationConditionsRequest();
        return TeaModel.build(map, self);
    }

    public SaveClassificationConditionsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SaveClassificationConditionsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveClassificationConditionsRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

}
