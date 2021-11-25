// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DeleteDevicesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicesResponseBody self = new DeleteDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDevicesResponseBody setData(java.util.List<DeleteDevicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DeleteDevicesResponseBodyData> getData() {
        return this.data;
    }

    public DeleteDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDevicesResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceId")
        public String deviceId;

        public static DeleteDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDevicesResponseBodyData self = new DeleteDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDevicesResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteDevicesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteDevicesResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

    }

}
