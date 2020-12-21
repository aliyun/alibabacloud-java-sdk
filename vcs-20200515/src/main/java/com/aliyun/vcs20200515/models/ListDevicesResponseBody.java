// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListDevicesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListDevicesResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesResponseBody self = new ListDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicesResponseBody setData(ListDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDevicesResponseBodyData getData() {
        return this.data;
    }

    public ListDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListDevicesResponseBodyDataRecords extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("SipGBId")
        public String sipGBId;

        @NameInMap("DeviceDirection")
        public String deviceDirection;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceAddress")
        public String deviceAddress;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SipPassword")
        public String sipPassword;

        @NameInMap("SipServerPort")
        public String sipServerPort;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("GbId")
        public String gbId;

        @NameInMap("CoverImageUrl")
        public String coverImageUrl;

        @NameInMap("AccessProtocolType")
        public String accessProtocolType;

        @NameInMap("DeviceSite")
        public String deviceSite;

        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("Latitude")
        public String latitude;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("SipServerIp")
        public String sipServerIp;

        @NameInMap("BitRate")
        public String bitRate;

        public static ListDevicesResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyDataRecords self = new ListDevicesResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyDataRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDevicesResponseBodyDataRecords setSipGBId(String sipGBId) {
            this.sipGBId = sipGBId;
            return this;
        }
        public String getSipGBId() {
            return this.sipGBId;
        }

        public ListDevicesResponseBodyDataRecords setDeviceDirection(String deviceDirection) {
            this.deviceDirection = deviceDirection;
            return this;
        }
        public String getDeviceDirection() {
            return this.deviceDirection;
        }

        public ListDevicesResponseBodyDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDevicesResponseBodyDataRecords setDeviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        public ListDevicesResponseBodyDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListDevicesResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDevicesResponseBodyDataRecords setSipPassword(String sipPassword) {
            this.sipPassword = sipPassword;
            return this;
        }
        public String getSipPassword() {
            return this.sipPassword;
        }

        public ListDevicesResponseBodyDataRecords setSipServerPort(String sipServerPort) {
            this.sipServerPort = sipServerPort;
            return this;
        }
        public String getSipServerPort() {
            return this.sipServerPort;
        }

        public ListDevicesResponseBodyDataRecords setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListDevicesResponseBodyDataRecords setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public ListDevicesResponseBodyDataRecords setCoverImageUrl(String coverImageUrl) {
            this.coverImageUrl = coverImageUrl;
            return this;
        }
        public String getCoverImageUrl() {
            return this.coverImageUrl;
        }

        public ListDevicesResponseBodyDataRecords setAccessProtocolType(String accessProtocolType) {
            this.accessProtocolType = accessProtocolType;
            return this;
        }
        public String getAccessProtocolType() {
            return this.accessProtocolType;
        }

        public ListDevicesResponseBodyDataRecords setDeviceSite(String deviceSite) {
            this.deviceSite = deviceSite;
            return this;
        }
        public String getDeviceSite() {
            return this.deviceSite;
        }

        public ListDevicesResponseBodyDataRecords setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public ListDevicesResponseBodyDataRecords setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ListDevicesResponseBodyDataRecords setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListDevicesResponseBodyDataRecords setSipServerIp(String sipServerIp) {
            this.sipServerIp = sipServerIp;
            return this;
        }
        public String getSipServerIp() {
            return this.sipServerIp;
        }

        public ListDevicesResponseBodyDataRecords setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

    }

    public static class ListDevicesResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<ListDevicesResponseBodyDataRecords> records;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyData self = new ListDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyData setRecords(java.util.List<ListDevicesResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListDevicesResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListDevicesResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListDevicesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDevicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDevicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
