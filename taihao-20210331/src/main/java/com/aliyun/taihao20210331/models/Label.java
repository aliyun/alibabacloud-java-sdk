// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class Label extends TeaModel {
    // key
    @NameInMap("key")
    public String key;

    // value
    @NameInMap("value")
    public String value;

    public static Label build(java.util.Map<String, ?> map) throws Exception {
        Label self = new Label();
        return TeaModel.build(map, self);
    }

    public Label setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Label setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
