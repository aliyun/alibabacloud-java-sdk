// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushV2ShrinkRequest extends TeaModel {
    /**
     * <p>AppKey value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>****530646</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>An idempotency token to prevent duplicate pushes caused by client-side retries. If you call this API with the same IdempotentToken within 15 minutes, only one push is sent. Subsequent calls return the result of the first successful push.</p>
     * <blockquote>
     * <ul>
     * <li><p>Format the token as a standard 36-character UUID (8-4-4-4-12). Valid characters are hexadecimal digits 0–9 and a–f. Case-insensitive.</p>
     * </li>
     * <li><p>This parameter prevents duplicates only from retries. It does not prevent duplicates from concurrent calls.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c8016d13-6e76-****-9bda-769383d11787</p>
     */
    @NameInMap("IdempotentToken")
    public String idempotentToken;

    /**
     * <p>Push task definition.</p>
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
