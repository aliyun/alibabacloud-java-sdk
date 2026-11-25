// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchCaptureRenderingInstanceScreenshotShrinkRequest extends TeaModel {
    /**
     * <p>The quality of the image. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Quality")
    public Integer quality;

    /**
     * <p>The list of instance IDs. You can specify up to 100 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RenderingInstanceIds")
    public String renderingInstanceIdsShrink;

    public static BatchCaptureRenderingInstanceScreenshotShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCaptureRenderingInstanceScreenshotShrinkRequest self = new BatchCaptureRenderingInstanceScreenshotShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCaptureRenderingInstanceScreenshotShrinkRequest setQuality(Integer quality) {
        this.quality = quality;
        return this;
    }
    public Integer getQuality() {
        return this.quality;
    }

    public BatchCaptureRenderingInstanceScreenshotShrinkRequest setRenderingInstanceIdsShrink(String renderingInstanceIdsShrink) {
        this.renderingInstanceIdsShrink = renderingInstanceIdsShrink;
        return this;
    }
    public String getRenderingInstanceIdsShrink() {
        return this.renderingInstanceIdsShrink;
    }

}
