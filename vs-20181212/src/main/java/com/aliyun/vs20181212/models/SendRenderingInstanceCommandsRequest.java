// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SendRenderingInstanceCommandsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>date;ls -l /tmp</p>
     */
    @NameInMap("Commands")
    public String commands;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static SendRenderingInstanceCommandsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendRenderingInstanceCommandsRequest self = new SendRenderingInstanceCommandsRequest();
        return TeaModel.build(map, self);
    }

    public SendRenderingInstanceCommandsRequest setCommands(String commands) {
        this.commands = commands;
        return this;
    }
    public String getCommands() {
        return this.commands;
    }

    public SendRenderingInstanceCommandsRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
