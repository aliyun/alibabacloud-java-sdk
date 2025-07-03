// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateAgentRequest extends TeaModel {
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
    public UpdateAgentRequestVoiceChatConfig voiceChatConfig;

    public static UpdateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRequest self = new UpdateAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAgentRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateAgentRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateAgentRequest setVoiceChatConfig(UpdateAgentRequestVoiceChatConfig voiceChatConfig) {
        this.voiceChatConfig = voiceChatConfig;
        return this;
    }
    public UpdateAgentRequestVoiceChatConfig getVoiceChatConfig() {
        return this.voiceChatConfig;
    }

    public static class UpdateAgentRequestVoiceChatConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChatMode")
        public Integer chatMode;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InterruptMode")
        public Integer interruptMode;

        public static UpdateAgentRequestVoiceChatConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentRequestVoiceChatConfig self = new UpdateAgentRequestVoiceChatConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAgentRequestVoiceChatConfig setChatMode(Integer chatMode) {
            this.chatMode = chatMode;
            return this;
        }
        public Integer getChatMode() {
            return this.chatMode;
        }

        public UpdateAgentRequestVoiceChatConfig setInterruptMode(Integer interruptMode) {
            this.interruptMode = interruptMode;
            return this;
        }
        public Integer getInterruptMode() {
            return this.interruptMode;
        }

    }

}
