// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainQpsDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
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
     * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>YYYY-MM-DD**Thh:mm:ss</em> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-02T15:59:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of QPS records at each interval.</p>
     */
    @NameInMap("QpsDataInterval")
    public DescribeVodDomainQpsDataResponseBodyQpsDataInterval qpsDataInterval;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>YYYY-MM-DD**Thh:mm:ss</em> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-02T15:50:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainQpsDataResponseBody self = new DescribeVodDomainQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainQpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainQpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainQpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainQpsDataResponseBody setQpsDataInterval(DescribeVodDomainQpsDataResponseBodyQpsDataInterval qpsDataInterval) {
        this.qpsDataInterval = qpsDataInterval;
        return this;
    }
    public DescribeVodDomainQpsDataResponseBodyQpsDataInterval getQpsDataInterval() {
        return this.qpsDataInterval;
    }

    public DescribeVodDomainQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainQpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule extends TeaModel {
        /**
         * <p>The number of requests in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AccDomesticValue")
        public String accDomesticValue;

        /**
         * <p>The number of requests outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AccOverseasValue")
        public String accOverseasValue;

        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AccValue")
        public String accValue;

        /**
         * <p>The QPS data in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DomesticValue")
        public String domesticValue;

        /**
         * <p>The QPS that is calculated based on the HTTPS requests sent to POPs in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HttpsAccDomesticValue")
        public String httpsAccDomesticValue;

        /**
         * <p>The number of HTTPS requests sent to POPs outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HttpsAccOverseasValue")
        public String httpsAccOverseasValue;

        /**
         * <p>The number of HTTPS requests sent to POPs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HttpsAccValue")
        public String httpsAccValue;

        /**
         * <p>The QPS that is calculated based on the HTTPS requests sent to POPs in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HttpsDomesticValue")
        public String httpsDomesticValue;

        /**
         * <p>The QPS that is calculated based on the HTTPS requests sent to POPs outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HttpsOverseasValue")
        public String httpsOverseasValue;

        /**
         * <p>The QPS that is calculated based on the HTTPS requests sent to points of presence (POPs).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HttpsValue")
        public String httpsValue;

        /**
         * <p>The QPS data outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OverseasValue")
        public String overseasValue;

        /**
         * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-27 10:10:58</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule self = new DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccDomesticValue(String accDomesticValue) {
            this.accDomesticValue = accDomesticValue;
            return this;
        }
        public String getAccDomesticValue() {
            return this.accDomesticValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccOverseasValue(String accOverseasValue) {
            this.accOverseasValue = accOverseasValue;
            return this;
        }
        public String getAccOverseasValue() {
            return this.accOverseasValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccValue(String accValue) {
            this.accValue = accValue;
            return this;
        }
        public String getAccValue() {
            return this.accValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsAccDomesticValue(String httpsAccDomesticValue) {
            this.httpsAccDomesticValue = httpsAccDomesticValue;
            return this;
        }
        public String getHttpsAccDomesticValue() {
            return this.httpsAccDomesticValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsAccOverseasValue(String httpsAccOverseasValue) {
            this.httpsAccOverseasValue = httpsAccOverseasValue;
            return this;
        }
        public String getHttpsAccOverseasValue() {
            return this.httpsAccOverseasValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsAccValue(String httpsAccValue) {
            this.httpsAccValue = httpsAccValue;
            return this;
        }
        public String getHttpsAccValue() {
            return this.httpsAccValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsDomesticValue(String httpsDomesticValue) {
            this.httpsDomesticValue = httpsDomesticValue;
            return this;
        }
        public String getHttpsDomesticValue() {
            return this.httpsDomesticValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsOverseasValue(String httpsOverseasValue) {
            this.httpsOverseasValue = httpsOverseasValue;
            return this;
        }
        public String getHttpsOverseasValue() {
            return this.httpsOverseasValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainQpsDataResponseBodyQpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule> dataModule;

        public static DescribeVodDomainQpsDataResponseBodyQpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainQpsDataResponseBodyQpsDataInterval self = new DescribeVodDomainQpsDataResponseBodyQpsDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainQpsDataResponseBodyQpsDataInterval setDataModule(java.util.List<DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodDomainQpsDataResponseBodyQpsDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
