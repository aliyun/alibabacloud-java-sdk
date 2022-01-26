// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class DescribeDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeDevicesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesResponseBody self = new DescribeDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDevicesResponseBody setData(java.util.List<DescribeDevicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDevicesResponseBodyData> getData() {
        return this.data;
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

    public DescribeDevicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDevicesResponseBodyData extends TeaModel {
        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("FrameRate")
        public String frameRate;

        @NameInMap("ImageSize")
        public Float imageSize;

        @NameInMap("Location")
        public String location;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PullStreamStatus")
        public String pullStreamStatus;

        @NameInMap("RealTimeDataRate")
        public String realTimeDataRate;

        @NameInMap("StructuredSize")
        public Float structuredSize;

        @NameInMap("VectorSize")
        public Float vectorSize;

        public static DescribeDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyData self = new DescribeDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyData setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public DescribeDevicesResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeDevicesResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeDevicesResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeDevicesResponseBodyData setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public DescribeDevicesResponseBodyData setImageSize(Float imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Float getImageSize() {
            return this.imageSize;
        }

        public DescribeDevicesResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeDevicesResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeDevicesResponseBodyData setPullStreamStatus(String pullStreamStatus) {
            this.pullStreamStatus = pullStreamStatus;
            return this;
        }
        public String getPullStreamStatus() {
            return this.pullStreamStatus;
        }

        public DescribeDevicesResponseBodyData setRealTimeDataRate(String realTimeDataRate) {
            this.realTimeDataRate = realTimeDataRate;
            return this;
        }
        public String getRealTimeDataRate() {
            return this.realTimeDataRate;
        }

        public DescribeDevicesResponseBodyData setStructuredSize(Float structuredSize) {
            this.structuredSize = structuredSize;
            return this;
        }
        public Float getStructuredSize() {
            return this.structuredSize;
        }

        public DescribeDevicesResponseBodyData setVectorSize(Float vectorSize) {
            this.vectorSize = vectorSize;
            return this;
        }
        public Float getVectorSize() {
            return this.vectorSize;
        }

    }

}
