// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainMax95BpsDataResponseBody extends TeaModel {
    @NameInMap("DetailData")
    public DescribeVodDomainMax95BpsDataResponseBodyDetailData detailData;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>16777590.28</p>
     */
    @NameInMap("DomesticMax95Bps")
    public String domesticMax95Bps;

    /**
     * <strong>example:</strong>
     * <p>2017-01-11T13:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>16777590.28</p>
     */
    @NameInMap("Max95Bps")
    public String max95Bps;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OverseasMax95Bps")
    public String overseasMax95Bps;

    /**
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainMax95BpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainMax95BpsDataResponseBody self = new DescribeVodDomainMax95BpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainMax95BpsDataResponseBody setDetailData(DescribeVodDomainMax95BpsDataResponseBodyDetailData detailData) {
        this.detailData = detailData;
        return this;
    }
    public DescribeVodDomainMax95BpsDataResponseBodyDetailData getDetailData() {
        return this.detailData;
    }

    public DescribeVodDomainMax95BpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainMax95BpsDataResponseBody setDomesticMax95Bps(String domesticMax95Bps) {
        this.domesticMax95Bps = domesticMax95Bps;
        return this;
    }
    public String getDomesticMax95Bps() {
        return this.domesticMax95Bps;
    }

    public DescribeVodDomainMax95BpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainMax95BpsDataResponseBody setMax95Bps(String max95Bps) {
        this.max95Bps = max95Bps;
        return this;
    }
    public String getMax95Bps() {
        return this.max95Bps;
    }

    public DescribeVodDomainMax95BpsDataResponseBody setOverseasMax95Bps(String overseasMax95Bps) {
        this.overseasMax95Bps = overseasMax95Bps;
        return this;
    }
    public String getOverseasMax95Bps() {
        return this.overseasMax95Bps;
    }

    public DescribeVodDomainMax95BpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainMax95BpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <strong>example:</strong>
         * <p>16777590.28</p>
         */
        @NameInMap("Max95Bps")
        public Float max95Bps;

        /**
         * <strong>example:</strong>
         * <p>2015-12-11T21:05:00Z</p>
         */
        @NameInMap("Max95BpsPeakTime")
        public String max95BpsPeakTime;

        /**
         * <strong>example:</strong>
         * <p>2024-01-18 10:11:32</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail self = new DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail setMax95Bps(Float max95Bps) {
            this.max95Bps = max95Bps;
            return this;
        }
        public Float getMax95Bps() {
            return this.max95Bps;
        }

        public DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail setMax95BpsPeakTime(String max95BpsPeakTime) {
            this.max95BpsPeakTime = max95BpsPeakTime;
            return this;
        }
        public String getMax95BpsPeakTime() {
            return this.max95BpsPeakTime;
        }

        public DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVodDomainMax95BpsDataResponseBodyDetailData extends TeaModel {
        @NameInMap("Max95Detail")
        public java.util.List<DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail> max95Detail;

        public static DescribeVodDomainMax95BpsDataResponseBodyDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainMax95BpsDataResponseBodyDetailData self = new DescribeVodDomainMax95BpsDataResponseBodyDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainMax95BpsDataResponseBodyDetailData setMax95Detail(java.util.List<DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail> max95Detail) {
            this.max95Detail = max95Detail;
            return this;
        }
        public java.util.List<DescribeVodDomainMax95BpsDataResponseBodyDetailDataMax95Detail> getMax95Detail() {
            return this.max95Detail;
        }

    }

}
