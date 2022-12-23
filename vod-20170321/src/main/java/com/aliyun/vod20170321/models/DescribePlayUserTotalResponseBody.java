// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserTotalResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The statistics on total playback each day.
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

    public static class DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV extends TeaModel {
        // The total number of unique visitors who use ApsaraVideo Player SDK for Android.
        @NameInMap("Android")
        public String android;

        // The total number of unique visitors who use ApsaraVideo Player SDK for Flash.
        @NameInMap("Flash")
        public String flash;

        // The total number of unique visitors who use ApsaraVideo Player SDK for HTML5.
        @NameInMap("HTML5")
        public String HTML5;

        // The total number of unique visitors who use ApsaraVideo Player SDK for iOS.
        @NameInMap("iOS")
        public String iOS;

        public static DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV self = new DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV();
            return TeaModel.build(map, self);
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV setAndroid(String android) {
            this.android = android;
            return this;
        }
        public String getAndroid() {
            return this.android;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV setFlash(String flash) {
            this.flash = flash;
            return this;
        }
        public String getFlash() {
            return this.flash;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV setHTML5(String HTML5) {
            this.HTML5 = HTML5;
            return this;
        }
        public String getHTML5() {
            return this.HTML5;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV setIOS(String iOS) {
            this.iOS = iOS;
            return this;
        }
        public String getIOS() {
            return this.iOS;
        }

    }

    public static class DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV extends TeaModel {
        // The total number of video views that is collected for videos that are played by using ApsaraVideo Player SDK for Android.
        @NameInMap("Android")
        public String android;

        // The total number of video views that is collected for videos that are played by using ApsaraVideo Player SDK for Flash.
        @NameInMap("Flash")
        public String flash;

        // The total number of video views that is collected for videos that are played by using ApsaraVideo Player SDK for HTML5.
        @NameInMap("HTML5")
        public String HTML5;

        // The total number of video views that is collected for videos that are played by using ApsaraVideo Player SDK for iOS.
        @NameInMap("iOS")
        public String iOS;

        public static DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV self = new DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV();
            return TeaModel.build(map, self);
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV setAndroid(String android) {
            this.android = android;
            return this;
        }
        public String getAndroid() {
            return this.android;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV setFlash(String flash) {
            this.flash = flash;
            return this;
        }
        public String getFlash() {
            return this.flash;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV setHTML5(String HTML5) {
            this.HTML5 = HTML5;
            return this;
        }
        public String getHTML5() {
            return this.HTML5;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV setIOS(String iOS) {
            this.iOS = iOS;
            return this;
        }
        public String getIOS() {
            return this.iOS;
        }

    }

    public static class DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal extends TeaModel {
        // The date when the statistics were generated. The date follows the *yyyy-MM-dd* format.
        @NameInMap("Date")
        public String date;

        // The total playback duration. Unit: milliseconds.
        @NameInMap("PlayDuration")
        public String playDuration;

        // The distribution of the playback duration.
        @NameInMap("PlayRange")
        public String playRange;

        // The total number of unique visitors.
        @NameInMap("UV")
        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV UV;

        // The total number of video views.
        @NameInMap("VV")
        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV VV;

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

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal setUV(DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV UV) {
            this.UV = UV;
            return this;
        }
        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV getUV() {
            return this.UV;
        }

        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotal setVV(DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV VV) {
            this.VV = VV;
            return this;
        }
        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalVV getVV() {
            return this.VV;
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
