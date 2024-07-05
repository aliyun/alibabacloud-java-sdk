// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetRenderingInstanceStreamingInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static GetRenderingInstanceStreamingInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRenderingInstanceStreamingInfoRequest self = new GetRenderingInstanceStreamingInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetRenderingInstanceStreamingInfoRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
