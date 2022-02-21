// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchResumeVsStreamRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("ControlStreamAction")
    public String controlStreamAction;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("LiveStreamType")
    public String liveStreamType;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static BatchResumeVsStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchResumeVsStreamRequest self = new BatchResumeVsStreamRequest();
        return TeaModel.build(map, self);
    }

    public BatchResumeVsStreamRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public BatchResumeVsStreamRequest setControlStreamAction(String controlStreamAction) {
        this.controlStreamAction = controlStreamAction;
        return this;
    }
    public String getControlStreamAction() {
        return this.controlStreamAction;
    }

    public BatchResumeVsStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BatchResumeVsStreamRequest setLiveStreamType(String liveStreamType) {
        this.liveStreamType = liveStreamType;
        return this;
    }
    public String getLiveStreamType() {
        return this.liveStreamType;
    }

    public BatchResumeVsStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
