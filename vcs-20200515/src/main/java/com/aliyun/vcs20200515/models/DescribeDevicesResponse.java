// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeDevicesResponse extends TeaModel {
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
    public DescribeDevicesResponseData data;

    public static DescribeDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesResponse self = new DescribeDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDevicesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDevicesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDevicesResponse setData(DescribeDevicesResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeDevicesResponseData getData() {
        return this.data;
    }

    public static class DescribeDevicesResponseDataRecords extends TeaModel {
        @NameInMap("InProtocol")
        @Validation(required = true)
        public String inProtocol;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("DeviceAddress")
        @Validation(required = true)
        public String deviceAddress;

        @NameInMap("DeviceId")
        @Validation(required = true)
        public String deviceId;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("DeviceType")
        @Validation(required = true)
        public String deviceType;

        @NameInMap("Latitude")
        @Validation(required = true)
        public String latitude;

        @NameInMap("Longitude")
        @Validation(required = true)
        public String longitude;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Vendor")
        @Validation(required = true)
        public String vendor;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        public static DescribeDevicesResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseDataRecords self = new DescribeDevicesResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseDataRecords setInProtocol(String inProtocol) {
            this.inProtocol = inProtocol;
            return this;
        }
        public String getInProtocol() {
            return this.inProtocol;
        }

        public DescribeDevicesResponseDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDevicesResponseDataRecords setDeviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        public DescribeDevicesResponseDataRecords setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeDevicesResponseDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeDevicesResponseDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeDevicesResponseDataRecords setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public DescribeDevicesResponseDataRecords setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public DescribeDevicesResponseDataRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDevicesResponseDataRecords setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public DescribeDevicesResponseDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

    }

    public static class DescribeDevicesResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

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
        public java.util.List<DescribeDevicesResponseDataRecords> records;

        public static DescribeDevicesResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseData self = new DescribeDevicesResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public DescribeDevicesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeDevicesResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeDevicesResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public DescribeDevicesResponseData setRecords(java.util.List<DescribeDevicesResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeDevicesResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
