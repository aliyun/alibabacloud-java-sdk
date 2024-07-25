// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class JoinConfiguration extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>$0.id == $1.id</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <strong>example:</strong>
     * <p>left_join</p>
     */
    @NameInMap("type")
    public String type;

    public static JoinConfiguration build(java.util.Map<String, ?> map) throws Exception {
        JoinConfiguration self = new JoinConfiguration();
        return TeaModel.build(map, self);
    }

    public JoinConfiguration setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public JoinConfiguration setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
