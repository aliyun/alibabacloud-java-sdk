// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateInfiniteCanvasResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>canvas_***</p>
     */
    @NameInMap("CanvasId")
    public String canvasId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInfiniteCanvasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInfiniteCanvasResponseBody self = new CreateInfiniteCanvasResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInfiniteCanvasResponseBody setCanvasId(String canvasId) {
        this.canvasId = canvasId;
        return this;
    }
    public String getCanvasId() {
        return this.canvasId;
    }

    public CreateInfiniteCanvasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
