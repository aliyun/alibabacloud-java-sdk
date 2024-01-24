// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AIMasterMessage extends TeaModel {
    @NameInMap("Extended")
    public String extended;

    @NameInMap("JobRestartCount")
    public Integer jobRestartCount;

    @NameInMap("MessageContent")
    public String messageContent;

    @NameInMap("MessageEvent")
    public String messageEvent;

    @NameInMap("MessageVersion")
    public Integer messageVersion;

    @NameInMap("RestartType")
    public String restartType;

    public static AIMasterMessage build(java.util.Map<String, ?> map) throws Exception {
        AIMasterMessage self = new AIMasterMessage();
        return TeaModel.build(map, self);
    }

    public AIMasterMessage setExtended(String extended) {
        this.extended = extended;
        return this;
    }
    public String getExtended() {
        return this.extended;
    }

    public AIMasterMessage setJobRestartCount(Integer jobRestartCount) {
        this.jobRestartCount = jobRestartCount;
        return this;
    }
    public Integer getJobRestartCount() {
        return this.jobRestartCount;
    }

    public AIMasterMessage setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
    public String getMessageContent() {
        return this.messageContent;
    }

    public AIMasterMessage setMessageEvent(String messageEvent) {
        this.messageEvent = messageEvent;
        return this;
    }
    public String getMessageEvent() {
        return this.messageEvent;
    }

    public AIMasterMessage setMessageVersion(Integer messageVersion) {
        this.messageVersion = messageVersion;
        return this;
    }
    public Integer getMessageVersion() {
        return this.messageVersion;
    }

    public AIMasterMessage setRestartType(String restartType) {
        this.restartType = restartType;
        return this;
    }
    public String getRestartType() {
        return this.restartType;
    }

}
