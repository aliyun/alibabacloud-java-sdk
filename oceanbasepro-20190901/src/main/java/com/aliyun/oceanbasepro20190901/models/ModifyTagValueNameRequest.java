// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTagValueNameRequest extends TeaModel {
    /**
     * <p>The name of the tag group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tag group 1</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The new name of the tag.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tag 2</p>
     */
    @NameInMap("NewValue")
    public String newValue;

    /**
     * <p>The name of the tag.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tag 1</p>
     */
    @NameInMap("Value")
    public String value;

    public static ModifyTagValueNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagValueNameRequest self = new ModifyTagValueNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTagValueNameRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ModifyTagValueNameRequest setNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }
    public String getNewValue() {
        return this.newValue;
    }

    public ModifyTagValueNameRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
