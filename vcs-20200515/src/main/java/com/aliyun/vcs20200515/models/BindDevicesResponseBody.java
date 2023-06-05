// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BindDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BindDevicesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static BindDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindDevicesResponseBody self = new BindDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public BindDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindDevicesResponseBody setData(BindDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindDevicesResponseBodyData getData() {
        return this.data;
    }

    public BindDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BindDevicesResponseBodyDataSubDeviceList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("SubDeviceId")
        public String subDeviceId;

        @NameInMap("SubDeviceIp")
        public String subDeviceIp;

        @NameInMap("SubDeviceName")
        public String subDeviceName;

        @NameInMap("SubDeviceNum")
        public String subDeviceNum;

        @NameInMap("SubDevicePort")
        public String subDevicePort;

        public static BindDevicesResponseBodyDataSubDeviceList build(java.util.Map<String, ?> map) throws Exception {
            BindDevicesResponseBodyDataSubDeviceList self = new BindDevicesResponseBodyDataSubDeviceList();
            return TeaModel.build(map, self);
        }

        public BindDevicesResponseBodyDataSubDeviceList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BindDevicesResponseBodyDataSubDeviceList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BindDevicesResponseBodyDataSubDeviceList setSubDeviceId(String subDeviceId) {
            this.subDeviceId = subDeviceId;
            return this;
        }
        public String getSubDeviceId() {
            return this.subDeviceId;
        }

        public BindDevicesResponseBodyDataSubDeviceList setSubDeviceIp(String subDeviceIp) {
            this.subDeviceIp = subDeviceIp;
            return this;
        }
        public String getSubDeviceIp() {
            return this.subDeviceIp;
        }

        public BindDevicesResponseBodyDataSubDeviceList setSubDeviceName(String subDeviceName) {
            this.subDeviceName = subDeviceName;
            return this;
        }
        public String getSubDeviceName() {
            return this.subDeviceName;
        }

        public BindDevicesResponseBodyDataSubDeviceList setSubDeviceNum(String subDeviceNum) {
            this.subDeviceNum = subDeviceNum;
            return this;
        }
        public String getSubDeviceNum() {
            return this.subDeviceNum;
        }

        public BindDevicesResponseBodyDataSubDeviceList setSubDevicePort(String subDevicePort) {
            this.subDevicePort = subDevicePort;
            return this;
        }
        public String getSubDevicePort() {
            return this.subDevicePort;
        }

    }

    public static class BindDevicesResponseBodyData extends TeaModel {
        @NameInMap("SubDeviceList")
        public java.util.List<BindDevicesResponseBodyDataSubDeviceList> subDeviceList;

        public static BindDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindDevicesResponseBodyData self = new BindDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindDevicesResponseBodyData setSubDeviceList(java.util.List<BindDevicesResponseBodyDataSubDeviceList> subDeviceList) {
            this.subDeviceList = subDeviceList;
            return this;
        }
        public java.util.List<BindDevicesResponseBodyDataSubDeviceList> getSubDeviceList() {
            return this.subDeviceList;
        }

    }

}
