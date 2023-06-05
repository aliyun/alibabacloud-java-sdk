// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotDevicesResponseBody extends TeaModel {
    @NameInMap("AiotDevices")
    public DescribeAiotDevicesResponseBodyAiotDevices aiotDevices;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAiotDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotDevicesResponseBody self = new DescribeAiotDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiotDevicesResponseBody setAiotDevices(DescribeAiotDevicesResponseBodyAiotDevices aiotDevices) {
        this.aiotDevices = aiotDevices;
        return this;
    }
    public DescribeAiotDevicesResponseBodyAiotDevices getAiotDevices() {
        return this.aiotDevices;
    }

    public DescribeAiotDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAiotDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAiotDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList extends TeaModel {
        @NameInMap("CapDirection")
        public String capDirection;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        @NameInMap("IPAddr")
        public String IPAddr;

        @NameInMap("IPV6Addr")
        public String IPV6Addr;

        @NameInMap("IPv4Gateway")
        public String IPv4Gateway;

        @NameInMap("IPv4Netmask")
        public String IPv4Netmask;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsOnline")
        public String isOnline;

        @NameInMap("Latitude")
        public Float latitude;

        @NameInMap("Longitude")
        public Float longitude;

        @NameInMap("MAC")
        public String MAC;

        @NameInMap("Manufacturer")
        public String manufacturer;

        @NameInMap("Model")
        public String model;

        @NameInMap("MonitorAreaDesc")
        public String monitorAreaDesc;

        @NameInMap("MonitorDirection")
        public String monitorDirection;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrgCode")
        public String orgCode;

        @NameInMap("OwnerApsID")
        public String ownerApsID;

        @NameInMap("Password")
        public String password;

        @NameInMap("Place")
        public String place;

        @NameInMap("PlaceCode")
        public String placeCode;

        @NameInMap("Port")
        public Long port;

        @NameInMap("SerialNuber")
        public String serialNuber;

        @NameInMap("UserId")
        public String userId;

        public static DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList self = new DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList();
            return TeaModel.build(map, self);
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setCapDirection(String capDirection) {
            this.capDirection = capDirection;
            return this;
        }
        public String getCapDirection() {
            return this.capDirection;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setIPAddr(String IPAddr) {
            this.IPAddr = IPAddr;
            return this;
        }
        public String getIPAddr() {
            return this.IPAddr;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setIPV6Addr(String IPV6Addr) {
            this.IPV6Addr = IPV6Addr;
            return this;
        }
        public String getIPV6Addr() {
            return this.IPV6Addr;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setIPv4Gateway(String IPv4Gateway) {
            this.IPv4Gateway = IPv4Gateway;
            return this;
        }
        public String getIPv4Gateway() {
            return this.IPv4Gateway;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setIPv4Netmask(String IPv4Netmask) {
            this.IPv4Netmask = IPv4Netmask;
            return this;
        }
        public String getIPv4Netmask() {
            return this.IPv4Netmask;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setIsOnline(String isOnline) {
            this.isOnline = isOnline;
            return this;
        }
        public String getIsOnline() {
            return this.isOnline;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setLatitude(Float latitude) {
            this.latitude = latitude;
            return this;
        }
        public Float getLatitude() {
            return this.latitude;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setLongitude(Float longitude) {
            this.longitude = longitude;
            return this;
        }
        public Float getLongitude() {
            return this.longitude;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setMAC(String MAC) {
            this.MAC = MAC;
            return this;
        }
        public String getMAC() {
            return this.MAC;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setMonitorAreaDesc(String monitorAreaDesc) {
            this.monitorAreaDesc = monitorAreaDesc;
            return this;
        }
        public String getMonitorAreaDesc() {
            return this.monitorAreaDesc;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setMonitorDirection(String monitorDirection) {
            this.monitorDirection = monitorDirection;
            return this;
        }
        public String getMonitorDirection() {
            return this.monitorDirection;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setOrgCode(String orgCode) {
            this.orgCode = orgCode;
            return this;
        }
        public String getOrgCode() {
            return this.orgCode;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setOwnerApsID(String ownerApsID) {
            this.ownerApsID = ownerApsID;
            return this;
        }
        public String getOwnerApsID() {
            return this.ownerApsID;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setPlace(String place) {
            this.place = place;
            return this;
        }
        public String getPlace() {
            return this.place;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setPlaceCode(String placeCode) {
            this.placeCode = placeCode;
            return this;
        }
        public String getPlaceCode() {
            return this.placeCode;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setSerialNuber(String serialNuber) {
            this.serialNuber = serialNuber;
            return this;
        }
        public String getSerialNuber() {
            return this.serialNuber;
        }

        public DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeAiotDevicesResponseBodyAiotDevices extends TeaModel {
        @NameInMap("AiotDeviceList")
        public java.util.List<DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList> aiotDeviceList;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static DescribeAiotDevicesResponseBodyAiotDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotDevicesResponseBodyAiotDevices self = new DescribeAiotDevicesResponseBodyAiotDevices();
            return TeaModel.build(map, self);
        }

        public DescribeAiotDevicesResponseBodyAiotDevices setAiotDeviceList(java.util.List<DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList> aiotDeviceList) {
            this.aiotDeviceList = aiotDeviceList;
            return this;
        }
        public java.util.List<DescribeAiotDevicesResponseBodyAiotDevicesAiotDeviceList> getAiotDeviceList() {
            return this.aiotDeviceList;
        }

        public DescribeAiotDevicesResponseBodyAiotDevices setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeAiotDevicesResponseBodyAiotDevices setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAiotDevicesResponseBodyAiotDevices setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
