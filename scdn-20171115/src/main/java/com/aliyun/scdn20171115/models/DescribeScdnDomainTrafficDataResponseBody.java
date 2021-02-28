// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainTrafficDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("TrafficDataPerInterval")
    public DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeScdnDomainTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainTrafficDataResponseBody self = new DescribeScdnDomainTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainTrafficDataResponseBody setTrafficDataPerInterval(DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public DescribeScdnDomainTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeScdnDomainTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TrafficValue")
        public String trafficValue;

        @NameInMap("HttpTrafficValue")
        public String httpTrafficValue;

        @NameInMap("HttpsTrafficValue")
        public String httpsTrafficValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule self = new DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTrafficValue(String trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public String getTrafficValue() {
            return this.trafficValue;
        }

        public DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpTrafficValue(String httpTrafficValue) {
            this.httpTrafficValue = httpTrafficValue;
            return this;
        }
        public String getHttpTrafficValue() {
            return this.httpTrafficValue;
        }

        public DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsTrafficValue(String httpsTrafficValue) {
            this.httpsTrafficValue = httpsTrafficValue;
            return this;
        }
        public String getHttpsTrafficValue() {
            return this.httpsTrafficValue;
        }

        public DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerInterval self = new DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerInterval setDataModule(java.util.List<DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeScdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
