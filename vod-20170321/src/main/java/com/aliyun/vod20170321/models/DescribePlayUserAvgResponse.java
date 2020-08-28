// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserAvgResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserPlayStatisAvgs")
    @Validation(required = true)
    public DescribePlayUserAvgResponseUserPlayStatisAvgs userPlayStatisAvgs;

    public static DescribePlayUserAvgResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayUserAvgResponse self = new DescribePlayUserAvgResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribePlayUserAvgResponseUserPlayStatisAvgsUserPlayStatisAvg extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("AvgPlayDuration")
        @Validation(required = true)
        public String avgPlayDuration;

        @NameInMap("AvgPlayCount")
        @Validation(required = true)
        public String avgPlayCount;

        public static DescribePlayUserAvgResponseUserPlayStatisAvgsUserPlayStatisAvg build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserAvgResponseUserPlayStatisAvgsUserPlayStatisAvg self = new DescribePlayUserAvgResponseUserPlayStatisAvgsUserPlayStatisAvg();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePlayUserAvgResponseUserPlayStatisAvgs extends TeaModel {
        @NameInMap("UserPlayStatisAvg")
        @Validation(required = true)
        public java.util.List<DescribePlayUserAvgResponseUserPlayStatisAvgsUserPlayStatisAvg> userPlayStatisAvg;

        public static DescribePlayUserAvgResponseUserPlayStatisAvgs build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserAvgResponseUserPlayStatisAvgs self = new DescribePlayUserAvgResponseUserPlayStatisAvgs();
            return TeaModel.build(map, self);
        }

    }

}
