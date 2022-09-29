// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class StrategyItem extends TeaModel {
    @NameInMap("action")
    public String action;

    @NameInMap("resource")
    public String resource;

    public static StrategyItem build(java.util.Map<String, ?> map) throws Exception {
        StrategyItem self = new StrategyItem();
        return TeaModel.build(map, self);
    }

    public StrategyItem setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public StrategyItem setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
