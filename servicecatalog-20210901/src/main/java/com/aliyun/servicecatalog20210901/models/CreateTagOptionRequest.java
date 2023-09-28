// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateTagOptionRequest extends TeaModel {
    /**
     * <p>The key of the tag option.</p>
     * <br>
     * <p>The key can be up to 128 characters in length. It cannot start with `aliyun` or `acs:` and cannot contain `http://` or `https://`.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The value of the tag option.</p>
     * <br>
     * <p>The value can be up to 128 characters in length. It cannot start with `acs:`and cannot contain `http://` or `https://`.</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateTagOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTagOptionRequest self = new CreateTagOptionRequest();
        return TeaModel.build(map, self);
    }

    public CreateTagOptionRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateTagOptionRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
