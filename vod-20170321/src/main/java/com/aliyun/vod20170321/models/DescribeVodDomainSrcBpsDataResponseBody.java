// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainSrcBpsDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the entries returned. Unit: seconds.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the origin bandwidth data returned at each time interval. Unit: bit/s.</p>
     */
    @NameInMap("SrcBpsDataPerInterval")
    public DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerInterval srcBpsDataPerInterval;

    /**
     * <p>The start of the time range during which data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainSrcBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainSrcBpsDataResponseBody self = new DescribeVodDomainSrcBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainSrcBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainSrcBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainSrcBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainSrcBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainSrcBpsDataResponseBody setSrcBpsDataPerInterval(DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerInterval srcBpsDataPerInterval) {
        this.srcBpsDataPerInterval = srcBpsDataPerInterval;
        return this;
    }
    public DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerInterval getSrcBpsDataPerInterval() {
        return this.srcBpsDataPerInterval;
    }

    public DescribeVodDomainSrcBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The bandwidth values of origin HTTPS requests.</p>
         */
        @NameInMap("HttpsValue")
        public String httpsValue;

        /**
         * <p>The timestamp of the returned data. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The bandwidth value at each time interval.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule self = new DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerInterval self = new DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerInterval setDataModule(java.util.List<DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
