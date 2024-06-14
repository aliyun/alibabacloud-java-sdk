// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTagValueRequest extends TeaModel {
    /**
     * <p>The identifier of the client.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the tag group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the tag.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateTagValueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTagValueRequest self = new CreateTagValueRequest();
        return TeaModel.build(map, self);
    }

    public CreateTagValueRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTagValueRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateTagValueRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
