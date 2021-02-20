// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateConferenceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ConferenceName")
    public String conferenceName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Type")
    public String type;

    @NameInMap("RemindNotice")
    public Integer remindNotice;

    public static CreateConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConferenceRequest self = new CreateConferenceRequest();
        return TeaModel.build(map, self);
    }

    public CreateConferenceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateConferenceRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public CreateConferenceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateConferenceRequest setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }
    public String getConferenceName() {
        return this.conferenceName;
    }

    public CreateConferenceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConferenceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateConferenceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateConferenceRequest setRemindNotice(Integer remindNotice) {
        this.remindNotice = remindNotice;
        return this;
    }
    public Integer getRemindNotice() {
        return this.remindNotice;
    }

}
