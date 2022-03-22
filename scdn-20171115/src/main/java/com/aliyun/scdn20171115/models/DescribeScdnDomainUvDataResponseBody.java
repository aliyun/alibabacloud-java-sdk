// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainUvDataResponseBody extends TeaModel {
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

    @NameInMap("UvDataInterval")
    public DescribeScdnDomainUvDataResponseBodyUvDataInterval uvDataInterval;

    public static DescribeScdnDomainUvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainUvDataResponseBody self = new DescribeScdnDomainUvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainUvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeScdnDomainUvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainUvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainUvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainUvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeScdnDomainUvDataResponseBody setUvDataInterval(DescribeScdnDomainUvDataResponseBodyUvDataInterval uvDataInterval) {
        this.uvDataInterval = uvDataInterval;
        return this;
    }
    public DescribeScdnDomainUvDataResponseBodyUvDataInterval getUvDataInterval() {
        return this.uvDataInterval;
    }

    public static class DescribeScdnDomainUvDataResponseBodyUvDataIntervalUsageData extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeScdnDomainUvDataResponseBodyUvDataIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainUvDataResponseBodyUvDataIntervalUsageData self = new DescribeScdnDomainUvDataResponseBodyUvDataIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainUvDataResponseBodyUvDataIntervalUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeScdnDomainUvDataResponseBodyUvDataIntervalUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeScdnDomainUvDataResponseBodyUvDataInterval extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeScdnDomainUvDataResponseBodyUvDataIntervalUsageData> usageData;

        public static DescribeScdnDomainUvDataResponseBodyUvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainUvDataResponseBodyUvDataInterval self = new DescribeScdnDomainUvDataResponseBodyUvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainUvDataResponseBodyUvDataInterval setUsageData(java.util.List<DescribeScdnDomainUvDataResponseBodyUvDataIntervalUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeScdnDomainUvDataResponseBodyUvDataIntervalUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
