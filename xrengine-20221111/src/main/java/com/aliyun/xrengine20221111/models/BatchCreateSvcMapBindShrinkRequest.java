// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class BatchCreateSvcMapBindShrinkRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MapIds")
    public String mapIdsShrink;

    @NameInMap("SvcId")
    public Long svcId;

    public static BatchCreateSvcMapBindShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSvcMapBindShrinkRequest self = new BatchCreateSvcMapBindShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateSvcMapBindShrinkRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public BatchCreateSvcMapBindShrinkRequest setMapIdsShrink(String mapIdsShrink) {
        this.mapIdsShrink = mapIdsShrink;
        return this;
    }
    public String getMapIdsShrink() {
        return this.mapIdsShrink;
    }

    public BatchCreateSvcMapBindShrinkRequest setSvcId(Long svcId) {
        this.svcId = svcId;
        return this;
    }
    public Long getSvcId() {
        return this.svcId;
    }

}
