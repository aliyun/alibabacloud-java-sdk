// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogTag extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Value")
    public String value;

    public static LogTag build(java.util.Map<String, ?> map) throws Exception {
        LogTag self = new LogTag();
        return TeaModel.build(map, self);
    }

    public LogTag setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public LogTag setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
