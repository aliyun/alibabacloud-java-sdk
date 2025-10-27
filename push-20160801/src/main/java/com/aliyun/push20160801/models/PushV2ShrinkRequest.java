// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushV2ShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>****530646</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <strong>example:</strong>
     * <p>c8016d13-6e76-****-9bda-769383d11787</p>
     */
    @NameInMap("IdempotentToken")
    public String idempotentToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PushTask")
    public String pushTaskShrink;

    public static PushV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushV2ShrinkRequest self = new PushV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushV2ShrinkRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushV2ShrinkRequest setIdempotentToken(String idempotentToken) {
        this.idempotentToken = idempotentToken;
        return this;
    }
    public String getIdempotentToken() {
        return this.idempotentToken;
    }

    public PushV2ShrinkRequest setPushTaskShrink(String pushTaskShrink) {
        this.pushTaskShrink = pushTaskShrink;
        return this;
    }
    public String getPushTaskShrink() {
        return this.pushTaskShrink;
    }

}
