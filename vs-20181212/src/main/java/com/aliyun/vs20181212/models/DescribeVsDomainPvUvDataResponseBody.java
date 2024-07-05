// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainPvUvDataResponseBody extends TeaModel {
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
     * <p>2021-11-24T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PvUvDataInfos")
    public DescribeVsDomainPvUvDataResponseBodyPvUvDataInfos pvUvDataInfos;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2021-12-12T10:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDomainPvUvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainPvUvDataResponseBody self = new DescribeVsDomainPvUvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainPvUvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVsDomainPvUvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainPvUvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainPvUvDataResponseBody setPvUvDataInfos(DescribeVsDomainPvUvDataResponseBodyPvUvDataInfos pvUvDataInfos) {
        this.pvUvDataInfos = pvUvDataInfos;
        return this;
    }
    public DescribeVsDomainPvUvDataResponseBodyPvUvDataInfos getPvUvDataInfos() {
        return this.pvUvDataInfos;
    }

    public DescribeVsDomainPvUvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainPvUvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVsDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PV")
        public String PV;

        /**
         * <strong>example:</strong>
         * <p>2021-10-14T23:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UV")
        public String UV;

        public static DescribeVsDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo self = new DescribeVsDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo setPV(String PV) {
            this.PV = PV;
            return this;
        }
        public String getPV() {
            return this.PV;
        }

        public DescribeVsDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVsDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo setUV(String UV) {
            this.UV = UV;
            return this;
        }
        public String getUV() {
            return this.UV;
        }

    }

    public static class DescribeVsDomainPvUvDataResponseBodyPvUvDataInfos extends TeaModel {
        @NameInMap("PvUvDataInfo")
        public java.util.List<DescribeVsDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo> pvUvDataInfo;

        public static DescribeVsDomainPvUvDataResponseBodyPvUvDataInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainPvUvDataResponseBodyPvUvDataInfos self = new DescribeVsDomainPvUvDataResponseBodyPvUvDataInfos();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainPvUvDataResponseBodyPvUvDataInfos setPvUvDataInfo(java.util.List<DescribeVsDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo> pvUvDataInfo) {
            this.pvUvDataInfo = pvUvDataInfo;
            return this;
        }
        public java.util.List<DescribeVsDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo> getPvUvDataInfo() {
            return this.pvUvDataInfo;
        }

    }

}
