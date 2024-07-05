// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTrafficDataResponseBody extends TeaModel {
    /**
     * <p>The time interval at which data is returned, which is the time granularity. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
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
     * <p>2019-01-20T14:59:58Z</p>
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
     * <p>2019-01-20T13:59:58Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total amount of network traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>5906662826</p>
     */
    @NameInMap("TotalTraffic")
    public String totalTraffic;

    /**
     * <p>The amount of network traffic at each time interval.</p>
     */
    @NameInMap("TrafficDataPerInterval")
    public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    public static DescribeVodDomainTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainTrafficDataResponseBody self = new DescribeVodDomainTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodDomainTrafficDataResponseBody setTotalTraffic(String totalTraffic) {
        this.totalTraffic = totalTraffic;
        return this;
    }
    public String getTotalTraffic() {
        return this.totalTraffic;
    }

    public DescribeVodDomainTrafficDataResponseBody setTrafficDataPerInterval(DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static class DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The amount of network traffic in the Chinese mainland. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DomesticValue")
        public String domesticValue;

        /**
         * <p>The amount of HTTPS network traffic on points of presence (POPs) in the Chinese mainland. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HttpsDomesticValue")
        public String httpsDomesticValue;

        /**
         * <p>The amount of HTTPS network traffic on POPs outside the Chinese mainland. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HttpsOverseasValue")
        public String httpsOverseasValue;

        /**
         * <p>The total amount of HTTPS network traffic on POPs. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HttpsValue")
        public String httpsValue;

        /**
         * <p>The amount of network traffic outside the Chinese mainland. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OverseasValue")
        public String overseasValue;

        /**
         * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-15T19:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule self = new DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsDomesticValue(String httpsDomesticValue) {
            this.httpsDomesticValue = httpsDomesticValue;
            return this;
        }
        public String getHttpsDomesticValue() {
            return this.httpsDomesticValue;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsOverseasValue(String httpsOverseasValue) {
            this.httpsOverseasValue = httpsOverseasValue;
            return this;
        }
        public String getHttpsOverseasValue() {
            return this.httpsOverseasValue;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval self = new DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainTrafficDataResponseBodyTrafficDataPerInterval setDataModule(java.util.List<DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
