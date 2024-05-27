// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTagRequest extends TeaModel {
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

    public static CreateTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTagRequest self = new CreateTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateTagRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTagRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
