// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateWarmPoolRequest extends TeaModel {
    /**
     * <p>The request body, which contains the warm pool configuration.</p>
     */
    @NameInMap("body")
    public UpdateWarmPoolInput body;

    public static UpdateWarmPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarmPoolRequest self = new UpdateWarmPoolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWarmPoolRequest setBody(UpdateWarmPoolInput body) {
        this.body = body;
        return this;
    }
    public UpdateWarmPoolInput getBody() {
        return this.body;
    }

}
