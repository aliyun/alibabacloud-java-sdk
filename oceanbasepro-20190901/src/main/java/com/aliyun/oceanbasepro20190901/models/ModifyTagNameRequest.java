// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTagNameRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("NewKey")
    public String newKey;

    public static ModifyTagNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagNameRequest self = new ModifyTagNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTagNameRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ModifyTagNameRequest setNewKey(String newKey) {
        this.newKey = newKey;
        return this;
    }
    public String getNewKey() {
        return this.newKey;
    }

}
