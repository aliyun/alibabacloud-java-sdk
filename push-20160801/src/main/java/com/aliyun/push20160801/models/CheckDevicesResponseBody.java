// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceCheckInfos")
    public CheckDevicesResponseBodyDeviceCheckInfos deviceCheckInfos;

    public static CheckDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDevicesResponseBody self = new CheckDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDevicesResponseBody setDeviceCheckInfos(CheckDevicesResponseBodyDeviceCheckInfos deviceCheckInfos) {
        this.deviceCheckInfos = deviceCheckInfos;
        return this;
    }
    public CheckDevicesResponseBodyDeviceCheckInfos getDeviceCheckInfos() {
        return this.deviceCheckInfos;
    }

    public static class CheckDevicesResponseBodyDeviceCheckInfosDeviceCheckInfo extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Available")
        public Boolean available;

        public static CheckDevicesResponseBodyDeviceCheckInfosDeviceCheckInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckDevicesResponseBodyDeviceCheckInfosDeviceCheckInfo self = new CheckDevicesResponseBodyDeviceCheckInfosDeviceCheckInfo();
            return TeaModel.build(map, self);
        }

        public CheckDevicesResponseBodyDeviceCheckInfosDeviceCheckInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public CheckDevicesResponseBodyDeviceCheckInfosDeviceCheckInfo setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

    }

    public static class CheckDevicesResponseBodyDeviceCheckInfos extends TeaModel {
        @NameInMap("DeviceCheckInfo")
        public java.util.List<CheckDevicesResponseBodyDeviceCheckInfosDeviceCheckInfo> deviceCheckInfo;

        public static CheckDevicesResponseBodyDeviceCheckInfos build(java.util.Map<String, ?> map) throws Exception {
            CheckDevicesResponseBodyDeviceCheckInfos self = new CheckDevicesResponseBodyDeviceCheckInfos();
            return TeaModel.build(map, self);
        }

        public CheckDevicesResponseBodyDeviceCheckInfos setDeviceCheckInfo(java.util.List<CheckDevicesResponseBodyDeviceCheckInfosDeviceCheckInfo> deviceCheckInfo) {
            this.deviceCheckInfo = deviceCheckInfo;
            return this;
        }
        public java.util.List<CheckDevicesResponseBodyDeviceCheckInfosDeviceCheckInfo> getDeviceCheckInfo() {
            return this.deviceCheckInfo;
        }

    }

}
