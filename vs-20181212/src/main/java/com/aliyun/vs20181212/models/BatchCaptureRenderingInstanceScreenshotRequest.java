// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchCaptureRenderingInstanceScreenshotRequest extends TeaModel {
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
    public java.util.List<String> renderingInstanceIds;

    public static BatchCaptureRenderingInstanceScreenshotRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCaptureRenderingInstanceScreenshotRequest self = new BatchCaptureRenderingInstanceScreenshotRequest();
        return TeaModel.build(map, self);
    }

    public BatchCaptureRenderingInstanceScreenshotRequest setQuality(Integer quality) {
        this.quality = quality;
        return this;
    }
    public Integer getQuality() {
        return this.quality;
    }

    public BatchCaptureRenderingInstanceScreenshotRequest setRenderingInstanceIds(java.util.List<String> renderingInstanceIds) {
        this.renderingInstanceIds = renderingInstanceIds;
        return this;
    }
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

}
