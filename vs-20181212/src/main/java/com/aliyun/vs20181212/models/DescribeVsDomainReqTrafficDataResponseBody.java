// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainReqTrafficDataResponseBody extends TeaModel {
    @NameInMap("ReqTrafficDataPerInterval")
    public DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval reqTrafficDataPerInterval;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeVsDomainReqTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainReqTrafficDataResponseBody self = new DescribeVsDomainReqTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainReqTrafficDataResponseBody setReqTrafficDataPerInterval(DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval reqTrafficDataPerInterval) {
        this.reqTrafficDataPerInterval = reqTrafficDataPerInterval;
        return this;
    }
    public DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerInterval getReqTrafficDataPerInterval() {
        return this.reqTrafficDataPerInterval;
    }

    public DescribeVsDomainReqTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainReqTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainReqTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainReqTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVsDomainReqTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeVsDomainReqTrafficDataResponseBodyReqTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("ReqTrafficValue")
        public String reqTrafficValue;

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
