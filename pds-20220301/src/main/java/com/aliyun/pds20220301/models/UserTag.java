// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UserTag extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("key")
    public String key;

    public static UserTag build(java.util.Map<String, ?> map) throws Exception {
        UserTag self = new UserTag();
        return TeaModel.build(map, self);
    }

    public UserTag setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public UserTag setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
