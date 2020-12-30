// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListSubscribeDeviceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListSubscribeDeviceResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListSubscribeDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribeDeviceResponseBody self = new ListSubscribeDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscribeDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscribeDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscribeDeviceResponseBody setData(ListSubscribeDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSubscribeDeviceResponseBodyData getData() {
        return this.data;
    }

    public ListSubscribeDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListSubscribeDeviceResponseBodyDataSubscribeList extends TeaModel {
        @NameInMap("PushConfig")
        public String pushConfig;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UserId")
        public String userId;

        public static ListSubscribeDeviceResponseBodyDataSubscribeList build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribeDeviceResponseBodyDataSubscribeList self = new ListSubscribeDeviceResponseBodyDataSubscribeList();
            return TeaModel.build(map, self);
        }

        public ListSubscribeDeviceResponseBodyDataSubscribeList setPushConfig(String pushConfig) {
            this.pushConfig = pushConfig;
            return this;
        }
        public String getPushConfig() {
            return this.pushConfig;
        }

        public ListSubscribeDeviceResponseBodyDataSubscribeList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSubscribeDeviceResponseBodyDataSubscribeList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListSubscribeDeviceResponseBodyDataSubscribeList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSubscribeDeviceResponseBodyDataSubscribeList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListSubscribeDeviceResponseBodyData extends TeaModel {
        @NameInMap("SubscribeList")
        public java.util.List<ListSubscribeDeviceResponseBodyDataSubscribeList> subscribeList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSubscribeDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribeDeviceResponseBodyData self = new ListSubscribeDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubscribeDeviceResponseBodyData setSubscribeList(java.util.List<ListSubscribeDeviceResponseBodyDataSubscribeList> subscribeList) {
            this.subscribeList = subscribeList;
            return this;
        }
        public java.util.List<ListSubscribeDeviceResponseBodyDataSubscribeList> getSubscribeList() {
            return this.subscribeList;
        }

        public ListSubscribeDeviceResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
