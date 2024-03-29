// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainBpsDataResponseBody extends TeaModel {
    @NameInMap("BpsDataPerInterval")
    public DescribeScdnDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval;

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

    public static DescribeScdnDomainBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainBpsDataResponseBody self = new DescribeScdnDomainBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainBpsDataResponseBody setBpsDataPerInterval(DescribeScdnDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeScdnDomainBpsDataResponseBodyBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public DescribeScdnDomainBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeScdnDomainBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("BpsValue")
        public String bpsValue;

        @NameInMap("HttpBpsValue")
        public String httpBpsValue;

        @NameInMap("HttpsBpsValue")
        public String httpsBpsValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule self = new DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setBpsValue(String bpsValue) {
            this.bpsValue = bpsValue;
            return this;
        }
        public String getBpsValue() {
            return this.bpsValue;
        }

        public DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setHttpBpsValue(String httpBpsValue) {
            this.httpBpsValue = httpBpsValue;
            return this;
        }
        public String getHttpBpsValue() {
            return this.httpBpsValue;
        }

        public DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setHttpsBpsValue(String httpsBpsValue) {
            this.httpsBpsValue = httpsBpsValue;
            return this;
        }
        public String getHttpsBpsValue() {
            return this.httpsBpsValue;
        }

        public DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeScdnDomainBpsDataResponseBodyBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule;

        public static DescribeScdnDomainBpsDataResponseBodyBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainBpsDataResponseBodyBpsDataPerInterval self = new DescribeScdnDomainBpsDataResponseBodyBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainBpsDataResponseBodyBpsDataPerInterval setDataModule(java.util.List<DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeScdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
