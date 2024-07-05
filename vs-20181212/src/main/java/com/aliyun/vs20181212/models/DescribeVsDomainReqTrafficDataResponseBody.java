// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainReqTrafficDataResponseBody extends TeaModel {
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
     * <p>2021-09-22T03:40:41Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ReqTrafficDataPerInterval")
    public DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval reqTrafficDataPerInterval;

    /**
     * <strong>example:</strong>
     * <p>9BEC5E85-C76B-56EF-A922-860EFDB8B64B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2021-09-21T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDomainReqTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainReqTrafficDataResponseBody self = new DescribeVsDomainReqTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainReqTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVsDomainReqTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainReqTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainReqTrafficDataResponseBody setReqTrafficDataPerInterval(DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval reqTrafficDataPerInterval) {
        this.reqTrafficDataPerInterval = reqTrafficDataPerInterval;
        return this;
    }
    public DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval getReqTrafficDataPerInterval() {
        return this.reqTrafficDataPerInterval;
    }

    public DescribeVsDomainReqTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainReqTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerIntervalDataModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ReqTrafficValue")
        public String reqTrafficValue;

        /**
         * <strong>example:</strong>
         * <p>2021-09-22T03:40:41Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerIntervalDataModule self = new DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerIntervalDataModule setReqTrafficValue(String reqTrafficValue) {
            this.reqTrafficValue = reqTrafficValue;
            return this;
        }
        public String getReqTrafficValue() {
            return this.reqTrafficValue;
        }

        public DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval self = new DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval setDataModule(java.util.List<DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
