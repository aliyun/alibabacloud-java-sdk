// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ConfigModel extends TeaModel {
    @NameInMap("attribute")
    public String attribute;

    @NameInMap("type")
    public String type;

    @NameInMap("value")
    public String value;

    public static ConfigModel build(java.util.Map<String, ?> map) throws Exception {
        ConfigModel self = new ConfigModel();
        return TeaModel.build(map, self);
    }

    public ConfigModel setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    public String getAttribute() {
        return this.attribute;
    }

    public ConfigModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ConfigModel setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
