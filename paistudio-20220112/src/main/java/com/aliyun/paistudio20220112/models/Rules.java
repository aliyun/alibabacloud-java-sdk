// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Rules extends TeaModel {
    @NameInMap("SchedulingRule")
    public SchedulingRule schedulingRule;

    public static Rules build(java.util.Map<String, ?> map) throws Exception {
        Rules self = new Rules();
        return TeaModel.build(map, self);
    }

    public Rules setSchedulingRule(SchedulingRule schedulingRule) {
        this.schedulingRule = schedulingRule;
        return this;
    }
    public SchedulingRule getSchedulingRule() {
        return this.schedulingRule;
    }

}
