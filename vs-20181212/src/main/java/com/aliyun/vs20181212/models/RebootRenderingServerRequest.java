// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RebootRenderingServerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RenderingInstanceIds")
    public java.util.List<String> renderingInstanceIds;

    public static RebootRenderingServerRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootRenderingServerRequest self = new RebootRenderingServerRequest();
        return TeaModel.build(map, self);
    }

    public RebootRenderingServerRequest setRenderingInstanceIds(java.util.List<String> renderingInstanceIds) {
        this.renderingInstanceIds = renderingInstanceIds;
        return this;
    }
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

}
