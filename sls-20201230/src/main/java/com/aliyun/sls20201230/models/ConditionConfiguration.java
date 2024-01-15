// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConditionConfiguration extends TeaModel {
    @NameInMap("condition")
    public String condition;

    @NameInMap("countCondition")
    public String countCondition;

    public static ConditionConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ConditionConfiguration self = new ConditionConfiguration();
        return TeaModel.build(map, self);
    }

    public ConditionConfiguration setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public ConditionConfiguration setCountCondition(String countCondition) {
        this.countCondition = countCondition;
        return this;
    }
    public String getCountCondition() {
        return this.countCondition;
    }

}
