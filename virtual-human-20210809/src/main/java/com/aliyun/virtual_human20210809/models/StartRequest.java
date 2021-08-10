// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class StartRequest extends TeaModel {
    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("Token")
    public String token;

    @NameInMap("VideoType")
    public String videoType;

    @NameInMap("PushStreamUrl")
    public String pushStreamUrl;

    @NameInMap("ExtendParams")
    public java.util.Map<String, String> extendParams;

    @NameInMap("VirtualHumanCode")
    public String virtualHumanCode;

    public static StartRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRequest self = new StartRequest();
        return TeaModel.build(map, self);
    }

    public StartRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public StartRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public StartRequest setVideoType(String videoType) {
        this.videoType = videoType;
        return this;
    }
    public String getVideoType() {
        return this.videoType;
    }

    public StartRequest setPushStreamUrl(String pushStreamUrl) {
        this.pushStreamUrl = pushStreamUrl;
        return this;
    }
    public String getPushStreamUrl() {
        return this.pushStreamUrl;
    }

    public StartRequest setExtendParams(java.util.Map<String, String> extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public java.util.Map<String, String> getExtendParams() {
        return this.extendParams;
    }

    public StartRequest setVirtualHumanCode(String virtualHumanCode) {
        this.virtualHumanCode = virtualHumanCode;
        return this;
    }
    public String getVirtualHumanCode() {
        return this.virtualHumanCode;
    }

}
