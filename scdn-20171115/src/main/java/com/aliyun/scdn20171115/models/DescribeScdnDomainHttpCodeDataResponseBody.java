// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainHttpCodeDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DataPerInterval")
    public DescribeScdnDomainHttpCodeDataResponseBodyDataPerInterval dataPerInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeScdnDomainHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainHttpCodeDataResponseBody self = new DescribeScdnDomainHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeScdnDomainHttpCodeDataResponseBody setDataPerInterval(DescribeScdnDomainHttpCodeDataResponseBodyDataPerInterval dataPerInterval) {
        this.dataPerInterval = dataPerInterval;
        return this;
    }
    public DescribeScdnDomainHttpCodeDataResponseBodyDataPerInterval getDataPerInterval() {
        return this.dataPerInterval;
    }

    public DescribeScdnDomainHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Count")
        public String count;

        @NameInMap("Proportion")
        public String proportion;

        public static DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule self = new DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

    }

    public static class DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval extends TeaModel {
        @NameInMap("HttpCodeDataModule")
        public java.util.List<DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule> httpCodeDataModule;

        public static DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval self = new DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval setHttpCodeDataModule(java.util.List<DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule> httpCodeDataModule) {
            this.httpCodeDataModule = httpCodeDataModule;
            return this;
        }
        public java.util.List<DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule> getHttpCodeDataModule() {
            return this.httpCodeDataModule;
        }

    }

    public static class DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule extends TeaModel {
        @NameInMap("HttpCodeDataPerInterval")
        public DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval httpCodeDataPerInterval;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule self = new DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule setHttpCodeDataPerInterval(DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval httpCodeDataPerInterval) {
            this.httpCodeDataPerInterval = httpCodeDataPerInterval;
            return this;
        }
        public DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval getHttpCodeDataPerInterval() {
            return this.httpCodeDataPerInterval;
        }

        public DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeScdnDomainHttpCodeDataResponseBodyDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule> dataModule;

        public static DescribeScdnDomainHttpCodeDataResponseBodyDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainHttpCodeDataResponseBodyDataPerInterval self = new DescribeScdnDomainHttpCodeDataResponseBodyDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainHttpCodeDataResponseBodyDataPerInterval setDataModule(java.util.List<DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeScdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
