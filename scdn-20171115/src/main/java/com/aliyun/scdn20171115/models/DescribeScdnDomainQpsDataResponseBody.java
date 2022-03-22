// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainQpsDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("QpsDataPerInterval")
    public DescribeScdnDomainQpsDataResponseBodyQpsDataPerInterval qpsDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeScdnDomainQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainQpsDataResponseBody self = new DescribeScdnDomainQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainQpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeScdnDomainQpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainQpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainQpsDataResponseBody setQpsDataPerInterval(DescribeScdnDomainQpsDataResponseBodyQpsDataPerInterval qpsDataPerInterval) {
        this.qpsDataPerInterval = qpsDataPerInterval;
        return this;
    }
    public DescribeScdnDomainQpsDataResponseBodyQpsDataPerInterval getQpsDataPerInterval() {
        return this.qpsDataPerInterval;
    }

    public DescribeScdnDomainQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainQpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("AccValue")
        public String accValue;

        @NameInMap("HttpAccValue")
        public String httpAccValue;

        @NameInMap("HttpQpsValue")
        public String httpQpsValue;

        @NameInMap("HttpsAccValue")
        public String httpsAccValue;

        @NameInMap("HttpsQpsValue")
        public String httpsQpsValue;

        @NameInMap("QpsValue")
        public String qpsValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule self = new DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setAccValue(String accValue) {
            this.accValue = accValue;
            return this;
        }
        public String getAccValue() {
            return this.accValue;
        }

        public DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setHttpAccValue(String httpAccValue) {
            this.httpAccValue = httpAccValue;
            return this;
        }
        public String getHttpAccValue() {
            return this.httpAccValue;
        }

        public DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setHttpQpsValue(String httpQpsValue) {
            this.httpQpsValue = httpQpsValue;
            return this;
        }
        public String getHttpQpsValue() {
            return this.httpQpsValue;
        }

        public DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setHttpsAccValue(String httpsAccValue) {
            this.httpsAccValue = httpsAccValue;
            return this;
        }
        public String getHttpsAccValue() {
            return this.httpsAccValue;
        }

        public DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setHttpsQpsValue(String httpsQpsValue) {
            this.httpsQpsValue = httpsQpsValue;
            return this;
        }
        public String getHttpsQpsValue() {
            return this.httpsQpsValue;
        }

        public DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setQpsValue(String qpsValue) {
            this.qpsValue = qpsValue;
            return this;
        }
        public String getQpsValue() {
            return this.qpsValue;
        }

        public DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeScdnDomainQpsDataResponseBodyQpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule> dataModule;

        public static DescribeScdnDomainQpsDataResponseBodyQpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainQpsDataResponseBodyQpsDataPerInterval self = new DescribeScdnDomainQpsDataResponseBodyQpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainQpsDataResponseBodyQpsDataPerInterval setDataModule(java.util.List<DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeScdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
