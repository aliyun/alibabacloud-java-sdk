// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodEditingUsageDataResponseBody extends TeaModel {
    @NameInMap("EditingData")
    public java.util.List<DescribeVodEditingUsageDataResponseBodyEditingData> editingData;

    /**
     * <strong>example:</strong>
     * <p>2024-11-07T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>6CB55B62-6E5F-54D1-80BF-DFA3DE9F0***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2024-11-06T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodEditingUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodEditingUsageDataResponseBody self = new DescribeVodEditingUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodEditingUsageDataResponseBody setEditingData(java.util.List<DescribeVodEditingUsageDataResponseBodyEditingData> editingData) {
        this.editingData = editingData;
        return this;
    }
    public java.util.List<DescribeVodEditingUsageDataResponseBodyEditingData> getEditingData() {
        return this.editingData;
    }

    public DescribeVodEditingUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodEditingUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodEditingUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeVodEditingUsageDataResponseBodyEditingData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>H264.SD</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <strong>example:</strong>
         * <p>2024-11-06T16:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodEditingUsageDataResponseBodyEditingData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodEditingUsageDataResponseBodyEditingData self = new DescribeVodEditingUsageDataResponseBodyEditingData();
            return TeaModel.build(map, self);
        }

        public DescribeVodEditingUsageDataResponseBodyEditingData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeVodEditingUsageDataResponseBodyEditingData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeVodEditingUsageDataResponseBodyEditingData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeVodEditingUsageDataResponseBodyEditingData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
