// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendTopicInputTpsResponseBody extends TeaModel {
    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public OnsTrendTopicInputTpsResponseBodyData data;

    /**
     * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTrendTopicInputTpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendTopicInputTpsResponseBody self = new OnsTrendTopicInputTpsResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTrendTopicInputTpsResponseBody setData(OnsTrendTopicInputTpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTrendTopicInputTpsResponseBodyData getData() {
        return this.data;
    }

    public OnsTrendTopicInputTpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo extends TeaModel {
        /**
         * <p>Indicates the timestamp. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("X")
        public Long x;

        /**
         * <p>Indicates the TPS for message publishing or the number of messages that are published to the topic.</p>
         */
        @NameInMap("Y")
        public Float y;

        public static OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo self = new OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo();
            return TeaModel.build(map, self);
        }

        public OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public OnsTrendTopicInputTpsResponseBodyDataRecordsStatsDataDo setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
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
        /**
         * <p>The data set that is returned based on each sampling period.</p>
         */
        @NameInMap("Records")
        public OnsTrendTopicInputTpsResponseBodyDataRecords records;

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

        public OnsTrendTopicInputTpsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
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

    }

}
