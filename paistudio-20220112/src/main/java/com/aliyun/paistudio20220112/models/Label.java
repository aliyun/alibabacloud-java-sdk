// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Label extends TeaModel {
    /**
     * <p>The key of the label.</p>
     * 
     * <strong>example:</strong>
     * <p>testAccTag</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The value of the label.</p>
     * 
     * <strong>example:</strong>
     * <p>nihao</p>
     */
    @NameInMap("Value")
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
