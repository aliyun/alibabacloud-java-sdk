// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushV2ShrinkRequest extends TeaModel {
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
