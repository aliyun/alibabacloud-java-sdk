// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateInfiniteCanvasRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8fec0fd4172941f7a6213095c8657ecf</p>
     */
    @NameInMap("CoverUrl")
    public String coverUrl;

    /**
     * <strong>example:</strong>
     * <p>pd_061716***</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>这是无限画布标题</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>ws_2121**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateInfiniteCanvasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInfiniteCanvasRequest self = new CreateInfiniteCanvasRequest();
        return TeaModel.build(map, self);
    }

    public CreateInfiniteCanvasRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public CreateInfiniteCanvasRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

    public CreateInfiniteCanvasRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateInfiniteCanvasRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
