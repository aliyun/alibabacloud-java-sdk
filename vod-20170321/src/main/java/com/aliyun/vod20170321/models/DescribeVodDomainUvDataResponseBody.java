// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUvDataResponseBody extends TeaModel {
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
    public DescribeVodDomainUvDataResponseBodyUvDataInterval uvDataInterval;

    public static DescribeVodDomainUvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainUvDataResponseBody self = new DescribeVodDomainUvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainUvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainUvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainUvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainUvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainUvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodDomainUvDataResponseBody setUvDataInterval(DescribeVodDomainUvDataResponseBodyUvDataInterval uvDataInterval) {
        this.uvDataInterval = uvDataInterval;
        return this;
    }
    public DescribeVodDomainUvDataResponseBodyUvDataInterval getUvDataInterval() {
        return this.uvDataInterval;
    }

    public static class DescribeVodDomainUvDataResponseBodyUvDataIntervalUvDataInterval extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeVodDomainUvDataResponseBodyUvDataIntervalUvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainUvDataResponseBodyUvDataIntervalUvDataInterval self = new DescribeVodDomainUvDataResponseBodyUvDataIntervalUvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainUvDataResponseBodyUvDataIntervalUvDataInterval setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainUvDataResponseBodyUvDataIntervalUvDataInterval setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainUvDataResponseBodyUvDataInterval extends TeaModel {
        @NameInMap("UvDataInterval")
        public java.util.List<DescribeVodDomainUvDataResponseBodyUvDataIntervalUvDataInterval> uvDataInterval;

        public static DescribeVodDomainUvDataResponseBodyUvDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainUvDataResponseBodyUvDataInterval self = new DescribeVodDomainUvDataResponseBodyUvDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainUvDataResponseBodyUvDataInterval setUvDataInterval(java.util.List<DescribeVodDomainUvDataResponseBodyUvDataIntervalUvDataInterval> uvDataInterval) {
            this.uvDataInterval = uvDataInterval;
            return this;
        }
        public java.util.List<DescribeVodDomainUvDataResponseBodyUvDataIntervalUvDataInterval> getUvDataInterval() {
            return this.uvDataInterval;
        }

    }

}
