// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainIspDataResponseBody extends TeaModel {
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
    public DescribeScdnDomainIspDataResponseBodyValue value;

    public static DescribeScdnDomainIspDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainIspDataResponseBody self = new DescribeScdnDomainIspDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainIspDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnDomainIspDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainIspDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainIspDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeScdnDomainIspDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeScdnDomainIspDataResponseBody setValue(DescribeScdnDomainIspDataResponseBodyValue value) {
        this.value = value;
        return this;
    }
    public DescribeScdnDomainIspDataResponseBodyValue getValue() {
        return this.value;
    }

    public static class DescribeScdnDomainIspDataResponseBodyValueISPProportionData extends TeaModel {
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

        @NameInMap("Proportion")
        public String proportion;

        @NameInMap("IspEname")
        public String ispEname;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("BytesProportion")
        public String bytesProportion;

        public static DescribeScdnDomainIspDataResponseBodyValueISPProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainIspDataResponseBodyValueISPProportionData self = new DescribeScdnDomainIspDataResponseBodyValueISPProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setTotalQuery(String totalQuery) {
            this.totalQuery = totalQuery;
            return this;
        }
        public String getTotalQuery() {
            return this.totalQuery;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setAvgResponseRate(String avgResponseRate) {
            this.avgResponseRate = avgResponseRate;
            return this;
        }
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setAvgResponseTime(String avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setReqErrRate(String reqErrRate) {
            this.reqErrRate = reqErrRate;
            return this;
        }
        public String getReqErrRate() {
            return this.reqErrRate;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setAvgObjectSize(String avgObjectSize) {
            this.avgObjectSize = avgObjectSize;
            return this;
        }
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setIspEname(String ispEname) {
            this.ispEname = ispEname;
            return this;
        }
        public String getIspEname() {
            return this.ispEname;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeScdnDomainIspDataResponseBodyValueISPProportionData setBytesProportion(String bytesProportion) {
            this.bytesProportion = bytesProportion;
            return this;
        }
        public String getBytesProportion() {
            return this.bytesProportion;
        }

    }

    public static class DescribeScdnDomainIspDataResponseBodyValue extends TeaModel {
        @NameInMap("ISPProportionData")
        public java.util.List<DescribeScdnDomainIspDataResponseBodyValueISPProportionData> ISPProportionData;

        public static DescribeScdnDomainIspDataResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainIspDataResponseBodyValue self = new DescribeScdnDomainIspDataResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainIspDataResponseBodyValue setISPProportionData(java.util.List<DescribeScdnDomainIspDataResponseBodyValueISPProportionData> ISPProportionData) {
            this.ISPProportionData = ISPProportionData;
            return this;
        }
        public java.util.List<DescribeScdnDomainIspDataResponseBodyValueISPProportionData> getISPProportionData() {
            return this.ISPProportionData;
        }

    }

}
