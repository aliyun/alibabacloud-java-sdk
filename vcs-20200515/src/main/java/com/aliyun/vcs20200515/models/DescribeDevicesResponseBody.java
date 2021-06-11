// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeDevicesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeDevicesResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static DescribeDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesResponseBody self = new DescribeDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDevicesResponseBody setData(DescribeDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDevicesResponseBodyData getData() {
        return this.data;
    }

    public DescribeDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeDevicesResponseBodyDataRecords extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceAddress")
        public String deviceAddress;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("InProtocol")
        public String inProtocol;

        @NameInMap("Latitude")
        public String latitude;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("CapturedPictureId")
        public String capturedPictureId;

        @NameInMap("Password")
        public String password;

        public static DescribeDevicesResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyDataRecords self = new DescribeDevicesResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyDataRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDevicesResponseBodyDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeDevicesResponseBodyDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeDevicesResponseBodyDataRecords setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeDevicesResponseBodyDataRecords setDeviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        public DescribeDevicesResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDevicesResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public DescribeDevicesResponseBodyDataRecords setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public DescribeDevicesResponseBodyDataRecords setInProtocol(String inProtocol) {
            this.inProtocol = inProtocol;
            return this;
        }
        public String getInProtocol() {
            return this.inProtocol;
        }

        public DescribeDevicesResponseBodyDataRecords setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public DescribeDevicesResponseBodyDataRecords setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public DescribeDevicesResponseBodyDataRecords setCapturedPictureId(String capturedPictureId) {
            this.capturedPictureId = capturedPictureId;
            return this;
        }
        public String getCapturedPictureId() {
            return this.capturedPictureId;
        }

        public DescribeDevicesResponseBodyDataRecords setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

    public static class DescribeDevicesResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("Records")
        public java.util.List<DescribeDevicesResponseBodyDataRecords> records;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyData self = new DescribeDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public DescribeDevicesResponseBodyData setRecords(java.util.List<DescribeDevicesResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeDevicesResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public DescribeDevicesResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public DescribeDevicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeDevicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
