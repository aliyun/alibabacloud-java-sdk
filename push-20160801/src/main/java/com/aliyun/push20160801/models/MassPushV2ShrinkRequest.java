// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushV2ShrinkRequest extends TeaModel {
    /**
     * <p>AppKey value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267***</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>An idempotency token to prevent duplicate pushes caused by API retries. If you call this API with the same IdempotentToken within 15 minutes, only one push is sent. Subsequent calls return the result of the first successful push.</p>
     * <blockquote>
     * <ul>
     * <li><p>The token must be a standard 36-character UUID in 8-4-4-4-12 format. Valid characters are hexadecimal digits 0–9 and a–f. Case does not matter.</p>
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
     * <p>Batch push tasks.</p>
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
