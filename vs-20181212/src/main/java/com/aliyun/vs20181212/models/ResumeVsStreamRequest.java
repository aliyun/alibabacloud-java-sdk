// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ResumeVsStreamRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ControlStreamAction")
    public String controlStreamAction;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("LiveStreamType")
    public String liveStreamType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StreamName")
    public String streamName;

    public static ResumeVsStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeVsStreamRequest self = new ResumeVsStreamRequest();
        return TeaModel.build(map, self);
    }

    public ResumeVsStreamRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ResumeVsStreamRequest setControlStreamAction(String controlStreamAction) {
        this.controlStreamAction = controlStreamAction;
        return this;
    }
    public String getControlStreamAction() {
        return this.controlStreamAction;
    }

    public ResumeVsStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ResumeVsStreamRequest setLiveStreamType(String liveStreamType) {
        this.liveStreamType = liveStreamType;
        return this;
    }
    public String getLiveStreamType() {
        return this.liveStreamType;
    }

    public ResumeVsStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResumeVsStreamRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
