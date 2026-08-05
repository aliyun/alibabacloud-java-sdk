// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class DeleteInfiniteCanvasRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>canvas_adaasd*</p>
     */
    @NameInMap("CanvasId")
    public String canvasId;

    public static DeleteInfiniteCanvasRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInfiniteCanvasRequest self = new DeleteInfiniteCanvasRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInfiniteCanvasRequest setCanvasId(String canvasId) {
        this.canvasId = canvasId;
        return this;
    }
    public String getCanvasId() {
        return this.canvasId;
    }

}
