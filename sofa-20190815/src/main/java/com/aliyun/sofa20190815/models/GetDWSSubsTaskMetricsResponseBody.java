// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsTaskMetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSSubsTaskMetricsResponseBodyData data;

    public static GetDWSSubsTaskMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsTaskMetricsResponseBody self = new GetDWSSubsTaskMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsTaskMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSSubsTaskMetricsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSSubsTaskMetricsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSSubsTaskMetricsResponseBody setData(GetDWSSubsTaskMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSSubsTaskMetricsResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSSubsTaskMetricsResponseBodyDataMetric extends TeaModel {
        @NameInMap("ConsumptionLatency")
        public Long consumptionLatency;

        @NameInMap("ConsumptionRps")
        public Long consumptionRps;

        @NameInMap("DailyConsumedRecords")
        public Long dailyConsumedRecords;

        @NameInMap("SampleTime")
        public String sampleTime;

        @NameInMap("SlowestPartition")
        public String slowestPartition;

        public static GetDWSSubsTaskMetricsResponseBodyDataMetric build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsTaskMetricsResponseBodyDataMetric self = new GetDWSSubsTaskMetricsResponseBodyDataMetric();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsTaskMetricsResponseBodyDataMetric setConsumptionLatency(Long consumptionLatency) {
            this.consumptionLatency = consumptionLatency;
            return this;
        }
        public Long getConsumptionLatency() {
            return this.consumptionLatency;
        }

        public GetDWSSubsTaskMetricsResponseBodyDataMetric setConsumptionRps(Long consumptionRps) {
            this.consumptionRps = consumptionRps;
            return this;
        }
        public Long getConsumptionRps() {
            return this.consumptionRps;
        }

        public GetDWSSubsTaskMetricsResponseBodyDataMetric setDailyConsumedRecords(Long dailyConsumedRecords) {
            this.dailyConsumedRecords = dailyConsumedRecords;
            return this;
        }
        public Long getDailyConsumedRecords() {
            return this.dailyConsumedRecords;
        }

        public GetDWSSubsTaskMetricsResponseBodyDataMetric setSampleTime(String sampleTime) {
            this.sampleTime = sampleTime;
            return this;
        }
        public String getSampleTime() {
            return this.sampleTime;
        }

        public GetDWSSubsTaskMetricsResponseBodyDataMetric setSlowestPartition(String slowestPartition) {
            this.slowestPartition = slowestPartition;
            return this;
        }
        public String getSlowestPartition() {
            return this.slowestPartition;
        }

    }

    public static class GetDWSSubsTaskMetricsResponseBodyData extends TeaModel {
        @NameInMap("Consumer")
        public String consumer;

        @NameInMap("Group")
        public String group;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("Metric")
        public GetDWSSubsTaskMetricsResponseBodyDataMetric metric;

        public static GetDWSSubsTaskMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsTaskMetricsResponseBodyData self = new GetDWSSubsTaskMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsTaskMetricsResponseBodyData setConsumer(String consumer) {
            this.consumer = consumer;
            return this;
        }
        public String getConsumer() {
            return this.consumer;
        }

        public GetDWSSubsTaskMetricsResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetDWSSubsTaskMetricsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDWSSubsTaskMetricsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDWSSubsTaskMetricsResponseBodyData setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public GetDWSSubsTaskMetricsResponseBodyData setMetric(GetDWSSubsTaskMetricsResponseBodyDataMetric metric) {
            this.metric = metric;
            return this;
        }
        public GetDWSSubsTaskMetricsResponseBodyDataMetric getMetric() {
            return this.metric;
        }

    }

}
