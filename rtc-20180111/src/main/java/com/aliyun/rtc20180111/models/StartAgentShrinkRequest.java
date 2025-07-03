// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartAgentShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aoe****</p>
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
     */
    @NameInMap("RtcConfig")
    public String rtcConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>76dasgb****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("VoiceChatConfig")
    public String voiceChatConfigShrink;

    public static StartAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAgentShrinkRequest self = new StartAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartAgentShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartAgentShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartAgentShrinkRequest setRtcConfigShrink(String rtcConfigShrink) {
        this.rtcConfigShrink = rtcConfigShrink;
        return this;
    }
    public String getRtcConfigShrink() {
        return this.rtcConfigShrink;
    }

    public StartAgentShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartAgentShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartAgentShrinkRequest setVoiceChatConfigShrink(String voiceChatConfigShrink) {
        this.voiceChatConfigShrink = voiceChatConfigShrink;
        return this;
    }
    public String getVoiceChatConfigShrink() {
        return this.voiceChatConfigShrink;
    }

}
