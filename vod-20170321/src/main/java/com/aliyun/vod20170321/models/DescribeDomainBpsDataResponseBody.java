// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataResponseBody extends TeaModel {
    @NameInMap("BpsDataPerInterval")
    public DescribeDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval;

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

    @NameInMap("SupplyBpsDatas")
    public DescribeDomainBpsDataResponseBodySupplyBpsDatas supplyBpsDatas;

    public static DescribeDomainBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataResponseBody self = new DescribeDomainBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsDataResponseBody setBpsDataPerInterval(DescribeDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeDomainBpsDataResponseBodyBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public DescribeDomainBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainBpsDataResponseBody setSupplyBpsDatas(DescribeDomainBpsDataResponseBodySupplyBpsDatas supplyBpsDatas) {
        this.supplyBpsDatas = supplyBpsDatas;
        return this;
    }
    public DescribeDomainBpsDataResponseBodySupplyBpsDatas getSupplyBpsDatas() {
        return this.supplyBpsDatas;
    }

    public static class DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("DomesticL2Value")
        public String domesticL2Value;

        @NameInMap("DomesticValue")
        public String domesticValue;

        @NameInMap("DynamicDomesticValue")
        public String dynamicDomesticValue;

        @NameInMap("DynamicOverseasValue")
        public String dynamicOverseasValue;

        @NameInMap("DynamicValue")
        public Long dynamicValue;

        @NameInMap("L2Value")
        public String l2Value;

        @NameInMap("OverseasL2Value")
        public String overseasL2Value;

        @NameInMap("OverseasValue")
        public String overseasValue;

        @NameInMap("StaticDomesticValue")
        public String staticDomesticValue;

        @NameInMap("StaticOverseasValue")
        public String staticOverseasValue;

        @NameInMap("StaticValue")
        public String staticValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule self = new DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDomesticL2Value(String domesticL2Value) {
            this.domesticL2Value = domesticL2Value;
            return this;
        }
        public String getDomesticL2Value() {
            return this.domesticL2Value;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDynamicDomesticValue(String dynamicDomesticValue) {
            this.dynamicDomesticValue = dynamicDomesticValue;
            return this;
        }
        public String getDynamicDomesticValue() {
            return this.dynamicDomesticValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDynamicOverseasValue(String dynamicOverseasValue) {
            this.dynamicOverseasValue = dynamicOverseasValue;
            return this;
        }
        public String getDynamicOverseasValue() {
            return this.dynamicOverseasValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDynamicValue(Long dynamicValue) {
            this.dynamicValue = dynamicValue;
            return this;
        }
        public Long getDynamicValue() {
            return this.dynamicValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setL2Value(String l2Value) {
            this.l2Value = l2Value;
            return this;
        }
        public String getL2Value() {
            return this.l2Value;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setOverseasL2Value(String overseasL2Value) {
            this.overseasL2Value = overseasL2Value;
            return this;
        }
        public String getOverseasL2Value() {
            return this.overseasL2Value;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setStaticDomesticValue(String staticDomesticValue) {
            this.staticDomesticValue = staticDomesticValue;
            return this;
        }
        public String getStaticDomesticValue() {
            return this.staticDomesticValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setStaticOverseasValue(String staticOverseasValue) {
            this.staticOverseasValue = staticOverseasValue;
            return this;
        }
        public String getStaticOverseasValue() {
            return this.staticOverseasValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setStaticValue(String staticValue) {
            this.staticValue = staticValue;
            return this;
        }
        public String getStaticValue() {
            return this.staticValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainBpsDataResponseBodyBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule;

        public static DescribeDomainBpsDataResponseBodyBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataResponseBodyBpsDataPerInterval self = new DescribeDomainBpsDataResponseBodyBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerInterval setDataModule(java.util.List<DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

    public static class DescribeDomainBpsDataResponseBodySupplyBpsDatasDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeDomainBpsDataResponseBodySupplyBpsDatasDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataResponseBodySupplyBpsDatasDataModule self = new DescribeDomainBpsDataResponseBodySupplyBpsDatasDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsDataResponseBodySupplyBpsDatasDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainBpsDataResponseBodySupplyBpsDatasDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainBpsDataResponseBodySupplyBpsDatas extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainBpsDataResponseBodySupplyBpsDatasDataModule> dataModule;

        public static DescribeDomainBpsDataResponseBodySupplyBpsDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataResponseBodySupplyBpsDatas self = new DescribeDomainBpsDataResponseBodySupplyBpsDatas();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsDataResponseBodySupplyBpsDatas setDataModule(java.util.List<DescribeDomainBpsDataResponseBodySupplyBpsDatasDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainBpsDataResponseBodySupplyBpsDatasDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
