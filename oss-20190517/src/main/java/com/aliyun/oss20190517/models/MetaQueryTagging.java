// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class MetaQueryTagging extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("Value")
    public String value;

    public static MetaQueryTagging build(java.util.Map<String, ?> map) throws Exception {
        MetaQueryTagging self = new MetaQueryTagging();
        return TeaModel.build(map, self);
    }

    public MetaQueryTagging setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MetaQueryTagging setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
