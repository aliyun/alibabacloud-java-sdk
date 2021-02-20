// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyConferenceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("ConferenceName")
    public String conferenceName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Type")
    public String type;

    @NameInMap("RemindNotice")
    public Integer remindNotice;

    public static ModifyConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConferenceRequest self = new ModifyConferenceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConferenceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyConferenceRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public ModifyConferenceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyConferenceRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public ModifyConferenceRequest setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }
    public String getConferenceName() {
        return this.conferenceName;
    }

    public ModifyConferenceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModifyConferenceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ModifyConferenceRequest setRemindNotice(Integer remindNotice) {
        this.remindNotice = remindNotice;
        return this;
    }
    public Integer getRemindNotice() {
        return this.remindNotice;
    }

}
