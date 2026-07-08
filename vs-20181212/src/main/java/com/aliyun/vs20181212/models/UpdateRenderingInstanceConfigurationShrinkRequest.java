// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingInstanceConfigurationShrinkRequest extends TeaModel {
    /**
     * <p>The configuration content.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Configuration")
    public String configurationShrink;

    /**
     * <p>The ID of the cloud application service instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static UpdateRenderingInstanceConfigurationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingInstanceConfigurationShrinkRequest self = new UpdateRenderingInstanceConfigurationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingInstanceConfigurationShrinkRequest setConfigurationShrink(String configurationShrink) {
        this.configurationShrink = configurationShrink;
        return this;
    }
    public String getConfigurationShrink() {
        return this.configurationShrink;
    }

    public UpdateRenderingInstanceConfigurationShrinkRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
