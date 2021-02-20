// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class MuteAudioAllRequest extends TeaModel {
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

    public static MuteAudioAllRequest build(java.util.Map<String, ?> map) throws Exception {
        MuteAudioAllRequest self = new MuteAudioAllRequest();
        return TeaModel.build(map, self);
    }

    public MuteAudioAllRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MuteAudioAllRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public MuteAudioAllRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MuteAudioAllRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public MuteAudioAllRequest setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
    public String getParticipantId() {
        return this.participantId;
    }

}
