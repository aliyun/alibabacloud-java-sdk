// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class SwitchOffVirtualHumansRequest extends TeaModel {
    @NameInMap("Groups")
    public java.util.List<SwitchOffVirtualHumansRequestGroups> groups;

    public static SwitchOffVirtualHumansRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchOffVirtualHumansRequest self = new SwitchOffVirtualHumansRequest();
        return TeaModel.build(map, self);
    }

    public SwitchOffVirtualHumansRequest setGroups(java.util.List<SwitchOffVirtualHumansRequestGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<SwitchOffVirtualHumansRequestGroups> getGroups() {
        return this.groups;
    }

    public static class SwitchOffVirtualHumansRequestGroups extends TeaModel {
        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("UserId")
        public String userId;

        public static SwitchOffVirtualHumansRequestGroups build(java.util.Map<String, ?> map) throws Exception {
            SwitchOffVirtualHumansRequestGroups self = new SwitchOffVirtualHumansRequestGroups();
            return TeaModel.build(map, self);
        }

        public SwitchOffVirtualHumansRequestGroups setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public SwitchOffVirtualHumansRequestGroups setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
