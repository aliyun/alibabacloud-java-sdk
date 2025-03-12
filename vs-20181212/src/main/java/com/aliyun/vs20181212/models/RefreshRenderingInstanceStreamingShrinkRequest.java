// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RefreshRenderingInstanceStreamingShrinkRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfoShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static RefreshRenderingInstanceStreamingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshRenderingInstanceStreamingShrinkRequest self = new RefreshRenderingInstanceStreamingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RefreshRenderingInstanceStreamingShrinkRequest setClientInfoShrink(String clientInfoShrink) {
        this.clientInfoShrink = clientInfoShrink;
        return this;
    }
    public String getClientInfoShrink() {
        return this.clientInfoShrink;
    }

    public RefreshRenderingInstanceStreamingShrinkRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
