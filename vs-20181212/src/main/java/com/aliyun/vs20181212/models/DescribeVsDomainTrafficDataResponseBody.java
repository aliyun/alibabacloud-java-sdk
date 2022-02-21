// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainTrafficDataResponseBody extends TeaModel {
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

    @NameInMap("TrafficDataPerInterval")
    public DescribeVsDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    public static DescribeVsDomainTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainTrafficDataResponseBody self = new DescribeVsDomainTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVsDomainTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVsDomainTrafficDataResponseBody setTrafficDataPerInterval(DescribeVsDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeVsDomainTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static class DescribeVsDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TrafficValue")
        public String trafficValue;

        public static DescribeVsDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule self = new DescribeVsDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVsDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTrafficValue(String trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public String getTrafficValue() {
            return this.trafficValue;
        }

    }

    public static class DescribeVsDomainTrafficDataResponseBodyTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVsDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeVsDomainTrafficDataResponseBodyTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainTrafficDataResponseBodyTrafficDataPerInterval self = new DescribeVsDomainTrafficDataResponseBodyTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainTrafficDataResponseBodyTrafficDataPerInterval setDataModule(java.util.List<DescribeVsDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVsDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
