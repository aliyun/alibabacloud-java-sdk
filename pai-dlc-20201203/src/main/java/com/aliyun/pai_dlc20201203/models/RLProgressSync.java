// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressSync extends TeaModel {
    /**
     * <p>The parameter synchronization duration in seconds. This property has a value only when State is end.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5</p>
     */
    @NameInMap("Cost")
    public Double cost;

    /**
     * <p>begin / end</p>
     * 
     * <strong>example:</strong>
     * <p>end</p>
     */
    @NameInMap("State")
    public String state;

    public static RLProgressSync build(java.util.Map<String, ?> map) throws Exception {
        RLProgressSync self = new RLProgressSync();
        return TeaModel.build(map, self);
    }

    public RLProgressSync setCost(Double cost) {
        this.cost = cost;
        return this;
    }
    public Double getCost() {
        return this.cost;
    }

    public RLProgressSync setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
