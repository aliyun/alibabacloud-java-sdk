// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class RestoreOssImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>208B016D-4CB9-4A85-96A5-0B8ED1EBF271</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>aliyun_dsc_original /dir1/test.png</p>
     */
    @NameInMap("RestoredImageKey")
    public String restoredImageKey;

    public static RestoreOssImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreOssImageResponseBody self = new RestoreOssImageResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreOssImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestoreOssImageResponseBody setRestoredImageKey(String restoredImageKey) {
        this.restoredImageKey = restoredImageKey;
        return this;
    }
    public String getRestoredImageKey() {
        return this.restoredImageKey;
    }

}
