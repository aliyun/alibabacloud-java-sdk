// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogContent extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("Value")
    public String value;

    public static LogContent build(java.util.Map<String, ?> map) throws Exception {
        LogContent self = new LogContent();
        return TeaModel.build(map, self);
    }

    public LogContent setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public LogContent setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
