// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTagValueRequest extends TeaModel {
    /**
     * <p>The identifier of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>The name of the tag.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tag 1</p>
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
