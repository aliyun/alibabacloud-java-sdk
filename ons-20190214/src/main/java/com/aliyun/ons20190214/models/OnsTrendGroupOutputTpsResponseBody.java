// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendGroupOutputTpsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public OnsTrendGroupOutputTpsResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CE57AEDC-8FD2-43ED-8E3B-1F878077****</p>
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
        @NameInMap("X")
        public Long x;

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
        @NameInMap("Records")
        public OnsTrendGroupOutputTpsResponseBodyDataRecords records;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx%test@MQ_INST_111111111111_DOxxxxxx%GID_test trend chart of delivered messages</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The unit of the timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>time</p>
         */
        @NameInMap("XUnit")
        public String XUnit;

        /**
         * <p>The total number of messages.</p>
         * 
         * <strong>example:</strong>
         * <p>msg</p>
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
