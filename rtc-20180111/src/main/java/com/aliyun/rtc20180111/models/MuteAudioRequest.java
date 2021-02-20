// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class MuteAudioRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("ParticipantIds")
    public java.util.List<String> participantIds;

    public static MuteAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        MuteAudioRequest self = new MuteAudioRequest();
        return TeaModel.build(map, self);
    }

    public MuteAudioRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MuteAudioRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public MuteAudioRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MuteAudioRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public MuteAudioRequest setParticipantIds(java.util.List<String> participantIds) {
        this.participantIds = participantIds;
        return this;
    }
    public java.util.List<String> getParticipantIds() {
        return this.participantIds;
    }

}
