// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UserTag extends TeaModel {
    /**
     * <p>Key. Required. Must not contain the # character. The combined length of key and value in a single tag must not exceed 2000 bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>k1</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>Value</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("value")
    public String value;

    public static UserTag build(java.util.Map<String, ?> map) throws Exception {
        UserTag self = new UserTag();
        return TeaModel.build(map, self);
    }

    public UserTag setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UserTag setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
