// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateTagOptionRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

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
