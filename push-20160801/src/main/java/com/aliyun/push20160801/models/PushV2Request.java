// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushV2Request extends TeaModel {
    /**
     * <p>The AppKey information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>****530646</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>An idempotence parameter that prevents duplicate push notifications caused by retries from the API caller. If you use the same IdempotentToken within 15 minutes, only one push notification is sent, and subsequent calls return the result of the first successful push.</p>
     * <blockquote>
     * <ul>
     * <li>The parameter format is a standard 36-character UUID (8-4-4-4-12). Each valid character is a hexadecimal digit in the range 0-9 or a-f, case-insensitive.</li>
     * <li>This parameter only prevents duplicate push notifications caused by retries. It cannot prevent duplicate push notifications caused by concurrent calls.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c8016d13-6e76-****-9bda-769383d11787</p>
     */
    @NameInMap("IdempotentToken")
    public String idempotentToken;

    /**
     * <p>The push task.</p>
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
