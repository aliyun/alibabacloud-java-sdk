// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainReqHitRateDataResponseBody extends TeaModel {
    /**
     * <p>The request hit rate data at each time interval.</p>
     */
    @NameInMap("Data")
    public DescribeVodDomainReqHitRateDataResponseBodyData data;

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
     * <p>2023-12-22T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

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
     * <p>2023-12-21T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainReqHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainReqHitRateDataResponseBody self = new DescribeVodDomainReqHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainReqHitRateDataResponseBody setData(DescribeVodDomainReqHitRateDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeVodDomainReqHitRateDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeVodDomainReqHitRateDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainReqHitRateDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainReqHitRateDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainReqHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainReqHitRateDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVodDomainReqHitRateDataResponseBodyDataDataModule extends TeaModel {
        /**
         * <p>The HTTPS request hit rate.</p>
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
         * <p>2023-12-21T08:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total request hit rate.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVodDomainReqHitRateDataResponseBodyDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainReqHitRateDataResponseBodyDataDataModule self = new DescribeVodDomainReqHitRateDataResponseBodyDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainReqHitRateDataResponseBodyDataDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeVodDomainReqHitRateDataResponseBodyDataDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainReqHitRateDataResponseBodyDataDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainReqHitRateDataResponseBodyData extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodDomainReqHitRateDataResponseBodyDataDataModule> dataModule;

        public static DescribeVodDomainReqHitRateDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainReqHitRateDataResponseBodyData self = new DescribeVodDomainReqHitRateDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainReqHitRateDataResponseBodyData setDataModule(java.util.List<DescribeVodDomainReqHitRateDataResponseBodyDataDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodDomainReqHitRateDataResponseBodyDataDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
