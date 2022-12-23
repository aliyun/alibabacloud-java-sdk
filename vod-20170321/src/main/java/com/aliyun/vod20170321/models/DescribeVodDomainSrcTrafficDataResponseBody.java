// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainSrcTrafficDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SrcTrafficDataPerInterval")
    public DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval srcTrafficDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TotalTraffic")
    public String totalTraffic;

    public static DescribeVodDomainSrcTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainSrcTrafficDataResponseBody self = new DescribeVodDomainSrcTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainSrcTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainSrcTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainSrcTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainSrcTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainSrcTrafficDataResponseBody setSrcTrafficDataPerInterval(DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval srcTrafficDataPerInterval) {
        this.srcTrafficDataPerInterval = srcTrafficDataPerInterval;
        return this;
    }
    public DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval getSrcTrafficDataPerInterval() {
        return this.srcTrafficDataPerInterval;
    }

    public DescribeVodDomainSrcTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodDomainSrcTrafficDataResponseBody setTotalTraffic(String totalTraffic) {
        this.totalTraffic = totalTraffic;
        return this;
    }
    public String getTotalTraffic() {
        return this.totalTraffic;
    }

    public static class DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("HttpsValue")
        public String httpsValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule self = new DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval self = new DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerInterval setDataModule(java.util.List<DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodDomainSrcTrafficDataResponseBodySrcTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
