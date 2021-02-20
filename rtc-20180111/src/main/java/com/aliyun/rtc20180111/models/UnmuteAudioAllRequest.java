// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UnmuteAudioAllRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("ParticipantId")
    public String participantId;

    public static UnmuteAudioAllRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmuteAudioAllRequest self = new UnmuteAudioAllRequest();
        return TeaModel.build(map, self);
    }

    public UnmuteAudioAllRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnmuteAudioAllRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public UnmuteAudioAllRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UnmuteAudioAllRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public UnmuteAudioAllRequest setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
    public String getParticipantId() {
        return this.participantId;
    }

}
