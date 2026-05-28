// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AlertTag extends TeaModel {
    /**
     * <p>The key name.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The key value.</p>
     * 
     * <strong>example:</strong>
     * <p>example value</p>
     */
    @NameInMap("value")
    public String value;

    public static AlertTag build(java.util.Map<String, ?> map) throws Exception {
        AlertTag self = new AlertTag();
        return TeaModel.build(map, self);
    }

    public AlertTag setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AlertTag setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
