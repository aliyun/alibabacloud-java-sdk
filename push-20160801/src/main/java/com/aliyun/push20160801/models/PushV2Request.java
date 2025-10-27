// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushV2Request extends TeaModel {
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
    public PushTask pushTask;

    public static PushV2Request build(java.util.Map<String, ?> map) throws Exception {
        PushV2Request self = new PushV2Request();
        return TeaModel.build(map, self);
    }

    public PushV2Request setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public PushV2Request setIdempotentToken(String idempotentToken) {
        this.idempotentToken = idempotentToken;
        return this;
    }
    public String getIdempotentToken() {
        return this.idempotentToken;
    }

    public PushV2Request setPushTask(PushTask pushTask) {
        this.pushTask = pushTask;
        return this;
    }
    public PushTask getPushTask() {
        return this.pushTask;
    }

}
