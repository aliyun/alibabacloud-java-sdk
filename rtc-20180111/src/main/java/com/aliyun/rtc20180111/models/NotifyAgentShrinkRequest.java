// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class NotifyAgentShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aec****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BackgroundMusic")
    public String backgroundMusicShrink;

    /**
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;color\&quot;:\&quot;blue\&quot;}</p>
     */
    @NameInMap("CustomAttribute")
    public String customAttribute;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Interruptable")
    public Boolean interruptable;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static NotifyAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyAgentShrinkRequest self = new NotifyAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public NotifyAgentShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public NotifyAgentShrinkRequest setBackgroundMusicShrink(String backgroundMusicShrink) {
        this.backgroundMusicShrink = backgroundMusicShrink;
        return this;
    }
    public String getBackgroundMusicShrink() {
        return this.backgroundMusicShrink;
    }

    public NotifyAgentShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public NotifyAgentShrinkRequest setCustomAttribute(String customAttribute) {
        this.customAttribute = customAttribute;
        return this;
    }
    public String getCustomAttribute() {
        return this.customAttribute;
    }

    public NotifyAgentShrinkRequest setInterruptable(Boolean interruptable) {
        this.interruptable = interruptable;
        return this;
    }
    public Boolean getInterruptable() {
        return this.interruptable;
    }

    public NotifyAgentShrinkRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public NotifyAgentShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public NotifyAgentShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
