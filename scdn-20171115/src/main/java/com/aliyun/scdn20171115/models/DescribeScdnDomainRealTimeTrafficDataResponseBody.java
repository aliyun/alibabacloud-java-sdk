// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeTrafficDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RealTimeTrafficDataPerInterval")
    public DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeScdnDomainRealTimeTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeTrafficDataResponseBody self = new DescribeScdnDomainRealTimeTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainRealTimeTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainRealTimeTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainRealTimeTrafficDataResponseBody setRealTimeTrafficDataPerInterval(DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval) {
        this.realTimeTrafficDataPerInterval = realTimeTrafficDataPerInterval;
        return this;
    }
    public DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval getRealTimeTrafficDataPerInterval() {
        return this.realTimeTrafficDataPerInterval;
    }

    public DescribeScdnDomainRealTimeTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeScdnDomainRealTimeTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule self = new DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval self = new DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval setDataModule(java.util.List<DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeScdnDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
