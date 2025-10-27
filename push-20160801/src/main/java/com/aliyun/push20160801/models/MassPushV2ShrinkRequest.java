// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushV2ShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("IdempotentToken")
    public String idempotentToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PushTasks")
    public String pushTasksShrink;

    public static MassPushV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MassPushV2ShrinkRequest self = new MassPushV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MassPushV2ShrinkRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public MassPushV2ShrinkRequest setIdempotentToken(String idempotentToken) {
        this.idempotentToken = idempotentToken;
        return this;
    }
    public String getIdempotentToken() {
        return this.idempotentToken;
    }

    public MassPushV2ShrinkRequest setPushTasksShrink(String pushTasksShrink) {
        this.pushTasksShrink = pushTasksShrink;
        return this;
    }
    public String getPushTasksShrink() {
        return this.pushTasksShrink;
    }

}
