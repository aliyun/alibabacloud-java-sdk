// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class GetVirtualHumanStatusesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetVirtualHumanStatusesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetVirtualHumanStatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVirtualHumanStatusesResponseBody self = new GetVirtualHumanStatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVirtualHumanStatusesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVirtualHumanStatusesResponseBody setData(java.util.List<GetVirtualHumanStatusesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetVirtualHumanStatusesResponseBodyData> getData() {
        return this.data;
    }

    public GetVirtualHumanStatusesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVirtualHumanStatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVirtualHumanStatusesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVirtualHumanStatusesResponseBodyData extends TeaModel {
        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        public static GetVirtualHumanStatusesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVirtualHumanStatusesResponseBodyData self = new GetVirtualHumanStatusesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVirtualHumanStatusesResponseBodyData setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetVirtualHumanStatusesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVirtualHumanStatusesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
