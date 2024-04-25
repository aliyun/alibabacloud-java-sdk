// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainHitRateDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("HitRateInterval")
    public DescribeVodDomainHitRateDataResponseBodyHitRateInterval hitRateInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainHitRateDataResponseBody self = new DescribeVodDomainHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainHitRateDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainHitRateDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainHitRateDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainHitRateDataResponseBody setHitRateInterval(DescribeVodDomainHitRateDataResponseBodyHitRateInterval hitRateInterval) {
        this.hitRateInterval = hitRateInterval;
        return this;
    }
    public DescribeVodDomainHitRateDataResponseBodyHitRateInterval getHitRateInterval() {
        return this.hitRateInterval;
    }

    public DescribeVodDomainHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainHitRateDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVodDomainHitRateDataResponseBodyHitRateIntervalDataModule extends TeaModel {
        @NameInMap("HttpsValue")
        public String httpsValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeVodDomainHitRateDataResponseBodyHitRateIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainHitRateDataResponseBodyHitRateIntervalDataModule self = new DescribeVodDomainHitRateDataResponseBodyHitRateIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainHitRateDataResponseBodyHitRateIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeVodDomainHitRateDataResponseBodyHitRateIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainHitRateDataResponseBodyHitRateIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainHitRateDataResponseBodyHitRateInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodDomainHitRateDataResponseBodyHitRateIntervalDataModule> dataModule;

        public static DescribeVodDomainHitRateDataResponseBodyHitRateInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainHitRateDataResponseBodyHitRateInterval self = new DescribeVodDomainHitRateDataResponseBodyHitRateInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainHitRateDataResponseBodyHitRateInterval setDataModule(java.util.List<DescribeVodDomainHitRateDataResponseBodyHitRateIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodDomainHitRateDataResponseBodyHitRateIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
