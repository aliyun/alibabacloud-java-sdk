// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class UpdateInfiniteCanvasRequest extends TeaModel {
    /**
     * <p>The ID of the infinite canvas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>canvas_gesad*</p>
     */
    @NameInMap("CanvasId")
    public String canvasId;

    /**
     * <p>The cover URL.</p>
     * 
     * <strong>example:</strong>
     * <p>84ec412603784c04a00c737c71d86dfd</p>
     */
    @NameInMap("CoverUrl")
    public String coverUrl;

    /**
     * <p>The project title.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
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
