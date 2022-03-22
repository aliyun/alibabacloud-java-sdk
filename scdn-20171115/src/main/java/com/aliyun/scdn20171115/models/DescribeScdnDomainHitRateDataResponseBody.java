// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainHitRateDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("HitRatePerInterval")
    public DescribeScdnDomainHitRateDataResponseBodyHitRatePerInterval hitRatePerInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeScdnDomainHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainHitRateDataResponseBody self = new DescribeScdnDomainHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainHitRateDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeScdnDomainHitRateDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainHitRateDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainHitRateDataResponseBody setHitRatePerInterval(DescribeScdnDomainHitRateDataResponseBodyHitRatePerInterval hitRatePerInterval) {
        this.hitRatePerInterval = hitRatePerInterval;
        return this;
    }
    public DescribeScdnDomainHitRateDataResponseBodyHitRatePerInterval getHitRatePerInterval() {
        return this.hitRatePerInterval;
    }

    public DescribeScdnDomainHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainHitRateDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeScdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule extends TeaModel {
        @NameInMap("ByteHitRate")
        public String byteHitRate;

        @NameInMap("ReqHitRate")
        public String reqHitRate;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeScdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule self = new DescribeScdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule setByteHitRate(String byteHitRate) {
            this.byteHitRate = byteHitRate;
            return this;
        }
        public String getByteHitRate() {
            return this.byteHitRate;
        }

        public DescribeScdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule setReqHitRate(String reqHitRate) {
            this.reqHitRate = reqHitRate;
            return this;
        }
        public String getReqHitRate() {
            return this.reqHitRate;
        }

        public DescribeScdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeScdnDomainHitRateDataResponseBodyHitRatePerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeScdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule> dataModule;

        public static DescribeScdnDomainHitRateDataResponseBodyHitRatePerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainHitRateDataResponseBodyHitRatePerInterval self = new DescribeScdnDomainHitRateDataResponseBodyHitRatePerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainHitRateDataResponseBodyHitRatePerInterval setDataModule(java.util.List<DescribeScdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeScdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
