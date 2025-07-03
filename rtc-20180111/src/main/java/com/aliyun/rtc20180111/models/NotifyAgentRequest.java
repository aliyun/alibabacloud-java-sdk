// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class NotifyAgentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aec****</p>
     */
    @NameInMap("AppId")
    public String appId;

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

    public static NotifyAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyAgentRequest self = new NotifyAgentRequest();
        return TeaModel.build(map, self);
    }

    public NotifyAgentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public NotifyAgentRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public NotifyAgentRequest setCustomAttribute(String customAttribute) {
        this.customAttribute = customAttribute;
        return this;
    }
    public String getCustomAttribute() {
        return this.customAttribute;
    }

    public NotifyAgentRequest setInterruptable(Boolean interruptable) {
        this.interruptable = interruptable;
        return this;
    }
    public Boolean getInterruptable() {
        return this.interruptable;
    }

    public NotifyAgentRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public NotifyAgentRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public NotifyAgentRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
