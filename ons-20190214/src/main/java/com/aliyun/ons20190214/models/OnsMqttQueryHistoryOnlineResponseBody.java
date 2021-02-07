// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryHistoryOnlineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsMqttQueryHistoryOnlineResponseBodyData data;

    public static OnsMqttQueryHistoryOnlineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryHistoryOnlineResponseBody self = new OnsMqttQueryHistoryOnlineResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryHistoryOnlineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsMqttQueryHistoryOnlineResponseBody setData(OnsMqttQueryHistoryOnlineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsMqttQueryHistoryOnlineResponseBodyData getData() {
        return this.data;
    }

    public static class OnsMqttQueryHistoryOnlineResponseBodyDataRecordsStatsDataDo extends TeaModel {
        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Long x;

        public static OnsMqttQueryHistoryOnlineResponseBodyDataRecordsStatsDataDo build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttQueryHistoryOnlineResponseBodyDataRecordsStatsDataDo self = new OnsMqttQueryHistoryOnlineResponseBodyDataRecordsStatsDataDo();
            return TeaModel.build(map, self);
        }

        public OnsMqttQueryHistoryOnlineResponseBodyDataRecordsStatsDataDo setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public OnsMqttQueryHistoryOnlineResponseBodyDataRecordsStatsDataDo setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

    }

    public static class OnsMqttQueryHistoryOnlineResponseBodyDataRecords extends TeaModel {
        @NameInMap("StatsDataDo")
        public java.util.List<OnsMqttQueryHistoryOnlineResponseBodyDataRecordsStatsDataDo> statsDataDo;

        public static OnsMqttQueryHistoryOnlineResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttQueryHistoryOnlineResponseBodyDataRecords self = new OnsMqttQueryHistoryOnlineResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public OnsMqttQueryHistoryOnlineResponseBodyDataRecords setStatsDataDo(java.util.List<OnsMqttQueryHistoryOnlineResponseBodyDataRecordsStatsDataDo> statsDataDo) {
            this.statsDataDo = statsDataDo;
            return this;
        }
        public java.util.List<OnsMqttQueryHistoryOnlineResponseBodyDataRecordsStatsDataDo> getStatsDataDo() {
            return this.statsDataDo;
        }

    }

    public static class OnsMqttQueryHistoryOnlineResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public OnsMqttQueryHistoryOnlineResponseBodyDataRecords records;

        @NameInMap("XUnit")
        public String XUnit;

        @NameInMap("YUnit")
        public String YUnit;

        @NameInMap("Title")
        public String title;

        public static OnsMqttQueryHistoryOnlineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttQueryHistoryOnlineResponseBodyData self = new OnsMqttQueryHistoryOnlineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMqttQueryHistoryOnlineResponseBodyData setRecords(OnsMqttQueryHistoryOnlineResponseBodyDataRecords records) {
            this.records = records;
            return this;
        }
        public OnsMqttQueryHistoryOnlineResponseBodyDataRecords getRecords() {
            return this.records;
        }

        public OnsMqttQueryHistoryOnlineResponseBodyData setXUnit(String XUnit) {
            this.XUnit = XUnit;
            return this;
        }
        public String getXUnit() {
            return this.XUnit;
        }

        public OnsMqttQueryHistoryOnlineResponseBodyData setYUnit(String YUnit) {
            this.YUnit = YUnit;
            return this;
        }
        public String getYUnit() {
            return this.YUnit;
        }

        public OnsMqttQueryHistoryOnlineResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
