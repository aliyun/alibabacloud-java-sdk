// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.plaso_online_class2021420.models;

import com.aliyun.tea.*;

public class EndCallbackRequest extends TeaModel {
    @NameInMap("OpTime")
    public Long opTime;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("ValidBegin")
    public Long validBegin;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("MeetingId")
    public String meetingId;

    @NameInMap("ValidTime")
    public Long validTime;

    @NameInMap("NewEndTime")
    public Long newEndTime;

    public static EndCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        EndCallbackRequest self = new EndCallbackRequest();
        return TeaModel.build(map, self);
    }

    public EndCallbackRequest setOpTime(Long opTime) {
        this.opTime = opTime;
        return this;
    }
    public Long getOpTime() {
        return this.opTime;
    }

    public EndCallbackRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public EndCallbackRequest setValidBegin(Long validBegin) {
        this.validBegin = validBegin;
        return this;
    }
    public Long getValidBegin() {
        return this.validBegin;
    }

    public EndCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public EndCallbackRequest setMeetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    public String getMeetingId() {
        return this.meetingId;
    }

    public EndCallbackRequest setValidTime(Long validTime) {
        this.validTime = validTime;
        return this;
    }
    public Long getValidTime() {
        return this.validTime;
    }

    public EndCallbackRequest setNewEndTime(Long newEndTime) {
        this.newEndTime = newEndTime;
        return this;
    }
    public Long getNewEndTime() {
        return this.newEndTime;
    }

}
