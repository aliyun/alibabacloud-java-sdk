// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class BatchDeleteSvcMapBindShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static BatchDeleteSvcMapBindShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteSvcMapBindShrinkRequest self = new BatchDeleteSvcMapBindShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteSvcMapBindShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public BatchDeleteSvcMapBindShrinkRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
