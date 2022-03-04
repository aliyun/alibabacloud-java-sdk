// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class SwitchOffVirtualHumanRequest extends TeaModel {
    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("UserId")
    public String userId;

    public static SwitchOffVirtualHumanRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchOffVirtualHumanRequest self = new SwitchOffVirtualHumanRequest();
        return TeaModel.build(map, self);
    }

    public SwitchOffVirtualHumanRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SwitchOffVirtualHumanRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
