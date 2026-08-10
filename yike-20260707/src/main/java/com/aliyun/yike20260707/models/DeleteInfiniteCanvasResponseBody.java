// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class DeleteInfiniteCanvasResponseBody extends TeaModel {
    /**
     * <p>The ID of the infinite canvas.</p>
     * 
     * <strong>example:</strong>
     * <p>canvas_adaasd*</p>
     */
    @NameInMap("CanvasId")
    public String canvasId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong>F88A3-AC51-5588-859A-03144F082</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInfiniteCanvasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInfiniteCanvasResponseBody self = new DeleteInfiniteCanvasResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInfiniteCanvasResponseBody setCanvasId(String canvasId) {
        this.canvasId = canvasId;
        return this;
    }
    public String getCanvasId() {
        return this.canvasId;
    }

    public DeleteInfiniteCanvasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
