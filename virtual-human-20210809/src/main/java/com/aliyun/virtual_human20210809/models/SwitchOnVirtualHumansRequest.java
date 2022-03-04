// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class SwitchOnVirtualHumansRequest extends TeaModel {
    @NameInMap("Groups")
    public java.util.List<SwitchOnVirtualHumansRequestGroups> groups;

    public static SwitchOnVirtualHumansRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchOnVirtualHumansRequest self = new SwitchOnVirtualHumansRequest();
        return TeaModel.build(map, self);
    }

    public SwitchOnVirtualHumansRequest setGroups(java.util.List<SwitchOnVirtualHumansRequestGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<SwitchOnVirtualHumansRequestGroups> getGroups() {
        return this.groups;
    }

    public static class SwitchOnVirtualHumansRequestGroups extends TeaModel {
        @NameInMap("AvatarConfig")
        public String avatarConfig;

        @NameInMap("AvatarId")
        public Long avatarId;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("UserId")
        public String userId;

        public static SwitchOnVirtualHumansRequestGroups build(java.util.Map<String, ?> map) throws Exception {
            SwitchOnVirtualHumansRequestGroups self = new SwitchOnVirtualHumansRequestGroups();
            return TeaModel.build(map, self);
        }

        public SwitchOnVirtualHumansRequestGroups setAvatarConfig(String avatarConfig) {
            this.avatarConfig = avatarConfig;
            return this;
        }
        public String getAvatarConfig() {
            return this.avatarConfig;
        }

        public SwitchOnVirtualHumansRequestGroups setAvatarId(Long avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public Long getAvatarId() {
            return this.avatarId;
        }

        public SwitchOnVirtualHumansRequestGroups setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public SwitchOnVirtualHumansRequestGroups setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
