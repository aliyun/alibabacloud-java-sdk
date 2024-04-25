// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainBpsDataByLayerResponseBody extends TeaModel {
    @NameInMap("BpsDataInterval")
    public DescribeVodDomainBpsDataByLayerResponseBodyBpsDataInterval bpsDataInterval;

    @NameInMap("DataInterval")
    public Integer dataInterval;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainBpsDataByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainBpsDataByLayerResponseBody self = new DescribeVodDomainBpsDataByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainBpsDataByLayerResponseBody setBpsDataInterval(DescribeVodDomainBpsDataByLayerResponseBodyBpsDataInterval bpsDataInterval) {
        this.bpsDataInterval = bpsDataInterval;
        return this;
    }
    public DescribeVodDomainBpsDataByLayerResponseBodyBpsDataInterval getBpsDataInterval() {
        return this.bpsDataInterval;
    }

    public DescribeVodDomainBpsDataByLayerResponseBody setDataInterval(Integer dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public Integer getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainBpsDataByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TrafficValue")
        public Long trafficValue;

        @NameInMap("Value")
        public Double value;

        public static DescribeVodDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule self = new DescribeVodDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setTrafficValue(Long trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public Long getTrafficValue() {
            return this.trafficValue;
        }

        public DescribeVodDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainBpsDataByLayerResponseBodyBpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule> dataModule;

        public static DescribeVodDomainBpsDataByLayerResponseBodyBpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainBpsDataByLayerResponseBodyBpsDataInterval self = new DescribeVodDomainBpsDataByLayerResponseBodyBpsDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainBpsDataByLayerResponseBodyBpsDataInterval setDataModule(java.util.List<DescribeVodDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
