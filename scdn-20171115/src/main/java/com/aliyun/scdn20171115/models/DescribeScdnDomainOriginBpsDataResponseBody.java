// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainOriginBpsDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OriginBpsDataPerInterval")
    public DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval originBpsDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeScdnDomainOriginBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainOriginBpsDataResponseBody self = new DescribeScdnDomainOriginBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainOriginBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeScdnDomainOriginBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainOriginBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainOriginBpsDataResponseBody setOriginBpsDataPerInterval(DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval originBpsDataPerInterval) {
        this.originBpsDataPerInterval = originBpsDataPerInterval;
        return this;
    }
    public DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval getOriginBpsDataPerInterval() {
        return this.originBpsDataPerInterval;
    }

    public DescribeScdnDomainOriginBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainOriginBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("HttpOriginBpsValue")
        public String httpOriginBpsValue;

        @NameInMap("HttpsOriginBpsValue")
        public String httpsOriginBpsValue;

        @NameInMap("OriginBpsValue")
        public String originBpsValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule self = new DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule setHttpOriginBpsValue(String httpOriginBpsValue) {
            this.httpOriginBpsValue = httpOriginBpsValue;
            return this;
        }
        public String getHttpOriginBpsValue() {
            return this.httpOriginBpsValue;
        }

        public DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule setHttpsOriginBpsValue(String httpsOriginBpsValue) {
            this.httpsOriginBpsValue = httpsOriginBpsValue;
            return this;
        }
        public String getHttpsOriginBpsValue() {
            return this.httpsOriginBpsValue;
        }

        public DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule setOriginBpsValue(String originBpsValue) {
            this.originBpsValue = originBpsValue;
            return this;
        }
        public String getOriginBpsValue() {
            return this.originBpsValue;
        }

        public DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule> dataModule;

        public static DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval self = new DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval setDataModule(java.util.List<DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeScdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
