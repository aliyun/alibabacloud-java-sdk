// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendTopicInputTpsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public OnsTrendTopicInputTpsResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E213AD8A-0730-4B3D-A35A-340DA47D****</p>
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
        @NameInMap("X")
        public Long x;

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
        @NameInMap("Records")
        public OnsTrendTopicInputTpsResponseBodyDataRecords records;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx%test trend of received messages</p>
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
         * <p>The unit of the Y axis.</p>
         * 
         * <strong>example:</strong>
         * <p>msg</p>
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
