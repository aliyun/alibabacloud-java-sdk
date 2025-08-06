// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainPvDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PvDataInterval")
    public DescribeVodDomainPvDataResponseBodyPvDataInterval pvDataInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainPvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainPvDataResponseBody self = new DescribeVodDomainPvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainPvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainPvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainPvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainPvDataResponseBody setPvDataInterval(DescribeVodDomainPvDataResponseBodyPvDataInterval pvDataInterval) {
        this.pvDataInterval = pvDataInterval;
        return this;
    }
    public DescribeVodDomainPvDataResponseBodyPvDataInterval getPvDataInterval() {
        return this.pvDataInterval;
    }

    public DescribeVodDomainPvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainPvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVodDomainPvDataResponseBodyPvDataIntervalPvDataInterval extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeVodDomainPvDataResponseBodyPvDataIntervalPvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainPvDataResponseBodyPvDataIntervalPvDataInterval self = new DescribeVodDomainPvDataResponseBodyPvDataIntervalPvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainPvDataResponseBodyPvDataIntervalPvDataInterval setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainPvDataResponseBodyPvDataIntervalPvDataInterval setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainPvDataResponseBodyPvDataInterval extends TeaModel {
        @NameInMap("PvDataInterval")
        public java.util.List<DescribeVodDomainPvDataResponseBodyPvDataIntervalPvDataInterval> pvDataInterval;

        public static DescribeVodDomainPvDataResponseBodyPvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainPvDataResponseBodyPvDataInterval self = new DescribeVodDomainPvDataResponseBodyPvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainPvDataResponseBodyPvDataInterval setPvDataInterval(java.util.List<DescribeVodDomainPvDataResponseBodyPvDataIntervalPvDataInterval> pvDataInterval) {
            this.pvDataInterval = pvDataInterval;
            return this;
        }
        public java.util.List<DescribeVodDomainPvDataResponseBodyPvDataIntervalPvDataInterval> getPvDataInterval() {
            return this.pvDataInterval;
        }

    }

}
