// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class TestAmpDescribeScdnDomainIspDataResponseBody extends TeaModel {
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

    @NameInMap("Value")
    public TestAmpDescribeScdnDomainIspDataResponseBodyValue value;

    public static TestAmpDescribeScdnDomainIspDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestAmpDescribeScdnDomainIspDataResponseBody self = new TestAmpDescribeScdnDomainIspDataResponseBody();
        return TeaModel.build(map, self);
    }

    public TestAmpDescribeScdnDomainIspDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public TestAmpDescribeScdnDomainIspDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public TestAmpDescribeScdnDomainIspDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TestAmpDescribeScdnDomainIspDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestAmpDescribeScdnDomainIspDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public TestAmpDescribeScdnDomainIspDataResponseBody setValue(TestAmpDescribeScdnDomainIspDataResponseBodyValue value) {
        this.value = value;
        return this;
    }
    public TestAmpDescribeScdnDomainIspDataResponseBodyValue getValue() {
        return this.value;
    }

    public static class TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData extends TeaModel {
        @NameInMap("AvgObjectSize")
        public String avgObjectSize;

        @NameInMap("AvgResponseRate")
        public String avgResponseRate;

        @NameInMap("AvgResponseTime")
        public String avgResponseTime;

        @NameInMap("Bps")
        public String bps;

        @NameInMap("BytesProportion")
        public String bytesProportion;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("IspEname")
        public String ispEname;

        @NameInMap("Proportion")
        public String proportion;

        @NameInMap("Qps")
        public String qps;

        @NameInMap("ReqErrRate")
        public String reqErrRate;

        @NameInMap("TotalBytes")
        public String totalBytes;

        @NameInMap("TotalQuery")
        public String totalQuery;

        public static TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData build(java.util.Map<String, ?> map) throws Exception {
            TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData self = new TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData();
            return TeaModel.build(map, self);
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setAvgObjectSize(String avgObjectSize) {
            this.avgObjectSize = avgObjectSize;
            return this;
        }
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setAvgResponseRate(String avgResponseRate) {
            this.avgResponseRate = avgResponseRate;
            return this;
        }
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setAvgResponseTime(String avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setBytesProportion(String bytesProportion) {
            this.bytesProportion = bytesProportion;
            return this;
        }
        public String getBytesProportion() {
            return this.bytesProportion;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setIspEname(String ispEname) {
            this.ispEname = ispEname;
            return this;
        }
        public String getIspEname() {
            return this.ispEname;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setReqErrRate(String reqErrRate) {
            this.reqErrRate = reqErrRate;
            return this;
        }
        public String getReqErrRate() {
            return this.reqErrRate;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData setTotalQuery(String totalQuery) {
            this.totalQuery = totalQuery;
            return this;
        }
        public String getTotalQuery() {
            return this.totalQuery;
        }

    }

    public static class TestAmpDescribeScdnDomainIspDataResponseBodyValue extends TeaModel {
        @NameInMap("ISPProportionData")
        public java.util.List<TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData> ISPProportionData;

        public static TestAmpDescribeScdnDomainIspDataResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            TestAmpDescribeScdnDomainIspDataResponseBodyValue self = new TestAmpDescribeScdnDomainIspDataResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public TestAmpDescribeScdnDomainIspDataResponseBodyValue setISPProportionData(java.util.List<TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData> ISPProportionData) {
            this.ISPProportionData = ISPProportionData;
            return this;
        }
        public java.util.List<TestAmpDescribeScdnDomainIspDataResponseBodyValueISPProportionData> getISPProportionData() {
            return this.ISPProportionData;
        }

    }

}
