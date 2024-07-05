// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserTotalResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1FAFB884-D5A7-47D1-****-8928AA9C8720</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The daily playback statistics.</p>
     */
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
        /**
         * <p>The total number of unique visitors who use ApsaraVideo Player SDK for Android.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Android")
        public String android;

        /**
         * <p>The total number of unique visitors who use the Flash player.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Flash")
        public String flash;

        /**
         * <p>The total number of unique visitors who use the HTML5 player.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HTML5")
        public String HTML5;

        /**
         * <p>The total number of unique visitors who use ApsaraVideo Player SDK for iOS.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The total number of video views played by using ApsaraVideo Player SDK for Android.</p>
         * 
         * <strong>example:</strong>
         * <p>161</p>
         */
        @NameInMap("Android")
        public String android;

        /**
         * <p>The total number of video views played by using the Flash player.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Flash")
        public String flash;

        /**
         * <p>The total number of video views played by using the HTML5 player.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HTML5")
        public String HTML5;

        /**
         * <p>The total number of video views played by using ApsaraVideo Player SDK for iOS.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The date. The date is displayed in the <em>yyyy-MM-dd</em> format.</p>
         * 
         * <strong>example:</strong>
         * <p>20170120</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The total playback duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>9340070</p>
         */
        @NameInMap("PlayDuration")
        public String playDuration;

        /**
         * <p>The distribution of the playback duration.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&lt;=1m:74.3%;&gt;1&lt;=5m:22.8%;&gt;5&lt;=10m:1.0%;&gt;10&lt;=15m:1.0%;&gt;15&lt;=30m:1.0%&quot;</p>
         */
        @NameInMap("PlayRange")
        public String playRange;

        /**
         * <p>The total number of unique visitors.</p>
         */
        @NameInMap("UV")
        public DescribePlayUserTotalResponseBodyUserPlayStatisTotalsUserPlayStatisTotalUV UV;

        /**
         * <p>The total number of video views.</p>
         */
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
