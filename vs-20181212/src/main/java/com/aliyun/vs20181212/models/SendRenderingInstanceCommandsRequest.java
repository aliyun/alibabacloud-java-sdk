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

    @NameInMap("Mode")
    public String mode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    @NameInMap("Timeout")
    public Integer timeout;

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

    public SendRenderingInstanceCommandsRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SendRenderingInstanceCommandsRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public SendRenderingInstanceCommandsRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
