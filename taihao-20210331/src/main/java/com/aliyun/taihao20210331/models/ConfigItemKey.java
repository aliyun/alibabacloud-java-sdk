// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ConfigItemKey extends TeaModel {
    // key
    @NameInMap("key")
    public String key;

    // name
    @NameInMap("name")
    public String name;

    public static ConfigItemKey build(java.util.Map<String, ?> map) throws Exception {
        ConfigItemKey self = new ConfigItemKey();
        return TeaModel.build(map, self);
    }

    public ConfigItemKey setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ConfigItemKey setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
