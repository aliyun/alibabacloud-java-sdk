// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaAutoStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeviceOtaAutoStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceOtaAutoStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaAutoStatusResponseBody self = new GetDeviceOtaAutoStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaAutoStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceOtaAutoStatusResponseBody setData(GetDeviceOtaAutoStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceOtaAutoStatusResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceOtaAutoStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceOtaAutoStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceOtaAutoStatusResponseBodyData extends TeaModel {
        @NameInMap("AutoUpdate")
        public Integer autoUpdate;

        @NameInMap("AutoUpdateTimeSchedule")
        public String autoUpdateTimeSchedule;

        @NameInMap("ForceUpgrade")
        public Integer forceUpgrade;

        @NameInMap("Status")
        public Integer status;

        public static GetDeviceOtaAutoStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceOtaAutoStatusResponseBodyData self = new GetDeviceOtaAutoStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceOtaAutoStatusResponseBodyData setAutoUpdate(Integer autoUpdate) {
            this.autoUpdate = autoUpdate;
            return this;
        }
        public Integer getAutoUpdate() {
            return this.autoUpdate;
        }

        public GetDeviceOtaAutoStatusResponseBodyData setAutoUpdateTimeSchedule(String autoUpdateTimeSchedule) {
            this.autoUpdateTimeSchedule = autoUpdateTimeSchedule;
            return this;
        }
        public String getAutoUpdateTimeSchedule() {
            return this.autoUpdateTimeSchedule;
        }

        public GetDeviceOtaAutoStatusResponseBodyData setForceUpgrade(Integer forceUpgrade) {
            this.forceUpgrade = forceUpgrade;
            return this;
        }
        public Integer getForceUpgrade() {
            return this.forceUpgrade;
        }

        public GetDeviceOtaAutoStatusResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
