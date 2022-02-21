// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainPvDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PvDataInterval")
    public DescribeVsDomainPvDataResponseBodyPvDataInterval pvDataInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDomainPvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainPvDataResponseBody self = new DescribeVsDomainPvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainPvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVsDomainPvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainPvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainPvDataResponseBody setPvDataInterval(DescribeVsDomainPvDataResponseBodyPvDataInterval pvDataInterval) {
        this.pvDataInterval = pvDataInterval;
        return this;
    }
    public DescribeVsDomainPvDataResponseBodyPvDataInterval getPvDataInterval() {
        return this.pvDataInterval;
    }

    public DescribeVsDomainPvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainPvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVsDomainPvDataResponseBodyPvDataIntervalUsageData extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeVsDomainPvDataResponseBodyPvDataIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainPvDataResponseBodyPvDataIntervalUsageData self = new DescribeVsDomainPvDataResponseBodyPvDataIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainPvDataResponseBodyPvDataIntervalUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVsDomainPvDataResponseBodyPvDataIntervalUsageData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVsDomainPvDataResponseBodyPvDataInterval extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeVsDomainPvDataResponseBodyPvDataIntervalUsageData> usageData;

        public static DescribeVsDomainPvDataResponseBodyPvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainPvDataResponseBodyPvDataInterval self = new DescribeVsDomainPvDataResponseBodyPvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainPvDataResponseBodyPvDataInterval setUsageData(java.util.List<DescribeVsDomainPvDataResponseBodyPvDataIntervalUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeVsDomainPvDataResponseBodyPvDataIntervalUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
