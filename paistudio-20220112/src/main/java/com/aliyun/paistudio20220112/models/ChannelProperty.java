// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ChannelProperty extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SKlearn</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Framework</p>
     */
    @NameInMap("Value")
    public String value;

    public static ChannelProperty build(java.util.Map<String, ?> map) throws Exception {
        ChannelProperty self = new ChannelProperty();
        return TeaModel.build(map, self);
    }

    public ChannelProperty setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChannelProperty setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
