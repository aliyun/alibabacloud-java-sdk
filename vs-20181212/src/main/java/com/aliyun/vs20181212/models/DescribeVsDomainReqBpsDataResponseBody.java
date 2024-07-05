// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainReqBpsDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>2021-09-24T03:30:46Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ReqBpsDataPerInterval")
    public DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval reqBpsDataPerInterval;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2021-12-24T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDomainReqBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainReqBpsDataResponseBody self = new DescribeVsDomainReqBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainReqBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVsDomainReqBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainReqBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainReqBpsDataResponseBody setReqBpsDataPerInterval(DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval reqBpsDataPerInterval) {
        this.reqBpsDataPerInterval = reqBpsDataPerInterval;
        return this;
    }
    public DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval getReqBpsDataPerInterval() {
        return this.reqBpsDataPerInterval;
    }

    public DescribeVsDomainReqBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainReqBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ReqBpsValue")
        public String reqBpsValue;

        /**
         * <strong>example:</strong>
         * <p>2021-12-24T16:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule self = new DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule setReqBpsValue(String reqBpsValue) {
            this.reqBpsValue = reqBpsValue;
            return this;
        }
        public String getReqBpsValue() {
            return this.reqBpsValue;
        }

        public DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule> dataModule;

        public static DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval self = new DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval setDataModule(java.util.List<DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
