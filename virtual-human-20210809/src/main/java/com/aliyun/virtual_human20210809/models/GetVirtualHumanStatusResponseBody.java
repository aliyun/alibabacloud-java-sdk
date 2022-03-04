// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class GetVirtualHumanStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetVirtualHumanStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetVirtualHumanStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVirtualHumanStatusResponseBody self = new GetVirtualHumanStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVirtualHumanStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVirtualHumanStatusResponseBody setData(GetVirtualHumanStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVirtualHumanStatusResponseBodyData getData() {
        return this.data;
    }

    public GetVirtualHumanStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVirtualHumanStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVirtualHumanStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVirtualHumanStatusResponseBodyData extends TeaModel {
        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        public static GetVirtualHumanStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVirtualHumanStatusResponseBodyData self = new GetVirtualHumanStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVirtualHumanStatusResponseBodyData setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetVirtualHumanStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVirtualHumanStatusResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
