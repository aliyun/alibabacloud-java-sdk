// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeSubscribeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSubscribeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscribeResponseBody self = new DescribeSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscribeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSubscribeResponseBody setData(DescribeSubscribeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSubscribeResponseBodyData getData() {
        return this.data;
    }

    public DescribeSubscribeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSubscribeResponseBodyDataSubscribeList extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("PushConfig")
        public String pushConfig;

        @NameInMap("UserId")
        public String userId;

        public static DescribeSubscribeResponseBodyDataSubscribeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscribeResponseBodyDataSubscribeList self = new DescribeSubscribeResponseBodyDataSubscribeList();
            return TeaModel.build(map, self);
        }

        public DescribeSubscribeResponseBodyDataSubscribeList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeSubscribeResponseBodyDataSubscribeList setPushConfig(String pushConfig) {
            this.pushConfig = pushConfig;
            return this;
        }
        public String getPushConfig() {
            return this.pushConfig;
        }

        public DescribeSubscribeResponseBodyDataSubscribeList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeSubscribeResponseBodyData extends TeaModel {
        @NameInMap("SubscribeList")
        public java.util.List<DescribeSubscribeResponseBodyDataSubscribeList> subscribeList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSubscribeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscribeResponseBodyData self = new DescribeSubscribeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSubscribeResponseBodyData setSubscribeList(java.util.List<DescribeSubscribeResponseBodyDataSubscribeList> subscribeList) {
            this.subscribeList = subscribeList;
            return this;
        }
        public java.util.List<DescribeSubscribeResponseBodyDataSubscribeList> getSubscribeList() {
            return this.subscribeList;
        }

        public DescribeSubscribeResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
