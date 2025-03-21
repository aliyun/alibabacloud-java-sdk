// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeMediaDistributionResponseBody extends TeaModel {
    /**
     * <p>The distribution list of media assets. The data is displayed based on the statistical cycle of the natural hour, day, week, or month of the start and end time.</p>
     */
    @NameInMap("MediaDistributionList")
    public java.util.List<DescribeMediaDistributionResponseBodyMediaDistributionList> mediaDistributionList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of media assets returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeMediaDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMediaDistributionResponseBody self = new DescribeMediaDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMediaDistributionResponseBody setMediaDistributionList(java.util.List<DescribeMediaDistributionResponseBodyMediaDistributionList> mediaDistributionList) {
        this.mediaDistributionList = mediaDistributionList;
        return this;
    }
    public java.util.List<DescribeMediaDistributionResponseBodyMediaDistributionList> getMediaDistributionList() {
        return this.mediaDistributionList;
    }

    public DescribeMediaDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMediaDistributionResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeMediaDistributionResponseBodyMediaDistributionList extends TeaModel {
        /**
         * <p>The number of media assets that are queried during the specified time range.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The end of the time range during which data is queried (exclusive). The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T00:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start of the time range during which data is queried (inclusive). The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-13T00:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeMediaDistributionResponseBodyMediaDistributionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMediaDistributionResponseBodyMediaDistributionList self = new DescribeMediaDistributionResponseBodyMediaDistributionList();
            return TeaModel.build(map, self);
        }

        public DescribeMediaDistributionResponseBodyMediaDistributionList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeMediaDistributionResponseBodyMediaDistributionList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeMediaDistributionResponseBodyMediaDistributionList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
