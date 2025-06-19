// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetRenderingInstanceCommandsStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cmd-81de027b66e442e99c1e0e09a16a0be5</p>
     */
    @NameInMap("CmdId")
    public String cmdId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static GetRenderingInstanceCommandsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRenderingInstanceCommandsStatusRequest self = new GetRenderingInstanceCommandsStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetRenderingInstanceCommandsStatusRequest setCmdId(String cmdId) {
        this.cmdId = cmdId;
        return this;
    }
    public String getCmdId() {
        return this.cmdId;
    }

    public GetRenderingInstanceCommandsStatusRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
