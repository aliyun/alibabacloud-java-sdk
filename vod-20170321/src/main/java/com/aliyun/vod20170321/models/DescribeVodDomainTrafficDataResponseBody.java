// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTrafficDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TotalTraffic")
    public String totalTraffic;

    @NameInMap("TrafficDataPerInterval")
    public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    public static DescribeVodDomainTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainTrafficDataResponseBody self = new DescribeVodDomainTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodDomainTrafficDataResponseBody setTotalTraffic(String totalTraffic) {
        this.totalTraffic = totalTraffic;
        return this;
    }
    public String getTotalTraffic() {
        return this.totalTraffic;
    }

    public DescribeVodDomainTrafficDataResponseBody setTrafficDataPerInterval(DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static class DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("DomesticValue")
        public String domesticValue;

        @NameInMap("HttpsDomesticValue")
        public String httpsDomesticValue;

        @NameInMap("HttpsOverseasValue")
        public String httpsOverseasValue;

        @NameInMap("HttpsValue")
        public String httpsValue;

        @NameInMap("OverseasValue")
        public String overseasValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule self = new DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsDomesticValue(String httpsDomesticValue) {
            this.httpsDomesticValue = httpsDomesticValue;
            return this;
        }
        public String getHttpsDomesticValue() {
            return this.httpsDomesticValue;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsOverseasValue(String httpsOverseasValue) {
            this.httpsOverseasValue = httpsOverseasValue;
            return this;
        }
        public String getHttpsOverseasValue() {
            return this.httpsOverseasValue;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval self = new DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval setDataModule(java.util.List<DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
