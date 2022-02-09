// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTagValueRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("Value")
    public String value;

    public static DeleteTagValueRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagValueRequest self = new DeleteTagValueRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTagValueRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DeleteTagValueRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
