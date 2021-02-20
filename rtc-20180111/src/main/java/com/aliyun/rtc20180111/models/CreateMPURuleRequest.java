// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateMPURuleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelPrefix")
    public String channelPrefix;

    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("CropMode")
    public Integer cropMode;

    @NameInMap("TaskProfile")
    public String taskProfile;

    @NameInMap("PlayDomain")
    public String playDomain;

    @NameInMap("CallBack")
    public String callBack;

    @NameInMap("LayoutIds")
    public java.util.List<Integer> layoutIds;

    public static CreateMPURuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMPURuleRequest self = new CreateMPURuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateMPURuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMPURuleRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public CreateMPURuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMPURuleRequest setChannelPrefix(String channelPrefix) {
        this.channelPrefix = channelPrefix;
        return this;
    }
    public String getChannelPrefix() {
        return this.channelPrefix;
    }

    public CreateMPURuleRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public CreateMPURuleRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public CreateMPURuleRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public CreateMPURuleRequest setTaskProfile(String taskProfile) {
        this.taskProfile = taskProfile;
        return this;
    }
    public String getTaskProfile() {
        return this.taskProfile;
    }

    public CreateMPURuleRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public CreateMPURuleRequest setCallBack(String callBack) {
        this.callBack = callBack;
        return this;
    }
    public String getCallBack() {
        return this.callBack;
    }

    public CreateMPURuleRequest setLayoutIds(java.util.List<Integer> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<Integer> getLayoutIds() {
        return this.layoutIds;
    }

}
