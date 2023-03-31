// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ChannelProperty extends TeaModel {
    @NameInMap("Name")
    public String name;

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
