// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainReqHitRateDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeVodDomainReqHitRateDataResponseBodyData data;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("HttpsValue")
        public String httpsValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

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
