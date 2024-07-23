// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class LocalVariable extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>datagen</p>
     */
    @NameInMap("value")
    public String value;

    public static LocalVariable build(java.util.Map<String, ?> map) throws Exception {
        LocalVariable self = new LocalVariable();
        return TeaModel.build(map, self);
    }

    public LocalVariable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LocalVariable setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
