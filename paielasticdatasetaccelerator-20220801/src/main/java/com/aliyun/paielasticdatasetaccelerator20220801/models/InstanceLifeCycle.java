// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class InstanceLifeCycle extends TeaModel {
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Type")
    public String type;

    public static InstanceLifeCycle build(java.util.Map<String, ?> map) throws Exception {
        InstanceLifeCycle self = new InstanceLifeCycle();
        return TeaModel.build(map, self);
    }

    public InstanceLifeCycle setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public InstanceLifeCycle setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
