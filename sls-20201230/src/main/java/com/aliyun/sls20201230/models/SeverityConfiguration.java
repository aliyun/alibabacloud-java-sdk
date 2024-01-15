// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SeverityConfiguration extends TeaModel {
    @NameInMap("evalCondition")
    public ConditionConfiguration evalCondition;

    @NameInMap("severity")
    public Integer severity;

    public static SeverityConfiguration build(java.util.Map<String, ?> map) throws Exception {
        SeverityConfiguration self = new SeverityConfiguration();
        return TeaModel.build(map, self);
    }

    public SeverityConfiguration setEvalCondition(ConditionConfiguration evalCondition) {
        this.evalCondition = evalCondition;
        return this;
    }
    public ConditionConfiguration getEvalCondition() {
        return this.evalCondition;
    }

    public SeverityConfiguration setSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }
    public Integer getSeverity() {
        return this.severity;
    }

}
