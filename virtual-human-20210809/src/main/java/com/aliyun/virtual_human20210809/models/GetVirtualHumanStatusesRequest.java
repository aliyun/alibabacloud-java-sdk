// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class GetVirtualHumanStatusesRequest extends TeaModel {
    @NameInMap("Groups")
    public java.util.List<GetVirtualHumanStatusesRequestGroups> groups;

    public static GetVirtualHumanStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVirtualHumanStatusesRequest self = new GetVirtualHumanStatusesRequest();
        return TeaModel.build(map, self);
    }

    public GetVirtualHumanStatusesRequest setGroups(java.util.List<GetVirtualHumanStatusesRequestGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<GetVirtualHumanStatusesRequestGroups> getGroups() {
        return this.groups;
    }

    public static class GetVirtualHumanStatusesRequestGroups extends TeaModel {
        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("UserId")
        public String userId;

        public static GetVirtualHumanStatusesRequestGroups build(java.util.Map<String, ?> map) throws Exception {
            GetVirtualHumanStatusesRequestGroups self = new GetVirtualHumanStatusesRequestGroups();
            return TeaModel.build(map, self);
        }

        public GetVirtualHumanStatusesRequestGroups setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetVirtualHumanStatusesRequestGroups setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
