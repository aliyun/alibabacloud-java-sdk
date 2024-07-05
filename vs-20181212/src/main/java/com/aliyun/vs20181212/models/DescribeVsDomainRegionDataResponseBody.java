// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainRegionDataResponseBody extends TeaModel {
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
     * <p>2021-10-31T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2021-10-30T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Value")
    public DescribeVsDomainRegionDataResponseBodyValue value;

    public static DescribeVsDomainRegionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainRegionDataResponseBody self = new DescribeVsDomainRegionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainRegionDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVsDomainRegionDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainRegionDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainRegionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainRegionDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVsDomainRegionDataResponseBody setValue(DescribeVsDomainRegionDataResponseBodyValue value) {
        this.value = value;
        return this;
    }
    public DescribeVsDomainRegionDataResponseBodyValue getValue() {
        return this.value;
    }

    public static class DescribeVsDomainRegionDataResponseBodyValueRegionProportionData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2888253.7875</p>
         */
        @NameInMap("AvgObjectSize")
        public String avgObjectSize;

        /**
         * <strong>example:</strong>
         * <p>154.3345765545624</p>
         */
        @NameInMap("AvgResponseRate")
        public String avgResponseRate;

        /**
         * <strong>example:</strong>
         * <p>5183.666666666667</p>
         */
        @NameInMap("AvgResponseTime")
        public String avgResponseTime;

        /**
         * <strong>example:</strong>
         * <p>380.9614285714286</p>
         */
        @NameInMap("Bps")
        public String bps;

        /**
         * <strong>example:</strong>
         * <p>0.003544181046236794</p>
         */
        @NameInMap("BytesProportion")
        public String bytesProportion;

        /**
         * <strong>example:</strong>
         * <p>0.01155980271270037</p>
         */
        @NameInMap("Proportion")
        public String proportion;

        /**
         * <strong>example:</strong>
         * <p>0.001746031746031746</p>
         */
        @NameInMap("Qps")
        public String qps;

        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>chongqing</p>
         */
        @NameInMap("RegionEname")
        public String regionEname;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReqErrRate")
        public String reqErrRate;

        /**
         * <strong>example:</strong>
         * <p>2400057</p>
         */
        @NameInMap("TotalBytes")
        public String totalBytes;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalQuery")
        public String totalQuery;

        public static DescribeVsDomainRegionDataResponseBodyValueRegionProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainRegionDataResponseBodyValueRegionProportionData self = new DescribeVsDomainRegionDataResponseBodyValueRegionProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setAvgObjectSize(String avgObjectSize) {
            this.avgObjectSize = avgObjectSize;
            return this;
        }
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setAvgResponseRate(String avgResponseRate) {
            this.avgResponseRate = avgResponseRate;
            return this;
        }
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setAvgResponseTime(String avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setBytesProportion(String bytesProportion) {
            this.bytesProportion = bytesProportion;
            return this;
        }
        public String getBytesProportion() {
            return this.bytesProportion;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setRegionEname(String regionEname) {
            this.regionEname = regionEname;
            return this;
        }
        public String getRegionEname() {
            return this.regionEname;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setReqErrRate(String reqErrRate) {
            this.reqErrRate = reqErrRate;
            return this;
        }
        public String getReqErrRate() {
            return this.reqErrRate;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeVsDomainRegionDataResponseBodyValueRegionProportionData setTotalQuery(String totalQuery) {
            this.totalQuery = totalQuery;
            return this;
        }
        public String getTotalQuery() {
            return this.totalQuery;
        }

    }

    public static class DescribeVsDomainRegionDataResponseBodyValue extends TeaModel {
        @NameInMap("RegionProportionData")
        public java.util.List<DescribeVsDomainRegionDataResponseBodyValueRegionProportionData> regionProportionData;

        public static DescribeVsDomainRegionDataResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainRegionDataResponseBodyValue self = new DescribeVsDomainRegionDataResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainRegionDataResponseBodyValue setRegionProportionData(java.util.List<DescribeVsDomainRegionDataResponseBodyValueRegionProportionData> regionProportionData) {
            this.regionProportionData = regionProportionData;
            return this;
        }
        public java.util.List<DescribeVsDomainRegionDataResponseBodyValueRegionProportionData> getRegionProportionData() {
            return this.regionProportionData;
        }

    }

}
