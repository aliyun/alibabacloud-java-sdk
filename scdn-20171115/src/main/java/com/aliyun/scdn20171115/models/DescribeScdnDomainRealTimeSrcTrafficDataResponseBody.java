// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeSrcTrafficDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RealTimeSrcTrafficDataPerInterval")
    public DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerInterval realTimeSrcTrafficDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeScdnDomainRealTimeSrcTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeSrcTrafficDataResponseBody self = new DescribeScdnDomainRealTimeSrcTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeSrcTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeScdnDomainRealTimeSrcTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainRealTimeSrcTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainRealTimeSrcTrafficDataResponseBody setRealTimeSrcTrafficDataPerInterval(DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerInterval realTimeSrcTrafficDataPerInterval) {
        this.realTimeSrcTrafficDataPerInterval = realTimeSrcTrafficDataPerInterval;
        return this;
    }
    public DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerInterval getRealTimeSrcTrafficDataPerInterval() {
        return this.realTimeSrcTrafficDataPerInterval;
    }

    public DescribeScdnDomainRealTimeSrcTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainRealTimeSrcTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerIntervalDataModule self = new DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerInterval self = new DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerInterval setDataModule(java.util.List<DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeScdnDomainRealTimeSrcTrafficDataResponseBodyRealTimeSrcTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
