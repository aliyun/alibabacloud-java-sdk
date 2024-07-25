// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConditionConfiguration extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cnt &gt; 100</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <strong>example:</strong>
     * <p><strong>count</strong> &gt; 5</p>
     */
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
