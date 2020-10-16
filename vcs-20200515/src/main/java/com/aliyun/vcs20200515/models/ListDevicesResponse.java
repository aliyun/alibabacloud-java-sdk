// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListDevicesResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListDevicesResponseData data;

    public static ListDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesResponse self = new ListDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListDevicesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDevicesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDevicesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicesResponse setData(ListDevicesResponseData data) {
        this.data = data;
        return this;
    }
    public ListDevicesResponseData getData() {
        return this.data;
    }

    public static class ListDevicesResponseDataRecords extends TeaModel {
        @NameInMap("AccessProtocolType")
        @Validation(required = true)
        public String accessProtocolType;

        @NameInMap("BitRate")
        @Validation(required = true)
        public String bitRate;

        @NameInMap("CoverImageUrl")
        @Validation(required = true)
        public String coverImageUrl;

        @NameInMap("GbId")
        @Validation(required = true)
        public String gbId;

        @NameInMap("DeviceAddress")
        @Validation(required = true)
        public String deviceAddress;

        @NameInMap("DeviceDirection")
        @Validation(required = true)
        public String deviceDirection;

        @NameInMap("DeviceSite")
        @Validation(required = true)
        public String deviceSite;

        @NameInMap("Latitude")
        @Validation(required = true)
        public String latitude;

        @NameInMap("Longitude")
        @Validation(required = true)
        public String longitude;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("Resolution")
        @Validation(required = true)
        public String resolution;

        @NameInMap("SipGBId")
        @Validation(required = true)
        public String sipGBId;

        @NameInMap("SipPassword")
        @Validation(required = true)
        public String sipPassword;

        @NameInMap("SipServerIp")
        @Validation(required = true)
        public String sipServerIp;

        @NameInMap("SipServerPort")
        @Validation(required = true)
        public String sipServerPort;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("DeviceType")
        @Validation(required = true)
        public String deviceType;

        @NameInMap("Vendor")
        @Validation(required = true)
        public String vendor;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static ListDevicesResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseDataRecords self = new ListDevicesResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseDataRecords setAccessProtocolType(String accessProtocolType) {
            this.accessProtocolType = accessProtocolType;
            return this;
        }
        public String getAccessProtocolType() {
            return this.accessProtocolType;
        }

        public ListDevicesResponseDataRecords setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

        public ListDevicesResponseDataRecords setCoverImageUrl(String coverImageUrl) {
            this.coverImageUrl = coverImageUrl;
            return this;
        }
        public String getCoverImageUrl() {
            return this.coverImageUrl;
        }

        public ListDevicesResponseDataRecords setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public ListDevicesResponseDataRecords setDeviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        public ListDevicesResponseDataRecords setDeviceDirection(String deviceDirection) {
            this.deviceDirection = deviceDirection;
            return this;
        }
        public String getDeviceDirection() {
            return this.deviceDirection;
        }

        public ListDevicesResponseDataRecords setDeviceSite(String deviceSite) {
            this.deviceSite = deviceSite;
            return this;
        }
        public String getDeviceSite() {
            return this.deviceSite;
        }

        public ListDevicesResponseDataRecords setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ListDevicesResponseDataRecords setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public ListDevicesResponseDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDevicesResponseDataRecords setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListDevicesResponseDataRecords setSipGBId(String sipGBId) {
            this.sipGBId = sipGBId;
            return this;
        }
        public String getSipGBId() {
            return this.sipGBId;
        }

        public ListDevicesResponseDataRecords setSipPassword(String sipPassword) {
            this.sipPassword = sipPassword;
            return this;
        }
        public String getSipPassword() {
            return this.sipPassword;
        }

        public ListDevicesResponseDataRecords setSipServerIp(String sipServerIp) {
            this.sipServerIp = sipServerIp;
            return this;
        }
        public String getSipServerIp() {
            return this.sipServerIp;
        }

        public ListDevicesResponseDataRecords setSipServerPort(String sipServerPort) {
            this.sipServerPort = sipServerPort;
            return this;
        }
        public String getSipServerPort() {
            return this.sipServerPort;
        }

        public ListDevicesResponseDataRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDevicesResponseDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListDevicesResponseDataRecords setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListDevicesResponseDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class ListDevicesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<ListDevicesResponseDataRecords> records;

        public static ListDevicesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseData self = new ListDevicesResponseData();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDevicesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDevicesResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDevicesResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListDevicesResponseData setRecords(java.util.List<ListDevicesResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListDevicesResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
