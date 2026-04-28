// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UserTag extends TeaModel {
    /**
     * <p>The tag key. This parameter must be specified and the tag key cannot contain number signs (#). The tag key and tag value cannot exceed 2,000 bytes in length in total.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>k1</p>
     */
    @NameInMap("key")
    public String key;

    /**
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
