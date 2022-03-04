// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class SwitchOnVirtualHumanResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SwitchOnVirtualHumanResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SwitchOnVirtualHumanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchOnVirtualHumanResponseBody self = new SwitchOnVirtualHumanResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchOnVirtualHumanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SwitchOnVirtualHumanResponseBody setData(SwitchOnVirtualHumanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SwitchOnVirtualHumanResponseBodyData getData() {
        return this.data;
    }

    public SwitchOnVirtualHumanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SwitchOnVirtualHumanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchOnVirtualHumanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SwitchOnVirtualHumanResponseBodyData extends TeaModel {
        @NameInMap("PullUrl")
        public String pullUrl;

        @NameInMap("PushUrl")
        public String pushUrl;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("UserId")
        public String userId;

        public static SwitchOnVirtualHumanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SwitchOnVirtualHumanResponseBodyData self = new SwitchOnVirtualHumanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SwitchOnVirtualHumanResponseBodyData setPullUrl(String pullUrl) {
            this.pullUrl = pullUrl;
            return this;
        }
        public String getPullUrl() {
            return this.pullUrl;
        }

        public SwitchOnVirtualHumanResponseBodyData setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public SwitchOnVirtualHumanResponseBodyData setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public SwitchOnVirtualHumanResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
