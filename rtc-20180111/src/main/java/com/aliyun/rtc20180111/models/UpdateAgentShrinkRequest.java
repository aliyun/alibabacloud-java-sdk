// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateAgentShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4eah****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("VoiceChatConfig")
    public String voiceChatConfigShrink;

    public static UpdateAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentShrinkRequest self = new UpdateAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAgentShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateAgentShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateAgentShrinkRequest setVoiceChatConfigShrink(String voiceChatConfigShrink) {
        this.voiceChatConfigShrink = voiceChatConfigShrink;
        return this;
    }
    public String getVoiceChatConfigShrink() {
        return this.voiceChatConfigShrink;
    }

}
