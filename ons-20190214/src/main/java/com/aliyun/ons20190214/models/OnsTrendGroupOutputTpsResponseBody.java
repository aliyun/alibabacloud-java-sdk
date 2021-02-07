// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendGroupOutputTpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsTrendGroupOutputTpsResponseBodyData data;

    public static OnsTrendGroupOutputTpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendGroupOutputTpsResponseBody self = new OnsTrendGroupOutputTpsResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTrendGroupOutputTpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsTrendGroupOutputTpsResponseBody setData(OnsTrendGroupOutputTpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTrendGroupOutputTpsResponseBodyData getData() {
        return this.data;
    }

    public static class OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo extends TeaModel {
        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Long x;

        public static OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo self = new OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo();
            return TeaModel.build(map, self);
        }

        public OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

    }

    public static class OnsTrendGroupOutputTpsResponseBodyDataRecords extends TeaModel {
        @NameInMap("StatsDataDo")
        public java.util.List<OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo> statsDataDo;

        public static OnsTrendGroupOutputTpsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendGroupOutputTpsResponseBodyDataRecords self = new OnsTrendGroupOutputTpsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public OnsTrendGroupOutputTpsResponseBodyDataRecords setStatsDataDo(java.util.List<OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo> statsDataDo) {
            this.statsDataDo = statsDataDo;
            return this;
        }
        public java.util.List<OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo> getStatsDataDo() {
            return this.statsDataDo;
        }

    }

    public static class OnsTrendGroupOutputTpsResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public OnsTrendGroupOutputTpsResponseBodyDataRecords records;

        @NameInMap("XUnit")
        public String XUnit;

        @NameInMap("YUnit")
        public String YUnit;

        @NameInMap("Title")
        public String title;

        public static OnsTrendGroupOutputTpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendGroupOutputTpsResponseBodyData self = new OnsTrendGroupOutputTpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsTrendGroupOutputTpsResponseBodyData setRecords(OnsTrendGroupOutputTpsResponseBodyDataRecords records) {
            this.records = records;
            return this;
        }
        public OnsTrendGroupOutputTpsResponseBodyDataRecords getRecords() {
            return this.records;
        }

        public OnsTrendGroupOutputTpsResponseBodyData setXUnit(String XUnit) {
            this.XUnit = XUnit;
            return this;
        }
        public String getXUnit() {
            return this.XUnit;
        }

        public OnsTrendGroupOutputTpsResponseBodyData setYUnit(String YUnit) {
            this.YUnit = YUnit;
            return this;
        }
        public String getYUnit() {
            return this.YUnit;
        }

        public OnsTrendGroupOutputTpsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
