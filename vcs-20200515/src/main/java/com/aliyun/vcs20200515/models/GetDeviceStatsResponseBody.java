// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceStatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetDeviceStatsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatsResponseBody self = new GetDeviceStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceStatsResponseBody setData(java.util.List<GetDeviceStatsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDeviceStatsResponseBodyData> getData() {
        return this.data;
    }

    public GetDeviceStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceStatsResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("DeviceType")
        public String deviceType;

        public static GetDeviceStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatsResponseBodyData self = new GetDeviceStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatsResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetDeviceStatsResponseBodyData setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public GetDeviceStatsResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

    }

}
