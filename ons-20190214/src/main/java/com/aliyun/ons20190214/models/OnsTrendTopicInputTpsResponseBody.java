// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendTopicInputTpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsTrendTopicInputTpsResponseBodyData data;

    public static OnsTrendTopicInputTpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendTopicInputTpsResponseBody self = new OnsTrendTopicInputTpsResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTrendTopicInputTpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsTrendTopicInputTpsResponseBody setData(OnsTrendTopicInputTpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTrendTopicInputTpsResponseBodyData getData() {
        return this.data;
    }

    public static class OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo extends TeaModel {
        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Long x;

        public static OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo self = new OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo();
            return TeaModel.build(map, self);
        }

        public OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

    }

    public static class OnsTrendTopicInputTpsResponseBodyDataRecords extends TeaModel {
        @NameInMap("StatsDataDo")
        public java.util.List<OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo> statsDataDo;

        public static OnsTrendTopicInputTpsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendTopicInputTpsResponseBodyDataRecords self = new OnsTrendTopicInputTpsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public OnsTrendTopicInputTpsResponseBodyDataRecords setStatsDataDo(java.util.List<OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo> statsDataDo) {
            this.statsDataDo = statsDataDo;
            return this;
        }
        public java.util.List<OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo> getStatsDataDo() {
            return this.statsDataDo;
        }

    }

    public static class OnsTrendTopicInputTpsResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public OnsTrendTopicInputTpsResponseBodyDataRecords records;

        @NameInMap("XUnit")
        public String XUnit;

        @NameInMap("YUnit")
        public String YUnit;

        @NameInMap("Title")
        public String title;

        public static OnsTrendTopicInputTpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendTopicInputTpsResponseBodyData self = new OnsTrendTopicInputTpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsTrendTopicInputTpsResponseBodyData setRecords(OnsTrendTopicInputTpsResponseBodyDataRecords records) {
            this.records = records;
            return this;
        }
        public OnsTrendTopicInputTpsResponseBodyDataRecords getRecords() {
            return this.records;
        }

        public OnsTrendTopicInputTpsResponseBodyData setXUnit(String XUnit) {
            this.XUnit = XUnit;
            return this;
        }
        public String getXUnit() {
            return this.XUnit;
        }

        public OnsTrendTopicInputTpsResponseBodyData setYUnit(String YUnit) {
            this.YUnit = YUnit;
            return this;
        }
        public String getYUnit() {
            return this.YUnit;
        }

        public OnsTrendTopicInputTpsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
