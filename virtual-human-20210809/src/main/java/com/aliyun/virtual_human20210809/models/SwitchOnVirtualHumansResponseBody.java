// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class SwitchOnVirtualHumansResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SwitchOnVirtualHumansResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SwitchOnVirtualHumansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchOnVirtualHumansResponseBody self = new SwitchOnVirtualHumansResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchOnVirtualHumansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SwitchOnVirtualHumansResponseBody setData(java.util.List<SwitchOnVirtualHumansResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SwitchOnVirtualHumansResponseBodyData> getData() {
        return this.data;
    }

    public SwitchOnVirtualHumansResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SwitchOnVirtualHumansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchOnVirtualHumansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SwitchOnVirtualHumansResponseBodyData extends TeaModel {
        @NameInMap("PullUrl")
        public String pullUrl;

        @NameInMap("PushUrl")
        public String pushUrl;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("UserId")
        public String userId;

        public static SwitchOnVirtualHumansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SwitchOnVirtualHumansResponseBodyData self = new SwitchOnVirtualHumansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SwitchOnVirtualHumansResponseBodyData setPullUrl(String pullUrl) {
            this.pullUrl = pullUrl;
            return this;
        }
        public String getPullUrl() {
            return this.pullUrl;
        }

        public SwitchOnVirtualHumansResponseBodyData setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public SwitchOnVirtualHumansResponseBodyData setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public SwitchOnVirtualHumansResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
