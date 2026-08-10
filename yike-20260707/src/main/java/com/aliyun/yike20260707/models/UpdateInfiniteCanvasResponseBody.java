// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class UpdateInfiniteCanvasResponseBody extends TeaModel {
    /**
     * <p>The ID of the infinite canvas.</p>
     * 
     * <strong>example:</strong>
     * <p>canvas_gesad*</p>
     */
    @NameInMap("CanvasId")
    public String canvasId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInfiniteCanvasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInfiniteCanvasResponseBody self = new UpdateInfiniteCanvasResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInfiniteCanvasResponseBody setCanvasId(String canvasId) {
        this.canvasId = canvasId;
        return this;
    }
    public String getCanvasId() {
        return this.canvasId;
    }

    public UpdateInfiniteCanvasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
