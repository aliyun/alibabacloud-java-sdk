// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListSubscribeDeviceResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListSubscribeDeviceResponseData data;

    public static ListSubscribeDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribeDeviceResponse self = new ListSubscribeDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscribeDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubscribeDeviceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscribeDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscribeDeviceResponse setData(ListSubscribeDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public ListSubscribeDeviceResponseData getData() {
        return this.data;
    }

    public static class ListSubscribeDeviceResponseDataSubscribeList extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("DeviceId")
        @Validation(required = true)
        public String deviceId;

        @NameInMap("PushConfig")
        @Validation(required = true)
        public String pushConfig;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static ListSubscribeDeviceResponseDataSubscribeList build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribeDeviceResponseDataSubscribeList self = new ListSubscribeDeviceResponseDataSubscribeList();
            return TeaModel.build(map, self);
        }

        public ListSubscribeDeviceResponseDataSubscribeList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListSubscribeDeviceResponseDataSubscribeList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListSubscribeDeviceResponseDataSubscribeList setPushConfig(String pushConfig) {
            this.pushConfig = pushConfig;
            return this;
        }
        public String getPushConfig() {
            return this.pushConfig;
        }

        public ListSubscribeDeviceResponseDataSubscribeList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSubscribeDeviceResponseDataSubscribeList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListSubscribeDeviceResponseData extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("SubscribeList")
        @Validation(required = true)
        public java.util.List<ListSubscribeDeviceResponseDataSubscribeList> subscribeList;

        public static ListSubscribeDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribeDeviceResponseData self = new ListSubscribeDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public ListSubscribeDeviceResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListSubscribeDeviceResponseData setSubscribeList(java.util.List<ListSubscribeDeviceResponseDataSubscribeList> subscribeList) {
            this.subscribeList = subscribeList;
            return this;
        }
        public java.util.List<ListSubscribeDeviceResponseDataSubscribeList> getSubscribeList() {
            return this.subscribeList;
        }

    }

}
