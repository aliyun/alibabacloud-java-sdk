// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainReqBpsDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ReqBpsDataPerInterval")
    public DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval reqBpsDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeVsDomainReqBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainReqBpsDataResponseBody self = new DescribeVsDomainReqBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainReqBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainReqBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainReqBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainReqBpsDataResponseBody setReqBpsDataPerInterval(DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval reqBpsDataPerInterval) {
        this.reqBpsDataPerInterval = reqBpsDataPerInterval;
        return this;
    }
    public DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerInterval getReqBpsDataPerInterval() {
        return this.reqBpsDataPerInterval;
    }

    public DescribeVsDomainReqBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVsDomainReqBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("ReqBpsValue")
        public String reqBpsValue;

        public static DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule self = new DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVsDomainReqBpsDataResponseBodyReqBpsDataPerIntervalDataModule setReqBpsValue(String reqBpsValue) {
            this.reqBpsValue = reqBpsValue;
            return this;
        }
        public String getReqBpsValue() {
            return this.reqBpsValue;
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
