// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserAvgResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6C7F90B2-BDA4-4FAC-****-A38A121DFE19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics on average playback each day.</p>
     */
    @NameInMap("UserPlayStatisAvgs")
    public DescribePlayUserAvgResponseBodyUserPlayStatisAvgs userPlayStatisAvgs;

    public static DescribePlayUserAvgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayUserAvgResponseBody self = new DescribePlayUserAvgResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayUserAvgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlayUserAvgResponseBody setUserPlayStatisAvgs(DescribePlayUserAvgResponseBodyUserPlayStatisAvgs userPlayStatisAvgs) {
        this.userPlayStatisAvgs = userPlayStatisAvgs;
        return this;
    }
    public DescribePlayUserAvgResponseBodyUserPlayStatisAvgs getUserPlayStatisAvgs() {
        return this.userPlayStatisAvgs;
    }

    public static class DescribePlayUserAvgResponseBodyUserPlayStatisAvgsUserPlayStatisAvg extends TeaModel {
        /**
         * <p>The average number of video views.</p>
         * 
         * <strong>example:</strong>
         * <p>170</p>
         */
        @NameInMap("AvgPlayCount")
        public String avgPlayCount;

        /**
         * <p>The average playback duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1035902.8</p>
         */
        @NameInMap("AvgPlayDuration")
        public String avgPlayDuration;

        /**
         * <p>The date when the statistics were generated. The date follows the <em>yyyy-MM-dd</em> format.</p>
         * 
         * <strong>example:</strong>
         * <p>20170120</p>
         */
        @NameInMap("Date")
        public String date;

        public static DescribePlayUserAvgResponseBodyUserPlayStatisAvgsUserPlayStatisAvg build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserAvgResponseBodyUserPlayStatisAvgsUserPlayStatisAvg self = new DescribePlayUserAvgResponseBodyUserPlayStatisAvgsUserPlayStatisAvg();
            return TeaModel.build(map, self);
        }

        public DescribePlayUserAvgResponseBodyUserPlayStatisAvgsUserPlayStatisAvg setAvgPlayCount(String avgPlayCount) {
            this.avgPlayCount = avgPlayCount;
            return this;
        }
        public String getAvgPlayCount() {
            return this.avgPlayCount;
        }

        public DescribePlayUserAvgResponseBodyUserPlayStatisAvgsUserPlayStatisAvg setAvgPlayDuration(String avgPlayDuration) {
            this.avgPlayDuration = avgPlayDuration;
            return this;
        }
        public String getAvgPlayDuration() {
            return this.avgPlayDuration;
        }

        public DescribePlayUserAvgResponseBodyUserPlayStatisAvgsUserPlayStatisAvg setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class DescribePlayUserAvgResponseBodyUserPlayStatisAvgs extends TeaModel {
        @NameInMap("UserPlayStatisAvg")
        public java.util.List<DescribePlayUserAvgResponseBodyUserPlayStatisAvgsUserPlayStatisAvg> userPlayStatisAvg;

        public static DescribePlayUserAvgResponseBodyUserPlayStatisAvgs build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserAvgResponseBodyUserPlayStatisAvgs self = new DescribePlayUserAvgResponseBodyUserPlayStatisAvgs();
            return TeaModel.build(map, self);
        }

        public DescribePlayUserAvgResponseBodyUserPlayStatisAvgs setUserPlayStatisAvg(java.util.List<DescribePlayUserAvgResponseBodyUserPlayStatisAvgsUserPlayStatisAvg> userPlayStatisAvg) {
            this.userPlayStatisAvg = userPlayStatisAvg;
            return this;
        }
        public java.util.List<DescribePlayUserAvgResponseBodyUserPlayStatisAvgsUserPlayStatisAvg> getUserPlayStatisAvg() {
            return this.userPlayStatisAvg;
        }

    }

}
