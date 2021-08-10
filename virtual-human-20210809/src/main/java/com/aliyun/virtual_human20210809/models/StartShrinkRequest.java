// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class StartShrinkRequest extends TeaModel {
    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("Token")
    public String token;

    @NameInMap("VideoType")
    public String videoType;

    @NameInMap("PushStreamUrl")
    public String pushStreamUrl;

    @NameInMap("ExtendParams")
    public String extendParamsShrink;

    @NameInMap("VirtualHumanCode")
    public String virtualHumanCode;

    public static StartShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartShrinkRequest self = new StartShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartShrinkRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public StartShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public StartShrinkRequest setVideoType(String videoType) {
        this.videoType = videoType;
        return this;
    }
    public String getVideoType() {
        return this.videoType;
    }

    public StartShrinkRequest setPushStreamUrl(String pushStreamUrl) {
        this.pushStreamUrl = pushStreamUrl;
        return this;
    }
    public String getPushStreamUrl() {
        return this.pushStreamUrl;
    }

    public StartShrinkRequest setExtendParamsShrink(String extendParamsShrink) {
        this.extendParamsShrink = extendParamsShrink;
        return this;
    }
    public String getExtendParamsShrink() {
        return this.extendParamsShrink;
    }

    public StartShrinkRequest setVirtualHumanCode(String virtualHumanCode) {
        this.virtualHumanCode = virtualHumanCode;
        return this;
    }
    public String getVirtualHumanCode() {
        return this.virtualHumanCode;
    }

}
