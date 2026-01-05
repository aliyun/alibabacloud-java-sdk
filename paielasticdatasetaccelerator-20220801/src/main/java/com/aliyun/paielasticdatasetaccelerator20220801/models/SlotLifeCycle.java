// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class SlotLifeCycle extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Type")
    public String type;

    public static SlotLifeCycle build(java.util.Map<String, ?> map) throws Exception {
        SlotLifeCycle self = new SlotLifeCycle();
        return TeaModel.build(map, self);
    }

    public SlotLifeCycle setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public SlotLifeCycle setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
