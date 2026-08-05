// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class UpdateInfiniteCanvasRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>canvas_gesad*</p>
     */
    @NameInMap("CanvasId")
    public String canvasId;

    /**
     * <strong>example:</strong>
     * <p>https://*uncs.com/cover.png</p>
     */
    @NameInMap("CoverUrl")
    public String coverUrl;

    /**
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateInfiniteCanvasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInfiniteCanvasRequest self = new UpdateInfiniteCanvasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInfiniteCanvasRequest setCanvasId(String canvasId) {
        this.canvasId = canvasId;
        return this;
    }
    public String getCanvasId() {
        return this.canvasId;
    }

    public UpdateInfiniteCanvasRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public UpdateInfiniteCanvasRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
