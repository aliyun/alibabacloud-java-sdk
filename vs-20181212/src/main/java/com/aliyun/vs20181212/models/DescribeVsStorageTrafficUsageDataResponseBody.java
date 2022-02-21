// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStorageTrafficUsageDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficUsage")
    public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsage trafficUsage;

    public static DescribeVsStorageTrafficUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStorageTrafficUsageDataResponseBody self = new DescribeVsStorageTrafficUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsStorageTrafficUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsStorageTrafficUsageDataResponseBody setTrafficUsage(DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsage trafficUsage) {
        this.trafficUsage = trafficUsage;
        return this;
    }
    public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsage getTrafficUsage() {
        return this.trafficUsage;
    }

    public static class DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("LanBandwidthInDataValue")
        public Float lanBandwidthInDataValue;

        @NameInMap("LanBandwidthOutDataValue")
        public Float lanBandwidthOutDataValue;

        @NameInMap("LanTrafficInDataValue")
        public Long lanTrafficInDataValue;

        @NameInMap("LanTrafficOutDataValue")
        public Long lanTrafficOutDataValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("WanBandwidthInDataValue")
        public Float wanBandwidthInDataValue;

        @NameInMap("WanBandwidthOutDataValue")
        public Float wanBandwidthOutDataValue;

        @NameInMap("WanTrafficInDataValue")
        public Long wanTrafficInDataValue;

        @NameInMap("WanTrafficOutDataValue")
        public Long wanTrafficOutDataValue;

        public static DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule self = new DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule setLanBandwidthInDataValue(Float lanBandwidthInDataValue) {
            this.lanBandwidthInDataValue = lanBandwidthInDataValue;
            return this;
        }
        public Float getLanBandwidthInDataValue() {
            return this.lanBandwidthInDataValue;
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule setLanBandwidthOutDataValue(Float lanBandwidthOutDataValue) {
            this.lanBandwidthOutDataValue = lanBandwidthOutDataValue;
            return this;
        }
        public Float getLanBandwidthOutDataValue() {
            return this.lanBandwidthOutDataValue;
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule setLanTrafficInDataValue(Long lanTrafficInDataValue) {
            this.lanTrafficInDataValue = lanTrafficInDataValue;
            return this;
        }
        public Long getLanTrafficInDataValue() {
            return this.lanTrafficInDataValue;
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule setLanTrafficOutDataValue(Long lanTrafficOutDataValue) {
            this.lanTrafficOutDataValue = lanTrafficOutDataValue;
            return this;
        }
        public Long getLanTrafficOutDataValue() {
            return this.lanTrafficOutDataValue;
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule setWanBandwidthInDataValue(Float wanBandwidthInDataValue) {
            this.wanBandwidthInDataValue = wanBandwidthInDataValue;
            return this;
        }
        public Float getWanBandwidthInDataValue() {
            return this.wanBandwidthInDataValue;
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule setWanBandwidthOutDataValue(Float wanBandwidthOutDataValue) {
            this.wanBandwidthOutDataValue = wanBandwidthOutDataValue;
            return this;
        }
        public Float getWanBandwidthOutDataValue() {
            return this.wanBandwidthOutDataValue;
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule setWanTrafficInDataValue(Long wanTrafficInDataValue) {
            this.wanTrafficInDataValue = wanTrafficInDataValue;
            return this;
        }
        public Long getWanTrafficInDataValue() {
            return this.wanTrafficInDataValue;
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule setWanTrafficOutDataValue(Long wanTrafficOutDataValue) {
            this.wanTrafficOutDataValue = wanTrafficOutDataValue;
            return this;
        }
        public Long getWanTrafficOutDataValue() {
            return this.wanTrafficOutDataValue;
        }

    }

    public static class DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsage extends TeaModel {
        @NameInMap("TrafficUsageDataModule")
        public java.util.List<DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule> trafficUsageDataModule;

        public static DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsage self = new DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsage();
            return TeaModel.build(map, self);
        }

        public DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsage setTrafficUsageDataModule(java.util.List<DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule> trafficUsageDataModule) {
            this.trafficUsageDataModule = trafficUsageDataModule;
            return this;
        }
        public java.util.List<DescribeVsStorageTrafficUsageDataResponseBodyTrafficUsageTrafficUsageDataModule> getTrafficUsageDataModule() {
            return this.trafficUsageDataModule;
        }

    }

}
