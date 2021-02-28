// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRegionDataResponseBody extends TeaModel {
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

    @NameInMap("Value")
    public DescribeScdnDomainRegionDataResponseBodyValue value;

    public static DescribeScdnDomainRegionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRegionDataResponseBody self = new DescribeScdnDomainRegionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRegionDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainRegionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainRegionDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainRegionDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeScdnDomainRegionDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeScdnDomainRegionDataResponseBody setValue(DescribeScdnDomainRegionDataResponseBodyValue value) {
        this.value = value;
        return this;
    }
    public DescribeScdnDomainRegionDataResponseBodyValue getValue() {
        return this.value;
    }

    public static class DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData extends TeaModel {
        @NameInMap("TotalQuery")
        public String totalQuery;

        @NameInMap("TotalBytes")
        public String totalBytes;

        @NameInMap("AvgResponseRate")
        public String avgResponseRate;

        @NameInMap("AvgResponseTime")
        public String avgResponseTime;

        @NameInMap("ReqErrRate")
        public String reqErrRate;

        @NameInMap("AvgObjectSize")
        public String avgObjectSize;

        @NameInMap("Bps")
        public String bps;

        @NameInMap("Qps")
        public String qps;

        @NameInMap("RegionEname")
        public String regionEname;

        @NameInMap("Region")
        public String region;

        @NameInMap("Proportion")
        public String proportion;

        @NameInMap("BytesProportion")
        public String bytesProportion;

        public static DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData self = new DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setTotalQuery(String totalQuery) {
            this.totalQuery = totalQuery;
            return this;
        }
        public String getTotalQuery() {
            return this.totalQuery;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setAvgResponseRate(String avgResponseRate) {
            this.avgResponseRate = avgResponseRate;
            return this;
        }
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setAvgResponseTime(String avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setReqErrRate(String reqErrRate) {
            this.reqErrRate = reqErrRate;
            return this;
        }
        public String getReqErrRate() {
            return this.reqErrRate;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setAvgObjectSize(String avgObjectSize) {
            this.avgObjectSize = avgObjectSize;
            return this;
        }
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setRegionEname(String regionEname) {
            this.regionEname = regionEname;
            return this;
        }
        public String getRegionEname() {
            return this.regionEname;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData setBytesProportion(String bytesProportion) {
            this.bytesProportion = bytesProportion;
            return this;
        }
        public String getBytesProportion() {
            return this.bytesProportion;
        }

    }

    public static class DescribeScdnDomainRegionDataResponseBodyValue extends TeaModel {
        @NameInMap("RegionProportionData")
        public java.util.List<DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData> regionProportionData;

        public static DescribeScdnDomainRegionDataResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRegionDataResponseBodyValue self = new DescribeScdnDomainRegionDataResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRegionDataResponseBodyValue setRegionProportionData(java.util.List<DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData> regionProportionData) {
            this.regionProportionData = regionProportionData;
            return this;
        }
        public java.util.List<DescribeScdnDomainRegionDataResponseBodyValueRegionProportionData> getRegionProportionData() {
            return this.regionProportionData;
        }

    }

}
