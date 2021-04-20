// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotDeviceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    @NameInMap("AiotDevice")
    public UpdateAiotDeviceResponseBodyAiotDevice aiotDevice;

    public static UpdateAiotDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotDeviceResponseBody self = new UpdateAiotDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAiotDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAiotDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAiotDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAiotDeviceResponseBody setAiotDevice(UpdateAiotDeviceResponseBodyAiotDevice aiotDevice) {
        this.aiotDevice = aiotDevice;
        return this;
    }
    public UpdateAiotDeviceResponseBodyAiotDevice getAiotDevice() {
        return this.aiotDevice;
    }

    public static class UpdateAiotDeviceResponseBodyAiotDevice extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Model")
        public String model;

        @NameInMap("IPAddr")
        public String IPAddr;

        @NameInMap("IPV6Addr")
        public String IPV6Addr;

        @NameInMap("Port")
        public Long port;

        @NameInMap("Longitude")
        public Float longitude;

        @NameInMap("Latitude")
        public Float latitude;

        @NameInMap("PlaceCode")
        public String placeCode;

        @NameInMap("Place")
        public String place;

        @NameInMap("OrgCode")
        public String orgCode;

        @NameInMap("CapDirection")
        public String capDirection;

        @NameInMap("MonitorDirection")
        public String monitorDirection;

        @NameInMap("MonitorAreaDesc")
        public String monitorAreaDesc;

        @NameInMap("IsOnline")
        public String isOnline;

        @NameInMap("OwnerApsID")
        public String ownerApsID;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Password")
        public String password;

        @NameInMap("MAC")
        public String MAC;

        @NameInMap("IPv4Netmask")
        public String IPv4Netmask;

        @NameInMap("IPv4Gateway")
        public String IPv4Gateway;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Manufacturer")
        public String manufacturer;

        public static UpdateAiotDeviceResponseBodyAiotDevice build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotDeviceResponseBodyAiotDevice self = new UpdateAiotDeviceResponseBodyAiotDevice();
            return TeaModel.build(map, self);
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setIPAddr(String IPAddr) {
            this.IPAddr = IPAddr;
            return this;
        }
        public String getIPAddr() {
            return this.IPAddr;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setIPV6Addr(String IPV6Addr) {
            this.IPV6Addr = IPV6Addr;
            return this;
        }
        public String getIPV6Addr() {
            return this.IPV6Addr;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setLongitude(Float longitude) {
            this.longitude = longitude;
            return this;
        }
        public Float getLongitude() {
            return this.longitude;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setLatitude(Float latitude) {
            this.latitude = latitude;
            return this;
        }
        public Float getLatitude() {
            return this.latitude;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setPlaceCode(String placeCode) {
            this.placeCode = placeCode;
            return this;
        }
        public String getPlaceCode() {
            return this.placeCode;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setPlace(String place) {
            this.place = place;
            return this;
        }
        public String getPlace() {
            return this.place;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setOrgCode(String orgCode) {
            this.orgCode = orgCode;
            return this;
        }
        public String getOrgCode() {
            return this.orgCode;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setCapDirection(String capDirection) {
            this.capDirection = capDirection;
            return this;
        }
        public String getCapDirection() {
            return this.capDirection;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setMonitorDirection(String monitorDirection) {
            this.monitorDirection = monitorDirection;
            return this;
        }
        public String getMonitorDirection() {
            return this.monitorDirection;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setMonitorAreaDesc(String monitorAreaDesc) {
            this.monitorAreaDesc = monitorAreaDesc;
            return this;
        }
        public String getMonitorAreaDesc() {
            return this.monitorAreaDesc;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setIsOnline(String isOnline) {
            this.isOnline = isOnline;
            return this;
        }
        public String getIsOnline() {
            return this.isOnline;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setOwnerApsID(String ownerApsID) {
            this.ownerApsID = ownerApsID;
            return this;
        }
        public String getOwnerApsID() {
            return this.ownerApsID;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setMAC(String MAC) {
            this.MAC = MAC;
            return this;
        }
        public String getMAC() {
            return this.MAC;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setIPv4Netmask(String IPv4Netmask) {
            this.IPv4Netmask = IPv4Netmask;
            return this;
        }
        public String getIPv4Netmask() {
            return this.IPv4Netmask;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setIPv4Gateway(String IPv4Gateway) {
            this.IPv4Gateway = IPv4Gateway;
            return this;
        }
        public String getIPv4Gateway() {
            return this.IPv4Gateway;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public UpdateAiotDeviceResponseBodyAiotDevice setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

    }

}
