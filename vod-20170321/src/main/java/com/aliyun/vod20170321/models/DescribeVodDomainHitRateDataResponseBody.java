// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainHitRateDataResponseBody extends TeaModel {
    /**
     * <p>The time interval at which data is returned, which is the time granularity. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-20T14:59:58Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The byte hit rate data at each time interval.</p>
     */
    @NameInMap("HitRateInterval")
    public DescribeVodDomainHitRateDataResponseBodyHitRateInterval hitRateInterval;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D94E471F-1A27-442E-552D-D4D2000C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-20T13:59:58Z</p>
     */
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
        /**
         * <p>The HTTPS byte hit rate.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("HttpsValue")
        public String httpsValue;

        /**
         * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-20T13:59:58Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total byte hit rate.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
