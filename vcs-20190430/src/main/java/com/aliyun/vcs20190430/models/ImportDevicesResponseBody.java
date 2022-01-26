// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class ImportDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ImportDevicesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ImportDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportDevicesResponseBody self = new ImportDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportDevicesResponseBody setData(ImportDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportDevicesResponseBodyData getData() {
        return this.data;
    }

    public ImportDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImportDevicesResponseBodyDataFailure extends TeaModel {
        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("DeviceId")
        public String deviceId;

        public static ImportDevicesResponseBodyDataFailure build(java.util.Map<String, ?> map) throws Exception {
            ImportDevicesResponseBodyDataFailure self = new ImportDevicesResponseBodyDataFailure();
            return TeaModel.build(map, self);
        }

        public ImportDevicesResponseBodyDataFailure setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public ImportDevicesResponseBodyDataFailure setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

    }

    public static class ImportDevicesResponseBodyDataSuccess extends TeaModel {
        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("DeviceId")
        public String deviceId;

        public static ImportDevicesResponseBodyDataSuccess build(java.util.Map<String, ?> map) throws Exception {
            ImportDevicesResponseBodyDataSuccess self = new ImportDevicesResponseBodyDataSuccess();
            return TeaModel.build(map, self);
        }

        public ImportDevicesResponseBodyDataSuccess setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public ImportDevicesResponseBodyDataSuccess setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

    }

    public static class ImportDevicesResponseBodyData extends TeaModel {
        @NameInMap("Failure")
        public java.util.List<ImportDevicesResponseBodyDataFailure> failure;

        @NameInMap("Success")
        public java.util.List<ImportDevicesResponseBodyDataSuccess> success;

        public static ImportDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportDevicesResponseBodyData self = new ImportDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportDevicesResponseBodyData setFailure(java.util.List<ImportDevicesResponseBodyDataFailure> failure) {
            this.failure = failure;
            return this;
        }
        public java.util.List<ImportDevicesResponseBodyDataFailure> getFailure() {
            return this.failure;
        }

        public ImportDevicesResponseBodyData setSuccess(java.util.List<ImportDevicesResponseBodyDataSuccess> success) {
            this.success = success;
            return this;
        }
        public java.util.List<ImportDevicesResponseBodyDataSuccess> getSuccess() {
            return this.success;
        }

    }

}
