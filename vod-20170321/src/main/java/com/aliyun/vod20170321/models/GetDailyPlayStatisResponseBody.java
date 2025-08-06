// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDailyPlayStatisResponseBody extends TeaModel {
    @NameInMap("DailyPlayStatisList")
    public java.util.List<GetDailyPlayStatisResponseBodyDailyPlayStatisList> dailyPlayStatisList;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDailyPlayStatisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDailyPlayStatisResponseBody self = new GetDailyPlayStatisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDailyPlayStatisResponseBody setDailyPlayStatisList(java.util.List<GetDailyPlayStatisResponseBodyDailyPlayStatisList> dailyPlayStatisList) {
        this.dailyPlayStatisList = dailyPlayStatisList;
        return this;
    }
    public java.util.List<GetDailyPlayStatisResponseBodyDailyPlayStatisList> getDailyPlayStatisList() {
        return this.dailyPlayStatisList;
    }

    public GetDailyPlayStatisResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetDailyPlayStatisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDailyPlayStatisResponseBodyDailyPlayStatisList extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("Date")
        public String date;

        @NameInMap("Flow")
        public Double flow;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("PlayCount")
        public Long playCount;

        @NameInMap("UserId")
        public Long userId;

        public static GetDailyPlayStatisResponseBodyDailyPlayStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetDailyPlayStatisResponseBodyDailyPlayStatisList self = new GetDailyPlayStatisResponseBodyDailyPlayStatisList();
            return TeaModel.build(map, self);
        }

        public GetDailyPlayStatisResponseBodyDailyPlayStatisList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public GetDailyPlayStatisResponseBodyDailyPlayStatisList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetDailyPlayStatisResponseBodyDailyPlayStatisList setFlow(Double flow) {
            this.flow = flow;
            return this;
        }
        public Double getFlow() {
            return this.flow;
        }

        public GetDailyPlayStatisResponseBodyDailyPlayStatisList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetDailyPlayStatisResponseBodyDailyPlayStatisList setPlayCount(Long playCount) {
            this.playCount = playCount;
            return this;
        }
        public Long getPlayCount() {
            return this.playCount;
        }

        public GetDailyPlayStatisResponseBodyDailyPlayStatisList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
