// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainOriginTrafficDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OriginTrafficDataPerInterval")
    public DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval originTrafficDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeScdnDomainOriginTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainOriginTrafficDataResponseBody self = new DescribeScdnDomainOriginTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainOriginTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeScdnDomainOriginTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainOriginTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainOriginTrafficDataResponseBody setOriginTrafficDataPerInterval(DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval originTrafficDataPerInterval) {
        this.originTrafficDataPerInterval = originTrafficDataPerInterval;
        return this;
    }
    public DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval getOriginTrafficDataPerInterval() {
        return this.originTrafficDataPerInterval;
    }

    public DescribeScdnDomainOriginTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainOriginTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("HttpTrafficValue")
        public String httpTrafficValue;

        @NameInMap("HttpsTrafficValue")
        public String httpsTrafficValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TrafficValue")
        public String trafficValue;

        public static DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule self = new DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule setHttpTrafficValue(String httpTrafficValue) {
            this.httpTrafficValue = httpTrafficValue;
            return this;
        }
        public String getHttpTrafficValue() {
            return this.httpTrafficValue;
        }

        public DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule setHttpsTrafficValue(String httpsTrafficValue) {
            this.httpsTrafficValue = httpsTrafficValue;
            return this;
        }
        public String getHttpsTrafficValue() {
            return this.httpsTrafficValue;
        }

        public DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule setTrafficValue(String trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public String getTrafficValue() {
            return this.trafficValue;
        }

    }

    public static class DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval self = new DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval setDataModule(java.util.List<DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeScdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
