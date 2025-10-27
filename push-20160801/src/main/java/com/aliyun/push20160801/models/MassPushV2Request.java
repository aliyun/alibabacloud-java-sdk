// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushV2Request extends TeaModel {
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
    public java.util.List<PushTask> pushTasks;

    public static MassPushV2Request build(java.util.Map<String, ?> map) throws Exception {
        MassPushV2Request self = new MassPushV2Request();
        return TeaModel.build(map, self);
    }

    public MassPushV2Request setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public MassPushV2Request setIdempotentToken(String idempotentToken) {
        this.idempotentToken = idempotentToken;
        return this;
    }
    public String getIdempotentToken() {
        return this.idempotentToken;
    }

    public MassPushV2Request setPushTasks(java.util.List<PushTask> pushTasks) {
        this.pushTasks = pushTasks;
        return this;
    }
    public java.util.List<PushTask> getPushTasks() {
        return this.pushTasks;
    }

}
