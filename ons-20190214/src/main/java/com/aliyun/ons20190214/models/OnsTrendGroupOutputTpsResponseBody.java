// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendGroupOutputTpsResponseBody extends TeaModel {
    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public OnsTrendGroupOutputTpsResponseBodyData data;

    /**
     * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTrendGroupOutputTpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendGroupOutputTpsResponseBody self = new OnsTrendGroupOutputTpsResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTrendGroupOutputTpsResponseBody setData(OnsTrendGroupOutputTpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTrendGroupOutputTpsResponseBodyData getData() {
        return this.data;
    }

    public OnsTrendGroupOutputTpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo extends TeaModel {
        /**
         * <p>Indicates the timestamp. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("X")
        public Long x;

        /**
         * <p>Indicates the TPS for message consumption or the number of messages that are consumed.</p>
         */
        @NameInMap("Y")
        public Float y;

        public static OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo self = new OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo();
            return TeaModel.build(map, self);
        }

        public OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public OnsTrendGroupOutputTpsResponseBodyDataRecordsStatsDataDo setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
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
        /**
         * <p>The data set that is returned based on sampling period.</p>
         */
        @NameInMap("Records")
        public OnsTrendGroupOutputTpsResponseBodyDataRecords records;

        /**
         * <p>The name of the table that stores the data.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The unit of the timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("XUnit")
        public String XUnit;

        /**
         * <p>The unit of the value of the Y parameter.</p>
         */
        @NameInMap("YUnit")
        public String YUnit;

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

        public OnsTrendGroupOutputTpsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
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

    }

}
