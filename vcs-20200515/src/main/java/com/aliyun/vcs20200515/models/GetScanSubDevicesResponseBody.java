// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetScanSubDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetScanSubDevicesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetScanSubDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScanSubDevicesResponseBody self = new GetScanSubDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScanSubDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScanSubDevicesResponseBody setData(GetScanSubDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScanSubDevicesResponseBodyData getData() {
        return this.data;
    }

    public GetScanSubDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScanSubDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetScanSubDevicesResponseBodyDataSubDeviceList extends TeaModel {
        @NameInMap("AssociatedNvr")
        public String associatedNvr;

        @NameInMap("DeviceMac")
        public String deviceMac;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceSn")
        public String deviceSn;

        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("SubDeviceIp")
        public String subDeviceIp;

        @NameInMap("SubDevicePort")
        public String subDevicePort;

        public static GetScanSubDevicesResponseBodyDataSubDeviceList build(java.util.Map<String, ?> map) throws Exception {
            GetScanSubDevicesResponseBodyDataSubDeviceList self = new GetScanSubDevicesResponseBodyDataSubDeviceList();
            return TeaModel.build(map, self);
        }

        public GetScanSubDevicesResponseBodyDataSubDeviceList setAssociatedNvr(String associatedNvr) {
            this.associatedNvr = associatedNvr;
            return this;
        }
        public String getAssociatedNvr() {
            return this.associatedNvr;
        }

        public GetScanSubDevicesResponseBodyDataSubDeviceList setDeviceMac(String deviceMac) {
            this.deviceMac = deviceMac;
            return this;
        }
        public String getDeviceMac() {
            return this.deviceMac;
        }

        public GetScanSubDevicesResponseBodyDataSubDeviceList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public GetScanSubDevicesResponseBodyDataSubDeviceList setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public GetScanSubDevicesResponseBodyDataSubDeviceList setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public GetScanSubDevicesResponseBodyDataSubDeviceList setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public GetScanSubDevicesResponseBodyDataSubDeviceList setSubDeviceIp(String subDeviceIp) {
            this.subDeviceIp = subDeviceIp;
            return this;
        }
        public String getSubDeviceIp() {
            return this.subDeviceIp;
        }

        public GetScanSubDevicesResponseBodyDataSubDeviceList setSubDevicePort(String subDevicePort) {
            this.subDevicePort = subDevicePort;
            return this;
        }
        public String getSubDevicePort() {
            return this.subDevicePort;
        }

    }

    public static class GetScanSubDevicesResponseBodyData extends TeaModel {
        @NameInMap("SubDeviceList")
        public java.util.List<GetScanSubDevicesResponseBodyDataSubDeviceList> subDeviceList;

        public static GetScanSubDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScanSubDevicesResponseBodyData self = new GetScanSubDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScanSubDevicesResponseBodyData setSubDeviceList(java.util.List<GetScanSubDevicesResponseBodyDataSubDeviceList> subDeviceList) {
            this.subDeviceList = subDeviceList;
            return this;
        }
        public java.util.List<GetScanSubDevicesResponseBodyDataSubDeviceList> getSubDeviceList() {
            return this.subDeviceList;
        }

    }

}
