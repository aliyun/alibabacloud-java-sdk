// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDailyPlayRegionStatisResponseBody extends TeaModel {
    /**
     * <p>The CSV file information returned.</p>
     */
    @NameInMap("DailyPlayRegionStatisList")
    public java.util.List<GetDailyPlayRegionStatisResponseBodyDailyPlayRegionStatisList> dailyPlayRegionStatisList;

    /**
     * <p>If no playback data exists on a specific day, the date is displayed in this field.</p>
     */
    @NameInMap("EmptyDates")
    public java.util.List<String> emptyDates;

    /**
     * <p>If the playback data export fails on a specific day, the date is displayed in this field.</p>
     */
    @NameInMap("FailDates")
    public java.util.List<String> failDates;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67720502-CDDB-3F1C-8A91-12258*******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDailyPlayRegionStatisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDailyPlayRegionStatisResponseBody self = new GetDailyPlayRegionStatisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDailyPlayRegionStatisResponseBody setDailyPlayRegionStatisList(java.util.List<GetDailyPlayRegionStatisResponseBodyDailyPlayRegionStatisList> dailyPlayRegionStatisList) {
        this.dailyPlayRegionStatisList = dailyPlayRegionStatisList;
        return this;
    }
    public java.util.List<GetDailyPlayRegionStatisResponseBodyDailyPlayRegionStatisList> getDailyPlayRegionStatisList() {
        return this.dailyPlayRegionStatisList;
    }

    public GetDailyPlayRegionStatisResponseBody setEmptyDates(java.util.List<String> emptyDates) {
        this.emptyDates = emptyDates;
        return this;
    }
    public java.util.List<String> getEmptyDates() {
        return this.emptyDates;
    }

    public GetDailyPlayRegionStatisResponseBody setFailDates(java.util.List<String> failDates) {
        this.failDates = failDates;
        return this;
    }
    public java.util.List<String> getFailDates() {
        return this.failDates;
    }

    public GetDailyPlayRegionStatisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDailyPlayRegionStatisResponseBodyDailyPlayRegionStatisList extends TeaModel {
        /**
         * <p>The playback date, in days. Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-20</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The download URL of the CSV file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://outin-e70266d4ed*******0163e1403e7.oss-cn-shanghai.aliyuncs.com/dataexport/play/cn_hangzhou_20250320_video_traffic.csv">https://outin-e70266d4ed*******0163e1403e7.oss-cn-shanghai.aliyuncs.com/dataexport/play/cn_hangzhou_20250320_video_traffic.csv</a>?*******</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        public static GetDailyPlayRegionStatisResponseBodyDailyPlayRegionStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetDailyPlayRegionStatisResponseBodyDailyPlayRegionStatisList self = new GetDailyPlayRegionStatisResponseBodyDailyPlayRegionStatisList();
            return TeaModel.build(map, self);
        }

        public GetDailyPlayRegionStatisResponseBodyDailyPlayRegionStatisList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetDailyPlayRegionStatisResponseBodyDailyPlayRegionStatisList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}
