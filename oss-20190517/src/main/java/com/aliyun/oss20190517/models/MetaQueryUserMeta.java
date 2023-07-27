// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class MetaQueryUserMeta extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("Value")
    public String value;

    public static MetaQueryUserMeta build(java.util.Map<String, ?> map) throws Exception {
        MetaQueryUserMeta self = new MetaQueryUserMeta();
        return TeaModel.build(map, self);
    }

    public MetaQueryUserMeta setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MetaQueryUserMeta setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
