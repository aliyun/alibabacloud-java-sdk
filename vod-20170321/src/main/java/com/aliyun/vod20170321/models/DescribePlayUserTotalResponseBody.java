// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserTotalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserPlayStatisTotals")
    public DescribePlayUserTotalResponseBodyUserPlayStatisTotals userPlayStatisTotals;

    public static DescribePlayUserTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayUserTotalResponseBody self = new DescribePlayUserTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayUserTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlayUserTotalResponseBody setUserPlayStatisTotals(DescribePlayUserTotalResponseBodyUserPlayStatisTotals userPlayStatisTotals) {
        this.userPlayStatisTotals = userPlayStatisTotals;
        return this;
    }
    public DescribePlayUserTotalResponseBodyUserPlayStatisTotals getUserPlayStatisTotals() {
        return this.userPlayStatisTotals;
    }

    public static class DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV extends TeaModel {
        @NameInMap("Flash")
        public String flash;

        @NameInMap("iOS")
        public String iOS;

        @NameInMap("HTML5")
        public String HTML5;

        @NameInMap("Android")
        public String android;

        public static DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV self = new DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV();
            return TeaModel.build(map, self);
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV setFlash(String flash) {
            this.flash = flash;
            return this;
        }
        public String getFlash() {
            return this.flash;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV setIOS(String iOS) {
            this.iOS = iOS;
            return this;
        }
        public String getIOS() {
            return this.iOS;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV setHTML5(String HTML5) {
            this.HTML5 = HTML5;
            return this;
        }
        public String getHTML5() {
            return this.HTML5;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV setAndroid(String android) {
            this.android = android;
            return this;
        }
        public String getAndroid() {
            return this.android;
        }

    }

    public static class DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV extends TeaModel {
        @NameInMap("Flash")
        public String flash;

        @NameInMap("iOS")
        public String iOS;

        @NameInMap("HTML5")
        public String HTML5;

        @NameInMap("Android")
        public String android;

        public static DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV self = new DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV();
            return TeaModel.build(map, self);
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV setFlash(String flash) {
            this.flash = flash;
            return this;
        }
        public String getFlash() {
            return this.flash;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV setIOS(String iOS) {
            this.iOS = iOS;
            return this;
        }
        public String getIOS() {
            return this.iOS;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV setHTML5(String HTML5) {
            this.HTML5 = HTML5;
            return this;
        }
        public String getHTML5() {
            return this.HTML5;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV setAndroid(String android) {
            this.android = android;
            return this;
        }
        public String getAndroid() {
            return this.android;
        }

    }

    public static class DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("PlayDuration")
        public String playDuration;

        @NameInMap("PlayRange")
        public String playRange;

        @NameInMap("VV")
        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV VV;

        @NameInMap("UV")
        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV UV;

        public static DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal self = new DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal();
            return TeaModel.build(map, self);
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal setPlayDuration(String playDuration) {
            this.playDuration = playDuration;
            return this;
        }
        public String getPlayDuration() {
            return this.playDuration;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal setPlayRange(String playRange) {
            this.playRange = playRange;
            return this;
        }
        public String getPlayRange() {
            return this.playRange;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal setVV(DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV VV) {
            this.VV = VV;
            return this;
        }
        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV getVV() {
            return this.VV;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal setUV(DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV UV) {
            this.UV = UV;
            return this;
        }
        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV getUV() {
            return this.UV;
        }

    }

    public static class DescribePlayUserTotalResponseBodyUserPlayStatisTotals extends TeaModel {
        @NameInMap("UserPlayStatisTotal")
        public java.util.List<DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal> userPlayStatisTotal;

        public static DescribePlayUserTotalResponseBodyUserPlayStatisTotals build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserTotalResponseBodyUserPlayStatisTotals self = new DescribePlayUserTotalResponseBodyUserPlayStatisTotals();
            return TeaModel.build(map, self);
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotals setUserPlayStatisTotal(java.util.List<DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal> userPlayStatisTotal) {
            this.userPlayStatisTotal = userPlayStatisTotal;
            return this;
        }
        public java.util.List<DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal> getUserPlayStatisTotal() {
            return this.userPlayStatisTotal;
        }

    }

}
