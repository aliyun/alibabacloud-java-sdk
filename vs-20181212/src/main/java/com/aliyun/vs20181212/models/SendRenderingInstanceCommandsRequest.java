// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SendRenderingInstanceCommandsRequest extends TeaModel {
    /**
     * <p>A shell command string. Enter multiple commands separated by semicolons (;) or line feeds.</p>
     * <ul>
     * <li>Dangerous commands such as rm and reboot are disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>date;ls -l /tmp</p>
     */
    @NameInMap("Commands")
    public String commands;

    /**
     * <p>The response pattern for the command. Valid values:</p>
     * <ol>
     * <li><p>Sync: The response is returned synchronously. This is the default value.</p>
     * </li>
     * <li><p>Async: The response is returned asynchronously.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>Async</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The ID of the cloud application service instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>The timeout period for command execution, in seconds. The value range depends on the Mode parameter:</p>
     * <ol>
     * <li><p>If Mode is set to Sync, the value range is 0 to 30. The default value is 30.</p>
     * </li>
     * <li><p>If Mode is set to Async, the value range is 0 to 3600. The default value is 300.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
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
