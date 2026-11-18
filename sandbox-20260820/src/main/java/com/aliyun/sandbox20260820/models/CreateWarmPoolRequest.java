// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateWarmPoolRequest extends TeaModel {
    /**
     * <p>The request body, which contains the warm pool configuration.</p>
     */
    @NameInMap("body")
    public CreateWarmPoolInput body;

    public static CreateWarmPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWarmPoolRequest self = new CreateWarmPoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateWarmPoolRequest setBody(CreateWarmPoolInput body) {
        this.body = body;
        return this;
    }
    public CreateWarmPoolInput getBody() {
        return this.body;
    }

}
