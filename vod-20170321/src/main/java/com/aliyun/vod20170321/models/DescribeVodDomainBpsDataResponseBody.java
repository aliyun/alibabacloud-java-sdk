// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainBpsDataResponseBody extends TeaModel {
    @NameInMap("IspNameEn")
    public String ispNameEn;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("BpsDataPerInterval")
    public DescribeVodDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval;

    public static DescribeVodDomainBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainBpsDataResponseBody self = new DescribeVodDomainBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainBpsDataResponseBody setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeVodDomainBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainBpsDataResponseBody setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeVodDomainBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodDomainBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainBpsDataResponseBody setBpsDataPerInterval(DescribeVodDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeVodDomainBpsDataResponseBodyBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public static class DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("HttpsDomesticValue")
        public String httpsDomesticValue;

        @NameInMap("Value")
        public String value;

        @NameInMap("OverseasValue")
        public String overseasValue;

        @NameInMap("HttpsValue")
        public String httpsValue;

        @NameInMap("HttpsOverseasValue")
        public String httpsOverseasValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("DomesticValue")
        public String domesticValue;

        public static DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule self = new DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setHttpsDomesticValue(String httpsDomesticValue) {
            this.httpsDomesticValue = httpsDomesticValue;
            return this;
        }
        public String getHttpsDomesticValue() {
            return this.httpsDomesticValue;
        }

        public DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setHttpsOverseasValue(String httpsOverseasValue) {
            this.httpsOverseasValue = httpsOverseasValue;
            return this;
        }
        public String getHttpsOverseasValue() {
            return this.httpsOverseasValue;
        }

        public DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

    }

    public static class DescribeVodDomainBpsDataResponseBodyBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainBpsDataResponseBodyBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainBpsDataResponseBodyBpsDataPerInterval self = new DescribeVodDomainBpsDataResponseBodyBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainBpsDataResponseBodyBpsDataPerInterval setDataModule(java.util.List<DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
