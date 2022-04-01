// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ConfigItem extends TeaModel {
    // configItemDefaultValue
    @NameInMap("configItemDefaultValue")
    public String configItemDefaultValue;

    // configItemKey
    @NameInMap("configItemKey")
    public String configItemKey;

    // configItemType
    @NameInMap("configItemType")
    public String configItemType;

    public static ConfigItem build(java.util.Map<String, ?> map) throws Exception {
        ConfigItem self = new ConfigItem();
        return TeaModel.build(map, self);
    }

    public ConfigItem setConfigItemDefaultValue(String configItemDefaultValue) {
        this.configItemDefaultValue = configItemDefaultValue;
        return this;
    }
    public String getConfigItemDefaultValue() {
        return this.configItemDefaultValue;
    }

    public ConfigItem setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public ConfigItem setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

}
