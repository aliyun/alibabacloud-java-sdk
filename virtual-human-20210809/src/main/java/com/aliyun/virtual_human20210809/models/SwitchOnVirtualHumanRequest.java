// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class SwitchOnVirtualHumanRequest extends TeaModel {
    @NameInMap("AvatarConfig")
    public String avatarConfig;

    @NameInMap("AvatarId")
    public Long avatarId;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("UserId")
    public String userId;

    public static SwitchOnVirtualHumanRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchOnVirtualHumanRequest self = new SwitchOnVirtualHumanRequest();
        return TeaModel.build(map, self);
    }

    public SwitchOnVirtualHumanRequest setAvatarConfig(String avatarConfig) {
        this.avatarConfig = avatarConfig;
        return this;
    }
    public String getAvatarConfig() {
        return this.avatarConfig;
    }

    public SwitchOnVirtualHumanRequest setAvatarId(Long avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public Long getAvatarId() {
        return this.avatarId;
    }

    public SwitchOnVirtualHumanRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SwitchOnVirtualHumanRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
