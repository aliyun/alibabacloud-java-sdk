// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushV2Request extends TeaModel {
    /**
     * <p>The AppKey information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267***</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>An idempotent parameter used to prevent duplicate pushes caused by API call retries on the client side. If the same IdempotentToken is used for calls within 15 minutes, only one push is performed, and subsequent calls return the result of the first successful push.</p>
     * <blockquote>
     * <ul>
     * <li>The parameter format is a standard 36-character UUID (8-4-4-4-12). Each valid character is a hexadecimal digit in the range 0-9 or a-f, case-insensitive.</li>
     * <li>This parameter only prevents duplicate pushes caused by retries. It cannot prevent duplicate pushes caused by concurrent calls.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c8016d13-6e76-****-9bda-769383d11787</p>
     */
    @NameInMap("IdempotentToken")
    public String idempotentToken;

    /**
     * <p>The batch push tasks.</p>
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
