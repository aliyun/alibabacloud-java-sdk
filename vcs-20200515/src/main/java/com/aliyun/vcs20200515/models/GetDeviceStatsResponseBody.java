// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceStatsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public java.util.List<GetDeviceStatsResponseBodyData> data;

    public static GetDeviceStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatsResponseBody self = new GetDeviceStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceStatsResponseBody setData(java.util.List<GetDeviceStatsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDeviceStatsResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDeviceStatsResponseBodyData extends TeaModel {
        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("Count")
        public Long count;

        public static GetDeviceStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatsResponseBodyData self = new GetDeviceStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatsResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public GetDeviceStatsResponseBodyData setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public GetDeviceStatsResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
