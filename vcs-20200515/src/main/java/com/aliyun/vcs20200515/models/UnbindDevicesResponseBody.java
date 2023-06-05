// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnbindDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UnbindDevicesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UnbindDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindDevicesResponseBody self = new UnbindDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindDevicesResponseBody setData(UnbindDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnbindDevicesResponseBodyData getData() {
        return this.data;
    }

    public UnbindDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UnbindDevicesResponseBodyDataSubDeviceList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("SubDeviceId")
        public String subDeviceId;

        public static UnbindDevicesResponseBodyDataSubDeviceList build(java.util.Map<String, ?> map) throws Exception {
            UnbindDevicesResponseBodyDataSubDeviceList self = new UnbindDevicesResponseBodyDataSubDeviceList();
            return TeaModel.build(map, self);
        }

        public UnbindDevicesResponseBodyDataSubDeviceList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UnbindDevicesResponseBodyDataSubDeviceList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UnbindDevicesResponseBodyDataSubDeviceList setSubDeviceId(String subDeviceId) {
            this.subDeviceId = subDeviceId;
            return this;
        }
        public String getSubDeviceId() {
            return this.subDeviceId;
        }

    }

    public static class UnbindDevicesResponseBodyData extends TeaModel {
        @NameInMap("SubDeviceList")
        public java.util.List<UnbindDevicesResponseBodyDataSubDeviceList> subDeviceList;

        public static UnbindDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnbindDevicesResponseBodyData self = new UnbindDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnbindDevicesResponseBodyData setSubDeviceList(java.util.List<UnbindDevicesResponseBodyDataSubDeviceList> subDeviceList) {
            this.subDeviceList = subDeviceList;
            return this;
        }
        public java.util.List<UnbindDevicesResponseBodyDataSubDeviceList> getSubDeviceList() {
            return this.subDeviceList;
        }

    }

}
