// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserTotalResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserPlayStatisTotals")
    @Validation(required = true)
    public DescribePlayUserTotalResponseUserPlayStatisTotals userPlayStatisTotals;

    public static DescribePlayUserTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayUserTotalResponse self = new DescribePlayUserTotalResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotalVV extends TeaModel {
        @NameInMap("Android")
        @Validation(required = true)
        public String android;

        @NameInMap("iOS")
        @Validation(required = true)
        public String iOS;

        @NameInMap("Flash")
        @Validation(required = true)
        public String flash;

        @NameInMap("HTML5")
        @Validation(required = true)
        public String HTML5;

        public static DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotalVV build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotalVV self = new DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotalVV();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotalUV extends TeaModel {
        @NameInMap("Android")
        @Validation(required = true)
        public String android;

        @NameInMap("iOS")
        @Validation(required = true)
        public String iOS;

        @NameInMap("Flash")
        @Validation(required = true)
        public String flash;

        @NameInMap("HTML5")
        @Validation(required = true)
        public String HTML5;

        public static DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotalUV build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotalUV self = new DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotalUV();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotal extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("PlayDuration")
        @Validation(required = true)
        public String playDuration;

        @NameInMap("PlayRange")
        @Validation(required = true)
        public String playRange;

        @NameInMap("VV")
        @Validation(required = true)
        public DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotalVV VV;

        @NameInMap("UV")
        @Validation(required = true)
        public DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotalUV UV;

        public static DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotal build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotal self = new DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotal();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePlayUserTotalResponseUserPlayStatisTotals extends TeaModel {
        @NameInMap("UserPlayStatisTotal")
        @Validation(required = true)
        public java.util.List<DescribePlayUserTotalResponseUserPlayStatisTotalsUserPlayStatisTotal> userPlayStatisTotal;

        public static DescribePlayUserTotalResponseUserPlayStatisTotals build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserTotalResponseUserPlayStatisTotals self = new DescribePlayUserTotalResponseUserPlayStatisTotals();
            return TeaModel.build(map, self);
        }

    }

}
