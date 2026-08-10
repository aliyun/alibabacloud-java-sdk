// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetInfiniteCanvasRequest extends TeaModel {
    /**
     * <p>The ID of the infinite canvas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>canvas_***</p>
     */
    @NameInMap("CanvasId")
    public String canvasId;

    public static GetInfiniteCanvasRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInfiniteCanvasRequest self = new GetInfiniteCanvasRequest();
        return TeaModel.build(map, self);
    }

    public GetInfiniteCanvasRequest setCanvasId(String canvasId) {
        this.canvasId = canvasId;
        return this;
    }
    public String getCanvasId() {
        return this.canvasId;
    }

}
