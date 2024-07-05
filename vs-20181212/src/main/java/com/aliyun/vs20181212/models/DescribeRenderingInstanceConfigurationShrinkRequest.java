// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceConfigurationShrinkRequest extends TeaModel {
    @NameInMap("Configuration")
    public String configurationShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static DescribeRenderingInstanceConfigurationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceConfigurationShrinkRequest self = new DescribeRenderingInstanceConfigurationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingInstanceConfigurationShrinkRequest setConfigurationShrink(String configurationShrink) {
        this.configurationShrink = configurationShrink;
        return this;
    }
    public String getConfigurationShrink() {
        return this.configurationShrink;
    }

    public DescribeRenderingInstanceConfigurationShrinkRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
